class Employee extends Student
{
   public void run()
	{
	   System.out.println("hello iam jagadeesh");
	}
}
class Mainclog
{
	public static void main(String[] args) 
	{
		Employee e1=new Employee();
		Student t1=new Student(e1);
		t1.run();
	}
}
