package no.hvl.data102;

import no.hvl.data102.adt.FilmarkivADT;

public class KlientFilmarkiv{
	public static void main(String[] args){     
		
	FilmarkivADT filma = new Filmarkiv(4); // vilkårlig lengde 4
	Meny meny = new Meny(filma);
//	
//	Film en= new Film(1,"Peter Jackson", "Ringenes Herre 1", 2001, Sjanger.FANTASY,"New line cinema" );
//	Film to= new Film(2, "Mark Morgan", "The Twillight Saga - New moon", 2009, Sjanger.DRAMA, "Summit Entertainment" );
//	filma.leggTil(en);
//	filma.leggTil(to);
//	
	

	meny.start();
	
  }
}