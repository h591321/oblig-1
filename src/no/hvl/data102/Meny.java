package no.hvl.data102;

import java.util.Scanner;

import no.hvl.data102.adt.FilmarkivADT;

public class Meny {
	
	private Tekstgrensesnitt tgs;
	private FilmarkivADT fA;
	Scanner skanner;
	
	public Meny(FilmarkivADT filmer) {
		fA = filmer;
		tgs= new Tekstgrensesnitt();
		skanner = new Scanner(System.in);
		
	}
	
	 public void start(){
		 
		 System.out.println("vil du lase inn lagret arkiv(0)  eller lage nytt(1)");
		 int input = skanner.nextInt();
			skanner.nextLine();


			if(input == 0) {
				System.out.print("skriv in navn på arkivet du vil åpne: ");
			
				String filnavn = skanner.nextLine();
				
				fA = Fil.lesFraFil(filnavn);
				System.out.println();
				input = 1;
			}
			
			tgs.printOptions();
			
			while (input !=0) {
				input=skanner.nextInt();
				
				switch(input) {
				case 1:
					Film film = tgs.lesFilm();
					fA.leggTil(film);
					System.out.println(film.getTittel()+" er leget til\n ");
					tgs.printOptions();
					break;
				case 2:
					System.out.println("skriv inn film nummeret du vil fjerne: ");
					int nummer = skanner.nextInt();
					String filmn;
					fA.slettFilm(nummer);
					System.out.println("filmen nr "+nummer+" er sletet");
					tgs.printOptions();
					break;
				case 3:
					System.out.println("skriv inn delstrengen på titel du vil søke på: " );
					String delStreng= skanner.next();
					tgs.skrivUtFilmDelstrengITittel(fA, delStreng);
					tgs.printOptions();
				case 4:
					System.out.println("skriv inn delstrengen på produsent du vil søke på: " );
					String delSProdusent= skanner.next();
					tgs.skrivUtFilmProdusent(fA, delSProdusent);
					tgs.printOptions();
					break;
				case 5: 
					tgs.skrivUtStatistikk(fA);
					tgs.printOptions();
					break;
				case 6:
					System.out.println("skriv in navn på fil du vil lagre fimene på: ");
					String filNavn= skanner.next();
					Fil.skrivTilFil(fA, filNavn);
					tgs.printOptions();
					break;
				case 7:
					tgs.visAlleFilmene(fA);
					tgs.printOptions();
					break;
				default:
					input = 0;
					break;	
					
				}
						
				
			}

			
		}


}
