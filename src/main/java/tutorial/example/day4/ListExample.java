package tutorial.example.day4;

import java.util.ArrayList;
import java.util.List;

public class ListExample
{
	public static void main(String[] args) {
		List<String> emails = new ArrayList<>();
		emails.add("tianligao@hotmail.com");
		emails.add("alexis@hotmail.com");

		System.out.println("list size is " + emails.size());
		System.out.println("first element is " + emails.get(0));
		System.out.println("second element is " + emails.get(1));

		emails.add(1, "chloe@hotmail.com");

		/**
		 * 0->  tianligao@hotmail.com
		 * 1->  choloe@hotmail.com
		 * 2 -> alexis@hotmail.com
		 */
		System.out.println("list size is " + emails.size());
		System.out.println("first element is " + emails.get(0));
		System.out.println("second element is " + emails.get(1));
		System.out.println("third element is " + emails.get(2));

		List<String> contacts = List.of("Chloe", "Alexis", "Fenghua", "Annie", "Christina", "Jeremy");
		contacts.forEach(c -> System.out.println(c));
	}
}
