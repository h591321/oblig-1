package tabell;

import adt.FilmarkivADTTest;
import no.hvl.data102.Filmarkiv;
import no.hvl.data102.adt.FilmarkivADT;

public class FilmarkivTest extends FilmarkivADTTest {

	@Override
	protected FilmarkivADT reset() {
		return new Filmarkiv();
	}
	
}
