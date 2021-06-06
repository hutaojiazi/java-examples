package tutorial.example.day14;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class LambdaExample
{
	public static void main(String[] args)
	{
//		List<Integer> numbers = List.of(6, 8, 9, 43, 76, 99);

//		// for each element in the list, print it out.
//		numbers.forEach(n -> System.out.println("current number is ->" + n));
//
//		numbers.forEach(n -> {
//			System.out.println("current number is ->" + n);
//			System.out.println("current number is ->" + n);
//		});

//		Consumer<Integer> consumer = n -> System.out.println(n);
//		numbers.forEach(consumer);

//		Consumer<String> consumer = str -> {
//			String result = str + "?";
//			System.out.println("converted string is: " + result);
//		};

		//consumer.accept("this is a test");

//		List.of("str1", "str2", "str3").forEach(consumer);


		// find all the strings which is equals to "suspect"
		List<String> words = List.of("str1", "str2", "str3", "str1", "str4", "suspect", "machine gun", "sword", "weapon", "armor");
		words.stream().filter(str -> "suspect".equals(str)).forEach(str -> System.out.println("found a suspect"));

		System.out.println("_____________________________");

		for (String str: words)
		{
			if ("suspect".equals(str))
			{
				System.out.println("found a suspect");
			}
		}

//		List<Integer> numbers1 = new ArrayList<>();
//		numbers1.add(6);
//		numbers1.add(8);
//		numbers1.add(9);
//		numbers1.add(43);
//		numbers1.add(76);
//		numbers1.add(99);

	}
}
