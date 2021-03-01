package tutorial.example.day5;

import java.util.ArrayList;
import java.util.List;

public class TeacherExample
{
	public static void main(String[] args)
	{
		/**
		 *
		 * firstname, lastname,   gender,  grade,   class,   ratings
		 * Peter       White      Male,    5        English     8
		 * Sophie      Black      Female,  3        French      10
		 * Bob         Green      Male,    1        Science     5
		 * Emma        Legrand    Female   6        Music       7
		 * Linda       Lepetit    Female   2        Art         9
		 *
		 *
		 */
//		Teacher teacher1 = new Teacher();
//		teacher1.setFirstName("Peter");
//		teacher1.setLastName("White");
//		teacher1.setGender("Male");
//		teacher1.setGrade(5);
//		teacher1.setClassName("English");
//		teacher1.setRatings(8);
//
//		System.out.println(teacher1.toString());

		Teacher teacher1 = new Teacher("Peter", "White", "Male", 5, "English", 8, 30000);
		Teacher teacher2 = new Teacher("Sophie", "Black", "Female", 3, "French", 10, 50000);
		Teacher teacher3 = new Teacher("Bob", "Green", "Male", 1, "Science", 5, 80000);
		Teacher teacher4 = new Teacher("Emma", "Legrand", "Female", 6, "Music", 7, 45000);
		Teacher teacher5 = new Teacher("Linda", "Lepetit", "Female", 2, "Art", 9, 61000);

		List<Teacher> teachers = new ArrayList<>();
		teachers.add(teacher1);
		teachers.add(teacher2);
		teachers.add(teacher3);
		teachers.add(teacher4);
		teachers.add(teacher5);

		System.out.println("teacher count: " + teachers.size()); // teachers.size() is 5.

//		for (int i = 0; i < teachers.size(); i++)
//		{
//			Teacher temp = teachers.get(i);
//			if (temp.getClassName().equals("Music"))
//			{
//				System.out.println(temp);
//			}
//		}
//
//		int bestRatings = teacher1.getRatings();
//		Teacher bestRatingsTeacher = teacher1;
//
//		for (int i = 0; i < teachers.size(); i++)
//		{
//			Teacher temp = teachers.get(i);
//			//System.out.println(i + "-->" + temp);
//
//			if (temp.getRatings() > bestRatings)
//			{
//				bestRatings = temp.getRatings();
//				bestRatingsTeacher = temp;
//			}
//
//			//System.out.println("best rating teacher until now: " + bestRatingsTeacher);
//			//System.out.println("----------------------");
//		}
//
//		System.out.println("teacher with best rating:" + bestRatingsTeacher) ;

		List<Teacher> musicTeachers = findTeachersByClass(teachers, "Music");
		System.out.println("Music class teachers: ->" + musicTeachers);


		List<Teacher> frenchTeachers = findTeachersByClass(teachers, "French");
		System.out.println("French class teachers: ->" + frenchTeachers);

		List<Teacher> sixthGradeTeachers = findTeachersByGrade(teachers, 6);
		System.out.println("6th grade teachers: ->" + sixthGradeTeachers);

		int totalSalary = getTotalSalary(teachers);
		System.out.println("the total salary of all the teachers is: " + totalSalary);

	}

	/**
	 * find all teachers who teach a specific class.
	 * @param teachers
	 * @param className
	 * @return
	 */
	private static List<Teacher> findTeachersByClass(List<Teacher> teachers, String className)
	{
		List<Teacher> result = new ArrayList<>();

		for (int i = 0; i < teachers.size(); i++)
		{
			Teacher teacher = teachers.get(i);

			if (teacher.getClassName().equals(className))
			{
				result.add(teacher);
			}
		}

		return result;
	}

	/**
	 * find all teachers who teach a specific grade.
	 * @param teachers
	 * @param grade
	 * @return
	 */
	private static List<Teacher> findTeachersByGrade(List<Teacher> teachers, int grade)
	{
		List<Teacher> result = new ArrayList<>();

		for (int i = 0; i < teachers.size(); i++)
		{
			Teacher teacher = teachers.get(i);

			if (teacher.getGrade() == grade)
			{
				result.add(teacher);
			}
		}

		return result;
	}

	/**
	 * Get the total salary of all the teachers
	 * @param teachers
	 * @return
	 */
	private static int getTotalSalary(List<Teacher> teachers)
	{
		int totalSalary = 0;

		for (int i = 0; i < teachers.size(); i++)
		{
			Teacher teacher = teachers.get(i);
			totalSalary = totalSalary + teacher.getSalary();
			//System.out.println("total salary so far: " + totalSalary);
		}

		return totalSalary;
	}
}
