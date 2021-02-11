package kjedet;

import adt.FilmarkivADTTest;
import no.hvl.data102.Filmarkiv2;
import no.hvl.data102.adt.FilmarkivADT;

public class Filmarkiv2Test extends FilmarkivADTTest {

	@Override
	protected FilmarkivADT reset() {
		return new Filmarkiv2();
	}
	
}
