package tutorial.example.day5;

public class Teacher
{
	private String firstName;
	private String lastName;
	private String gender;
	private int grade;
	private String className;
	private int ratings;

	public Teacher()
	{
		// do nothing
	}

	public Teacher(String firstNameParam, String lastNameParam, String genderParam, int gradeParam, String classNameParam,
			int ratingsParam)
	{
		this.firstName = firstNameParam;
		this.lastName = lastNameParam;
		this.gender = genderParam;
		this.grade = gradeParam;
		this.className = classNameParam;
		this.ratings = ratingsParam;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName(final String firstName)
	{
		this.firstName = firstName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public void setLastName(final String lastName)
	{
		this.lastName = lastName;
	}

	public String getGender()
	{
		return gender;
	}

	public void setGender(final String gender)
	{
		this.gender = gender;
	}

	public int getGrade()
	{
		return grade;
	}

	public void setGrade(final int grade)
	{
		this.grade = grade;
	}

	public String getClassName()
	{
		return className;
	}

	public void setClassName(final String className)
	{
		this.className = className;
	}

	public int getRatings()
	{
		return ratings;
	}

	public void setRatings(final int ratings)
	{
		this.ratings = ratings;
	}

	@Override
	public String toString()
	{
		return "first name: " + this.firstName + ", last name: " + this.lastName + ", gender: " + gender + ", grade: " + grade
				+ ", class: " + className + ", rating: " + ratings;
	}
}
