package tangleTree;

public class TreeNode<K extends Comparable<K>, J extends Comparable<J>, V extends Comparable<V>>
		implements Comparable<TreeNode<J, K, V>> {

	private TreeNode<K, J, V> kLeft;
	private TreeNode<K, J, V> kRight;
	private TreeNode<K, J, V> jLeft;
	private TreeNode<K, J, V> jRight;
	private TreeNode<K, J, V> kParent;
	private TreeNode<K, J, V> jParent;
	private V value;
	private K kKey;
	private J jKey;

	public TreeNode() {

	}

	public TreeNode(K key, J jKey, V value) {
		this.kKey = key;
		this.jKey = jKey;
		this.value = value;
	}

	public V getValue() {
		return this.value;
	}

	public TreeNode<K, J, V> getParent() {
		return this.kParent;
	}

	public TreeNode<K, J, V> pullParent() {
		return this.jParent;
	}

	public TreeNode<K, J, V> addParent(TreeNode node) {
		this.kParent = node;
		return node;
	}

	public TreeNode<K, J, V> setParent(TreeNode node) {
		this.jParent = node;
		return node;
	}

	public TreeNode<K, J, V> getLeft() {
		return this.kLeft;
	}

	public TreeNode<K, J, V> getRight() {
		return this.kRight;
	}

	public TreeNode<K, J, V> pullRight() {
		return this.jRight;
	}

	public TreeNode<K, J, V> pullLeft() {
		return this.jLeft;
	}

	public K getKey() {
		return kKey;
	}

	public J pullKey() {
		return jKey;
	}

	public TreeNode<J, K, V> addLeft(TreeNode node) {
		this.kLeft = node;
		return node;
	}

	public TreeNode<J, K, V> addRight(TreeNode node) {
		this.kRight = node;
		return node;
	}

	public TreeNode<J, K, V> setLeft(TreeNode node) {
		this.jLeft = node;
		return node;
	}

	public TreeNode<J, K, V> setRight(TreeNode node) {
		this.jRight = node;
		return node;
	}

	public int compareTo(TreeNode<J, K, V> o) {
		return o.value.compareTo(this.value);
	}

}
