package applications;

// Import classes
import animals.Bird;
import animals.Cat;
import animals.Dog;
import people.GraduateStudent;
import people.UndergraduateStudent;

/*
 * Course: CSIS 162 - Programming II
 * Institution: University of Wisconsin-River Falls
 * Development Language: Java
 */

/**
 * <p>
 * 		Constructs people objects and assigns them attributes based upon their 
 *		inheritance of classes. Contains the {@link #main} method and "glues" other classes
 *		together.
 * </p>
 * <p>
 * 		Depends on:
 * </p>
 * <ul>
 * 		<li>
 * 			{@link GraduateStudent}
 * 		</li>
 * 		<li>
 * 			{@link UndergraduateStudent}
 * 		</li>
 * 		<li>
 * 			{@link Bird}
		</li>
 * 		<li>
 * 			{@link Cat}
 * 		</li>
 * 		<li>
 * 			{@link Dog}
 * 		</li>
 * </ul>
 * 
 * @author  Brady Lange - <a href = "https://www.linkedin.com/in/brady-lange/" target = "_blank">LinkedIn</a>
 * @version  1.0.1 (01/19/2019)
 * @since  1.0 (05/09/2017)
 */
public class Driver 
{
// ------------------- Main Method -------------------
	/**
	 * Instantiates and sets up a {@link GraduateStudent}, 
	 * {@link UndergraduateStudent}, {@link Bird}, {@link Cat}, 
	 * and {@link Dog}.
	 * 
	 * @param args  Array of command line arguments to be passed
	 */
	public static void main(String[] args)
	{   
		System.out.println("**************************************************************************");
		System.out.println("***                         People Properties:                         ***");
		System.out.println("**************************************************************************");
		// Person: John Smith
		// Pet Information:
		Cat johnsCat = new Cat("Long", "Maine Coon", "Tigger", "May 6, 2011"); 			// John has a cat 
		Dog johnsDog = new Dog("Large", false, true, "Great Dang", 						// John has dog
							   "Sparky", "April 2, 2007"); 		
		Bird johnsBird = new Bird(); 													// John does not have a bird
		// Student Information:
		GraduateStudent John = new GraduateStudent("N/A", "Art", 3750, 
												   "John", "Smith", "367-44-0900", 
												   21.50, 40, johnsBird, johnsDog, johnsCat); 
		System.out.println("Person: " + John.getFirstName() + " " 
						  + John.getLastName() + "\n" + John); 
		double salary = John.getPay();													// Retrieve John's pay 
		double totalSal = salary * 52.012; 												// Calculate John's salary
		System.out.println(John.getFirstName() + "'s salary: " + totalSal + "\n");
		
		// Person: Mary Anderson
		// Pet Information:
		Bird marysBird = new Bird("Red", 2, "Crow", "Beaky", "January 12, 1999");		// Mary has a bird
		Cat marysCat = new Cat(); 														// Mary does not have a cat
		Dog marysDog = new Dog();														// Mary does not have a dog
		// Student Information:
		UndergraduateStudent Mary = new UndergraduateStudent(3.5, "Junior", "Mary", 
															 "Anderson", "342-45-9812", 
															 10.50, 20, marysBird, marysDog, 
															 marysCat);
		System.out.println("**************************************************************************\n");
		System.out.print("Person: " + Mary.getFirstName() + " " + Mary.getLastName() 
						+ "\n" + Mary); 
		String featherColor = marysBird.getFeatherColor();								// Retrieve the color of Mary's bird
		System.out.println(Mary.getFirstName() + "'s bird's feather color: " 
						  + featherColor);
		Cat marysAdoptedCat = new Cat("Short", "Persian", "Stripe", 					// Mary has a cat 
									  "June 11th, 2004"); 			
		Mary.adoptCat(marysAdoptedCat); 												// Mary adopted a cat 
		System.out.println("**************************************************************************\n");
		System.out.print("Updated -- Person: " + Mary.getFirstName() + " " 
						+ Mary.getLastName() + "\n" + Mary); 
		String catsBreed = marysAdoptedCat.getBreed();									// Retrieve the breed of Mary's cat 
		System.out.println(Mary.getFirstName() + "'s cat's breed is: " + catsBreed); 
		System.out.println("**************************************************************************\n");  
	} 
// ------------------- End Main Method -------------------
} // End of class Driver