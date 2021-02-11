package adt;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import no.hvl.dat102.exception.EmptyCollectionException;
import no.hvl.data102.Film;
import no.hvl.data102.Sjanger;
import no.hvl.data102.adt.FilmarkivADT;

public abstract class FilmarkivADTTest {
	private FilmarkivADT filmarkiv;
	
	private Film film1 =new Film(10,"Birk","The Flash",1998,Sjanger.ACTION,"DC");
	private Film film2 =new Film(11,"Khalid","Captin America",1998,Sjanger.ACTION,"Marvels");
	private Film film3 =new Film(12,"håkon","Spider Man",1998,Sjanger.ACTION,"Marvels");
	private Film film4 =new Film(13,"Yosafe","Batman",1997,Sjanger.ACTION,"DC");
	private Film film5 =new Film(14,"Peter","ForrestGump",1996,Sjanger.COMEDY,"Universal");
	
	protected abstract FilmarkivADT reset();
	
	
	
	@BeforeEach
	public void setup() {
		filmarkiv = reset();
	}
	
	/**
	 * Test på legge inn og slette film fra film arkivet.
	 */
	@Test
	public void leggTilOgSlettFilm() {
		filmarkiv.leggTil(film1);
		filmarkiv.leggTil(film2);
		filmarkiv.leggTil(film3);
		filmarkiv.leggTil(film4);
		try {
			assertTrue(filmarkiv.slettFilm(film1.getFilmNr()));
			assertTrue(filmarkiv.slettFilm(film2.getFilmNr()));
			assertTrue(filmarkiv.slettFilm(film3.getFilmNr()));
			assertTrue(filmarkiv.slettFilm(film4.getFilmNr()));
		} catch (NullPointerException e) {
			fail("filmen er ikke i film arkivet " + e.getMessage());
		}
	}
	
	
	
	
	
	

}
