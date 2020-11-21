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
 * 		Contains graduate student attributes and algorithms to modify the attributes. 
 * 		Is considered a {@link PartTimeEmployee}.
 * </p>
 * <p>
 * 		Depends on:
 * </p>
 * <ul>
 * 		<li>{@link PartTimeEmployee}</li>
 * </ul>
 * <p>
 * 		Graduate student - obtains an undergraduate degree and 
 * 		continues further education.
 * </p>
 * 
 * @author  Brady Lange - <a href = "https://www.linkedin.com/in/brady-lange/" target = "_blank">LinkedIn</a>
 * @version  1.0.1 (01/19/2019)
 * @since  1.0 (05/09/2017)
 */
public class GraduateStudent extends PartTimeEmployee
{ 
	// Instance variables
	/**
	 * Bachelor of Science degree.
	 */
	private String bachSci;																
	/**
	 * Associate of Science degree.
	 */
	private String assocSci;																	
	/**
	 * Monthly salary.
	 */
	private double monthSal;	
	
// ------------------- Default Constructor -------------------
	/**
	 * Constructs a {@link GraduateStudent} object with default
	 * properties for both itself and its parent class {@link PartTimeEmployee}.
	 */
	public GraduateStudent()
	{
		// Instantiate default properties 
		super();												// Instantiate default parent class data using polymorphism										
		bachSci = "";										
		assocSci = "";
		monthSal = 0;
	}
// ------------------- End Default Constructor -------------------
	
// ------------------- Alternate Constructor -------------------
	/**
	 * Constructs a {@link GraduateStudent} object with the properties
	 * {@link #bachSci}, {@link #assocSci}, and {@link #monthSal} from
	 * {@link GraduateStudent} class - properties {@link Person#firstName},
	 * {@link Person#lastName}, and {@link Person#ssn} from the grandparent 
	 * class {@link Person} - properties {@link PartTimeEmployee#payRate}
	 * and {@link PartTimeEmployee#hoursWorked} from the parent class
	 * {@link PartTimeEmployee} - object {@link Bird} from
	 * {@link PartTimeEmployee}'s composition - object {@link Dog} from
	 * {@link PartTimeEmployee}'s composition - object {@link Cat} from
	 * {@link PartTimeEmployee}'s composition.
	 * 
	 * @param bachSci  Bachelor of Science degree ({@link #bachSci})
	 * @param assocSci  Associate of Science degree ({@link #assocSci})
	 * @param monthSal  Monthly salary ({@link #monthSal}).
	 * @param first  {@link Person#firstName}
	 * @param last  {@link Person#lastName}
	 * @param ssn  Social security number ({@link Person#ssn})
	 * @param rate  {@link PartTimeEmployee#payRate}
	 * @param hours  {@link PartTimeEmployee#hoursWorked}
	 * @param bird  {@link Bird}
	 * @param dog  {@link Dog}
	 * @param cat  {@link Cat}
	 */
	public GraduateStudent(String bachSci, String assocSci, double monthSal, String first, String last, 
						   String ssn, double rate, double hours, Bird bird, Dog dog, Cat cat)
	{
		// Instantiate properties with parameter values 
		super(first, last, ssn, rate, hours, 					// Instantiate parent class data using polymorphism
			  bird, dog, cat);									
		this.bachSci = bachSci;
		this.assocSci = assocSci;
		this.monthSal = monthSal;
	}
// ------------------- End Alternate Constructor -------------------
	
// ------------------- Copy Constructor -------------------
	/**
	 * Constructs a shallow copy of the {@link GraduateStudent} object.
	 *  
	 * @param obj  {@link GraduateStudent} object to be shallow copied
	 */
	public GraduateStudent(GraduateStudent obj)
	{
		// Instantiate properties with parameter values 
		super(obj);												// Instantiate parent class data using polymorphism
		this.bachSci = obj.bachSci;								// Shallow copy graduate student's Bachelor of Science degree
		this.assocSci = obj.assocSci;							// Shallow copy graduate student's Associate of Science degree
		this.monthSal = obj.monthSal;							// Shallow copy graduate student's monthly salary
	}
// ------------------- End Copy Constructor -------------------
	
// ------------------- Make Copy Method -------------------
	/**
	 * Creates a shallow copy of the {@link GraduateStudent} object.
	 * 
	 * @param obj  {@link GraduateStudent} object to be shallow copied
	 */
	public void makeCopy(GraduateStudent obj)
	{
		this.bachSci = obj.bachSci;								// Shallow copy graduate student's Bachelor of Science degree
		this.assocSci = obj.assocSci;							// Shallow copy graduate student's Associate of Science degree
		this.monthSal = obj.monthSal;							// Shallow copy graduate student's monthly salary
	}
// ------------------- End Make Copy Method -------------------
	
// ------------------- Get Copy Method -------------------
	/**
	 * Retrieves a deep copy of the {@link GraduateStudent} object.
	 * 
	 * @return  Deep copy of the {@link GraduateStudent} object
	 */
	public GraduateStudent getCopy()
	{
		GraduateStudent stu = new GraduateStudent();			// Instantiate copy of GraduateStudent object
		this.bachSci = stu.bachSci;								// Deep copy graduate student's Bachelor of Science degree									
		this.assocSci = stu.assocSci;							// Deep copy graduate student's Associate of Science degree
		this.monthSal = stu.monthSal;							// Deep copy graduate student's monthly salary
		return stu;												// Return deep copied GraduateStudent object 
	}
// ------------------- End Get Copy Method -------------------
	
// ****************
// *** Setters: ***
// ****************
// ------------------- Set Bachelor of Science Degree Method -------------------
	/**
	 * Updates the {@link GraduateStudent}'s {@link #bachSci} degree
	 * status.
	 * 
	 * @param bachSci  Bachelor of Science degree ({@link #bachSci}) status
	 */
	public void setBachSci(String bachSci)
	{
		this.bachSci = bachSci;									// Update graduate student's Bachelor of Science degree
	}
// ------------------- End Set Bachelor of Science Degree Method -------------------
	
// ------------------- Set Associate of Science Degree Method -------------------
	/**
	 * Updates the {@link GraduateStudent}'s {@link #assocSci} degree
	 * status.
	 * 
	 * @param assocSci  Associate of Science degree ({@link #assocSci}) status
	 */
	public void setAssocSci(String assocSci)
	{
		this.assocSci = assocSci;								// Update graduate student's Associate of Science degree
	}
// ------------------- End Set Associate of Science Degree Method -------------------
	
// ------------------- Set Monthly Salary Method -------------------
	/**
	 * Updates the {@link GraduateStudent}'s {@link monthSal}.
	 * 
	 * @param monthSal  Monthly salary ({@link #monthSal})
	 */
	public void setMonthSalary(double monthSal)
	{
		this.monthSal = monthSal;								// Update graduate student's monthly salary
	}
// ------------------- End Set Monthly Salary Method -------------------
	
// ****************
// *** Getters: ***
// ****************
// ------------------- Get Bachelor of Science Degree Method -------------------
	/**
	 * Retrieves the {@link GraduateStudent}'s {@link #bachSci} status.
	 * 
	 * @return  Bachelor of Science degree ({@link #bachSci}) status
	 */
	public String getBachSci()
	{
		return bachSci;											// Return graduate student's Bachelor of Science degree 
	}
// ------------------- End Get Bachelor of Science Degree Method -------------------
	
// ------------------- Get Associate of Science Degree -------------------
	/**
	 * Retrieves the {@link GraduateStudent}'s {@link #assocSci} status.
	 * 
	 * @return  Associate of Science degree ({@link assocSci}) status 
	 */
	public String getAssocSci()
	{
		return assocSci;										// Return graduate student's Associate of Science degree
	}
// ------------------- End Get Associate of Science Degree Method -------------------
	
// ------------------- Get Monthly Salary Method -------------------
	/**
	 * Retrieves the {@link GraduateStudent}'s {@link monthSal}.
	 * 
	 * @return  Monthly salary ({@link monthSal})
	 */
	public double getMonthSalary()
	{
		return monthSal;										// Return graduate student's monthly salary
	}
// ------------------- End Get Monthly Salary Method -------------------

// ------------------- To String Method -------------------
	/**
	 * Converts the {@link GraduateStudent} object's data to a String.
	 */
	public String toString()
	{
		String partTimeData = super.toString();					// Convert parent class data to a String
		String data = firstName + "'s Bachelor of Science Degree: " + bachSci 
					+ "\n" + firstName + "'s Associate of Science Degree: "  
					+ assocSci + "\n"  + partTimeData;
		return data;											// Return graduate student's data 
	}
// ------------------- End To String Method -------------------
} // End of class GraduateStudent