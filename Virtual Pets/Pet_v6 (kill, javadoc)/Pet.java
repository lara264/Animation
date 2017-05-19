/**
 * A Pet can eat, sleep, speak, die, and kill. Pets also have 
 * names and genders.
 *
 * @author  Jon Cooper
 * @version v5 Sept. 30, 2009
 */

public class Pet
{
	private boolean isAlive;
	private boolean isEating;
	private boolean isSleeping;
	private boolean isSpeaking;
	private boolean isMale;
	private String name;
	
	/**
	 * Creates an instance of a Pet with gender assigned. New Pets
	 * are in a sleeping state when created.
	 *
	 * @param g gender of Pet (true=male, false=female)
	 */
	public Pet(boolean g)
	{
		isAlive = true;
		isEating = false;
		isSleeping = true;
		isSpeaking = false;
		isMale = g;
	}
	
	/**
	 * Creates an instance of a Pet with gender and name assigned.
	 *
	 * @param g gender of Pet (true = male, false = female)
	 * @param n name of Pet
	 */
	public Pet(boolean g, String n)
	{
		isAlive = true;
		isEating = false;
		isSleeping = true;
		isSpeaking = false;
		isMale = g;
		name = n;
	}
	
	/**
	 * Sets Pet's state to eating.
	 */
	public void eat()
	{
		if (isAlive)
		{
			isEating = true;
			isSleeping = false;
			isSpeaking = false;
			
			System.out.println(name + " goes \"chomp, chomp, chomp.\"");
		}
		else
		{
			deadError("eat");
		}
	}

	/**
	 * Sets Pet's state to sleeping.
	 */
	public void sleep()
	{
		if (isAlive)
		{
			isEating = false;
			isSleeping = true;
			isSpeaking = false;
			
			System.out.println(name + " goes \"zzzzzzzzzz..........\"");
		}
		else
		{
			deadError("sleep");
		}
	}
	
	/**
	 * Sets Pet's state to speaking and displays Pet's speach.
	 *
	 * @param s phrase to speak
	 */
	public void speak (String s)
	{
		if (isAlive)
		{
			isEating = false;
			isSleeping = false;
			isSpeaking = true;

			System.out.println(name + " says, \"" + s + "\"");
		}
		else
		{
			deadError("speak");
		}
	}
	
	/**
	 * Sets Pet's state to dead.
	 */
	public void die()
	{
		if (isAlive)
		{
			isAlive = false;
			isEating = false;
			isSleeping = false;
			isSpeaking = false;
			
			System.out.println(name + " goes \"aaaaaaaaak!\" and dies.");
		}		
		else
		{
			deadError("die");
		}
	}
	
	/**
	 * Makes this pet kill another Pet.
	 * 
	 * @param p Pet to kill
	 */
	public void kill(Pet p)
	{
		if (isAlive)
		{
			System.out.println(name + " kills " + p.getName() + "!");
			p.die();
		}
		else
		{
			deadError("kill");
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
	 * Returns name of Pet.
	 *
	 * @return name of Pet
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * Returns gender of Pet as "male" or "female" rather than true or false.
	 *
	 * @return gender of Pet
	 */
	public String getGender()
	{
		if (isMale) return "male";
		else	    return "female";
	}
	
	/**
	 * Returns state of Pet.
	 *
	 * @return current state
	 */
	public String getState()
	{
		if      (!isAlive)   return "dead";
		else if (isEating)   return "eating";
		else if (isSleeping) return "sleeping";
		else if (isSpeaking) return "speaking";
		else    		     return "error";
	}
	
	/**
	 * Returns String representation of Pet
	 *
	 * @return Pet Object as String representation
	 */
	public String toString()
	{
		return name + "[" + getState() + ", " + getGender() + "]";
	}
	
	// helper methods
	private void deadError(String a)
	{
		String pronoun;
		
		if (isMale) pronoun = "he";
		else	    pronoun = "she";
		
		System.out.println("Error: " + name + " can't " + a + " because " + pronoun + " is dead!");
	}
}








