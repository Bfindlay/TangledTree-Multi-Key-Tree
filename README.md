# Tangled Tree

This is an implementation of a Binary Search tree that stores Data in a <KEY, KEY, VALUE> mapping.
This allows for a value to be retrieved using one of two keys and yet maintain O(log n) for best case searches

### The Tangled Tree ADT methods
- The Tree implements the standard Tree interface, but contains the modified methods: 
```Java
     insert(J j,K k,V v) //insert a new Entry with Keys J, K and Value V
    get(J key); //Returns value associated with Key J
    pull(K key); //Returns value associated with Key K

