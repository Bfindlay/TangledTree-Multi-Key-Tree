package tangleTree;

public class TreeNode<K, J, V> implements Node<K, J, V> {

	private Node<K, J, V> kLeft;
	private Node<K, J, V> kRight;
	private Node<K, J, V> jLeft;
	private Node<K, J, V> jRight;
	private Node<K, J, V> kParent;
	private Node<K, J, V> jParent;
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

	@Override
	public V value() {
		return this.value;
	}

	@Override
	public Node<K, J, V> getParent() {
		return this.kParent;
	}

	@Override
	public Node<K, J, V> pullParent() {
		return this.jParent;
	}

	@Override
	public Node<K, J, V> addParent(Node node) {
		this.kParent = node;
		return node;
	}

	@Override
	public Node<K, J, V> setParent(Node node) {
		this.jParent = node;
		return node;
	}

	@Override
	public Node<K, J, V> getLeft() {
		return this.kLeft;
	}

	@Override
	public Node<K, J, V> getRight() {
		return this.kRight;
	}

	@Override
	public Node<K, J, V> pullRight() {
		return this.jRight;
	}

	@Override
	public Node<K, J, V> pullLeft() {
		return this.jLeft;
	}

	public K getKey() {
		return kKey;
	}

	public J pullKey() {
		return jKey;
	}

	@Override
	public Node<K, J, V> addLeft(Node node) {
		this.kLeft = node;
		return node;
	}

	@Override
	public Node<K, J, V> addRight(Node node) {
		this.kRight = node;
		return node;
	}

	@Override
	public Node<K, J, V> setLeft(Node node) {
		this.jLeft = node;
		return node;
	}

	@Override
	public Node<K, J, V> setRight(Node node) {
		this.jRight = node;
		return node;
	}

}
