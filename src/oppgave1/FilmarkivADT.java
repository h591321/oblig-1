package oppgave1;

public interface FilmarkivADT {
	
	Film[] hentFilmTabell();
	void leggTil(Film film);
	boolean slettFilm(int film);
	Film[] soekTittel(String delNavnFilm);
	Film[] soekProdusent(String delNavnFilm);
	int antallSjanger(Sjanger sjanger);
	int antallFilmer();
}
