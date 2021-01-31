package tutorial.example.day2;

public class CharacterTest
{
	public static void main(String[] args) {
		// create a new character
		Character character1 = new Character();
		// set the character name
		character1.setName("blue character");
		// print the character name
		System.out.println("character name is: " + character1.getName());

		character1.setName("blue spirit");
		// print the character name
		System.out.println("character name is: " + character1.getName());

		// create a new character
		Character character2 = new Character();
		// set the character name
		character2.setName("green character");
		// print the character name
		System.out.println("character name is: " + character2.getName());

		// create a new character
		Character character3 = new Character();
		// set the character name
		character3.setName("orange character");
		// print the character name
		System.out.println("character name is: " + character3.getName());
	}
}
