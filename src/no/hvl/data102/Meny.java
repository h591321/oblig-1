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
		 System.out.print("Nytt arkiv (1), eller eksisterende (2): ");
			String valg = skanner.nextLine();
			System.out.println();

			if(valg.equals("2")) {
				System.out.print("Oppgi filnavn: ");
				String filnavn = skanner.nextLine();
				fA = Fil.lesFraFil(filnavn);
				System.out.println();
			}

			kundemeny();
		}

	private void kundemeny() {
		// TODO Auto-generated method stub
		
	}
		 
		 
		 
		 
		 
	 

	
}
