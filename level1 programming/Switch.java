import java.util.Scanner;
class Switch 
{
	public static void name(String s)
	{
		switch (s)
		{
		case "monday":System.out.println("1");
		                break;
		case "tuesday":System.out.println("2");
		     break;
		case "Wednesday": System.out.println("3");
		break; 
		case "thursday":System.out.println("4");
		break;
        case "friday":System.out.println("5");
		break;
		case "saturday":System.out.println("6");
		break;
		case "Sunday": System.out.println("7");
		break;
		default:System.out.println("Enter the day number MONDAY TO SUNDAY");

		}
	}
	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the days");
		String day=sc.next();
		name(day);

	}
}
