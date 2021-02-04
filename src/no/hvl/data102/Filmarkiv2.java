package no.hvl.data102;

import no.hvl.data102.adt.FilmarkivADT;

public class Filmarkiv2 implements FilmarkivADT{
	private int antall;
	private LinearNode<Film> start;
	
	public Filmarkiv2(LinearNode<Film> start) {
		int ant=0;
		LinearNode<Film> noder = start;
		while(noder!=null) {
			ant++;
			noder=noder.getNeste();
		}
		this.antall=ant;
		this.start=start;
	}
	
	public Filmarkiv2() {
		this.antall=0;
		this.start=null;
	}
	@Override
	public Film[] hentFilmTabell() {
		return trimTab(kjedeTilTab(),antall);
	}
	@Override
	public void leggTil(Film film) {
		LinearNode<Film> node=new LinearNode<Film>(film);
		node.setNeste(start);
		start=node;
		antall++;
	}
	@Override
	public boolean slettFilm(int film) {
		LinearNode<Film> node=start;
		LinearNode<Film> forrige=null;
		if(! erTom() ) {
			if(start.getElement().getFilmNr()==film) {
				start=start.getNeste();
				antall--;
				return true;
			}
			for(int i=0;i<antall;i++) {
				if(node.getElement().getFilmNr()==film) {
					forrige.setNeste(node.getNeste());
					antall--;
					return true;
				}
				else {
					forrige=node;
					node=node.getNeste();
				}
			}
		}
		return false;
	}
	

	@Override
	public Film[] soekTittel(String delNavnFilm) {
		Film[] tittelSamling=new Film[antall];
		LinearNode<Film> node=start;
		int antallTittler=0;
		for(int i=0;i<antall;i++) {
			if(node.getElement().getTittel().toUpperCase().contains(delNavnFilm.toUpperCase())) {
				tittelSamling[antallTittler]=node.getElement();
				antallTittler++;
			}
			node=node.getNeste();
		}
		return trimTab(tittelSamling,antallTittler);
	}
	@Override
	public Film[] soekProdusent(String delStringProdusent) {
		Film[] prodSamling=new Film[antall];
		LinearNode<Film> node=start;
		int antallTittler=0;
		for(int i=0;i<antall;i++) {
			if(node.getElement().getProdusent().toUpperCase().contains(delStringProdusent.toUpperCase())) {
				prodSamling[antallTittler]=node.getElement();
				antallTittler++;
			}
			node=node.getNeste();
		}
		return trimTab(prodSamling,antallTittler);
	}
	@Override
	public int antallSjanger(Sjanger sjanger) {
		LinearNode<Film> node=start;
		int teller=0;
		for(int i=0;i<antall;i++) {
			if(node.getElement().getSjanger()==sjanger) {
				teller++;
			}
			node=node.getNeste();
		}
		return teller;
	}
	@Override
	public int antallFilmer() {
		return antall;
	}
	
	//hjelpemetoder********************************************************************
	private boolean erTom() {
		return antall<=0;
	}
	
	public Film[] kjedeTilTab() {
		LinearNode<Film> node=start;
		Film[]tab=new Film[antall];
		if(!erTom()) {
			for(int i=0;i<antall;i++) {
				tab[i]=node.getElement();
				node=node.getNeste();
			}
		}
		return tab;
	}
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
