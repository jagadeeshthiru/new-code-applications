import java.util.Scanner;
class Mulit
{
	public static void add(int n,int m)
	{
		for (int i=n;i<=m ;i++)
		{
			System.out.println(i);
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
        Scanner sc =new Scanner(System.in);
		System.out.println("Enter your first number");
		int num1=sc.nextInt();
		System.out.println("Enter your  second number");
		int num2=sc.nextInt();
        
        add(num1,num2);
	
        
	}
}
