package no.hvl.data102.adt;

import no.hvl.data102.Film;
import no.hvl.data102.Sjanger;

public interface FilmarkivADT {
	
	/**
	 * Returnere en tabell av Filmer
	 * @return
	 */
	Film[] hentFilmTabell();
	
	/**
	 * Legger til en ny Film
	 * @param film
	 */
	void leggTil(Film film);
	

	/**
	 * Sletter en Film hvis den fins 
	 * @param film
	 * @return
	 */
	boolean slettFilm(int film);
	
	/**
	 *  Søker og henter Filmer med en gitt delstreng
	 * @param delNavnFilm
	 * @return
	 */
	
	/**
	 * Søker og henter Filmer med en gitt delstreng
	 * @param delNavnFilm
	 * @return
	 */
	Film[] soekTittel(String delNavnFilm);
	
	/**
	 * Søker og henter produsenter med en gitt delstreng
	 * @param delStringProdusent
	 * @return
	 */
	Film[] soekProdusent(String delStringProdusent);
	
	/**
	 * Henter antall Filmer for en gitt sjanger
	 * @param sjanger
	 * @return
	 */
	
	/**
	 * Henter antall Filmer for en gitt sjanger

	 * @param sjanger
	 * @return
	 */
	int antallSjanger(Sjanger sjanger);
	
	/**
	 * Returnerer antall Filmer
	 * @return
	 */
	int antallFilmer();
}
