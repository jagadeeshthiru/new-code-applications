class Fabi 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		int a=0;
		int b=1;
		int sum=0;
		System.out.println(a+" ");
       	System.out.println(b+" ");
		for(int i=3; i<=4;i++)
		{
			sum=a+b;
			System.out.println(sum+" ");
			a=b;
			b=sum;
		}

	}
}
