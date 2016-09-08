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
		assertEquals("HI", tree.pull("F"));
		tree.insert(5, "C", "BYE");
		assertEquals(2, tree.size());
		assertEquals("BYE", tree.get(5));
		assertEquals("BYE", tree.pull("C"));

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
