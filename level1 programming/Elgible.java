import java.util.Scanner;
class Elgible 
{
	public static void check(int a)
	{
		if (a>=18)
		{
			System.out.println("You are Eligible for voting");

		}
		else
		{
			System.out.println("Your not Eligible for Voting");
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("Main starts");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		int AGEE=sc.nextInt();
		check(AGEE);
	}
}
