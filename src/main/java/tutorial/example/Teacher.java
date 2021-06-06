package tutorial.example;

public class Teacher
{
	private String firstName;
	private String lastName;
	private String gender;
	private int grade;
	private String className;
	private int ratings;
	private int salary;

	public Teacher()
	{
		// do nothing
	}

	public Teacher(String firstNameParam, String lastNameParam, String genderParam, int gradeParam, String classNameParam,
			int ratingsParam, int salary)
	{
		this.firstName = firstNameParam;
		this.lastName = lastNameParam;
		this.gender = genderParam;
		this.grade = gradeParam;
		this.className = classNameParam;
		this.ratings = ratingsParam;
		this.salary = salary;
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

	public int getSalary()
	{
		return salary;
	}

	public void setSalary(final int salary)
	{
		this.salary = salary;
	}

	@Override
	public String toString()
	{
		return "first name: " + this.firstName + ", last name: " + this.lastName + ", gender: " + gender + ", grade: " + grade
				+ ", class: " + className + ", rating: " + ratings;
	}

	public String toCsvRow()
	{
		StringBuilder sb = new StringBuilder();
		return sb.append(this.firstName)
				.append(",")
				.append(this.lastName)
				.append(",")
				.append(this.gender)
				.append(",")
				.append(this.className)
				.append(",")
				.append(this.getGrade())
				.append(",")
				.append(this.ratings)
				.append(",")
				.append(this.salary)
				.toString();
	}
}
