package tutorial.example.day1;

public class HelloWorld
{
	public static void main(String[] args)
	{
		System.out.println("Hello world, this is my first Java code");

		// call method to print name
		print("Mr. JustForLaugh");
	}

	public static void print(String name)
	{
		System.out.println(String.format("hello, %s", name));
	}
}
