package tutorial.example.day16;

import tutorial.example.Teacher;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamExample3
{
	public static void main(String[] args)
	{
		Teacher teacher1 = new Teacher();
		teacher1.setFirstName("tom");
		teacher1.setLastName("Vincent");
		teacher1.setClassName("Music");

		Teacher teacher2 = new Teacher();
		teacher2.setFirstName("peter");
		teacher2.setLastName("Green");
		teacher2.setClassName("English");

		Teacher teacher3 = new Teacher();
		teacher3.setFirstName("mike");
		teacher3.setLastName("Leblanc");
		teacher3.setClassName("English");

		List<Teacher> list = List.of(teacher1, teacher2, teacher3);

		// difference between list and set
		// list allows duplicates
		// set doesn't allow duplicates

		List<String> classNames = list.stream().map(t -> t.getClassName()).collect(Collectors.toList());
		System.out.println("class list -> " + classNames);

		Set<String> classNames2 = list.stream().map(t -> t.getClassName()).collect(Collectors.toSet());
		System.out.println("class set -> " + classNames2);

		/* requirement:
		List<Teacher>  we have 3 teachers
		group all the teachers by class name  ->  return a Map<String, List<Teacher>>

		teacher1 ["music"]
		teacher2 ["english"]
		teacher3 ["english"]

		"Music" ->  [teacher1]
		"English" -> [teacher2, teacher3]
		 */
		// teacher -> list[teacher]
		Map<String, List<Teacher>> result = list.stream().collect(Collectors.toMap(Teacher::getClassName, t -> {
			List<Teacher> tmp = new ArrayList<>();
			tmp.add(t);
			return tmp;
		}, (l1, l2) -> {
			l1.addAll(l2);
			return l1;
		}));
		System.out.println("result -> " + result);

		// list.add(element)
		// set.add(element)
		// [t1, t2, t3] ->  map.put(key, value)
		// music -> [t1]
		// english -> [t2]
		// english -> [t3]
		// english -> [t2, t3]
	}
}
