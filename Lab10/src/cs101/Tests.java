package cs101;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.jupiter.api.Test;

class Tests {

	@Test
	void testA() {
		ArrayList<String> arrayList = ArrayListPractice.a();
		assertEquals(3, arrayList.size());
		assertEquals("baseball", arrayList.get(0));
		assertEquals("boxing", arrayList.get(1));
		assertEquals("fencing", arrayList.get(2));
	}

	@Test
	void testB() {
		ArrayList<Integer> arrayList = ArrayListPractice.b();
		assertEquals(10, arrayList.size());
		for (Integer i = 1; i <= 10; i++) {
			assertEquals(i, arrayList.get(i - 1));
		}
	}

	@Test
	void testC() {
		ArrayList<Double> givenList = new ArrayList<Double>();
		givenList.add(235.1);
		givenList.add(42.9);
		givenList.add(55.1);
		givenList.add(69.1);
		givenList.add(999.9);
		givenList.add(0.9);

		ArrayList<Double> arrayList = ArrayListPractice.c(givenList);
		assertEquals(235.1, arrayList.get(0));
		assertEquals(42.9, arrayList.get(1));
		assertEquals(55.1, arrayList.get(2));
		assertEquals(69.1, arrayList.get(3));
		assertEquals(99.99, arrayList.get(4));
		assertEquals(0.9, arrayList.get(5));
	}

	@Test
	void testD() {
		Double index1Item = 42.9;

		ArrayList<Double> givenList = new ArrayList<Double>();
		givenList.add(34.4);
		givenList.add(index1Item);
		givenList.add(33.1);
		givenList.add(567.1);
		givenList.add(52.9);

		ArrayList<Double> arrayList = ArrayListPractice.d(givenList);
		assertEquals(77.55, arrayList.get(1));
		assertEquals(index1Item, arrayList.get(2));
		assertEquals(6, arrayList.size());
	}

	@Test
	void testE() {
		ArrayList<Double> givenList = new ArrayList<Double>();
		givenList.add(24434.1);
		givenList.add(334.3);
		givenList.add(11.1);
		givenList.add(274.1);
		givenList.add(443.9);
		givenList.add(452.9);
		givenList.add(23.9);

		@SuppressWarnings("unchecked") // trust me, i got this (no i don't)
		ArrayList<Double> arrayList = ArrayListPractice.e((ArrayList<Double>) givenList.clone());

		assertEquals(443.9, arrayList.get(3));
		assertEquals(givenList.size() - 1, arrayList.size());
	}

	@Test
	void testF() {
		ArrayList<Double> givenList = new ArrayList<Double>();
		givenList.add(234.1);
		givenList.add(37734.3);
		givenList.add(54711.1);
		givenList.add(24.1);
		givenList.add(45643.9);

		int size = ArrayListPractice.f(givenList);
		assertEquals(5, size);

		assertEquals(0, ArrayListPractice.f(new ArrayList<Double>()));
	}

	@Test
	void testG() {
		ArrayList<Double> givenList = new ArrayList<Double>();
		givenList.add(45.1);
		givenList.add(34534.3);
		givenList.add(122341.1);
		givenList.add(313.1);
		givenList.add(44113.9);

		ArrayList<Double> arrayList = ArrayListPractice.g(givenList);
		assertEquals(0, arrayList.size());
	}

	@Test
	void testH() {
		ArrayList<Double> givenList = new ArrayList<Double>();
		givenList.add(45.1);
		givenList.add(334.3);
		givenList.add(231.1);
		givenList.add(13.1);
		givenList.add(13.9);

		@SuppressWarnings("unchecked") // trust me with this too (you should not)
		ArrayList<Double> arrayList = ArrayListPractice.h((ArrayList<Double>) givenList.clone());

		assertEquals(givenList.size() - 1, arrayList.size());
		for (int i = 0; i < arrayList.size(); i++) {
			assertEquals(givenList.get(i), arrayList.get(i));
		}
	}

	@Test
	void testI() {
		ArrayList<ArrayList<Integer>> arrayList = ArrayListPractice.i();
		// java does compile time checking, the student would see a compile time error
		// we will call that sufficient

		assert (arrayList != null);

	}

	@Test
	void testJ() {
		ArrayList<String> givenList = new ArrayList<String>();
		givenList.add("i");
		givenList.add("took");
		givenList.add("the");
		givenList.add("wok");
		givenList.add("[pause]");
		givenList.add("to");
		givenList.add("poland");

		@SuppressWarnings("unchecked")
		ArrayList<String> arrayList = ArrayListPractice.j((ArrayList<String>) givenList.clone());
		Collections.sort(givenList);

		assertEquals(true, arrayList.equals(givenList));

	}

	@Test
	void testK() {
		ArrayList<String> givenList = new ArrayList<String>();
		givenList.add("i");
		givenList.add("threw");
		givenList.add("my");
		givenList.add("phone");
		givenList.add("into");
		givenList.add("the");
		givenList.add("sea");
		givenList.add("simple");
		givenList.add("human");
		givenList.add("being");

		@SuppressWarnings("unchecked")
		ArrayList<String> arrayList = ArrayListPractice.k((ArrayList<String>) givenList.clone());

		givenList.add(1, "bar");
		givenList.add(3, "foo");
		givenList.add(5, "tiff");
		givenList.set(4, "bang!");

		assertEquals(true, arrayList.equals(givenList));

	}

	@Test
	void testL() {
		ArrayList<String> givenList = new ArrayList<String>();
		givenList.add("and");
		givenList.add("it");
		givenList.add("would");
		givenList.add("be");
		givenList.add("so");
		givenList.add("much");
		givenList.add("easier");
		givenList.add("to");
		givenList.add("love");
		givenList.add("you");

		@SuppressWarnings("unchecked")
		ArrayList<String> arrayList = ArrayListPractice.l((ArrayList<String>) givenList.clone());
		givenList.set(givenList.size() - 1, "goo");

		assertEquals(true, arrayList.equals(givenList));

	}
}