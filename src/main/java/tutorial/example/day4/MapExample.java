package tutorial.example.day4;

import java.util.HashMap;
import java.util.Map;

public class MapExample
{
	public static void main(String[] args)
	{
		Map<String, String> dictionary = new HashMap<>();
		dictionary.put("science", "how to explain science");
		dictionary.put("technology", "how to explain technology");

		System.out.println(dictionary.get("science"));

		System.out.println("----------------------");

		System.out.println(dictionary.get("technology"));

		System.out.println("----------------------");

		System.out.println(dictionary.get("math"));

		System.out.println("map size is " + dictionary.size());
		dictionary.entrySet().forEach(entry -> System.out.println("key is " + entry.getKey() + " value is " + entry.getValue()));


		Map<String, String> map = Map.of("key1", "value1", "key2", "value2");
		map.entrySet().forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));

	}
}
