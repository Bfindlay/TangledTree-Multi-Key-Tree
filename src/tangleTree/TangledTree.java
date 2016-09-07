package tangleTree;

public class TangledTree<K extends Comparable<K>, J extends Comparable<J>, V extends Comparable<V>> {

	private TreeNode<J, K, V> root;
	private int size;

	public TangledTree() {
		this.size = 0;
		this.root = null;
	}

	public TreeNode<J, K, V> insert(J j, K k, V v) {
		// TODO Auto-generated method stub
		return null;
	}

	// recursive method to add node with K key
	public TreeNode<J, K, V> insertK(K k, V v, TreeNode<J, K, V> node) {

		return null;
	}

	// recursive method to add node with J key
	public TreeNode<J, K, V> insertJ(J j, V v, TreeNode<J, K, V> node) {

		return null;
	}

	public boolean isEmpty() {
		return (size == 0);
	}

	public int size() {
		return this.size;
	}

	public void clear() {
		// TODO Auto-generated method stub

	}

	public boolean contains(TreeNode<J, K, V> node) {
		// TODO Auto-generated method stub
		return false;
	}

	public TreeNode<J, K, V> get(K key) {
		// TODO Auto-generated method stub
		return null;
	}

	public V get(K k, TreeNode<J, K, V> node) {
		if (node == null) {
			// k isn't in this subtree
			return null;
		}

		// base case: k matches the key in the current entry
		if (k.compareTo((K) node.getKey()) == 0) {
			// TODO: return the value
			return (V) node.getValue();
		}
		// recursive case: k < the current entry
		else if (k.compareTo((K) node.getKey()) < 0) {
			// TODO: return the result of recursing to the left
			return get(k, node.getLeft());
		}
		// recursive case: k > the current entry
		else {
			// TODO: return the result of recursing to the right
			return get(k, node.getRight());
		}
	}

	public TreeNode<J, K, V> pull(J key) {
		// TODO Auto-generated method stub
		return null;
	}

	public TreeNode<J, K, V> remove(TreeNode<J, K, V> node) {
		// TODO Auto-generated method stub
		return null;
	}

	public TreeNode<J, K, V> put(TreeNode<J, K, V> node) {
		// TODO Auto-generated method stub
		return null;
	}

	public TreeNode<J, K, V> get(Object key) {
		// TODO Auto-generated method stub
		return null;
	}

	public TreeNode<J, K, V> pull(Object key) {
		// TODO Auto-generated method stub
		return null;
	}

}
