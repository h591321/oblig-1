package no.hvl.data102.adt;

import no.hvl.data102.Film;
import no.hvl.data102.Sjanger;

public interface FilmarkivADT {
	
	Film[] hentFilmTabell();
	void leggTil(Film film);
	boolean slettFilm(int film);
	Film[] soekTittel(String delNavnFilm);
	Film[] soekProdusent(String delStringProdusent);
	int antallSjanger(Sjanger sjanger);
	int antallFilmer();
}
