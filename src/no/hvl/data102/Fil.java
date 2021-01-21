package no.hvl.data102;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import no.hvl.data102.adt.FilmarkivADT;
import no.hvl.data102.Film;

public class Fil {
	final static String SKILLE = "#"; 
	public static FilmarkivADT lesFraFil(String filnavn) {
		FilmarkivADT filma=null;
		
		try {
			Scanner scan=new Scanner(filnavn);
			filma= new Filmarkiv(scan.nextInt());   //første linje er et tall som angir antall filmer
			
			while(scan.hasNextLine()) {
				String[] tab = scan.nextLine().split(SKILLE);
				
				Film film=new Film(Integer.parseInt(tab[0]), tab[1], tab[2], Integer.parseInt(tab[3]), Sjanger.valueOf(tab[4]), tab[5]);
				filma.leggTil(film);
			}
			scan.close();
			
		}catch(FileNotFoundException e){ //idk hvorfor feilmelding
			System.out.println("ikke gyldig filnavn");
			return null;
		}
		
		
		return filma;
	}
	public static void skrivTilFil(FilmarkivADT filmarkiv, String filnavn){
		
		try {
			FileWriter skriver=new FileWriter(filnavn);
			Film[] filmTab=filmarkiv.hentFilmTabell();
			
			for(int i=0;i<filmarkiv.antallFilmer();i++) {
			skriver.write(filmTab[i].toStringFormat());
			}
			
			skriver.close();
			
		}catch(IOException e){
			System.out.println("noe galt skjedde, idfk hva");
		}
	}
}



