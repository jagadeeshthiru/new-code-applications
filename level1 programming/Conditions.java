import java.util.Scanner;
class Conditions
{
	public static char letter(char c)
	{
		return(c>='A'&&c<='Z')?"uppercaseAlpa":"lowerCaseAlpa";
	}


	public static void main(String[] args) 
	{
      Scanner sc=new Scanner(System.in);
		System.out.println("Enter the letter:");
		char id =sc.charAt();
		letter(id);
	}
}
