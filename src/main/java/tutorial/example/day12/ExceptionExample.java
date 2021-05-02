package tutorial.example.day12;

public class ExceptionExample
{
	public static void main(String[] args)
	{
		System.out.println("\n\n");
		checkPersonAge(20);
		System.out.println("\n\n");
	}


	private static boolean checkPersonAge(int age)
	{
		if (age < 18)
		{
			throw new ArithmeticException("to buy a lottery ticket, you must be 18 years old or above");
		}

		System.out.print("you are old enough to buy lottery");

		return true;
	}


	private static void exception1()
	{
		try {
			// array: length fixed.
			int[] numbers = {1, 2, 3, 4, 5};
			System.out.println("fetching the 6th number of the array");
			System.out.println("sixth number is: " + numbers[5]);  // valid indexes are from 0 to 4
			System.out.println("read array finished");
		}
		catch (Exception ex) {
			System.out.println("an exception happened.");
			System.out.println("error message is:" + ex.getMessage());
			System.out.println("exception class is:" + ex.getClass().getName());
		}
		finally {
			System.out.println("hey, I am here in the finally block.");
		}
	}

	private static void exception2()
	{
		try {
			int result = 1 / 0;
			System.out.println(result);
		}
		catch (ArithmeticException exp)
		{
			System.out.println("An error happened, a number cannot be divided by zero");
		}
	}
}
