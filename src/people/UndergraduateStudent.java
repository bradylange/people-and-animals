package people;

// Import classes
import animals.Bird;
import animals.Cat;
import animals.Dog;

/*
 * Course: CSIS 162 - Programming II
 * Institution: University of Wisconsin-River Falls
 * Development Language: Java
 */

/**
 * <p>
 * 		Contains undergraduate student attributes and algorithms to modify the attributes. 
 * 		Is considered a {@link PartTimeEmployee}.
 * </p>
 * <p>
 * 		Depends on:
 * </p>
 * <ul>
 * 		<li>{@link PartTimeEmployee}</li>
 * </ul>
 * <p>
 * 		Undergraduate student - a student at a college or university 
 * 		who has not yet earned a bachelor's or equivalent degree.
 * </p>
 * 
 * @author  Brady Lange - <a href = "https://www.linkedin.com/in/brady-lange/" target = "_blank">LinkedIn</a>
 * @version  1.0.1 (01/18/2019)
 * @since  1.0 (05/09/2017)
 */
public class UndergraduateStudent extends PartTimeEmployee
{ 
	// Instance variables
	/**
	 * Grade point average - an indication of a student's academic 
	 * achievement at a college or university, calculated as the 
	 * total number of grade points received over a given period 
	 * divided by the total number of credits awarded.
	 */
	private double gpa;												
	/**
	 * Classification: Freshman, Sophomore, Junior, or Senior.
	 */
	private String classification;									

// ------------------- Default Constructor -------------------
	/**
	 * Constructs a {@link UndergraduateStudent} object with
	 * default properties for both itself and its parent
	 * class {@link PartTimeEmployee}.
	 */
	public UndergraduateStudent()
	{
		// Instantiate default properties
		super();													// Instantiate default parent class data using polymorphism 
		gpa = 0;											
		classification = "";
	}
// ------------------- End Default Constructor -------------------
	
// ------------------- Alternate Constructor -------------------
	/**
	 * Constructs a {@link UndergraduateStudent} object with 
	 * the properties of grade point average ({@link #gpa})
	 * and {@link #classification} from the {@link UndergraduateStudent} class
	 * - properties of {@link Person#firstName}, {@link Person#lastName}, and 
	 * {@link Person#ssn} from the grandparent class {@link Person} 
	 * - properties of {@link PartTimeEmployee#payRate}
	 * and {@link PartTimeEmployee#hoursWorked} from the 
	 * parent class {@link PartTimeEmployee} - object {@link Bird} from
	 * {@link PartTimeEmployee}'s composition - object {@link Dog} from
	 * {@link PartTimeEmployee}'s composition - object {@link Cat} from
	 * {@link PartTimeEmployee}'s composition.
	 * 
	 * @param gpa  Grade point average ({@link #gpa})
	 * @param classi  {@link #classification}
	 * @param first  {@link Person#firstName}
	 * @param last  {@link Person#lastName}
	 * @param ssn  Social security number ({@link Person#ssn})
	 * @param rate  {@link PartTimeEmployee#payRate}
	 * @param hours  {@link PartTimeEmployee#hoursWorked}
	 * @param bird  {@link Bird}
	 * @param dog  {@link Dog}
	 * @param cat  {@link Cat}
	 */
	public UndergraduateStudent(double gpa, String classi, String first, String last, 
								String ssn, double rate, double hours, Bird bird, Dog dog, Cat cat)
	{
		// Instantiate properties with parameter values 
		super(first, last, ssn, rate, 								// Instantiate parent class data using polymorphism
			  hours, bird, dog, cat);		
		this.gpa = gpa;										
		this.classification = classi;						
	}
// ------------------- End Alternate Constructor -------------------
	
// ------------------- Copy Constructor -------------------
	/**
	 * Constructs a shallow copy of the {@link UndergraduateStudent} 
	 * object.
	 * 
	 * @param obj  {@link UndergraduateStudent} to be shallow copied
	 */
	public UndergraduateStudent(UndergraduateStudent obj)
	{
		// Instantiate properties with parameter value
		super(obj);													// Instantiate parent class data using polymorphism
		this.gpa = obj.gpa;											// Shallow copy undergraduate student's grade point average
		this.classification = obj.classification;					// Shallow copy undergraduate student's classification
	}
// ------------------- End Copy Constructor -------------------
	
// ------------------- Make Copy Method -------------------
	/**
	 * Creates a shallow copy of the {@link UndergraduateStudent}
	 * object.
	 * 
	 * @param obj  {@link UndergraduateStudent} to be shallow copied
	 */
	public void makeCopy(UndergraduateStudent obj)
	{
		this.gpa = obj.gpa;											// Shallow copy undergraduate student's grade point average
		this.classification = obj.classification;					// Shallow copy undergraduate student's classification
	}
// ------------------- End Make Copy Method -------------------
	
// ------------------- Get Copy Method -------------------
	/**
	 * Retrieves a deep copy of the {@link UndergraduateStudent} object.
	 * 
	 * @return  Deep copy of the {@link UndergraduateStudent} object
	 */
	public UndergraduateStudent getCopy()
	{
		UndergraduateStudent stu = new UndergraduateStudent();		// Instantiate copy of UndergraduateStudent object 
		this.gpa = stu.gpa;											// Deep copy undergraduate student's grade point average								
		this.classification = stu.classification;					// Deep copy undergraduate student's classification
		return stu;													// Return deep copied UndergraduateStudent object 
	}
// ------------------- End Get Copy Method -------------------
	
// ****************
// *** Setters: ***
// ****************
// ------------------- Set Grade Point Average Method -------------------
	/**
	 * Updates the {@link UndergraduateStudent}'s grade point average
	 * ({@link #gpa}).
	 * 
	 * @param gpa  Grade point average ({@link #gpa})
	 */
	public void setGPA(double gpa)
	{
		this.gpa = gpa;												// Update grade undergraduate student's point average
	}
// ------------------- End Grade Point Average Method -------------------	
	
// ------------------- Set Classification Method -------------------
	/**
	 * Updates the {@link UndergraduateStudent}'s {@link #classification}.
	 * 
	 * @param classi  {@link #classification}
	 */
	public void setClassification(String classi)
	{
		classification = classi;									// Update undergraduate student's classification 
	}
// ------------------- End Set Classification Method -------------------
	
// ****************
// *** Getters: ***
// ****************
// ------------------- Get Grade Point Average Method -------------------
	/**
	 * Retrieves the {@link UndergraduateStudent}'s grade point average
	 * ({@link #gpa}).
	 * 
	 * @return  Grade point average ({@link #gpa})
	 */
	public double getGPA()
	{
		return gpa;													// Return undergraduate student's grade point average
	}
// ------------------- End Get Grade Point Average Method -------------------
	
// ------------------- Get Classification Method -------------------
	/**
	 * Retrieves the {@link UndergraduateStudent}'s {@link #classification}.
	 * 
	 * @return  {@link #classification}
	 */
	public String getClassification()
	{
		return classification;										// Return undergraduate student's classification 
	}
// ------------------- End Get Classification Method -------------------
	
// ------------------- To String Method -------------------
	/**
	 * Converts the {@link UndergraduateStudent} object's data to a String.
	 */
	public String toString()
	{
		String partTimeData = super.toString();						// Convert parent class data to a String 
		String data = firstName + "'s GPA: " + gpa + "\n" 
					+ "Classification: " + classification 
					+ "\n" + partTimeData + "\n";
		return data;												// Return undergraduate student's data 
	}
// ------------------- End To String Method -------------------
} // End of class UndergraduateStudent