package urjc.isi.union;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

import urjc.isi.union.Union;

public class UnionTest {
	
	Vector<Integer> a;
	Vector<Integer> b;
	Vector<Integer> c;
	
	@Before
	public void setUp() throws Exception {
		a = new Vector<Integer>();
		b = new Vector<Integer>();
		c = new Vector<Integer>();
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
		assertTrue("Fallo al unir vectores", c.equals(Union.union(a, b)));
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
		assertTrue("Fallo al unir vectores", c.equals(Union.union(a, b)));
	}
	
	@Test
	public void testUnaListaVacia() {
		b.add(1);
		c.add(1);
		assertTrue("Fallo al unir vectores con a vacio", c.equals(Union.union(a, b)));
	}

}