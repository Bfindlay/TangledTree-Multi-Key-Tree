package tangleTree;

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

	public K getKey() {
		return kKey;
	}

	public J pullKey() {
		return jKey;
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
