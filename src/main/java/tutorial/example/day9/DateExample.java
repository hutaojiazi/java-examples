package tutorial.example.day9;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;

public class DateExample
{
	public static void main(String[] args)
	{
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);

		OffsetDateTime now1 = OffsetDateTime.now();
		System.out.println(now1);

	}
}
