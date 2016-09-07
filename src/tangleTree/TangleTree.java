package tangleTree;

public interface TangleTree<K, J, V> {

	public Node<K, J, V> insert(Node<K, J, V> node);

	public boolean isEmpty();

	public int size();

	public void clear();

	public boolean contains(Node<K, J, V> node);

	public Node<K, J, V> get(K key);

	public Node<K, J, V> pull(J key);

	public Node<K, J, V> remove(Node<K, J, V> node);

}
