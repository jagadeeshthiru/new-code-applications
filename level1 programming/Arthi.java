import java.util.Scanner;
class Arthi
{
	public static int add(int a,int b)
	{
		return a+b;
	}
	public static int mul(int b,char ch1)
	{
		return b*ch1;
	}
	public static int sub(int a, char ch2)
	{
		return a-ch2;
	}
	public static void main(String[] args) 
	{
		System.out.println("main starts!!");
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		System.out.println("Enter a character");
		char char1=sc.next().charAt(0);
		char char2=sc.next().charAt(0);

		Sytsem.out.println(add(num1,num2));
		Sytsem.out.println(mul(num2,char1));
		Sytsem.out.println(sub(num1,char2));
	}
}
