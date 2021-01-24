package tutorial.example;

public class Variables
{
	public static void main(String[] args)
	{
		String studentName = "Tom Black";
		int age = 22;
		double gpa = 3.75;
		boolean isFemale = true;

		System.out.println(String.format("%s is %d years old. %s has a %s gpa.", studentName, age, (isFemale ? "She" : "He"), gpa));
	}
}
