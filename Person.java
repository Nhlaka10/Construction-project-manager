// The class declaration

public class Person{

	// Attributes
	
	String name;
	String telnumber;
	String emailadres;
	String physicaladres;
	
	// Methods
	
	
	// The constructor
	public Person(String name, String telnumber, String emailadres, String physicaladres) {
		
		// Referring to instance variables
		this.name = name;
		this.telnumber = telnumber;
		this.emailadres = emailadres;
		this.physicaladres = physicaladres;
	}

	
	// Method to allow user to change the telephone number of the objects
	public void setTelNumber(String newNum) {
		
		// Referring to instance variables
		this.telnumber = newNum;
	}
	
	// Method to return the string representation of the object
	public String toString() {
		
		
		String output = "Name: " + name;
		output += "\nTelephone number: " + telnumber;
		output += "\ne-mail Address: " + emailadres;
		output += "\nPhysical Address Name: " + physicaladres;
		
		
		return output;

}
}