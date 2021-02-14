package tutorial.example.day4;

import java.util.HashMap;
import java.util.Map;

public class MapExample
{
	public static void main(String[] args)
	{
		Map<String, String> dictionary = new HashMap<>();
		dictionary.put("Java", "Java is a OOP language");
		dictionary.put("Python", "Python is great for bigdata");

		System.out.println(dictionary.get("Java"));

		System.out.println("----------------------");

		System.out.println(dictionary.get("Python"));

		System.out.println("----------------------");

		System.out.println(dictionary.get("Go"));

		System.out.println("----------------------");

		System.out.println("map size is " + dictionary.size());
		dictionary.entrySet().forEach(entry -> System.out.println("key is: " + entry.getKey() + ", value is: " + entry.getValue()));

		System.out.println("----------------------");
		Map<String, String> map = Map.of("key1", "value1", "key2", "value2");
		map.entrySet().forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));

	}
}
