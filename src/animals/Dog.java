package animals;

/*
 * Course: CSIS 162 - Programming II
 * Institution: University of Wisconsin-River Falls
 * Development Language: Java
 */

/**
 * <p>
 * 		Contains dog attributes and algorithms to modify the attributes. 
 * 		Considered a {@link Pet}.
 * </p>
 * <p>
 * 		Depends on:
 * </p>
 * <ul>
 * 		<li>{@link Pet}</li>
 * </ul>
 * <p>
 * 		Dog - a domesticated carnivorous mammal that typically has a long snout, 
 * 		an acute sense of smell, nonretractable claws, and a barking, howling, or whining voice.
 * </p>
 * 
 * @author  Brady Lange - <a href = "https://www.linkedin.com/in/brady-lange/" target = "_blank">LinkedIn</a>
 * @version  1.0.1 (01/18/2019)
 * @since  1.0 (05/09/2017)
 */
public class Dog extends Pet 
{ 
	// Instance variables
	/**
	 * Mass of the animal - Small, Medium, or Large.
	 */
	private String size;																
	/**
	 * Aggressiveness towards human children.
	 */
	private boolean kidFriendly;														
	/**
	 * Skill for hunting prey.
	 */
	private boolean huntingDog;															
	
// ------------------- Default Constructor -------------------
	/**
	 * Constructs a {@link Dog} object with default properties  
	 * for both itself and it's parent class {@link Pet}.
	 */
	public Dog()
	{
		// Instantiate default properties
		super();											// Instantiate default parent class data using polymorphism
		size = "N/A";
		kidFriendly = false;
		huntingDog = false;
	}
// ------------------- End Default Constructor -------------------
	
// ------------------- Alternate Constructor -------------------
	/**
	 * Constructs a {@link Dog} object with the properties {@link #size},
	 * {@link #kidFriendly}, and {@link #huntingDog} from {@link Dog}
	 * - properties of {@link Pet#breed}, {@link Pet#name}, and {@link Pet#dob} from
	 * the parent class {@link Pet}.
	 * 
	 * @param size  {@link #size} (Small, Medium, or Large)
	 * @param kidF  {@link #kidFriendly}
	 * @param hDog  {@link #huntingDog}
	 * @param breed  {@link Pet#breed}
	 * @param name  {@link Pet#name}
	 * @param dob  Date of birth ({@link Pet#dob})
	 */
	public Dog(String size, boolean kidF, boolean hDog, String breed, String name, String dob)
	{
		// Instantiate properties with parameter values 
		super(breed, name, dob);							// Instantiate parent class data using polymorphism 
		this.size = size;
		this.kidFriendly = kidF;
		this.huntingDog = hDog;
	}
// ------------------- End Alternate Constructor -------------------
	
// ------------------- Copy Constructor -------------------
	/**
	 * Constructs a shallow copy of the {@link Dog} object.
	 * 
	 * @param obj  {@link Dog} object to be shallow copied
	 */
	public Dog(Dog obj)
	{
		// Instantiate properties with parameter value
		super(obj);											// Instantiate parent class data using polymorphism
		this.size = obj.size;								// Shallow copy dog's size 
		this.kidFriendly = obj.kidFriendly;					// Shallow copy if dog is kid friendly 
		this.huntingDog = obj.huntingDog;					// Shallow copy if dog is hunting dog
	}
// ------------------- End Copy Constructor -------------------
	
// ------------------- Make Copy Method -------------------
	/**
	 * Creates a shallow copy of the {@link Dog} object.
	 * 
	 * @param obj  {@link Dog} object to be shallow copied
	 */
	public void makeCopy(Dog obj)
	{
		this.size = obj.size;								// Shallow copy dog's size
		this.kidFriendly = obj.kidFriendly;					// Shallow copy if dog is kid friendly 
		this.huntingDog = obj.huntingDog;					// Shallow copy if dog is hunting dog 
	}
// ------------------- End Make Copy Method -------------------
	
// ------------------- Get Copy Method -------------------
	/**
	 * Retrieves a deep copy of the {@link Dog} object.
	 * 
	 * @return  Deep copy of the {@link Dog} object
	 */
	public Dog getCopy()
	{
		Dog dog = new Dog();								// Instantiate copy of Dog object 
		this.size = dog.size;								// Deep copy dog's size							
		this.kidFriendly = dog.kidFriendly;					// Deep copy if dog is kid friendly 
		this.huntingDog = dog.huntingDog;					// Deep copy if dog is hunting dog
		return dog;											// Return deep copied Dog object 
	}
// ------------------- End Get Copy Method -------------------
	
// ****************
// *** Setters: ***
// ****************
// ------------------- Set Size Method -------------------
	/**
	 * Updates the {@link Dog}'s {@link #size}.
	 * 
	 * @param size  {@link #size}
	 */
	public void setSize(String size)
	{
		this.size = size;									// Update dog's size 
	}
// ------------------- End Set Size Method -------------------
	
// ------------------- Set Kid Friendly Method -------------------
	/**
	 * Updates whether the {@link Dog} is {@link #kidFriendly}.
	 * 
	 * @param kFriend  'true' if {@link kidFriendly} and 'false' if not
	 */
	public void setKidFriendly(boolean kFriend)
	{
		this.kidFriendly = kFriend;							// Update if the dog is kid friendly 
	}
// ------------------- End Set Kid Friendly Method -------------------
	
// ------------------- Set Hunting Dog Method -------------------
	/**
	 * Updates whether the {@link Dog} is a {@link #huntingDog}.
	 * 
	 * @param hDog  'true' if a {@link #huntingDog} and 'false' if not
	 */
	public void setHuntingDog(boolean hDog)
	{
		this.huntingDog = hDog;								// Update if the dog is a hunting dog 
	}
// ------------------- End Set Hunting Dog Method -------------------

// ****************
// *** Getters: ***
// ****************
// ------------------- Get Size Method -------------------
	/**
	 * Retrieves the {@link Dog}'s {@link #size}.
	 * 
	 * @return  {@link #size}
	 */
	public String getSize()
	{
		return size;										// Return dog's size
	}
// ------------------- End Get Size Method -------------------
	
// ------------------- Get Kid Friendly Method -------------------
	/**
	 * Retrieves whether the {@link Dog} is {@link #kidFriendly}.
	 * 
	 * @return  'true' if {@link #kidFriendly} and 'false' if not
	 */
	public boolean getKidFriendly()
	{
		return kidFriendly;									// Return if the dog is kid friendly 
	}
// ------------------- End Get Kid Friendly Method -------------------
	
// ------------------- Get Hunting Dog Method -------------------
	/**
	 * Retrieves whether the {@link Dog} is a {@link #huntingDog}.
	 * 
	 * @return  'true' if a {@link #huntingDog} and 'false' if not
	 */
	public boolean getHuntingDog()
	{
		return huntingDog;									// Return if the dog is a hunting dog 
	}
// ------------------- End Get Hunting Dog Method -------------------
	
// ------------------- To String Method -------------------
	/**
	 * Converts the {@link Dog} object's data to a String.
	 */
	public String toString()
	{
		String petsData = super.toString();					// Convert parent class data to a String 
		String data = "Dog: " + "\n" + name + "'s size: " + size 
					+ "\n" + "Is " + name + " kid friendly: " + kidFriendly 
					+ "\n" + "Is " + name + " a hunting dog: " 
					+ huntingDog + "\n" + petsData;
		return data;										// Return dog's data
	}
// ------------------- End To String Method -------------------
} // End of class Dog