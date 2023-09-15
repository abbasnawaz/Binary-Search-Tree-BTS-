  public class Student implements Comparable<Student>
 {

	private int ID;
	private String name;
	private String program;
	private double GPA;
	
	
	public Student() {
		ID=0;
		name = null;
		program= null;
		GPA=0;
	}
	public Student(Student otherStudent)
	{
		this.ID=otherStudent.getID();
		this.name=otherStudent.getName();
		this.program=otherStudent.getProgram();
		this.GPA=otherStudent.getGPA();
	}

	
	
	public Student(int iD, String name, String program, double gPA) {
		
		ID = iD;
		this.name = name;
		this.program = program;
		GPA = gPA;
	}





	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProgram() {
		return program;
	}
	public void setProgram(String program) {
		this.program = program;
	}
	public double getGPA() {
		return GPA;
	}
	public void setGPA(double gPA) {
		GPA = gPA;
	}
	
	 @Override
	public String toString()
	{
		return getID()+" , "+getName()+" , "+getProgram()+" , "+getGPA();
	}

	@Override
	public int compareTo(Student otherStudent)
	{
		
		return(this.getName().compareTo(otherStudent.getName()));
		

	}


	
	

}
