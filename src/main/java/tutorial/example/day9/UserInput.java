package tutorial.example.day9;

import java.util.Scanner;

public class UserInput
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string");

		String input = scanner.nextLine();
		System.out.println("User input is: " + input);
	}
}
