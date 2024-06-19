package PreLab8;

public class PreLab8Tester {

	public static void main(String[] args) {
		
		print(4);
		print("Test");
		print(12.34);
		print(4L);
	}
	
	public static void print(int i)
	{
		System.out.println(i + " is an integer");
	}
	
	public static void print(String s)
	{
		System.out.println("\"" + s + "\" is a String");
	}
	
	public static void print(double d)
	{
		System.out.println(d + " is a double");
	}
	
	public static void print(long l)
	{
		System.out.println(l + " is a long");
	}

}
