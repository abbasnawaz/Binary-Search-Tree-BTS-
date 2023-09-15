
public interface SearchTreeInterface<T extends Comparable<? super T>> 

       
{
   /** Searches for a specific entry in this tree.
       @param anEntry  An object to be found.
       @return  True if the object was found in the tree. */
   public boolean contains(Student anEntry);

   /** Retrieves a specific entry in this tree.
       @param anEntry  An object to be found.
       @return  Either the object that was found in the tree or
                null if no such object exists. */
   public Student getEntry(Student anEntry);

   /** Adds a new entry to this tree, if it does not match an existing 
       object in the tree. Otherwise, replaces the existing object with
       the new entry.
       @param anEntry  An object to be added to the tree.
       @return  Either null if anEntry was not in the tree but has been added, or
                the existing entry that matched the parameter anEntry
                and has been replaced in the tree. */
   public void add(Student anEntry);
/** Removes a specific entry from this tree.
       @param anEntry  An object to be removed.
       @return  Either the object that was removed from the tree or
                null if no such object exists. */
   public Node<Student> remove(Student anEntry);
  	/** It Traversals the Binary Tree in INORDER Form 
  	  * Left -> Root -> Right */
    public void inorder();
	/** It Traversals the Binary Tree in PREORDER Form
      * Root -> Left -> Right */
	public void preorder();
    /** It traversals the Binary Tree in POSTORDER Form
      * Left -> Right -> Root */
    public void postorder();
    /*It will clear all the Nodes in Tree*/
    public void clear();
    /*It will check weather the Tree is Empty or not
     * @return true if Binary tree is Empty means there is no node present 
     	even Root is null*/
    public boolean isEmpty();
    /*It will set sub-trees  */
    public void SetTree(Student data,Node<Student> Left, Node<Student> Right);
} // end SearchTreeInterface
