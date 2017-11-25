package urjc.isi.union;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class UnionSetGenericTest {
	
	Set<Integer> a;
	Set<Integer> b;
	Set<Integer> c;

	@Before
	public void setUp() throws Exception {
		a = new HashSet<Integer>();
		b = new HashSet<Integer>();
		c = new HashSet<Integer>();
	}

	@After
	public void tearDown() throws Exception {
		a = null;
		b = null;
		c = null;
	}

	@Test
	public void testHappyPath() {
		a.add(1);
		a.add(2);
		b.add(3);
		b.add(4);
		c.add(1);
		c.add(2);
		c.add(3);
		c.add(4);
		assertTrue("Fallo al unir sets con mas de un elemento", c.equals(Union.<Integer>unionSetGeneric(a, b)));
	}
	
	@Test
	public void testListasVacias() {
		assertTrue("Fallo al unir sets vacios", c.equals(Union.<Integer>unionSetGeneric(a, b)));
	}

}
