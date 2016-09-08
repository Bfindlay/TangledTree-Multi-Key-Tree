package tangleTree;

public class TangledTree<J extends Comparable<J>, K extends Comparable<K>, V extends Comparable<V>> {

	/*** BEGING NESTED TREENODE IMPLEMENTATION ***/

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

	/*** BEGING TREE IMPLEMENTATION ****/

	public TreeNode<J, K, V> root;
	private int size;

	public TangledTree() {
		this.size = 0;
		this.root = null;
	}

	public V get(J key) {
		return get(key, root);
	}

	public TreeNode<J, K, V> root() {
		return this.root;
	}

	public V get(J j, TreeNode<J, K, V> node) {
		if (node == null) {
			return null;
		}
		int cmp = j.compareTo(node.getKey());
		System.out.println("compare is " + cmp);
		if (cmp == 0) {
			return node.getValue();
		} else if (cmp < 0) {
			get(j, node.getRight());
		} else if (cmp > 0) {
			get(j, node.getLeft());
		}
		return node.value;

	}

	public V pull(K key) {
		return pull(key, root);
	}

	public V pull(K key, TreeNode<J, K, V> node) {
		if (node == null) {
			return null;
		}
		// base case: k matches the key in the current entry
		if (key.compareTo(node.pullKey()) == 0) {
			// TODO: return the value
			return node.getValue();
		}
		// recursive case: k < the current entry
		else if (key.compareTo(node.pullKey()) < 0) {
			// TODO: return the result of recursing to the left
			return pull(key, node.pullLeft());
		}
		// recursive case: k > the current entry
		else {
			// TODO: return the result of recursing to the right
			return pull(key, node.pullRight());
		}
	}

	public void insert(J j, K k, V v) {

		// the resulting subtree after doing the put
		put(j, k, v, root());

	}

	public TreeNode<J, K, V> put(J key, K k, V val, TreeNode<J, K, V> x) {

		if (x == null) {
			TreeNode<J, K, V> entry = new TreeNode<J, K, V>(key, k, val);
			if (root == null)
				this.root = entry;
			size++;
			return entry;
		}
		int cmp = key.compareTo(x.getKey());
		System.out.println(cmp);
		if (cmp < 0) {
			x.jLeft = put(key, k, val, x.jLeft);
		} else if (cmp > 0) {
			x.jRight = put(key, k, val, x.jRight);
		} else {
			// cmp == 0
			TreeNode<J, K, V> entry = new TreeNode<J, K, V>(key, k, val);
			entry.setParent(entry);
			int comp = key.compareTo(entry.getParent().getKey());
			if (comp < 0)
				entry.getParent().setLeft(entry);
			else if (comp > 0)
				entry.getParent().setRight(entry);
			TreeNode<J, K, V> left = (x.getLeft() != null) ? x.getLeft() : null;
			TreeNode<J, K, V> right = (x.getRight() != null) ? x.getRight() : null;
			entry.setLeft(left);
			entry.setRight(right);
			if (left != null)
				left.setParent(entry);
			if (right != null)
				right.setParent(entry);
			return entry;
		}
		return x;
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
