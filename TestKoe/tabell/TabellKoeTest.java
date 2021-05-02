package tabell;

import adt.KoeADTTest;
import no.dat102.tabell.TabellKoe;
import no.hvl.dat102.adt.KoeADT;

public class TabellKoeTest  extends KoeADTTest{
	
	protected KoeADT<Integer> reset(){
		return new TabellKoe<Integer>();
	}

}
