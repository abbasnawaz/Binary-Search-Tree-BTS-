public class Node<Student> 
{
	private Student data;
	private Node left;
	private Node right;



	public boolean hasLeftChild()
	{
		if(getLeft()!=null)
		{
			return true;
		}
		else
			return false;
	}

	public boolean hasRightChild()
	{
		if(getRight()!=null)
		{
			return true;
		}
		else
			return false;
	}



	Node()
	{
		data = null;
		left = null;
		right = null;
	}
	Node(Student data)
	{
		this.data=data;
		left=null;
		right=null;
	}
	Node(Student data,Node left,Node right)
	{
		this.data=data;
		this.left=left;
		this.right=right;
	}


	void setData(Student data)
	{
		this.data=data;
	}
	void setLeft(Node left)
	{
		this.left=left;
	}
	void setRight(Node right)
	{
		this.right=right;
	}



	Student getData()
	{
		return data;
	}

	Node getLeft()
	{
		return left;
	}
	Node getRight()
	{
		return right;
	}

	

}