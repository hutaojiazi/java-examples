package tutorial.example.day1;

public class Variables
{
	public static void main(String[] args)
	{
		String studentName = "Tom Black";
		int age = 22;
		double gpa = 3.75;
		boolean isFemale = true;

		var anotherString = "test";
		var anotherAge = 22;
		var anotherGpa = 3.75;
		var isReady = false;


		System.out.println(String.format("%s is %d years old. %s has a %s gpa.", studentName, age, (isFemale ? "She" : "He"), gpa));
	}
}
