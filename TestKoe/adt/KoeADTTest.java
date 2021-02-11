package adt;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import no.hvl.dat102.adt.KoeADT;
import no.hvl.dat102.exception.EmptyCollectionException;


public abstract class KoeADTTest {
	// Referanse til Koe
		private KoeADT<Integer> Koe;
		
		// Testdata
		private Integer e0 = 1;
		private Integer e1 = 2;
		private Integer e2 = 3;
		private Integer e3 = 4;
		private Integer e4 = 5;
		
		protected abstract KoeADT<Integer> reset();
		
		/**
		 * Hent en ny Koe for hver test.
		 * 
		 * @return
		 */
		@BeforeEach
		public void setup() {
			Koe = reset();
		}
		
		/**
		 * Test på at en ny Koe er tom.
		 */
		@Test
		public void nyKoeErTom() {
			assertTrue(Koe.erTom());
		}
		
		
		
		/**
		 * Test på at en Koe med noen elementer ikke er tom.
		 */
		@Test
		public final void erIkkeTom() {
			Koe.innKoe(e0);
			Koe.innKoe(e1);
			assertFalse(Koe.erTom());
		}
		
		
		
		
		/**
		 * Test på at en Koe med null elementer er tom.
		 */
		@Test
		public void innKoeUtKoeTom() { 
			try {
				Koe.innKoe(e0);
				Koe.utKoe();
				assertTrue(Koe.erTom());

			} catch (EmptyCollectionException e) {
				fail("push eller pop feilet uventet " + e.getMessage());
			}
		}
		
		
		
		/**
		 * Test opå innKoe and UtKoe.
		 */
		@Test
		public void innKoeOgUttKoe() {

			Koe.innKoe(e0);
			Koe.innKoe(e1);
			Koe.innKoe(e2);
			Koe.innKoe(e3);

			try {
				assertEquals(e0, Koe.utKoe());
				assertEquals(e1, Koe.utKoe());
				assertEquals(e2, Koe.utKoe());
				assertEquals(e3, Koe.utKoe());
			} catch (EmptyCollectionException e) {
				fail("pop feilet uventet " + e.getMessage());
			}
		}

}
