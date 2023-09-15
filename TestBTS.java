public class TestBTS //implements Comparable
{
	public static void main(String[] args)
	{
		Student s0 = new Student();
		Student s1 = new Student(1,"Kaleem","Computer Science",3.44);
		Student s2 = new Student(2,"Faheem","English",3.0);
		Student s3 = new Student(3,"Sheryl","Interior",2.75);
		Student s4 = new Student(4,"Ommi","Mass Com",4.0);
		Student s5 = new Student(5,"Zoha","Fashion",4.0);
		Student s6 = new Student(6,"Daneil","Software",2.5);
		Student s7 = new Student(7,"Habib","Islamic",3.75);
		Student s8 = new Student(8,"Jameel","Software",4.0);
		Student s9 = new Student(9,"Pasha","Islamic",2.6);
		Student s10 = new Student(10,"Waleed","Fashion",3.24);

		SearchTree<Student> test1= new SearchTree<Student>();
		test1.add(s1);
		test1.add(s2);
		test1.add(s3);
		test1.add(s4);
		test1.add(s5);
		test1.add(s6);
		test1.add(s7);
		test1.add(s8);
		test1.add(s9);
		test1.add(s10);

		System.out.println(" Printing in INORDER ");
		System.out.println();
		test1.inorder();
		System.out.println();
		System.out.println("--------------------------------------");
		System.out.println();

		System.out.println();
		System.out.println("after removing ");
		System.out.println();
		System.out.println();

		Node<Student> remove = new Node<Student>();
		remove=test1.remove(s2);
		System.out.println(" This Node has been Removed "+remove.getData());
		Node<Student> remove1 = new Node<Student>();
		remove1=test1.remove(s7);
		System.out.println(" This Node has been Removed "+remove1.getData());
		System.out.println();
		test1.inorder();
		System.out.println();
		System.out.println();
		System.out.println("  Printing in INORDER ");
		System.out.println();
		test1.inorder();
		System.out.println();
		System.out.println("----------------------------------");
		System.out.println(" Printing in PREORDER ");
		System.out.println();
		test1.preorder();
		System.out.println();
		System.out.println("----------------------------------");
		System.out.println(" Printing in POSTORDER ");
		System.out.println();
		test1.postorder();
		System.out.println("----------------------------------");
		System.out.println();


		System.out.println(" Does Binary Tree isEmpty ? "+test1.isEmpty());

		System.out.println();
		System.out.println();

		test1.clear();
		

		
		
	}

}