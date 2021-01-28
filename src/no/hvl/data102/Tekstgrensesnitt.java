package no.hvl.data102;

import java.util.Scanner;

import no.hvl.data102.adt.FilmarkivADT;


public class Tekstgrensesnitt {
	
	public Film lesFilm() {
		Scanner leser = new Scanner(System.in);
		System.out.println("skriv inn filmNr: ");
		int filmNr=leser.nextInt();
		System.out.println("skriv inn produsent: ");
		String produsent=leser.next();
		System.out.println("skriv inn tittel: ");
		String tittel=leser.next();
		System.out.println("skriv inn aar: ");
		int aar=leser.nextInt();
		System.out.println("skriv inn sjanger: ");
		String sjangers=leser.next();
		Sjanger sjanger=Sjanger.valueOf(sjangers.toUpperCase());
		System.out.println("skriv inn selskap: ");
		String selskap=leser.next();
		
		Film film=new Film(filmNr,produsent,tittel,aar,sjanger,selskap);
		return film;
		
	}
	public void visFilm(Film film) {
		System.out.println(film.toString());
		//dette er ikke riktig men .toString finnes i Film klassen
	}
	
	public void visAlleFilmene(FilmarkivADT filma) {
		Film []tab=filma.hentFilmTabell();
		for(int i=0;i < tab.length; i++) {
			visFilm(tab[i]);
		}
		
	}
	
	// Skriver ut alle Filmer av en produsent/en gruppe
	public void skrivUtFilmDelstrengITittel(FilmarkivADT filma, String delstreng) {
		
		Film[] tab= filma.soekTittel(delstreng);
		System.out.println("Resultat for '"+delstreng+"':");
		for (Film a : tab) {
			System.out.println(a.getTittel());
		}
		
	}
	
	public void skrivUtFilmProdusent(FilmarkivADT filma, String delstreng) {
		Film[] tab= filma.soekProdusent(delstreng);
		System.out.println("Resultat for '"+delstreng+"':");
		for (Film a:tab) {
			System.out.println(a.getProdusent());
		}
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
	
	
	public void printOptions() {
		System.out.println("vil du lese in en film skriv 1\n"
				          +"vil du slette en fjerne skriv 2\n"
				          + "vil du ha titel til en film skriv 3\n"
				          + "vil du ha produsent til en film skriv 4\n"
				          + "vil du ha statistik til en film tast 5\n"
				          + "vil du ha filmene lagret på et ark skriv 6\n"
				          + "for å vise filmene skriv 7\n"
				          + "vil du avslute tast in 0"
							);
		
	}
	
	
	
	
	
	
	
	
}
