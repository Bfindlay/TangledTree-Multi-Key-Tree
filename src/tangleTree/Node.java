package tangleTree;

public interface Node<J, K, V> {

	public V value();

	public Node<J, K, V> getLeft();

	public Node<J, K, V> getRight();

	public Node<J, K, V> pullRight();

	public Node<J, K, V> pullLeft();
}
