package no.hvl.dat102.adt;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import no.hvl.dat102.exceptions.EmptyCollectionException;


public abstract class KoeADTTest {

	private KoeADT<Integer> koe;
	
	private Integer e0 = 1;
	private Integer e1 = 2;
	private Integer e2 = 3;
	private Integer e3 = 4;
	private Integer e4 = 5;

	protected abstract KoeADT<Integer> reset();
	
	@BeforeEach
	public void setup() {
		koe = reset();
	}
	@Test
	public void nyKoeErTom() {
		assertTrue(koe.erTom());
	}
	
	@Test
	public void innOgUt() {
		koe.innKoe(e0);
		koe.innKoe(e1);
		koe.innKoe(e2);
		koe.innKoe(e3);
		koe.innKoe(e4);
		
		try {
			assertEquals(e0, koe.utKoe());
			assertEquals(e1, koe.utKoe());
			assertEquals(e2, koe.utKoe());
			assertEquals(e3, koe.utKoe());
			assertEquals(e4, koe.utKoe());
		} catch (EmptyCollectionException e) {
			fail("utKoe feilet uventet " + e.getMessage());
		}
		assertTrue(koe.erTom());
		
		//størrelse er nå 200
		for(int i = 0; i < 105; i++) {
			koe.innKoe(i);
		}
		//50 skal være først, tallene 50 - 105 skal være i køen
		for(int i = 0; i < 50; i++) {
			koe.utKoe();
		}
		Integer e5 = 50;
		assertEquals(e5, koe.foerste());
		//50-220 skal være i køen
		for(int i = 105; i < 220; i++) {
			koe.innKoe(i);
		}
		
		for(int i = 0; i < 70; i++) {
			koe.utKoe();
		}
		//også testet sirkulasjonen i køen
		Integer e6 = 120;
		assertEquals(e6, koe.foerste());
	}
	
	@Test
	public void testForste() {
		koe.innKoe(e0);
		koe.innKoe(e1);
		koe.innKoe(e2);
		
		assertEquals(e0, koe.foerste());
		koe.utKoe();
		assertEquals(e1, koe.foerste());
		koe.utKoe();
		assertEquals(e2, koe.foerste());
		koe.utKoe();
		assertTrue(koe.erTom());
	}
}
