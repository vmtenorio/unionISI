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
	public void testHappyPath() {
		a.add(1);
		b.add(2);
		c.add(1);
		c.add(2);
		assertTrue("Fallo al unir vectores", c.equals(Union.unionSet(a, b)));
		// No puedo hacer código que pruebe solo esto como antes, pues no hay get, por lo que continuo
	}

}
