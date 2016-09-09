package tangleTree;

public class TangledTree<J extends Comparable<J>, K extends Comparable<K>, V extends Comparable<V>> {

	/*** BEGIN NESTED TREENODE IMPLEMENTATION ***/

	public class TreeNode<J extends Comparable<J>, K extends Comparable<K>, V extends Comparable<V>>
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
			this.kLeft = null;
			this.kRight = null;
			this.jLeft = null;
			this.jRight = null;
			this.kParent = null;
			this.jParent = null;

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

		public TreeNode<J, K, V> pushParent(TreeNode<J, K, V> node) {
			this.jParent = node;
			return node;
		}

		public TreeNode<J, K, V> setParent(TreeNode<J, K, V> node) {
			this.kParent = node;
			return node;
		}

		public TreeNode<J, K, V> getLeft() {
			return this.jLeft;
		}

		public TreeNode<J, K, V> getRight() {
			return this.jRight;
		}

		public TreeNode<J, K, V> pullRight() {
			return this.kRight;
		}

		public TreeNode<J, K, V> pullLeft() {
			return this.kLeft;
		}

		public J getKey() {
			return jKey;
		}

		public K pullKey() {
			return kKey;
		}

		public TreeNode<J, K, V> pushLeft(TreeNode<J, K, V> node) {
			this.kLeft = node;
			return node;
		}

		public TreeNode<J, K, V> pushRight(TreeNode<J, K, V> node) {
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

	/*** BEGIN TREE IMPLEMENTATION ****/

	public TreeNode<J, K, V> root;
	private int size;

	public TangledTree() {
		this.size = 0;
		this.root = null;
	}

	public TreeNode<J, K, V> root() {
		return this.root;
	}

	public V get(J key) {
		return get(key, root);
	}

	public V get(J elem, TreeNode<J, K, V> start) {
		// If the element isn't found, return null
		if (start == null) {
			return null;
		}

		// Compare the current node's element to the element we're looking for
		int comparison = start.getKey().compareTo(elem);

		// If we should look down the left tree
		if (comparison > 0) {
			return get(elem, start.getLeft());
		}
		// If we should look down the right tree
		else if (comparison < 0) {
			return get(elem, start.getRight());
		}
		// If we've found it
		else {
			return start.getValue();
		}

	}

	public V pull(K key) {
		return null;
	}

	public V pull(K key, TreeNode<J, K, V> node) {
		return null;

	}

	public TreeNode<J, K, V> insert(J j, K k, V v) {
		return insert(j, k, v, this.root);
	}

	/**
	 * Inserts a new Node into the tree, Currently does not replace nodes with
	 * the same key
	 * 
	 * @param j
	 * @param k
	 * @param v
	 * @param node
	 * @return
	 */
	public TreeNode<J, K, V> insert(J j, K k, V v, TreeNode<J, K, V> node) {
		if (node == null) {
			root = new TreeNode<J, K, V>(j, k, v);
			size++;
			return root;
		}

		int cmp = node.getKey().compareTo(j);
		if (cmp > 0) {

			// Reached point of insertion
			if (node.getLeft() == null) {
				TreeNode<J, K, V> insert = new TreeNode<J, K, V>(j, k, v);
				insert.setParent(node);
				node.setLeft(insert);
				size++;
				return insert;
			}
			return insert(j, k, v, node.getLeft());
		}
		if (cmp < 0) {
			if (node.getRight() == null) {
				TreeNode<J, K, V> insert = new TreeNode<J, K, V>(j, k, v);
				insert.setParent(node);
				node.setRight(insert);
				size++;
				return insert;
			}
			return insert(j, k, v, node.getRight());
		}
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

	public boolean containsJ(J j) {
		return (get(j) != null);
	}

	public boolean containsK(K k) {
		return (pull(k) != null);
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
