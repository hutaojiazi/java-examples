package tutorial.example;

public class User
{
	private int id;
	private String name;
	private String email;
	private String country;

	public int getId()
	{
		return id;
	}

	public void setId(final int id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(final String name)
	{
		this.name = name;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(final String email)
	{
		this.email = email;
	}

	public String getCountry()
	{
		return country;
	}

	public void setCountry(final String country)
	{
		this.country = country;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(final String password)
	{
		this.password = password;
	}

	private String password;
}
