package animals;

/*
 * Course: CSIS 162 - Programming II
 * Institution: University of Wisconsin-River Falls
 * Development Language: Java
 */

/**
 * <p>
 * 		Contains cat attributes and algorithms to modify the attributes. 
 * 		Considered a {@link Pet}.
 * </p>
 * <p>
 * 		Depends on:
 * </p>
 * <ul>
 * 		<li>{@link Pet}</li>
 * </ul>
 * <p>
 * 		Cat - a small domesticated carnivorous mammal with soft fur, 
 * 		a short snout, and retractable claws.
 * </p>
 * 
 * @author  Brady Lange - <a href = "https://www.linkedin.com/in/brady-lange/" target = "_blank">LinkedIn</a>
 * @version  1.0.1 (01/18/2019)
 * @since  1.0 (05/09/2017)
 */
public class Cat extends Pet 
{ 
	// Instance variables
	/**
	 * Hair length.
	 */
	private String hairLength;														
	
// ------------------- Default Constructor -------------------
	/**
	 * Constructs a {@link Cat} object with default properties 
	 * for both itself and its parent class {@link Pet}.
	 */
	public Cat ()
	{
		// Instantiate default properties 
		super();															// Instantiate default parent class data with polymorphism
		hairLength = "N/A";
	}
// ------------------- End Default Constructor -------------------
	
// ------------------- Alternate Constructors -------------------
	/**
	 * Constructs a {@link Cat} object with the properties
	 * {@link #hairLength} from {@link Cat} - properties of 
	 * {@link Pet#breed}, {@link Pet#name}, and {@link Pet#dob} from the 
	 * parent class {@link Pet}.
	 * 
	 * @param hair  {@link #hairLength} (Short or Long)
	 * @param breed  {@link Pet#breed}
	 * @param name  {@link Pet#name}
	 * @param dob  Date of birth ({@link Pet#dob})
	 */
	public Cat(String hair, String breed, String name, String dob)
	{
		// Instantiate properties with parameter values 
		super(breed, name, dob);											// Instantiate parent class data using polymorphism
		this.hairLength = hair;
	}
	
	/**
	 * Constructs a {@link Cat} object with the property
	 * {@link #hairLength} and default properties of the parent class
	 * {@link Pet}.
	 * 
	 * @param hair  {@link #hairLength} (Short or Long)
	 */
	public Cat(String hair)
	{
		// Instantiate properties with parameter value
		super();															// Instantiate default parent class data using polymorphism
		this.hairLength = hair;
	}
// ------------------- End Alternate Constructors -------------------
	
// ------------------- Copy Constructor -------------------
	/**
	 * Constructs a shallow copy of the {@link Cat} object.
	 * 
	 * @param obj  {@link Cat} object to be shallow copied
	 */
	public Cat(Cat obj)
	{
		// Instantiate properties with parameter value 
		super(obj);															// Instantiate parent class data using polymorphism
		this.hairLength = obj.hairLength;									// Shallow copy cat's hair length
	}
// ------------------- End Copy Constructor -------------------
	
// ------------------- Make Copy Method -------------------
	/**
	 * Creates a shallow copy of the {@link Cat} object.
	 * 
	 * @param obj  {@link Cat} object to be shallow copied
	 */
	public void makeCopy(Cat obj)
	{
		this.hairLength = obj.hairLength;									// Shallow copy cat's hair length
	}
// ------------------- End Make Copy Method -------------------
	
// ------------------- Get Copy Method -------------------
	/**
	 * Retrieves a deep copy of the {@link Cat} object.
	 * 
	 * @return  Deep copy of the {@link Cat} object
	 */
	public Cat getCopy()
	{
		Cat cat = new Cat();												// Instantiate copy of Cat object 
		this.hairLength = cat.hairLength;									// Deep copy cat's hair length								
		return cat;															// Return deep copied Cat object 
	}
// ------------------- End Get Copy Method -------------------
	
// ****************
// *** Setters: *** 
// ****************
// ------------------- Set Hair Length Method -------------------
	/**
	 * Updates the {@link Cat}'s {@link #hairLength}.
	 * 
	 * @param hair  {@link #hairLength} (Short or Long)
	 */
	public void setHairLength(String hair)
	{
		this.hairLength = hair;												// Update cat's hair length
	}
// ------------------- End Set Hair Length Method -------------------
	
// ****************
// *** Getters: *** 
// ****************
// ------------------- Get Hair Length Method -------------------
	/**
	 * Retrieves the {@link Cat}'s {@link #hairLength}.
	 * 
	 * @return  {@link #hairLength} (Short or Long)
	 */
	public String getHairLength()
	{
	   return hairLength;													// Return cat's hair length
	}
// ------------------- End Get Hair Length Method -------------------
	
// ******************
// *** Behaviors: *** 
// ******************
// ------------------- Hiss Method -------------------
	/**
	 * Displays the {@link Cat} hissing (defensive behavior).
	 */
	public void hiss()
	{
		System.out.println(name + "\nI am mad and hissing!");				// Defensive cat's behavior of intimidation 
	}
// ------------------- End Hiss Method -------------------

// ------------------- Running Method -------------------
   /**
    * Displays the {@link Cat} running (defensive behavior).
    */
   public void running()
   {
	   System.out.println(name + "\nI am running away, I had enough.");		// Defensive cat's behavior of fleeing 
   }
// ------------------- End Running Method -------------------
   
// ------------------- To String Method -------------------
   /**
    * Converts the {@link Cat} object's data to a String.
    */
   public String toString()
   {
	   String petsData = super.toString();									// Convert parent class data to a String 
	   return "Cat: " + "\n" + name + "'s hair length: " + hairLength		// Return cat's data 
			  + "\n" + petsData + "\n";	
   }
// ------------------- End To String Method -------------------
} // End of class Cat