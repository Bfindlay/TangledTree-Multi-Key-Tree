package tangleTree;

public class TangledTree<J extends Comparable<J>, K extends Comparable<K>, V extends Comparable<V>> {

	/*** BEGING NESTED TREENODE IMPLEMENTATION ***/

	class TreeNode<J extends Comparable<J>, K extends Comparable<K>, V extends Comparable<V>>
			implements Comparable<TreeNode<J, K, V>> {

		private TreeNode<J, K, V> kLeft;
		private TreeNode<J, K, V> kRight;
		private TreeNode<J, K, V> jLeft;
		private TreeNode<J, K, V> jRight;
		private TreeNode<J, K, V> kParent;
		private TreeNode<J, K, V> jParent;
		private V value;
		private K kKey;
		private J jKey;

		public TreeNode() {
		}

		public TreeNode(J jKey, K key, V value) {
			this.kKey = key;
			this.jKey = jKey;
			this.value = value;
		}

		public V getValue() {
			return this.value;
		}

		public TreeNode<J, K, V> getParent() {
			return this.kParent;
		}

		public TreeNode<J, K, V> pullParent() {
			return this.jParent;
		}

		public TreeNode<J, K, V> addParent(TreeNode<J, K, V> node) {
			this.kParent = node;
			return node;
		}

		public TreeNode<J, K, V> setParent(TreeNode<J, K, V> node) {
			this.jParent = node;
			return node;
		}

		public TreeNode<J, K, V> getLeft() {
			return this.kLeft;
		}

		public TreeNode<J, K, V> getRight() {
			return this.kRight;
		}

		public TreeNode<J, K, V> pullRight() {
			return this.jRight;
		}

		public TreeNode<J, K, V> pullLeft() {
			return this.jLeft;
		}

		public J getKey() {
			return jKey;
		}

		public K pullKey() {
			return kKey;
		}

		public TreeNode<J, K, V> addLeft(TreeNode<J, K, V> node) {
			this.kLeft = node;
			return node;
		}

		public TreeNode<J, K, V> addRight(TreeNode<J, K, V> node) {
			this.kRight = node;
			return node;
		}

		public TreeNode<J, K, V> setLeft(TreeNode<J, K, V> node) {
			this.jLeft = node;
			return node;
		}

		public TreeNode<J, K, V> setRight(TreeNode<J, K, V> node) {
			this.jRight = node;
			return node;
		}

		public int compareTo(TreeNode<J, K, V> o) {
			return o.value.compareTo(this.value);
		}

	}

	/*** BEGING TREE IMPLEMENTATION ****/

	public TreeNode<J, K, V> root;
	private int size;

	public TangledTree() {
		this.size = 0;
		this.root = null;
	}

	public V get(J key) {
		return get(key, this.root);
	}

	public V pull(K key) {
		return pull(key, this.root);
	}

	@SuppressWarnings("unchecked")
	public V get(J j, TreeNode<J, K, V> node) {

		if (node == null) {
			// k isn't in this subtree
			return null;
		}
		// base case: k matches the key in the current entry
		if (j.compareTo((J) node.getKey()) == 0) {
			// TODO: return the value
			return node.getValue();
		}
		// recursive case: k < the current entry
		else if (j.compareTo((J) node.getKey()) < 0) {
			// TODO: return the result of recursing to the left
			return get(j, node.getLeft());
		}
		// recursive case: k > the current entry
		else {
			// TODO: return the result of recursing to the right
			return get(j, node.getRight());
		}
	}

	@SuppressWarnings("unchecked")
	public V pull(K key, TreeNode<J, K, V> node) {
		if (node == null) {
			return null;
		}
		// base case: k matches the key in the current entry
		if (key.compareTo((K) node.pullKey()) == 0) {
			// TODO: return the value
			return node.getValue();
		}
		// recursive case: k < the current entry
		else if (key.compareTo((K) node.pullKey()) < 0) {
			// TODO: return the result of recursing to the left
			return pull(key, node.getLeft());
		}
		// recursive case: k > the current entry
		else {
			// TODO: return the result of recursing to the right
			return pull(key, node.getRight());
		}
	}

	public TreeNode<J, K, V> insert(J j, K k, V v) {
		root = insert(j, k, v, this.root);
		return root;
	}

	// recursive method to add node with K key
	public TreeNode<J, K, V> insert(J j, K k, V v, TreeNode<J, K, V> x) {
		if (x == null) {
			size++;
			return new TreeNode<J, K, V>(j, k, v);
		}
		int cmp = k.compareTo(x.kKey);
		if (cmp < 0) {
			x.kLeft = insert(j, k, v, x.kLeft);
		} else if (cmp > 0) {
			x.kRight = insert(j, k, v, x.kRight);
		} else {

		}
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

	public TreeNode<J, K, V> remove(TreeNode<J, K, V> node) {
		// TODO Auto-generated method stub
		return null;
	}

	public TreeNode<J, K, V> put(TreeNode<J, K, V> node) {
		// TODO Auto-generated method stub
		return null;
	}

}
