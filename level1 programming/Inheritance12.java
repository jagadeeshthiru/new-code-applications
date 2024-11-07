class School
{
	public void student()
	{
		System.out.println("Learning");
	}
	public void teacher()
	{
		System.out.println("Explaining");
	}
}
class Institution extends School
{
	public void hod()
	{5THN
		System.out.println("Head of the department");
	}
}
class University extends Institution
{
	public void principle()
	{
		System.out.println("Manitance");
	}
}
class Inheritance12
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		School s1=new School();
		University u1=new University();
		Institution i1= new Institution();
		s1.student();
		s1.teacher();
		u1.hod();
		u1.student();
		u1.teacher();
		u1.principle();
		i1.hod();
		i1.teacher();
		i1.student();


	}
}
