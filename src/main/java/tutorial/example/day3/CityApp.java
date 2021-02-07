package tutorial.example.day3;

public class CityApp
{
	public static void main(String[] args) {
		City city1 = new City();
		city1.setName("London");
		city1.setProvince("Ontario");
		city1.setCountry("Canada");


		City city2 = new City();
		city2.setName("London");
		city2.setProvince("Ontario");
		city2.setCountry("Canada");

		if (city1.equals(city2)) {
			System.out.println("these are 2 same cities.");
		} else {
			System.out.println("these are 2 different cities.");
		}


		City city3 = new City();
		city3.setName("London");
		city3.setProvince("Quebec");
		city3.setCountry("Canada");

		if (city1.equals(city3)) {
			System.out.println("these are 2 same cities.");
		} else {
			System.out.println("these are 2 different cities.");
		}

	}
}
