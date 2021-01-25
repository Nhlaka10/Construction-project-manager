// The class declaration

public class Project{

	// Attributes
	
	int pNumber;
	String pName;
	String buildtype;
	String pAddress;
	int erfNumber;
	double pPrice;
	double pPaid;
	String pDeadline;
	
	Person contractor;
	Person customer;
	Person architect;
	
	// Methods
	
	public Project(int pNumber, String pName, String buildtype, String pAddress, int erfNumber, double pPrice, double pPaid, String pDeadline, Person contractor, Person customer, Person architect) {
		
		// Referring to instance variables
		this.pNumber = pNumber;
		this.pName = pName;
		this.buildtype = buildtype;
		this.pAddress = pAddress;
		this.erfNumber = erfNumber;
		this.pPrice = pPrice;
		this.pPaid = pPaid;
		this.pDeadline = pDeadline;
		
		this.contractor = contractor;
		this.customer = customer;
		this.architect = architect;
		
	}
	
	// Methods to return the objects contractor, customer and architect
	public Person getContractor() {
		return contractor;
	}
	
	public Person getCustomer() {
		return customer;
		
	}
	
	public Person getArchitect() {
		return architect;
		
	}
	
	// Method to allow user to change the due date
	public void setDuedate(String newDeadline) {
		
		// Referring to the instance variable
		this.pDeadline = newDeadline;
	}
	
	// Method to allow the user to change the due date
	public void setAmountpaid(double newAmount) {
		
		// Referring to the instance variable
		this.pPaid = newAmount;
	}
	
	// Method to return the string representation of the object
	public String toString() {
		
		String output = "Project Number: " + pNumber;
		output += "\n\nProject Name: " + pName;
		output += "\n\nBuildtype: " + buildtype;
		output += "\n\nProject Address: " + pAddress;
		output += "\n\nERF Number: " + erfNumber;
		output += "\n\nProject price: R" + pPrice;
		output += "\n\nTotal amount paid to date: R" + pPaid;
		output += "\n\nProject deadline: " + pDeadline;
		output += "\n\nContractor details: " + contractor;
		output += "\n\nCustomer details: " + customer;
		output += "\n\nArchitect details: " + architect + "\n\n";
		
		
		return output;
	}
}
