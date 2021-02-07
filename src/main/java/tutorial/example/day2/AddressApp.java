package tutorial.example.day2;

public class AddressApp
{
	public static void main(String[] args) {
		Address addressForTianli = new Address();
		addressForTianli.setNumber("17973");
		addressForTianli.setStreet("Amalfi");
		addressForTianli.setCity("Pierrefonds");
		addressForTianli.setProvince("Quebec");
		addressForTianli.setCountry("Canada");
		addressForTianli.setPostalCode("H9K 1M2");

		System.out.println("my home address->" + addressForTianli.getAddress());


		//-------------------------------
		Address charlemagneAddr = new Address();
		charlemagneAddr.setNumber("5000");
		charlemagneAddr.setStreet("Pilon");
		charlemagneAddr.setCity("Pierrefonds");
		charlemagneAddr.setProvince("Quebec");
		charlemagneAddr.setCountry("Canada");
		charlemagneAddr.setPostalCode("I don't know");

		System.out.println("school address->" + charlemagneAddr.getAddress());

	}
}
