package no.hvl.data102;

import no.hvl.data102.adt.FilmarkivADT;

public class Filmarkiv2 implements FilmarkivADT{
	private int antall;
	private LinearNode<Film> start;
	
	public Filmarkiv2(LinearNode<Film> start, int antall) {
		this.antall=antall;
		this.start=start;
	}
	public Filmarkiv2() {
		this.antall=0;
		this.start=null;
	}
	@Override
	public Film[] hentFilmTabell() {
		return null;
	}
	@Override
	public void leggTil(Film film) {
		LinearNode<Film> node=new LinearNode<Film>(film);
		node.setNeste(start);
		start=node;
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
	
	private boolean erTom() {
		// TODO Auto-generated method stub
		return antall<=0;
	}
	@Override
	public Film[] soekTittel(String delNavnFilm) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Film[] soekProdusent(String delStringProdusent) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int antallSjanger(Sjanger sjanger) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int antallFilmer() {
		return antall;
	}
	
	//hjelpemetoder********************************************************************
	
	public Film[] kjedeTilTab() {
		//TODO
		return null;
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
