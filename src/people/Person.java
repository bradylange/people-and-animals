package people;

/*
 * Course: CSIS 162 - Programming II
 * Institution: University of Wisconsin-River Falls
 * Development Language: Java
 */

/**
 * <p>
 * 		Contains person attributes and algorithms to modify the attributes. 
 * </p>
 * <p>
 * 		Person - a human being regarded as an individual.
 * </p>
 * 
 * @author  Brady Lange - <a href = "https://www.linkedin.com/in/brady-lange/" target = "_blank">LinkedIn</a>
 * @version  1.0.1 (01/19/2019)
 * @since  1.0 (05/09/2017)
 */
public class Person  
{
	// Instance variables
	/**
	 * A personal name given to someone at birth or baptism and used before a family name.
	 */
	protected String firstName; 									
	/**
	 * A surname.
	 */
	private String lastName;  											
	/**
	 * Social security number - (in the US) a number in the format 000-00-0000, 
	 * unique for each individual, used to track Social Security benefits and 
	 * for other identification purposes.
	 */
	private String ssn;													
	
// ------------------- Default Constructor -------------------
	/**
	 * Constructs a {@link Person} object with default properties.
	 */
	public Person()
	{
		// Instantiate default properties
		firstName = "";
		lastName = "";
		ssn = "";
	} 
// ------------------- End Default Constructor Method -------------------
	    
// ------------------- Alternate Constructors -------------------
	/**
	 * Constructs a {@link Person} object with the property of 
	 * {@link #firstName}.
	 * 
	 * @param fName  {@link #firstName}
	 */
	public Person(String fName)
	{
		// Instantiate properties with parameter value
		this.firstName = fName;
	}
	    
	/**
	 * Constructs a {@link Person} object with the properties of
	 * {@link #firstName} and {@link #lastName}.
	 * 
	 * @param first  {@link #firstName}
	 * @param last  {@link #lastName}
	 */
	public Person(String first, String last)
	{
		// Instantiate properties with parameter values 
		this.firstName = first;
		this.lastName = last;
	}
	
	/**
	 * Constructs a {@link Person} object with the properties of 
	 * {@link #firstName}, {@link #lastName}, and {@link #ssn}.
	 * 
	 * @param first  {@link #firstName}
	 * @param last  {@link #lastName}
	 * @param ssn  Social security number ({@link #ssn})
	 */
	public Person(String first, String last, String ssn)
	{
		// Instantiate properties with parameter values 
		this.firstName = first;
		this.lastName = last;
		this.ssn = ssn;
	}
// ------------------- End Alternate Constructors -------------------
	
// ------------------- Copy Constructor -------------------
	/**
	 * Constructs a shallow copy of the {@link Person} object.
	 * 
	 * @param obj  {@link Person} object to be shallow copied
	 */
	public Person(Person obj)
	{
		// Instantiate properties with parameter value
		this.firstName = obj.firstName;					// Shallow copy person's first name	
		this.lastName = obj.lastName;					// Shallow copy person's last name
		this.ssn = obj.ssn;								// Shallow copy person's social security number 
	}
// ------------------- End Copy Constructor -------------------
	
// ------------------- Make Copy Method -------------------
	/**
	 * Creates a shallow copy of the {@link Person} object.
	 * 
	 * @param obj  {@link Person} object to be shallow copied
	 */
	public void makeCopy(Person obj)
	{
		this.firstName = obj.firstName;					// Shallow copy person's first name
		this.lastName = obj.lastName;					// Shallow copy person's last name
		this.ssn = obj.ssn;								// Shallow copy person's social security number 
	}
// ------------------- End Make Copy Method -------------------
	
// ------------------- Get Copy Method -------------------
	/**
	 * Retrieves a deep copy of the {@link Person} object.
	 * 
	 * @return  Deep copy of the {@link Person} object
	 */
	public Person getCopy()
	{
		Person person = new Person();					// Instantiate copy of Person object 
		this.firstName = person.firstName;				// Deep copy person's first name 								
		this.lastName = person.lastName;				// Deep copy person's last name
		this.ssn = person.ssn;							// Deep copy person's social security number
		return person;									// Return deep copied Person object 
	}
// ------------------- End Get Copy Method -------------------
		
// ****************
// *** Setters: ***
// ****************
// ------------------- Set Name Method -------------------	
	/**
	 * Updates the {@link Person}'s {@link #firstName} and 
	 * {@link #lastName}.
	 * 
	 * @param first  {@link #firstName}
	 * @param last  {@link #lastName}
	 */
	public void setName(String first, String last)
	{
		firstName = first;								// Update person's first name									
		lastName = last;								// Update person's last name
	}
// ------------------- End Set Name Method -------------------	
	
// ------------------- Set Social Security Number Method -------------------
	/**
	 * Updates the {@link Person}'s social security
	 * number ({@link #ssn}).
	 * 
	 * @param ssn  Social security number ({@link #ssn})
	 */
	public void setSSN(String ssn)
	{
		this.ssn = ssn;									// Update person's social security number 
	}
// ------------------- End Set Social Security Number Method -------------------
	
// ****************
// *** Getters: ***
// ****************
// ------------------- Get First Name Method -------------------
	/**
	 * Retrieves the {@link Person}'s {@link #firstName}.
	 * 
	 * @return  {@link #firstName}
	 */
	public String getFirstName()
	{
		return firstName;								// Return person's first name
	}
// ------------------- End Get First Name Method -------------------
	
// ------------------- Get Last Name Method -------------------	
	/**
	 * Retrieves the {@link Person}'s {@link #lastName}.
	 * 
	 * @return  {@link #lastName}
	 */
	public String getLastName()
	{
		return lastName;								// Return person's last name
	}
// ------------------- End Get Last Name Method -------------------
	
// ------------------- Get Social Security Number Method -------------------
	/**
	 * Retrieves the {@link Person}'s social security number
	 * ({@link #ssn}).
	 * 
	 * @return  Social security number ({@link #ssn})
	 */
	public String getSSN()
	{
		return ssn;										// Return person's social security number 
	}
// ------------------- End Get Social Security Name Method -------------------
	  
// ------------------- To String Method -------------------
	/**
	 * Converts the {@link Person} object's data to a String.
	 */
	public String toString()
	{													
		return ("First Name: " + firstName + "\n" 		// Return person's data 
			   + "Last Name: " + lastName + "\n" 
			   + "Social Security #: " + ssn + "\n");	
	} 
// ------------------- End To String Method -------------------
} // End of class Person