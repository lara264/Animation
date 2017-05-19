/**
 * A Pet can eat, sleep, speak, die, and kill. Pets also have names and genders.
 * This Pet has an integer-based state and gender.
 *
 * @author  Jon Cooper
 * @version v6 Sept. 30, 2009
 */

public class Pet
{
	private final static int DEAD     = 0;
	private final static int SLEEPING = 1;
	private final static int EATING   = 2;
	private final static int SPEAKING = 3;
	
	/** 0 indicates a female Pet. */
	public final static int FEMALE = 0;

	/** 1 indicates a male Pet. */
	public final static int MALE   = 1;
	
	private int state = SLEEPING; // newly instantiated Pets are sleeping by default
	private int gender;           // gender must be assigned on instantiation
	private String name;          // if no name is assigned, name remains null
	
	/**
	 * Creates an instance of a Pet with gender assigned. New Pets
	 * are in a sleeping state when instantiated.
	 *
	 * @param g gender of Pet
	 */
	public Pet(int g)
	{
		gender = g;
	}
	
	/**
	 * Creates an instance of a Pet with gender and name assigned.
	 * Pet is in a sleeping state when instantiated.
	 *
	 * @param g gender of Pet (true = male, false = female)
	 * @param n name of Pet
	 */
	public Pet(int g, String n)
	{
		gender = g;
		name = n;
	}

	/**
	 * Sets Pet's state to eating and displays "eating" output.
	 * An error message is displayed if the Pet is dead.
	 */
	public void eat()
	{
		if (state != DEAD)
		{
			state = EATING;
			
			System.out.println(name + " goes \"chomp, chomp, chomp.\"");
		}
		else
		{
			showDeadError("eat");
		}
	}

	/**
	 * Sets Pet's state to sleeping and displays "sleeping" output.
	 * An error message is displayed if the Pet is dead.
	 */
	public void sleep()
	{
		if (state != DEAD)
		{
			state = SLEEPING;
			
			System.out.println(name + " goes \"zzzzzzzzzz..........\"");
		}
		else
		{
			showDeadError("sleep");
		}
	}
	
	/**
	 * Sets Pet's state to speaking and displays Pet's speach.
	 * An error message is displayed if the Pet is dead.
	 *
	 * @param s phrase to speak
	 */
	public void speak (String s)
	{
		if (state != DEAD)
		{
			state = SPEAKING;
			
			System.out.println(name + " says, \"" + s + "\"");
		}
		else
		{
			showDeadError("speak");
		}
	}
	
	/**
	 * Sets Pet's state to dead and displays some "dying" output.
	 * An error message is displayed if the Pet is already dead.
	 */
	public void die()
	{
		if (state != DEAD)
		{

			state = DEAD;
			
			System.out.println(name + " goes \"aaaaaaaaak!\" and dies.");
		}		
		else
		{
			showDeadError("die");
		}
	}
	
	/**
	 * Makes this pet kill another Pet.
	 * 
	 * @param p Pet to kill
	 */
	public void kill(Pet p)
	{
		if (state != DEAD)
		{
			System.out.println(name + " kills " + p.getName() + "!");
			p.die();
		}
		else
		{
			showDeadError("kill");
		}
	}
	
	/**
	 * Assigns a name to a Pet.
	 *
	 * @param n name of Pet
	 */
	public void setName(String n)
	{
		name = n;
	}
	
	/**
	 * Tells the name of Pet.
	 *
	 * @return name of Pet
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * Tells the gender of the Pet as "male" or "female".
	 *
	 * @return gender of Pet
	 */
	public String getGender()
	{
		if      (gender == MALE)   return "male";
		else if (gender == FEMALE) return "female";
		else 					   return "Error: " + name + " has no gender assigned.";
	}
	
	/**
	 * Tells the current state of the Pet.
	 *
	 * @return state of Pet
	 */
	public String getState()
	{
		if      (state == DEAD)     return "dead";
		else if (state == EATING)   return "eating";
		else if (state == SLEEPING) return "sleeping";
		else if (state == SPEAKING) return "speaking";
		else    		            return "error";
	}
	
	/**
	 * Returns a String representation of a Pet Object.
	 *
	 * @return name, state, and gender
	 */
	public String toString()
	{
		return name + "[" + getState() + ", " + getGender() + "]";
	}
	
	// helper methods
	private void showDeadError(String a)
	{
		String pronoun;
		
		if (gender == MALE) pronoun = "he";
		else	           pronoun = "she";
		
		System.out.println("Error: " + name + " can't " + a + " because " + pronoun + " is dead.");
	}
}








