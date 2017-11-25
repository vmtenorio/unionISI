package urjc.isi.union;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

public class UnionSetTest {
	
	Set a;
	Set b;
	Set c;

	@Before
	public void setUp() throws Exception {
		a = new HashSet();
		b = new HashSet();
		c = new HashSet();
	}

	@After
	public void tearDown() throws Exception {
		a = null;
		b = null;
		c = null;
	}

	@Test
	public void testHappyPath1elem() {
		a.add(1);
		b.add(2);
		c.add(1);
		c.add(2);
		assertTrue("Fallo al unir sets", c.equals(Union.unionSet(a, b)));
		// No puedo hacer código que pruebe solo esto como antes, pues no hay get, por lo que continuo
	}
	
	@Test
	public void testHappyPath2elems() {
		a.add(1);
		a.add(2);
		b.add(3);
		b.add(4);
		c.add(1);
		c.add(2);
		c.add(3);
		c.add(4);
		assertTrue("Fallo al unir sets con mas de un elemento", c.equals(Union.unionSet(a, b)));
	}
	
	@Test
	public void testListasVacias() {
		assertTrue("Fallo al unir sets vacios", c.equals(Union.unionSet(a, b)));
	}
	
	@Test (expected = NullPointerException.class)
	public void testListaNull() {
		a = null;
		Union.unionSet(a, b);
	}
	
	@Test
	public void testElementosRepetidos() {
		a.add(1);
		b.add(1);
		b.add(2);
		c.add(1);
		c.add(2);
		assertTrue("Deja elementos repetidos", c.equals(Union.unionSet(a, b)));
		//Antes aquí hemos tenido que cambiar código, ahora no hace falta porque es un Set, ya funciona
	}
	
	@Test
	public void testListasConNulls() {
		a.add(null);
		b.add(1);
		b.add(null);
		c.add(null);
		c.add(1);
		assertTrue("No funciona con nulls en las listas", c.equals(Union.union(a, b)));
	}

}
