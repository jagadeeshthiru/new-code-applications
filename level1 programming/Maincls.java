public class A {
	 public static void bike() {
		 System.out.println(" model");
		
	}

}
public class B
{
	public  void plain() {
		System.out.println("speed");
		A.bike();
		
	}
}
public class c
{
	public void cycle() {
		System.out.println("jetspeed");
		
	}
}

public class D
{
	public static void motor() {
	   System.out.println("Easy");
	   C c1=new C();
	   c1.cycle();
	}


public class Maincls
{
	public static void main(String[] args) {
		
	} 
	B b1=new B();
	b1.plain();

	D.motor();
		
	}
}
