package projeto;


import junit.framework.TestCase;

public class Test extends TestCase {

	private Valores valores = new Valores();

	protected void setUp() throws Exception {
		super.setUp();
		valores.ins(5);
		valores.ins(12);
		valores.ins(1);
		valores.ins(30);
		valores.ins(152);
		valores.ins(6);
	}

	public void testIns() {
		assertEquals(false, valores.ins(-10));
		assertEquals(false, valores.ins(0));
		valores.ins(2);
		assertEquals(7, valores.size());
		valores.ins(3);
		assertEquals(8, valores.size());
		valores.ins(4);
		assertEquals(9, valores.size());
		valores.ins(5);
		assertEquals(10, valores.size());
		assertEquals(false, valores.ins(11));

	}

	public void testDel() {
		assertEquals(5, valores.del(0));
		assertEquals(152, valores.del(4));
		assertEquals(30,valores.del(3));
		assertEquals(6, valores.del(5));
	}
} 