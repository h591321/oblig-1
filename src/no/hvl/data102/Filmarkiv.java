package no.hvl.data102;

import no.hvl.data102.adt.FilmarkivADT;

public class Filmarkiv implements FilmarkivADT {
	private int STDK=100;
	private Film[] filmSamling;
	private int antall;
	
	public Filmarkiv() {
		this(100);
	}
	
	public Filmarkiv(int storrelse) {
		this.antall=0;
		this.filmSamling=new Film[storrelse];
	}
	
	
	@Override
	public Film[] hentFilmTabell() {
		return trimTab(filmSamling, antall);

	}
	@Override
	public void leggTil(Film film) { 
		if(!finnes(film)) {
			if(antall==filmSamling.length) {
				utvidFilmSamling();
			}
			filmSamling[antall]=film;
			antall++;
		}
	}
	@Override
	public boolean slettFilm(int filmNr) {
		for(int i=0;i<antall;i++) {
			if(filmSamling[i].getFilmNr()==filmNr) {
				filmSamling[tabellIndex(filmSamling[i])]=filmSamling[antall-1];
				antall--;
				return true;
				}
		}
		return false;
	}
	@Override
	public Film[] soekTittel(String delNavnFilm) {
		Film[] tittelSamling=new Film[antall];
		int antallTittler=0;
		for(int i=0;i<antall;i++) {
			if(filmSamling[i].getTittel().toUpperCase().contains(delNavnFilm.toUpperCase())) {
					tittelSamling[antallTittler]=filmSamling[i];
				antallTittler++;
			}
		}
		return trimTab(tittelSamling,antallTittler);
	}
	
	@Override
	public Film[] soekProdusent(String delStringProdusent) {
		Film[] prodSamling=new Film[antall];
		int antallProd=0;
		for(int i=0;i<antall;i++) {
			if(filmSamling[i].getProdusent().toUpperCase().contains(delStringProdusent.toUpperCase())) {
				prodSamling[antallProd]=filmSamling[i];
				antallProd++;
			}
		}
		return trimTab(prodSamling,antallProd);
	}
	@Override
	public int antallSjanger(Sjanger sjanger) {
		int teller=0;
		for(Film a:filmSamling){
			if(a.getSjanger()==sjanger) {
				teller++;
			}
		}
		return teller;
	}
	@Override
	public int antallFilmer() {
		return antall;
	}
	
	//hjelpemetoder under her****************************************************************
	
	
	//hjelpemetode som skjekker om en gitt film finnes i filmsamling tabellen
	public boolean finnes(Film film) { 
		for(int i=0;i<antall;i++) {
			if(filmSamling[i].equals(film)) {
				return true;
			}
		}
		return false;
	}
	//metoden returnerer hva tabellindexen til filmen er. -1 hvis den ikke finnes.
	public int tabellIndex(Film film) {
	for(int i=0;i<antall;i++) {
		if(filmSamling[i].equals(film)) {return i;}
	}
	return -1;
	}
	//utvider tabellen med 10%. math konseptet er tatt fra oppgaven
	public void utvidFilmSamling() {
		Film[] hjelpetabell = new Film[(int)Math.ceil(1.1*filmSamling.length)];
		for(int i=0;i<filmSamling.length;i++) {
			hjelpetabell[i]=filmSamling[i];
		}
		filmSamling=hjelpetabell;
	}
	//trimmer film[] tabell. tatt fra oppgaven
	private Film[] trimTab(Film[] tab, int n) { // n er antall elementer
		Film[] filmtab2= new Film[n];
		int i= 0;
		while(i< n) {
			filmtab2[i] = tab[i];
			i++;
			}//while
		return filmtab2;
	}
}
