class Inheritance
{
	public void employee()
	{
		System.out.println("work");

	}
	public void teamLeader() extends employee()
	{
		System.out.println("Main lead and work");
	}
	public void manager() extends teamLeader
	{
        
		System.out.println("PROJECT REVIEW");
	}
	public void hr() extends manager();
	{
        
		System.out.println("Main Leader");
	}

	public static void main(String[] args) 
	{
		System.out.println("Main Starts");
		Inheritance i1=new Inheritance();
		Inheritance i2=new Inheritance();
		Inheritance i3=new Inheritance();
	    Inheritance i4=new Inheritance();
         i1.employee();
		 i2.teamLeader();
		 i3.manager();
		 i4.hr();



	}
}
