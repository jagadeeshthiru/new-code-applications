import java.util.Scanner;
class Sampy3
{
  public static void data(int id,String name)
	{
	  System.out.println(name);
	  System.out.println(id);
	}

	public static void main(String[] args) 
	{
		System.out.println("main starts");
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your name");
		String Sname =sc.next();
		System.out.println("Enter your id");
		int Idno = sc.nextInt();
		data(Idno,Sname);
	}
}
