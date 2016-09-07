package tangleTree;

public interface Node<J, K, V> {

	public V value();

	public Node<J, K, V> getLeft();

	public Node<J, K, V> getRight();

	public Node<J, K, V> pullRight();

	public Node<J, K, V> pullLeft();

	public Node<J, K, V> setParent(Node<K, J, V> node);

	public Node<J, K, V> addParent(Node<K, J, V> node);

	public Node<J, K, V> getParent();

	public Node<J, K, V> pullParent();

	public Node<J, K, V> addLeft(Node<K, J, V> node);

	public Node<J, K, V> addRight(Node<K, J, V> node);

	public Node<J, K, V> setLeft(Node<K, J, V> node);

	public Node<J, K, V> setRight(Node<K, J, V> node);

}
