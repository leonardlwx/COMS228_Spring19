package edu.iastate.cs228.hw5;


import java.util.AbstractSet;
import java.util.Iterator;
import java.util.NoSuchElementException;


/**
 * 
 * @author 
 *
 */


/**
 * 
 * This class implements a splay tree.  Add any helper methods or implementation details 
 * you'd like to include.
 *
 */


public class SplayTree<E extends Comparable<? super E>> extends AbstractSet<E>
{
	protected Node root; 
	protected int size; 

	public class Node  // made public for grading purpose
	{
		public E data;
		public Node left;
		public Node parent;
		public Node right;

		public Node(E data) {
			this.data = data;
		}

		@Override
		public Node clone() {
			return new Node(data);
		}	
	}

	
	/**
	 * Default constructor constructs an empty tree. 
	 */
	public SplayTree() 
	{
		size = 0;
	}
	
	
	/**
	 * Needs to call addBST() later on to complete tree construction. 
	 */
	public SplayTree(E data) 
	{
		// TODO 
	}

	
	/**
	 * Copies over an existing splay tree. The entire tree structure must be copied.  
	 * No splaying. Calls cloneTreeRec(). 
	 * 
	 * @param tree
	 */
	public SplayTree(SplayTree<E> tree)
	{
		// TODO 
	}

	
	/**
	 * Recursive method called by the constructor above. 
	 * 
	 * @param subTree
	 * @return
	 */
	private Node cloneTreeRec(Node subTree) 
	{
		// TODO
		return null; 
	}
	
	
	/**
	 * This function is here for grading purpose. It is not a good programming practice.
	 * 
	 * @return element stored at the tree root 
	 */
	public E getRoot()
	{
		// TODO 
		return null; 
	}
	
	
	@Override 
	public int size()
	{
		// TODO
		return 0; 
	}
	
	
	/**
	 * Clear the splay tree. 
	 */
	@Override
	public void clear() 
	{
		// TODO 
	}
	
	
	// ----------
	// BST method
	// ----------
	
	/**
	 * Adds an element to the tree without splaying.  The method carries out a binary search tree
	 * addition.  It is used for initializing a splay tree. 
	 * 
	 * Calls link(). 
	 * 
	 * @param data
	 * @return true  if addition takes place  
	 *         false otherwise (i.e., data is in the tree already)
	 */
	public boolean addBST(E data)
	{
		// TODO 
		return false; 
	}
	
	
	// ------------------
	// Splay tree methods 
	// ------------------
	
	/**
	 * Inserts an element into the splay tree. In case the element was not contained, this  
	 * creates a new node and splays the tree at the new node. If the element exists in the 
	 * tree already, it splays at the node containing the element. 
	 * 
	 * Calls link(). 
	 * 
	 * @param  data  element to be inserted
	 * @return true  if addition takes place 
	 *         false otherwise (i.e., data is in the tree already)
	 */
	@Override 
	public boolean add(E data)
	{
		// TODO 
		return false; 
	}
	
	
	/**
	 * Determines whether the tree contains an element.  Splays at the node that stores the 
	 * element.  If the element is not found, splays at the last node on the search path.
	 * 
	 * @param  data  element to be determined whether to exist in the tree
	 * @return true  if the element is contained in the tree 
	 *         false otherwise
	 */
	public boolean contains(E data)
	{
		// TODO 
		return false; 
	}
	
	
	/**
	 * Finds the node that stores the data and splays at it.
	 *
	 * @param data
	 */
	public void splay(E data) 
	{
		contains(data);
	}

	
	/**
	 * Removes the node that stores an element.  Splays at its parent node after removal
	 * (No splay if the removed node was the root.) If the node was not found, the last node 
	 * encountered on the search path is splayed to the root.
	 * 
	 * Calls unlink(). 
	 * 
	 * @param  data  element to be removed from the tree
	 * @return true  if the object is removed 
	 *         false if it was not contained in the tree 
	 */
	public boolean remove(E data)
	{
		// TODO 
		return false; 
	}


