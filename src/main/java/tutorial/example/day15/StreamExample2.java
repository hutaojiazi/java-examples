package tutorial.example.day15;

import tutorial.example.Teacher;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamExample2
{
	public static void main(String[] args)
	{
		List<String> list2 = List.of("tom", "brad", "peter", "mike");
		System.out.println("total elements: " + list2.stream().distinct().count());

		List<String> result2 = list2.stream().sorted().collect(Collectors.toList());
		System.out.println(result2);
		
		
		// Music -> [teacher1, teacher2]
		// English -> [teacher3, teacher4]
		// Physics -> [teacher5]
		Map<String, List<Teacher>> test;

		Teacher teacher1 = new Teacher();
		teacher1.setFirstName("tom");
		teacher1.setLastName("brady");
		teacher1.setClassName("Music");

		Teacher teacher2 = new Teacher();
		teacher2.setFirstName("brad");
		teacher2.setLastName("peter");
		teacher2.setClassName("English");

		List<Teacher> list = List.of(teacher1, teacher2);

		List<Teacher> result = list.stream()
				.filter(teacher -> teacher.getClassName().equals("English") && teacher.getFirstName().equals("tony"))
				.collect(Collectors.toList());
		System.out.println(result);

		Optional<Teacher> teacherOptional = list.stream()
				.filter(teacher -> teacher.getClassName().equals("English") && teacher.getFirstName().equals("tony"))
				.findAny();

		System.out.println(teacherOptional);


		// List<Teacher>  -->  List<String>
		List<String> firstNames = list.stream().map(teacher -> teacher.getClassName()).collect(Collectors.toList());
		System.out.println(firstNames);
	}
}
