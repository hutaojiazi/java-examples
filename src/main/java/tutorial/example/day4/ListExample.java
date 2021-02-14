package tutorial.example.day4;

import java.util.ArrayList;
import java.util.List;

public class ListExample
{
	public static void main(String[] args) {
		List<String> emails = new ArrayList<>();
		emails.add("whoami@hotmail.com");
		emails.add("contact1@hotmail.com");

		System.out.println("list size is " + emails.size());
		System.out.println("first element is " + emails.get(0));
		System.out.println("second element is " + emails.get(1));

		System.out.println("----------------------");
		
		emails.add(1, "badguy@hotmail.com");

		/**
		 * 0->  whoami@hotmail.com
		 * 1->  badguy@hotmail.com
		 * 2 -> contact1@hotmail.com
		 */
		System.out.println("list size is " + emails.size());
		System.out.println("first element is " + emails.get(0));
		System.out.println("second element is " + emails.get(1));
		System.out.println("third element is " + emails.get(2));

		System.out.println("----------------------");

		List<String> contacts = List.of("Bob", "Mike", "Peter", "John", "Daniel", "Don");
		contacts.forEach(c -> System.out.println(c));
	}
}