	/**
	 * This method finds an element stored in the splay tree that is equal to data as decided 
	 * by the compareTo() method of the class E.  This is useful for retrieving the value of 
	 * a pair <key, value> stored at some node knowing the key, via a call with a pair 
	 * <key, ?> where ? can be any object of E.   
	 * 
	 * Calls findEntry(). Splays at the node containing the element or the last node on the 
	 * search path. 
	 * 
	 * @param  data
	 * @return element such that element.compareTo(data) == 0
	 */
	public E findElement(E data) 
	{
		// TODO 
		return null; 
	}

	
	/**
	 * Finds the node that stores an element. It is called by methods such as contains(), add(), remove(), 
	 * and findElement(). 
	 * 
	 * No splay at the found node. 
	 *
	 * @param  data  element to be searched for 
	 * @return node  if found or the last node on the search path otherwise
	 *         null  if size == 0. 
	 */
	protected Node findEntry(E data)
	{
		// TODO 
		return null; 
	}
	
	
	/** 
	 * Join the two subtrees T1 and T2 rooted at root1 and root2 into one.  It is 
	 * called by remove(). 
	 * 
	 * Precondition: All elements in T1 are less than those in T2. 
	 * 
	 * Access the largest element in T1, and splay at the node to make it the root of T1.  
	 * Make T2 the right subtree of T1.  The method is called by remove(). 
	 * 
	 * @param root1  root of the subtree T1 
	 * @param root2  root of the subtree T2 
	 * @return the root of the joined subtree
	 */
	protected Node join(Node root1, Node root2)
	{
		// TODO
		return null; 
	}

	
	/**
	 * Splay at the current node.  This consists of a sequence of zig, zigZig, or zigZag 
	 * operations until the current node is moved to the root of the tree.
	 * 
	 * @param current  node to splay
	 */
	protected void splay(Node current)
	{
		// TODO
	}
	

	/**
	 * This method performs the zig operation on a node. Calls leftRotate() 
	 * or rightRotate().
	 * 
	 * @param current  node to perform the zig operation on
	 */
	protected void zig(Node current)
    {
		// TODO
	}

	
	/**
	 * This method performs the zig-zig operation on a node. Calls leftRotate() 
	 * or rightRotate().
	 * 
	 * @param current  node to perform the zig-zig operation on
	 */
	protected void zigZig(Node current)
	{
		// TODO
	}

	
    /**
	 * This method performs the zig-zag operation on a node. Calls leftRotate() 
	 * and rightRotate().
	 * 
	 * @param current  node to perform the zig-zag operation on
	 */
	protected void zigZag(Node current)
	{
		// TODO
	}	
	
	
	/**
	 * Carries out a left rotation at a node such that after the rotation 
	 * its former parent becomes its left child. 
	 * 
	 * Calls link(). 
	 * 
	 * @param current
	 */
	private void leftRotate(Node current)
	{
		
	}

	
	/**
	 * Carries out a right rotation at a node such that after the rotation 
	 * its former parent becomes its right child. 
	 * 
	 * Calls link(). 
	 * 
	 * @param current
	 */
	private void rightRotate(Node current)
	{
		
	}	
	
	
	/**
	 * Establish the parent-child relationship between two nodes. 
	 * 
	 * Called by addBST(), add(), leftRotate(), and rightRotate(). 
	 * 
	 * @param parent
	 * @param child
	 */
	private void link(Node parent, Node child) 
	{
		// TODO 
	}
	
	
	/** 
	 * Removes a node n by replacing the subtree rooted at n with the join of the node's
	 * two subtrees.
	 * 
	 * Called by remove().   
	 * 
	 * @param n
	 */
	private void unlink(Node n) 
	{
		// TODO 
	}
	
	
	/**
	 * Perform BST removal of a node. 
	 * 
	 * Called by the iterator method remove(). 
	 * @param n
	 */
	private void unlinkBST(Node n)
	{
		// TODO 
	}
	
	
	/**
	 * Called by unlink() and the iterator method next(). 
	 * 
	 * @param n
	 * @return successor of n 
	 */
	private Node successor(Node n) 
	{
		// TODO 
		return null; 
	}

	
	@Override
	public Iterator<E> iterator()
	{
	    return new SplayTreeIterator();
	}

	
	/**
	 * Write the splay tree according to the format specified in Section 2.2 of the project 
	 * description.
	 * 	
	 * Calls toStringRec(). 
	 *
	 */
	@Override 
	public String toString()
	{
		// TODO 
		return null; 
	}

	
	private String toStringRec(Node n, int depth)
	{
		// TODO 
		return null; 
	}
	
	
	/**
	   *
	   * Iterator implementation for this splay tree.  The elements are returned in 
	   * ascending order according to their natural ordering.  The methods hasNext()
	   * and next() are exactly the same as those for a binary search tree --- no 
	   * splaying at any node as the cursor moves.  The method remove() behaves like 
	   * the class method remove(E data) --- after the node storing data is found.  
	   *  
	   */
	private class SplayTreeIterator implements Iterator<E>
	{
		Node cursor;
		Node pending; 

	    public SplayTreeIterator()
	    {
	    	// TODO
	    }
	    
	    @Override
	    public boolean hasNext()
	    {
	    	// TODO
	    	return true; 
	    }

	    @Override
	    public E next()
	    {
	    	// TODO
	    	return null; 
	    }

	    /**
	     * This method will join the left and right subtrees of the node being removed, 
	     * and then splay at its parent node.  It behaves like the class method 
	     * remove(E data) after the node storing data is found.  Place the cursor at the 
	     * parent (or the new root if removed node was the root).
	     * 
	     * Calls unlinkBST(). 
	     * 
	     */
	    @Override
	    public void remove()
	    {
	      // TODO
	    }
	}
}
