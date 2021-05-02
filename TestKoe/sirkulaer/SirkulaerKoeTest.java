package sirkulaer;

import adt.KoeADTTest;
import no.hvl.dat102.adt.KoeADT;
import no.hvl.dat102.sirkulaer.SirkulaerKoe;


public class SirkulaerKoeTest extends KoeADTTest {
	
	
	protected KoeADT<Integer> reset(){
		return new SirkulaerKoe<Integer>();
	}

}
