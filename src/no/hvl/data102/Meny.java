package no.hvl.data102;

import no.hvl.data102.adt.FilmarkivADT;

public class Meny {
	
	private Tekstgrensesnitt tekstgrensesnitt;
	private FilmarkivADT filmarkiv;
	
	public Meny(FilmarkivADT filmer) {
		tekstgrensesnitt= new Tekstgrensesnitt();
		filmarkiv = filmer;
	}
	
	 public void start(){
		 int valg=valg();
		 switch (valg) {
		 case 1: 
		 
		 
		 
		 }
		 
		 
	 }

	 
	 private int valg() {
		 int valget=0;
		 System.out.println("1) ei velkommer til dette");
		 System.out.println("2) ei velkommer til dette");
		 
		 return valget;
	 }
}
