// Importing the scanner
import java.util.Scanner;

// The class declaration
public class Construction {
	
	// Method to get details of the contractor, customer and architect
	public static Person getDetails(String type) {
		
		// Creating the scanner
		Scanner input = new Scanner(System.in);
		
		// Requesting user input
		
		
		input = new Scanner(System.in);
		System.out.print("Please enter the "+ type +"'s name: ");
		String contName = input.nextLine();
		
		// Refreshing the scanner
		input = new Scanner(System.in);
		System.out.print("Please enter the "+ type +"'s contact details: ");
		String contContact = input.nextLine();
		
		// Refreshing the scanner
		input = new Scanner(System.in);
		System.out.print("Please enter the "+ type +"'s e-mail address: ");
		String contEmail = input.nextLine();
		
		// Refreshing the scanner
		input = new Scanner(System.in);
		System.out.print("Please enter the "+ type +" physical address: ");
		String contPhysicaladres = input.nextLine();
		
		// Return the user input information
		return new Person(contName, contContact, contEmail,contPhysicaladres);

	}

	// The main method
	public static void main(String[] args) {
		
		
		// Use the user input to create the objects
		Person cont = getDetails("contractor");
		Person cust = getDetails("customer");
		Person archi = getDetails("architect");
		
		// Creating the scanner
		Scanner input = new Scanner(System.in);
		// Displaying the question text to the user
		System.out.println("Please enter the project number: ");
		// Taking in user input as a integer type input
		int proNum = input.nextInt();
		
		// Refreshing the scanner
		input = new Scanner(System.in);
		// Displaying the question text to the user
		System.out.print("Please enter the project name: ");
		// Taking in user input as a string type input
		String proName = input.nextLine();
		
		// Refreshing the scanner
		input = new Scanner(System.in);
		// Displaying the question text to the user
		System.out.print("Please enter the project Buildtype e.g House, apartment block or store, etc: ");
		// Taking in user input as a string type input
		String proBuildtype = input.nextLine();
		
		// Refreshing the scanner
		input = new Scanner(System.in);
		// Displaying the question text to the user
		System.out.print("Please enter the project's address: ");
		// Taking in user input as a string type input
		String proAddress = input.nextLine();
		
		// Refreshing the scanner
		input = new Scanner(System.in);
		// Displaying the question text to the user
		System.out.print("Please enter the project ERF number: ");
		// Taking in user input as an integer type input
		int proERF = input.nextInt();
		
		// Refreshing the scanner
		input = new Scanner(System.in);
		// Displaying the question text to the user
		System.out.print("Please enter the project price: ");
		// Taking in user input as a double type input
		double proPrice = input.nextDouble();
		
		// Refreshing the scanner
		input = new Scanner(System.in);
		// Displaying the question text to the user
		System.out.print("Please enter the total amount paid to date for the project: ");
		// Taking in user input as a double type input
		double proPaid = input.nextDouble();
		
		// Refreshing the scanner
		input = new Scanner(System.in);
		// Displaying the question text to the user
		System.out.print("Please enter the project deadline: ");
		// Taking in user input as a string type input
		String proDeadline = input.nextLine();
		
		
		// Use the user input and objects to create the project object
		Project ppcCEMENT = new Project (proNum, proName, proBuildtype, proAddress, proERF, proPrice, proPaid, proDeadline, cont, cust, archi);
		
		// Display the details of the object
		System.out.println(ppcCEMENT);
		
		// Request user input
		input = new Scanner(System.in);
		System.out.print("Enter 1 to change the due date of the project\n\nEnter 2 to change the total amount paid to date\n\nEnter 3 to change contractor's contact details"
				+ "\n\nEnter 4 to exit:	");
		int userInput = input.nextInt();
		
			// Displaying the appropriate message based on the user input
			// Then changing the appropriate detail
			
			// If user chooses to change the due date
			if (userInput == 1) {
			
				input = new Scanner(System.in);
				System.out.print("\nPlease enter a new due date:	");
				String newDate = input.nextLine();
				ppcCEMENT.setDuedate(newDate);
				
			
			// If the user chooses to edit the amount paid to date
			}else if (userInput == 2) {
			
				input = new Scanner(System.in);
				System.out.print("\nPlease enter the amount paid to date:    ");
				double newPaid = input.nextDouble();
				ppcCEMENT.setAmountpaid(newPaid);
				
			
			// If user chooses to change the contractor's contact details 	
			}else if (userInput == 3) {
			
				input = new Scanner(System.in);
				System.out.print("\nPlease enter the contractor's new contact details");
				String newConcontact = input.nextLine();
				ppcCEMENT.getContractor().setTelNumber(newConcontact);		
				
		}
			
			// Displaying the project details with the new changes
			System.out.println(ppcCEMENT);
		
}}
