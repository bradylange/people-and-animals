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
 * 		Contains part-time employee attributes and algorithms to modify the attributes. 
 * 		Is considered a {@link Person}. This class relies upon the animal objects 
 * 		{@link Cat}, {@link Bird}, and {@link Dog} using composition.
 * </p>
 * <p>
 * 		Depends on:
 * </p>
 * <ul>
 * 		<li>{@link Person}</li>
 * </ul>
 * <p>
 * 		Part-time employee - a form of employment that carries fewer 
 * 		hours per week than a full-time job.
 * </p>
 * 
 * @author  Brady Lange - <a href = "https://www.linkedin.com/in/brady-lange/" target = "_blank">LinkedIn</a>
 * @version  1.0.1 (01/19/2019)
 * @since  1.0 (05/09/2017)
 */
public class PartTimeEmployee extends Person  
{
	// Instance variables
	/**
	 * The amount of money paid per hour.
	 */
	private double payRate;     											
	/**
	 * A fixed regular payment, typically paid on a monthly or biweekly basis but 
	 * often expressed as an annual sum.
	 */
	private double salary;													
	/**
	 * Number of hours worked.
	 */
	private double hoursWorked; 											
	/**
	 * Ownership of a {@link Cat} (Composition).
	 */
	private Cat employeesCat; 												
	/**
	 * Ownership of a {@link Bird} (Composition).
	 */
	private Bird employeesBird; 											
	/**
	 * Ownership of a {@link Dog} (Composition).
	 */
	private Dog employeesDog; 			
	
// ------------------- Default Constructor -------------------
	/**
	 * Constructs a {@link PartTimeEmployee} object with 
	 * default properties for itself, its parent class 
	 * {@link Person}, and its composition objects of
	 * {@link Cat}, {@link Dog}, and {@link Bird}.
	 */
	public PartTimeEmployee()
	{
		// Instantiate default properties
		super();											// Instantiate default parent class data using polymorphism
		payRate = 0;
		hoursWorked = 0;
		employeesCat = new Cat();							// Instantiate default composition data
		employeesDog = new Dog();							// Instantiate default composition data
		employeesBird = new Bird();							// Instantiate default composition data
	}
// ------------------- End Default Constructor -------------------
			 
// ------------------- Alternate Constructors -------------------
	/**
	 * Constructs a {@link PartTimeEmployee} object with the properties 
	 * {@link Person#firstName}, {@link Person#lastName}, and {@link Person#ssn} 
	 * from the parent class {@link Person} - properties of {@link #payRate}
	 * and {@link #hoursWorked} from {@link PartTimeEmployee} - property
	 * {@link Cat#hairLength} from the composition object {@link Cat}.
	 * This {@link PartTimeEmployee} owns a {@link Cat}. Calculates 
	 * {@link #salary}.
	 * 
	 * @param first  {@link Person#firstName}
	 * @param last  {@link Person#lastName}
	 * @param ssn  Social security number ({@link Person#ssn})
	 * @param rate  {@link payRate}
	 * @param hours  {@link hoursWorked}
	 * @param hairLength  {@link Cat#hairLength}
	 */
	public PartTimeEmployee(String first, String last, String ssn, 
							double rate, double hours, String hairLength)
	{
		// Instantiate properties with parameter values 
		super(first, last, ssn);							// Instantiate parent class data using polymorphism
		payRate = rate;
		hoursWorked = hours;
		employeesCat = new Cat(hairLength);					// Part-time employee owns a cat
		calculatePay();										// Calculate part-time employee's salary
	}
		
