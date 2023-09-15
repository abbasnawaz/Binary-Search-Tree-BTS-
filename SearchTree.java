public class SearchTree<T extends Comparable<? super T>> implements SearchTreeInterface<T>
{

	private Node<Student> Root;

	SearchTree()
	{
		Root=null;  
	}

	public Node<Student> getRoot()
	{
		return Root;
	} 
	public void setRoot(Node<Student> Root)
	{
		this.Root=Root;
	}

	public void add(Student key)
	{
		Student type = new Student(key);
    	Root = insert(getRoot(), type);
	}
 
	private Node<Student> insert(Node<Student> data, Student key)
	{

    	if (data == null) 
    	{
    		Node<Student> sdata = new Node<Student>();
    		sdata.setData(key); 
        	return sdata;
    	}
     
    	if (data.getData().equals(key)) 
    	{
    		return null;    
    	}
    
    	else if (key.compareTo(data.getData()) < 0) 
    	{
        
        	data.setLeft( insert(data.getLeft(), key) );
        	return data;
    	}
    
   	 	else 
   	 	{
            data.setRight( insert(data.getRight(), key) );
      	  return data;
    	}
	}


	public Student getEntry(Student entry)
	{
   		return findEntry(getRoot(), entry);
	}

	private Student findEntry(Node<Student> rootNode, Student entry)
	{
		//Node<Student> temp = getRoot();
	   Student result = null;

	   if (rootNode != null)
	  	{
			Student check = rootNode.getData();
			//System.out.println(check);
      		if (entry.equals(check))
      		{
         		result = check;
      		}
      		else if (entry.compareTo(check) < 0)
      		{
      			//System.out.println(" check left ");
        	 	result = findEntry(rootNode.getLeft(), entry);
      		}
      		else
      		{
      			//System.out.println(" check right ");
        	 	result = findEntry(rootNode.getRight(), entry);
      		}
   		}	 

   		return result;
	} 


	public boolean contains(Student entry)
	{
   		return getEntry(entry) != null; 
	}

	public Node<Student> remove(Student entry)
	{
  	 	Node<Student> oldEntry = new Node<Student>();
   		Node<Student> newRoot = removeEntry(getRoot(), entry, oldEntry);
   		setRoot(newRoot);

   		return oldEntry;
	}


	private Node<Student> removeEntry(Node<Student> rootNode, Student entry,Node<Student> oldEntry)
	{
   		if (rootNode.getData() != null)
   		{
    	 Student rootData = rootNode.getData();
    	  int comparison = entry.compareTo(rootData);

    	  if (comparison == 0)       
    	  {
    	     oldEntry.setData(rootData);
    	     rootNode = removeFromRoot(rootNode);
    	  }
    	  else if (comparison < 0)   
    	  {
    	     Node<Student> leftChild = rootNode.getLeft();
    	     Node<Student> subtreeRoot = removeEntry(leftChild, entry, oldEntry);
    	     rootNode.setLeft(subtreeRoot);
    	  }
    	  else                    
    	  {
    	     Node<Student> rightChild = rootNode.getRight();
    	     Node<Student> subroottree0 = removeEntry(rightChild, entry, oldEntry);
    	     rootNode.setRight(subroottree0);
    	  }
   		} 

   		return rootNode;
	} 




	
	private Node<Student> removeFromRoot(Node<Student> rootNode)
	{
	  
	   if (rootNode.hasLeftChild() && rootNode.hasRightChild())
	   {
    	  
    	  Node<Student> leftSubtreeRoot = rootNode.getLeft();
    	  Node<Student> largestNode = findLargest(leftSubtreeRoot);

    	  
    	  rootNode.setData(largestNode.getData());

    	  
    	  rootNode.setLeft(removeLargest(leftSubtreeRoot));
   		} 
   		else if (rootNode.hasRightChild())
   		{
   		   rootNode = rootNode.getRight();
   		}
   		else
   		{
      		rootNode = rootNode.getLeft();
      	}
   

   		return rootNode;
	} 



	private Node<Student> removeLargest(Node<Student> rootNode)
	{
	   if (rootNode.hasRightChild())
	   {
	     Node<Student> rightChild = rootNode.getRight();
	      rightChild = removeLargest(rightChild);
	      rootNode.setRight(rightChild);
	   }
	   else
	   {
      		rootNode = rootNode.getLeft();
      	}
   		return rootNode;
	}


	private Node<Student> findLargest(Node<Student> rootNode)
	{
	   if (rootNode.hasRightChild())
	   {
    	  rootNode = findLargest(rootNode.getRight());
	   }

   		return rootNode;
	}


	public boolean isEmpty()
	{
		return (getRoot()==null);
	}

	public void clear()
	{
		Root=null;
	}


	public void SetTree(Student data,Node<Student> Left, Node<Student> Right)
	{
		Node<Student> newNode = new Node<Student>(data);
		newNode.setLeft(Left);
		newNode.setRight(Right);
		Root=newNode;

	}

	
	public void inorder()
	{
		inTraverse(getRoot());

	}

	public void postorder()
	{
		postTraverse(getRoot());
	}

	public void preorder()
	{
		preTraverse(getRoot());
	}

	private void preTraverse(Node<Student> root)
	{
		if(root!=null)
		{
			System.out.println(root.getData());
			preTraverse(root.getLeft());
			preTraverse(root.getRight());
		}
	}

	private void postTraverse(Node<Student> root)
	{
		if(root!=null)
		{
			postTraverse(root.getLeft());
			postTraverse(root.getRight());
			System.out.println(root.getData());
		}
	}


	private void inTraverse(Node<Student> root)
	{
		if(root!=null)
		{
			inTraverse(root.getLeft());
			System.out.println(root.getData());
			inTraverse(root.getRight());
		}
	}

	
}

