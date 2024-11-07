import java.util.Scanner;
class Vowel 
{
	public static void check(char ch)
	{
	switch(ch)
		{
		case 'A': System.out.println(ch+"It is a vowel");
		break;
		case 'E':System.out.println(ch+"It is a vowel");
		break;
		case 'I':System.out.println(ch+"It is a vowel");
		break;
        case 'O':System.out.println(ch+"It is a vowel");
		break;
		case 'U':System.out.println(ch+"It is a vowel");
		break;
		case 'a': System.out.println(ch+"It is a vowel");
		break;
		case 'e': System.out.println(ch+"It is a vowel");
		break;
		case 'i': System.out.println(ch+"It is a vowel");
		break;
		case 'o': System.out.println(ch+"It is a vowel");
		break;
		case 'u': System.out.println(ch+"It is a vowel");
		break;
		default: System.out.println(ch+ "It is a constant");
		break;
		}
	}



	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
         System.out.println("Enter an Alphabet");
		char alpa =sc.next().charAt(0);
		check(alpa);
	}
}