
package cs101;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class IntervalTests {

	@Test
	void constructorTest1() {
		IllegalArgumentException exception1 = assertThrows(IllegalArgumentException.class,
				() -> new Interval(15.0, 0.0));

		IllegalArgumentException exception2 = assertThrows(IllegalArgumentException.class,
				() -> new Interval(0.0, -0.9));

		IllegalArgumentException exception3 = assertThrows(IllegalArgumentException.class,
				() -> new Interval(0.0, Double.POSITIVE_INFINITY));

		IllegalArgumentException exception4 = assertThrows(IllegalArgumentException.class,
				() -> new Interval(Double.NaN, 19.456));

	}

	@Test
	void constructorTest2() {
		Interval a = new Interval(15.0, 33.0);
		Interval b = new Interval(-5.99, 33.0);
		Interval c = new Interval(1.0, 1.0);

	}

	@Test
	void getLeftTest() {
		Interval a = new Interval(15.0, 33.0);
		assertEquals(15.0, a.getLeft());

		Interval b = new Interval(-5.99, 33.0);
		assertEquals(-5.99, b.getLeft());
	}

	@Test
	void getRightTest() {
		Interval a = new Interval(15.0, 33.0);
		assertEquals(33.0, a.getRight());

		Interval b = new Interval(-5.99, -1);
		assertEquals(-1, b.getRight());
	}

	@Test
	void lengthTest() {
		Interval a = new Interval(15.0, 33.0);
		assertEquals(18.0, a.length());

		Interval b = new Interval(-5.99, 33.0);
		assertEquals(38.99, b.length());

		Interval c = new Interval(0.0, 0.0);
		assertEquals(0.0, c.length());

		Interval d = new Interval(-44.098, -7.9);
		assertEquals(-36.198, d.length());
	}

	@Test
	void containsTest() {
		Interval a = new Interval(15.0, 33.0);
		assertEquals(true, a.contains(15.0));
		assertEquals(true, a.contains(33.0));
		assertEquals(true, a.contains(15.004));
		assertEquals(false, a.contains(1.0));

		Interval b = new Interval(-5.99, 33.0);
		assertEquals(false, b.contains(-15.004));
		assertEquals(true, b.contains(0.0));

		Interval c = new Interval(0.0, 0.0);
		assertEquals(true, a.contains(0.0));
		assertEquals(false, a.contains(0.1));

		Interval d = new Interval(-44.098, -7.9);
		assertEquals(true, a.contains(-33.3));
		assertEquals(false, a.contains(-44.099));

	}

	@Test
	void intersectsTest() {
		Interval a = new Interval(15.0, 33.0);
		Interval b = new Interval(-5.99, 33.0);
		Interval c = new Interval(0.0, 0.0);
		Interval d = new Interval(-44.098, -7.9);

		assertEquals(true, a.intersects(b));
		assertEquals(true, b.intersects(a));

		assertEquals(false, a.intersects(c));
		assertEquals(false, c.intersects(a));

		assertEquals(true, b.intersects(c));
		assertEquals(true, c.intersects(b));

		assertEquals(false, d.intersects(b));
		assertEquals(false, b.intersects(d));

		assertEquals(false, d.intersects(a));
		assertEquals(false, a.intersects(d));
	}

	@Test
	void toStringTest() {
		Interval a = new Interval(15.0, 33.0);
		assertEquals("[15.0, 33.0]", a.toString());

		Interval b = new Interval(-5.99, 33.0);
		assertEquals("[-5.99, 33.0]", b.toString());

		Interval c = new Interval(0.0, 0.0);
		assertEquals("[0.0, 0.0]", c.toString());
	}

}
