package tutorial.example.day15;

import tutorial.example.Teacher;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample
{
	public static void main(String[] args)
	{
		// how to get a stream
		// method 1
		Stream<String> stream = Stream.of("tom", "bob", "peter");

		// from a list of string ->
		// use elements in the list as the first name of the teacher and return a list of teachers.
		List<Teacher> result = stream.map(name -> {
			Teacher t = new Teacher();
			t.setFirstName(name);
			return t;
		}).collect(Collectors.toList());

		System.out.println(result);

		// method 2
		List<String> names = List.of("tom", "bob", "peter");
		Stream<String> stream2 = names.stream();

		// method 3
		String[] arr = new String[]{"tom", "bob", "peter"};
		Stream<String> stream3 = Arrays.stream(arr);

		SortedMap map = new TreeMap();
		List<String> list = new ArrayList<>();

		// method 4
		Stream<String> stream4 = Stream.empty();

	}
}
