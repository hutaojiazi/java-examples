package tutorial.example.day4;

public class CityApp
{
	public static void main(String[] args) {
		City city1 = new City();

		System.out.println("city name is " + city1.getName());
		System.out.println("city province is " + city1.getProvince());
		System.out.println("city country is " + city1.getCountry());
		System.out.println("city population is " + city1.getPopulation());

		System.out.println("---------------------------");
		System.out.println("---------------------------");

		City city2 = new City("Montreal", "Quebec", "Canada", 3000000);
		System.out.println("city name is " + city2.getName());
		System.out.println("city province is " + city2.getProvince());
		System.out.println("city country is " + city2.getCountry());
		System.out.println("city population is " + city2.getPopulation());

	}
}
