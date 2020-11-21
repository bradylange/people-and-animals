package animals;

/*
 * Course: CSIS 162 - Programming II
 * Institution: University of Wisconsin-River Falls
 * Development Language: Java
 */

/**
 * <p>
 * 		Contains bird attributes and algorithms to modify the attributes. 
 * 		Considered a {@link Pet}.
 * </p>
 * <p>
 * 		Depends on:
 * </p>
 * <ul>
 * 		<li>{@link Pet}</li>
 * </ul>
 * <p>
 * 		Bird - a warm-blooded egg-laying vertebrate distinguished 
 * 		by the possession of feathers, wings, and a beak and (typically) by being able to fly.
 * </p>
 * 
 * @author  Brady Lange - <a href = "https://www.linkedin.com/in/brady-lange/" target = "_blank">LinkedIn</a>
 * @version  1.0.1 (01/18/2019)
 * @since  1.0 (05/09/2017)
 */
public class Bird extends Pet
{ 
	// Instance variables
	/**
	 * Feather color.
	 */
	private String featherColor;	
	/**
	 * Beak length.
	 */
	private int beakLength;												
	
// ------------------- Default Constructor -------------------
	/**
	 * Constructs a {@link Bird} object with default properties
	 * for both itself and its parent class {@link Pet}.
	 */
	public Bird()
	{
		// Instantiate default properties 
		super();											// Instantiate default parent class data using polymorphism
		featherColor = "N/A";
		beakLength = 0;
	}
// ------------------- End Default Constructor -------------------
	
// ------------------- Alternate Constructors -------------------
	/**
	 * Constructs a {@link Bird} object with the properties 
	 * {@link #featherColor} and {@link #beakLength} from {@link Bird}
	 * - properties of {@link Pet#breed}, {@link Pet#name}, and {@link Pet#dob}
	 *  from the parent class {@link Pet}.
	 * 
	 * @param fCol  {@link #featherColor}
	 * @param bLen  {@link #beakLength}
	 * @param breed  {@link Pet#breed}
	 * @param name  {@link Pet#name}
	 * @param dob  Date of birth ({@link Pet#dob})
	 */
	public Bird(String fCol, int bLen, String breed, String name, String dob)
	{
		// Instantiate properties with parameter values 
		super(breed, name, dob);							// Instantiate parent class data using polymorphism
		this.featherColor = fCol;
		this.beakLength = bLen;
	}
	
	/**
	 * Constructs a {@link Bird} object with the properties 
	 * {@link #featherColor} and {@link #beakLength} and 
	 * default properties for the parent class {@link Pet}.
	 * 
	 * @param fCol  {@link #featherColor}
	 * @param bLen  {@link #beakLength}
	 */
	public Bird(String fCol, int bLen)
	{
		// Instantiate properties with parameter values 
		super();											// Instantiate default parent class data using polymorphism
		this.featherColor = fCol;
		this.beakLength = bLen;
	}
// ------------------- End Alternate Constructors -------------------
	
// ------------------- Copy Constructor -------------------
	/**
	 * Constructs a shallow copy of the {@link Bird} object.
	 * 
	 * @param obj  {@link Bird} object to be shallow copied
	 */
	public Bird(Bird obj)
	{
		// Instantiate properties with parameter value 
		super(obj);											// Instantiate parent class data using polymorphism
		this.featherColor = obj.featherColor;				// Shallow copy bird's feather color
		this.beakLength = obj.beakLength;					// Shallow copy bird's beak length
	}
// ------------------- End Copy Constructor -------------------
	
// ------------------- Make Copy Method -------------------
	/**
	 * Creates a shallow copy of the {@link Bird} object.
	 * 
	 * @param obj  {@link Bird} object to be shallow copied
	 */
	public void makeCopy(Bird obj)
	{
		this.featherColor = obj.featherColor;				// Shallow copy bird's feather color
		this.beakLength = obj.beakLength;					// Shallow copy bird's beak length 
	}
// ------------------- End Make Copy Method -------------------
	
// ------------------- Get Copy Method -------------------
	/**
	 * Retrieves a deep copy of the {@link Bird} object.
	 * 
	 * @return  Deep copy of the {@link Bird} object
	 */
	public Bird getCopy()
	{
		Bird bird = new Bird();								// Instantiate copy of Bird object 
		this.featherColor = bird.featherColor;				// Deep copy bird's feather color								
		this.beakLength = bird.beakLength;					// Deep copy bird's beak length
		return bird;										// Return deep copied Bird object 
	}
// ------------------- End Get Copy Method -------------------
	
// ****************
// *** Setters: ***
// ****************
// ------------------- Set Feather Color Method -------------------
	/**
	 * Updates the {@link Bird}'s {@link #featherColor}.
	 * 
	 * @param color  {@link featherColor}
	 */
	public void setFeatherColor(String color)
	{
		this.featherColor = color;							// Update bird's feather color
	}
// ------------------- End Set Feather Color Method -------------------
	
// ------------------- Set Beak Length Method -------------------
	/**
	 * Updates the {@link Bird}'s {@link beakLength}.
	 * 
	 * @param length  {@link beakLength}
	 */
	public void setBeakLength(int length)
	{
		this.beakLength = length;							// Update bird's beak length
	}
// ------------------- End Set Beak Length Method -------------------
	
// ****************
// *** Getters: ***
// ****************
// ------------------- Get Feather Color Method -------------------
	/**
	 * Retrieves the {@link Bird}'s {@link #featherColor}.
	 * 
	 * @return  {@link #featherColor}
	 */
	public String getFeatherColor()
	{
		return featherColor;								// Return bird's feather color
	}
// ------------------- End Get Feather Color Method -------------------
	
// ------------------- Get Beak Length Method -------------------
	/**
	 * Retrieves the {@link Bird}'s {@link #beakLength}.
	 * 
	 * @return  {@link #beakLength}
	 */
	public int getBeakLength()
	{	
		return beakLength;									// Return bird's beak length
	}	
// ------------------- End Get Beak Length Method -------------------
	
// ------------------- To String Method -------------------
	/**
	 * Converts the {@link Bird} object's data to a String.
	 */
	public String toString()
	{
		String petsData = super.toString();					// Convert parent class data to a String 
		String data = "Bird: " + "\n" + name + "'s feather color: " 
					+ featherColor + "\n" + name + "'s beak length: " 
					+ beakLength + " inches" + "\n" + petsData + "\n";
		return data;										// Return bird's data 
	}
// ------------------- End To String Method -------------------
} // End of class Bird