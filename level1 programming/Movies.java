class Movies
{
	public static void hero()
	{
		System.out.println("main character");
	}
		public static void heroine()
	{
			System.out.println("beauty Character");
	}
	public void villan()
	{
		System.out.println("negative");
	}
	public void comedian()
	{
		System.out.println("funny");
	}

	public static void main(String[] args) 
	{
		System.out.println("characters");
		Movies m1=new Movies();
		Movies m2=new Movies();
		hero();
		heroine();
		m1.villan();
		m2.comedian();
		System.out.println("end movie");

	}
}
