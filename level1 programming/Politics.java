class Politics
{
	public static void jagan()
	{
		System.out.println("Chief Minister");
	}
	public void nani()
	{
		System.out.println("Minister");
		jagan();
	}
    public void suresh()
	{
		System.out.println("Medical Minister");
	}
	public static void main(String[] args) 
	{
		System.out.println("politision");
		Politics p1=new Politics();
		Politics p2=new Politics();
		p1.nani();
		p2.suresh();
	}
}
