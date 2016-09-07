package test;

import static org.junit.Assert.*;

import org.junit.Test;

import tangleTree.TangledTree;

public class TangledTreeTest {

	@Test
	public void testBasicTree() {
		TangledTree<Integer, String, String> tree = new TangledTree<>();

		assertEquals(0, tree.size());
		tree.insert(10, "A", "HI");
		assertEquals(1, tree.size());
		assertEquals("HI", tree.get(10));
		assertEquals("HI", tree.pull("A"));

	}

}
