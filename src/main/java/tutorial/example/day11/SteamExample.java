package tutorial.example.day11;

import java.util.ArrayList;
import java.util.List;

public class SteamExample
{
	public static void main(String[] args)
	{
		List<String> emails = List.of("who@where.com", "who1@where.com", "who@where.com");

		List<String> result = new ArrayList<>();
		for (String email: emails)
		{
			if (!result.contains(email))
			{
				result.add(email);
			}
		}

		System.out.println("result size is ->" + result.size() );


		long count = emails.stream().distinct().count();

		System.out.println("total emails: " + count);
	}
}
