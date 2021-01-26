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
		Sjanger sjanger=Sjanger.valueOf(sjangers);
		System.out.println("skriv inn selskap: ");
		String selskap=leser.next();
		
		Film film=new Film(filmNr,produsent,tittel,aar,sjanger,selskap);
		return film;
		
	}
	public void visFilm(Film film) {
		System.out.println(film.toString());
		//dette er ikke riktig men .toString finnes i Film klassen
	}
	
	// Skriver ut alle Filmer av en produsent/en gruppe
	public void skrivUtFilmDelstrengITittel(FilmarkivADT filma, String delstreng) {
		
		Film[] tab= filma.soekProdusent(delstreng);
		System.out.println("Resultat for '"+delstreng+"':");
		for (Film a:tab) {
			System.out.println(a.getTittel());
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
}
