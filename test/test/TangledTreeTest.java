package test;

import static org.junit.Assert.*;

import org.junit.Test;

import tangleTree.TangledTree;

public class TangledTreeTest {

	@Test
	public void testBasicTree() {
		TangledTree<Integer, String, String> tree = new TangledTree<>();

		assertEquals(0, tree.size());
		tree.insert(10, "F", "HI");
		assertEquals(1, tree.size());
		assertEquals("HI", tree.get(10));
		// assertEquals("HI", tree.pull("F"));
		tree.insert(5, "C", "BYE");
		assertEquals(2, tree.size());
		assertEquals("BYE", tree.get(5));
		// assertEquals("BYE", tree.pull("C"));

	}

	@Test
	public void testStructuredTree() {
		TangledTree<Integer, String, String> tree = new TangledTree<>();

		tree.insert(10, "F", "A");
		tree.insert(5, "G", "B");
		tree.insert(20, "I", "C");
		tree.insert(3, "D", "D");
		tree.insert(12, "C", "E");
		tree.insert(7, "B", "F");
		tree.insert(22, "K", "G");

		assertEquals(7, tree.size());
		assertEquals("A", tree.get(10));
		// assertEquals("A", tree.pull("F"));
		//
		assertEquals("B", tree.get(5));
		// assertEquals("B", tree.pull("G"));
		//
		assertEquals("C", tree.get(20));
		// assertEquals("C", tree.pull("I"));
		//
		assertEquals("D", tree.get(3));
		// assertEquals("D", tree.pull("D"));
		//
		assertEquals("E", tree.get(12));
		// assertEquals("E", tree.pull("C"));
		//
		assertEquals("F", tree.get(7));
		// assertEquals("F", tree.pull("B"));
		//
		assertEquals("G", tree.get(22));
		// assertEquals("G", tree.pull("K"));
		//
		assertNull(tree.get(21));
		// assertNull(tree.pull("Z"));
	}

	@Test
	public void testContains() {

		TangledTree<Integer, String, String> tree = new TangledTree<>();
		// Inserting elements into the tree
		tree.insert(10, "F", "A");
		tree.insert(5, "L", "B");
		tree.insert(20, "I", "C");
		tree.insert(3, "D", "D");
		tree.insert(12, "C", "E");
		tree.insert(7, "B", "F");
		tree.insert(22, "K", "G");

		System.out.println("root is " + tree.root.getValue());
		System.out.println("left is " + tree.root.getLeft().getKey());

		// testing the elements are there
		assertEquals("A", tree.get(10));
		// assertEquals("A", tree.pull("F"));
		//
		assertEquals("B", tree.get(5));
		// assertEquals("B", tree.pull("L"));
		//
		// assertEquals("C", tree.get(20));
		// assertEquals("C", tree.pull("I"));
		//
		// assertEquals(6, tree.size());
		//
		// // Begin testing contains
		// assertTrue(tree.containsJ(10));
		// assertFalse(tree.containsJ(1));
		// assertTrue(tree.containsK("F"));
		// assertFalse(tree.containsK("B"));
	}

	@Test
	public void testIsEmpty() {
		TangledTree<Integer, String, String> tree = new TangledTree<>();

		assertTrue(tree.isEmpty());
		tree.insert(10, "A", "HI");
		assertFalse(tree.isEmpty());
	}

	@Test
	public void testSize() {
		TangledTree<Integer, String, String> tree = new TangledTree<>();

		assertEquals(0, tree.size());
		tree.insert(10, "A", "HI");
		assertEquals(1, tree.size());
	}

}
