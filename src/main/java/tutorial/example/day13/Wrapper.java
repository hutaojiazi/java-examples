package tutorial.example.day13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Wrapper
{
	public static void main(String[] args)
	{
		Integer num1 = 11;
		Integer num2 = 16;
		Integer num3 = 23;
		Integer num4 = 31;
		Integer num5 = 35;
		Integer num6 = 48;
		Integer num7 = 49;

		// 7 numbers;
		List<Integer> myLuckyNumbers = new ArrayList<>();
		myLuckyNumbers.add(num1);
		myLuckyNumbers.add(num2);
		myLuckyNumbers.add(num3);
		myLuckyNumbers.add(num4);
		myLuckyNumbers.add(num5);
		myLuckyNumbers.add(num6);
		myLuckyNumbers.add(num7);

		//System.out.println(myLuckyNumbers);

		int number1;  // 0
		Integer number1Wrap;  // null

		Map<String, Integer> map = new HashMap<>();
		map.put("index1", 6);
		map.put("index2", 12);

		System.out.println(map);
	}

}
