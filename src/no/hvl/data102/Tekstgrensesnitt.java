package no.hvl.data102;

import no.hvl.data102.adt.FilmarkivADT;


public class Tekstgrensesnitt {
	
	public Film lesFilm() {
		//TODO
		return null;
	}
	public void visFilm(Film film) {
		System.out.println(film.toString());
		//dette er ikke riktig men .toString finnes i Film klassen
	}
	
	// Skriver ut alle Filmer av en produsent/en gruppe
	public void skrivUtFilmDelstrengITittel(FilmarkivADT filma, String delstreng) {
		//TODO
	}
	public void skrivUtStatistikk(FilmarkivADT filma) {
		System.out.println("Antall Filmer: "+filma.antallFilmer());
		System.out.println("Antall Sjangre: "+Sjanger.values().length);
		System.out.println("Sjangre:");
		Sjanger[] sjangTab = Sjanger.values();
		for (Sjanger a:sjangTab) {
			System.out.println(a.toString()+": "+filma.antallSjanger(a));
		}
		
		
		
	}
}
