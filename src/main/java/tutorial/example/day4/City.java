package tutorial.example.day4;

import java.util.Objects;

public class City
{
	private String name;
	private String province;
	private String country;
	private long population;

	public City() {
		this.name = "Dummy city";
		this.province = "Quebec";
		this.country = "Canada";
		this.population = 100;
	}

	public City(String name, String province, String country, long population) {
		this.name = name;
		this.province = province;
		this.country = country;
		this.population = population;
	}

	public String getName()
	{
		return name;
	}

	public void setName(final String name)
	{
		this.name = name;
	}

	public String getProvince()
	{
		return province;
	}

	public void setProvince(final String province)
	{
		this.province = province;
	}

	public String getCountry()
	{
		return country;
	}

	public void setCountry(final String country)
	{
		this.country = country;
	}

	public long getPopulation()
	{
		return population;
	}

	public void setPopulation(final long population)
	{
		this.population = population;
	}

	@Override
	public boolean equals(final Object o)
	{
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		final City city = (City) o;
		return name.equals(city.name) && province.equals(city.province) && country.equals(city.country);
	}

	@Override
	public int hashCode()
	{
		return Objects.hash(name, province, country);
	}
}
