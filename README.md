# Tangled Tree

The TangledTree ADT is an implementation of a standard Java Binary Search Tree with the Ability to store and retrieve a value in a \<KEY, KEY, VALUE> mapping.
This results in a Multi Key Tree Structure and mantains O(log n) for best case searches and insertion.


### The Tangled Tree ADT methods
- The Tree implements the standard Tree interface, but contains the modified methods:

```Java
     insert(J j,K k,V v); // inserts a new Entry with Keys J, K and Value V
     get(J key); // Returns value associated with Key J
     pull(K key); // Returns value associated with Key K
     remove(J j); //Removes Value associated with Key J
     delete(K k); //Removes the value associated with Key K
     
```
     
 This implementation uses generics and therefore due to Type erasure, overloading the methods is not possible.
 Access method for each key are as follows:
 
|**Action**|**J**|**K**|
|:-----:|:-----:|:-----:|
|Set left child|setLeft(TreeNode n)|pushLeft(TreeNode n)|
|Set right child|setRight(TreeNode n)|pushLeft(TreeNode n)|
|Set parent|setParent(TreeNode n)|pushParent(TreeNode n)|
|Get parent|getParent()|pullParent()|
|Get left child|getLeft()|pullLeft()|
|Get right child|getRight()|pullRight()|
|Get Value|getValue()|getValue()|
|Get Key|getKey()|pullKey()|
