package animals;

/*
 * Course: CSIS 162 - Programming II
 * Institution: University of Wisconsin-River Falls
 * Development Language: Java
 */

/**
 * <p>
 * 		Contains pet attributes and algorithms to modify the attributes. 
 * </p>
 * <p>
 * 		Pet - a domestic or tamed animal kept for companionship or pleasure.
 * </p>
 * 
 * @author  Brady Lange - <a href = "https://www.linkedin.com/in/brady-lange/" target = "_blank">LinkedIn</a>
 * @version  1.0.1 (01/18/2019)
 * @since  1.0 (05/09/2017)
 */
public class Pet
{
	// Instance variables
	/**
	 * A distinctive appearance and typically having been 
	 * developed by deliberate selection.
	 */
	private String breed;											
	/**
	 * Identification.
	 */
	protected String name; 	
	/**
	 * Date of birth.
	 */
	private String dob;			
	
// ------------------- Default Constructor -------------------
	/**
	 * Constructs a {@link Pet} object with default properties.
	 */
	public Pet()
	{
		// Instantiate default properties 
		breed = "N/A";
		name = "N/A";
		dob = "N/A";
	}
// ------------------- End Default Constructor -------------------
	
// ------------------- Alternate Constructor -------------------
	/**
	 * Constructs a {@link Pet} object with the properties
	 * {@link #breed}, {@link #name}, and {@link #dob}.
	 * 
	 * @param breed  {@link #breed}
	 * @param name  {@link #name}
	 * @param dob  Date of birth ({@link #dob})
	 */
	public Pet(String breed, String name, String dob)
	{
		// Instantiate properties with parameter values 
		this.breed = breed;
		this.name = name;
		this.dob = dob;
	}
// ------------------- End Alternate Constructor -------------------
	
// ------------------- Copy Constructor -------------------
	/**
	 * Constructs a shallow copy of the {@link Pet} object.
	 * 
	 * @param obj  {@link Pet} object to be shallow copied
	 */
	public Pet(Pet obj)
	{
		// Instantiate properties with parameter value
		this.breed = obj.breed;								// Shallow copy pet's breed
		this.name = obj.name;								// Shallow copy pet's name
		this.dob = obj.dob;									// Shallow copy pet's date of birth
	}
// ------------------- End Copy Constructor -------------------

// ------------------- Make Copy Method -------------------
	/**
	 * Creates a shallow copy of the {@link Pet} object.
	 * 
	 * @param obj  {@link Pet} object to be shallow copied
	 */
    public void makeCopy(Pet obj)
    {
		this.breed = obj.breed;								// Shallow copy pet's breed
		this.name = obj.name;								// Shallow copy pet's name
		this.dob = obj.dob;									// Shallow copy pet's date of birth
    }
// ------------------- End Make Copy Method -------------------
    
// ------------------- Get Copy Method -------------------
 	/**
 	 * Retrieves a deep copy of the {@link Pet} object.
 	 * 
 	 * @return  Deep copy of the {@link Pet} object
 	 */
 	public Pet getCopy()
 	{
 		Pet pet = new Pet();								// Instantiate copy of Pet object
 		this.breed = pet.breed;								// Deep copy pet's breed  								
 		this.name = pet.name;								// Deep copy pet's name
 		this.dob = pet.dob;									// Deep copy pet's date of birth
 		return pet;											// Return deep copied Pet object 
 	}
// ------------------- End Get Copy Method -------------------
	
// ****************
// *** Setters: ***
// ****************
// ------------------- Set Breed Method -------------------
	/**
	 * Updates the {@link Pet}'s {@link #breed}.
	 * 
	 * @param breed  {@link #breed}
	 */
	public void setBreed(String breed)
	{
		this.breed = breed;									// Update pet's breed 		
	}
// ------------------- End Set Breed Method -------------------
	
// ------------------- Set Name Method -------------------
	/**
	 * Updates the {@link Pet}'s {@link #name}.
	 * 
	 * @param name  {@link #name} (identification)
	 */
	public void setName(String name)
	{
		this.name = name;									// Update pet's name 
	}
// ------------------- End Set Name Method -------------------
	
// ------------------- Set Date of Birth Method -------------------
	/**
	 * Updates the {@link Pet}'s date of birth ({@link #dob}).
	 * 
	 * @param dob  Date of birth ({@link #dob})
	 */
	public void setDateOfBirth(String dob)
	{
		this.dob = dob;										// Update pet's date of birth
	}
// ------------------- End Set Date of Birth Method -------------------
	
// ****************
// *** Getters: ***
// ****************
// ------------------- Get Breed Method -------------------
	/**
	 * Retrieves the {@link Pet}'s {@link #breed}.
	 * 
	 * @return  {@link #breed}
	 */
	public String getBreed()
	{
		return breed;										// Return pet's breed
	}
// ------------------- End Get Breed Method -------------------
	
// ------------------- Get Name Method -------------------
	/**
	 * Retrieves the {@link Pet}'s {@link #name}.
	 * 
	 * @return  {@link #name} (identification)
	 */
	public String getName()
	{
		return name;										// Return pet's name
	}
// ------------------- End Get Name Method -------------------
	
// ------------------- Get Date of Birth Method -------------------
	/**
	 * Retrieves the {@link Pet}'s date of birth ({@link #dob}).
	 * 
	 * @return  Date of birth ({@link #dob})
	 */
	public String getDateOfBirth()
	{
		return dob;											// Return pet's date of birth
	}
// ------------------- End Get Date of Birth Method -------------------
	
// ------------------- To String Method -------------------
	/**
	 * Converts the {@link Pet} object's data to a String.
	 */
	public String toString()
	{
		String data = "Breed: " + breed + "\n" + "Name: " + name 
					+ "\n" + "Date of Birth: " + dob + "\n";
		return data;										// Return pet's data 
	}
// ------------------- End To String Method -------------------
} // End of class Pet