	/**
	 * Constructs a {@link PartTimeEmployee} object with the properties 
	 * {@link Person#firstName}, {@link Person#lastName}, and {@link Person#ssn} 
	 * from the parent class {@link Person} - properties of {@link #payRate}
	 * and {@link #hoursWorked} from the {@link PartTimeEmployee} class - 
	 * composition objects {@link Bird}, {@link Dog}, and {@link Cat}.
	 * This {@link PartTimeEmployee} owns a {@link Bird}, {@link Cat},
	 * and {@link Cat}. Calculates {@link #salary}.
	 * 
	 * @param first  {@link Person#firstName}
	 * @param last  {@link Person#lastName}
	 * @param ssn  Social security number ({@link Person#ssn})
	 * @param rate  {@link payRate}
	 * @param hours  {@link hoursWorked}
	 * @param bird  {@link Bird}
	 * @param dog  {@link Dog}
	 * @param cat  {@link Cat}
	 */
	public PartTimeEmployee(String first, String last, String ssn, 
							double rate, double hours, Bird bird, 
							Dog dog, Cat cat)
	{
		// Instantiate properties with parameter values 
		super(first, last, ssn);							// Instantiate parent class data using polymorphism
		payRate = rate;
		hoursWorked = hours;
		employeesBird = new Bird(bird);						// Part-time employee owns a bird
		employeesDog = new Dog(dog);						// Part-time employee owns a dog
		employeesCat = new Cat(cat);						// Part-time employee owns a cat
		calculatePay();										// Calculate part-time employee's salary
	}
// ------------------- End Alternate Constructors -------------------
	
// ------------------- Copy Constructor -------------------
	/**
	 * Constructs a shallow copy of the {@link PartTimeEmployee}
	 * object.
	 * 
	 * @param obj  {@link PartTimeEmployee} object to be shallow copied
	 */
	public PartTimeEmployee(PartTimeEmployee obj)
	{
		// Instantiate properties with parameter value
		super(obj);											// Instantiate parent class data using polymorphism 
		this.payRate = obj.payRate;							// Shallow copy part-time employee's pay rate
		this.salary = obj.salary;							// Shallow copy part-time employee's salary
		this.hoursWorked = obj.hoursWorked;					// Shallow copy part-time employee's hours worked
		this.employeesCat = obj.employeesCat;				// Shallow copy part-time employee's cat
		this.employeesBird = obj.employeesBird;				// Shallow copy part-time employee's bird
		this.employeesDog = obj.employeesDog;				// Shallow copy part-time employee's dog 
	}
// ------------------- End Copy Constructor -------------------
	
// ------------------- Make Copy Method -------------------
	/**
	 * Creates a shallow copy of the {@link PartTimeEmployee}
	 * object.
	 * 
	 * @param obj  {@link PartTimeEmployee} to be shallow copied
	 */
	public void makeCopy(PartTimeEmployee obj)
	{
		this.payRate = obj.payRate;							// Shallow copy part-time employee's pay rate
		this.salary = obj.salary;							// Shallow copy part-time employee's salary
		this.hoursWorked = obj.hoursWorked;					// Shallow copy part-time employee's hours worked
		this.employeesCat = obj.employeesCat;				// Shallow copy part-time employee's cat
		this.employeesBird = obj.employeesBird;				// Shallow copy part-time employee's bird
		this.employeesDog = obj.employeesDog;				// Shallow copy part-time employee's dog 
	}
// ------------------- End Make Copy Method -------------------
	
// ------------------- Get Copy Method -------------------
	/**
	 * Retrieves a deep copy of the {@link PartTimeEmployee} object.
	 * 
	 * @return  Deep copy of the {@link PartTimeEmployee} object
	 */
	public Person getCopy()
	{
		PartTimeEmployee emp = new PartTimeEmployee();		// Instantiate copy of PartTimeEmployee object 
		this.payRate = emp.payRate;							// Deep copy part-time employee's pay rate								
		this.salary = emp.salary;							// Deep copy part-time employee's salary
		this.hoursWorked = emp.hoursWorked;					// Deep copy part-time employee's hours worked
		this.employeesCat = emp.employeesCat;				// Deep copy part-time employee's cat
		this.employeesBird = emp.employeesBird;				// Deep copy part-time employee's bird 
		this.employeesDog = emp.employeesDog;				// Deep copy part-time employee's dog
		return emp;											// Return deep copied PartTimeEmployee object 
	}
// ------------------- End Get Copy Method -------------------
	  
// ------------------- Adopt Cat Method -------------------
	/**
	 * Executes the {@link PartTimeEmployee} adopting a {@link Cat}.
	 * 
	 * @param strayCat  {@link Cat} 
	 */
	public void adoptCat(Cat strayCat)
	{
		String cName = strayCat.getName(); 					// Retrieve cat's name
		employeesCat.setName(cName);						// Set cat's name 
		String breed = strayCat.getBreed();					// Retrieve cat's breed
		employeesCat.setBreed(breed);						// Set cat's breed
		String dob = strayCat.getDateOfBirth();				// Retrieve cat's date of birth
		employeesCat.setDateOfBirth(dob);					// Set cat's date of birth
		String hair = strayCat.getHairLength();				// Retrieve cat's hair length
		employeesCat.setHairLength(hair);					// Set cat's hair length
	}
// ------------------- End Adopt Cat Method -------------------
	 
// ------------------- Adopt Dog Method -------------------
	/**
	 * Executes the {@link PartTimeEmployee} adopting a {@link Dog}.
	 * 
	 * @param strayDog  {@link Dog}
	 */
	public void adoptDog(Dog strayDog)
	{
		String dName = strayDog.getName(); 					// Retrieve dog's name
		employeesDog.setName(dName);						// Set dog's name
		String breed = strayDog.getBreed();					// Retrieve dog's breed
		employeesDog.setBreed(breed);						// Set dog's breed
		String dob = strayDog.getDateOfBirth();				// Retrieve dog's date of birth
		employeesDog.setDateOfBirth(dob);					// Set dog's date of birth
		boolean hunt = strayDog.getHuntingDog();			// Retrieve if dog's a hunting dog
		employeesDog.setHuntingDog(hunt);					// Set if the dog's a hunting dog
		boolean kidF = strayDog.getKidFriendly();			// Retrieve if dog's kid friendly
		employeesDog.setKidFriendly(kidF);					// Set if dog's kid friendly
		String size  = strayDog.getSize();					// Retrieve dog's size 
		employeesDog.setSize(size);							// Set dog's size 
	}
// ------------------- End Adopt Dog Method -------------------
	   
// ------------------- Adopt Bird Method -------------------
	/**
	 * Executes the {@link PartTimeEmployee} adopting a {@link Bird}.
	 * 
	 * @param strayBird  {@link Bird}
	 */
	public void adoptBird(Bird strayBird)
	{
		String bName = strayBird.getName(); 				// Retrieve bird's name
		employeesBird.setName(bName);						// Set bird's name
		String breed = strayBird.getBreed();				// Retrieve bird's breed
		employeesBird.setBreed(breed);						// Set bird's breed
		String dob = strayBird.getDateOfBirth();			// Retrieve bird's date of birth
		employeesBird.setDateOfBirth(dob);					// Set bird's date of birth
		String color = strayBird.getFeatherColor();			// Retrieve bird's feather color
		employeesBird.setFeatherColor(color);				// Set bird's feather color
		int length = strayBird.getBeakLength();				// Retrieve bird's beak length
		employeesBird.setBeakLength(length);				// Set bird's beak length
	}
// ------------------- End Adopt Bird Method -------------------
	 
// **********************
// *** Pet Behaviors: ***
// **********************
// ------------------- Cat Running Method -------------------
	/**
	 * Displays the {@link Cat} running.
	 */
	public void catRunning()
	{
		employeesCat.running(); 							// Execute cat's running behavior
	}
// ------------------- End Cat Running Method -------------------
	   
// ------------------- Cat Hissing Method -------------------
	/**
	 * Displays the {@link Cat} hissing.
	 */
	public void catHissing()
	{
		employeesCat.hiss();								// Execute cat's hissing behavior
	} 
// ------------------- End Cat Hissing Method -------------------
	 
// ------------------- Play with Pets Method -------------------
	/**
	 * Displays the {@link PartTimeEmployee} playing with their {@link Cat}.
	 */
	public void playWithCat()
	{
		employeesCat.hiss();								// Execute cat's hissing behavior
		employeesCat.running();								// Execute cat's running behavior
	}
// ------------------- End Play with Pets Method -------------------
	   
// ------------------- Calculate Pay Method -------------------
	/**
	 * Calculates the {@link PartTimeEmployee}'s {@link #salary}.
	 */
	public void calculatePay()
	{
		salary = (payRate * hoursWorked);   				// Calculate part-time employee's salary 
	}
// ------------------- End Calculate Pay Method -------------------
	     
// ****************
// *** Setters: *** 
// ****************
// ------------------- Set Name, Rate, and Hours Method -------------------
	/** 
	 * Updates the {@link PartTimeEmployee}'s {@link Person#firstName},
	 * {@link Person#lastName}, {@link payRate}, and {@link hoursWorked}.
	 * 
	 * @param first  {@link Person#firstName}
	 * @param last  {@link Person#lastName}
	 * @param rate  {@link payRate}
	 * @param hours  {@link hoursWorked}
	 */
	public void setNameRateHours(String first, String last, double rate, double hours)
	{
		setName(first, last);								// Update part-time employee's first and last name
		payRate = rate;										// Update part-time employee's hourly rate
		hoursWorked = hours;								// Update part-time employee's hours worked 
	}
// ------------------- End Set Name, Rate, and Hours Method -------------------

// ****************
// *** Getters: *** 
// ****************
// ------------------- Get Cat Name Method -------------------
	/**
	 * Retrieves the {@link PartTimeEmployee}'s {@link Cat}'s 
	 * {@link animals.Pet#name}.
	 * 
	 * @return  {@link animals.Pet#name}
	 */
	public String getCatName()
	{
		String catName = employeesCat.getName();			// Retrieve cat's name
		return catName;										// Return cat's name
	}
// ------------------- End Get Cat Name Method -------------------
	
// ------------------- Get Pay Method -------------------
	/**
	 * Retrieves the {@link PartTimeEmployee}'s {@link #salary}.
	 * 
	 * @return  {@link #salary}
	 */
	public double getPay()
	{
		return salary;										// Return part-time employee's salary 
	}
// ------------------- End Get Pay Method -------------------
	
// ------------------- Get Pay Rate Method -------------------
	/**
	 * Retrieves the {@link PartTimeEmployee}'s {@link #payRate}.
	 * 
	 * @return  {@link #payRate}
	 */
	public double getPayRate()
	{
		return payRate;										// Return part-time employee's pay rate 
	}
// ------------------- End Get Pay Rate Method -------------------
	
// ------------------- Get Hours Worked Method -------------------
	/**
	 * Retrieves the {@link PartTimeEmployee}'s {@link #hoursWorked}.
	 * 
	 * @return  {@link #hoursWorked}
	 */
	public double getHoursWorked()
	{
		return hoursWorked;									// Return part-time employee's hours worked 
	}
// ------------------- End Get Hours Worked Method -------------------
	   
// ------------------- To String Method -------------------
	/**
	 * Converts the {@link PartTimeEmployee} object's data to a String.
	 */
	public String toString()
	{
		String catData = employeesCat.toString();			// Convert cat data to a String				
		String birdData = employeesBird.toString();			// Convert bird data to a String 
		String dogData = employeesDog.toString();			// Convert dog data to a String 
		String personData = super.toString();				// Convert parent class data to a String 
		
		// Temporary variables to see if the pet isn't used
		Bird tempBird = new Bird();
		Cat tempCat = new Cat();
		Dog tempDog = new Dog();
		String partTimeData;
		
		// Determine which pets the part-time employee owns
		if (birdData.equals(tempBird.toString()) 			// No pets 
		   && catData.equals(tempCat.toString()) 
		   && dogData.equals(tempDog.toString()))
		{
			partTimeData = personData + "Wage is: $" + salary + "\n\n";
		}
		else if (birdData.equals(tempBird.toString()) 		// Has a dog
				&& catData.equals(tempCat.toString()) 
				&& !dogData.equals(tempDog.toString()))
		{
			partTimeData = personData + "Wage is: $" + salary + "\n\n" + dogData;
		}
		else if (birdData.equals(tempBird.toString()) 		// Has a cat 
				&& !catData.equals(tempCat.toString()) 
				&& dogData.equals(tempDog.toString()))
		{
			partTimeData = personData + "Wage is: $" + salary + "\n\n" + catData;
		} 
		else if (!birdData.equals(tempBird.toString()) 		// Has a bird
				&& catData.equals(tempCat.toString()) 
				&& dogData.equals(tempDog.toString()))
		{
			partTimeData = personData + "Wage is: $" + salary + "\n\n" + birdData;
		}
		else if (birdData.equals(tempBird.toString()) 		// Has a cat and a dog
				&& !catData.equals(tempCat.toString()) 
				&& !dogData.equals(tempDog.toString()))
		{
			partTimeData = personData + "Wage is: $" + salary + "\n\n" + catData  + dogData;
		}
		else if (!birdData.equals(tempBird.toString()) 		// Has a bird and a dog
				&& catData.equals(tempCat.toString()) 
				&& !dogData.equals(tempDog.toString()))
		{
			partTimeData = personData + "Wage is: $" + salary + "\n\n" + birdData  + dogData;
		}
		else if (!birdData.equals(tempBird.toString()) 		// Has a bird and cat 
				&& !catData.equals(tempCat.toString()) 
				&& dogData.equals(tempDog.toString()))
		{
			partTimeData = personData + "Wage is: $" + salary + "\n\n" + birdData + catData;
		}
		else 												// Has a bird, cat, and dog 
		{
			partTimeData = personData + "Wage is: $" + salary + "\n\n" + birdData + catData + dogData;
		}
		return partTimeData;								// Return part-time employee's data 
	}
// ------------------- End To String Method -------------------
} // End of class PartTimeEmployee