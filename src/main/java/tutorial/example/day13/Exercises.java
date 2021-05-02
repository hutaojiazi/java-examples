package tutorial.example.day13;

import java.util.Arrays;

public class Exercises
{
	//Q1: Write a Java program to sum values of an array.

	// A: a + b + c + d ......

	//Q2: Write a Java program to calculate the average value of array elements.

	// A: (a + b + c + d ... ) / number of the elements

	//Q3: Write a Java program to test if an array contains a specific value.

	// A: loop through the array and check if any element is equal to the specific value

	public static int calculateSum(int[] array)
	{
		//int result = Arrays.stream(array).sum();
		int result = 0;
		// 3, 5, 6, 8, 9
		for (int num : array)
		{
			//System.out.println("current number in the array: " + num);
			result = result + num;
			//System.out.println("sum at this moment is: " + result);
		}

		return result;
	}

	public static double calculateAverage(int[] array)
	{
		int result = 0;
		for (int num : array)
		{
			result = result + num;
		}

		return (double) result / array.length;
	}

	public static boolean valueExists(int[] array, int value)
	{
		for (int num : array)
		{
			if (num == value)
			{
				return true;
			}
		}

		return false;
	}

	public static void main(String[] args)
	{
		int[] numbers = new int[] { 3, 5, 6, 8, 9 };
		int result = calculateSum(numbers);
		System.out.println("\n\nsum is: " + result);

		double average = calculateAverage(numbers);
		System.out.println("average is: " + average);

		int value = 99;
		boolean exists = valueExists(numbers, value);
		if (exists)
		{
			System.out.println("array contains value: " + value);
		}
		else
		{
			System.out.println("array does not contain value: " + value);
		}

		value = 8;
		exists = valueExists(numbers, value);
		if (exists)
		{
			System.out.println("array contains value: " + value);
		}
		else
		{
			System.out.println("array does not contain value: " + value);
		}
	}
}
