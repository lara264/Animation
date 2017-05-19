public class Pet
{
	// fields
	private boolean isAlive;
	private boolean isEating;
	private boolean isSleeping;
	private boolean isMale;
	private String name;
	
	
	// constructors
	public Pet(boolean g)
	{
		isAlive = true;
		isEating = false;
		isSleeping = true;
		isMale = g;
	}
	
	public Pet(boolean g, String n)
	{
		isAlive = true;
		isEating = false;
		isSleeping = true;
		isMale = g;
		name = n;
	}
	
	// access methods
	public void eat()
	{
		if (isAlive)
		{
			isEating = true;
			isSleeping = false;
			
			System.out.println(name + " goes \"chomp, chomp, chomp.\"");
		}
		else
		{
			deadError("eat");
		}
	}

	public void sleep()
	{
		if (isAlive)
		{
			isEating = false;
			isSleeping = true;
			
			System.out.println(name + " goes \"zzzzzzzzzz..........\"");
		}
		else
		{
			deadError("sleep");
		}
	}
	
	public void speak (String s)
	{
		if (isAlive)
		{
			System.out.println(name + " says, \"" + s + "\"");
		}
		else
		{
			deadError("speak");
		}
	}
	
	public void die()
	{
		if (isAlive)
		{
			isAlive = false;
			isEating = false;
			isSleeping = false;
			
			System.out.println(name + " goes \"aaaaaaaaak!\" and dies.");
		}		
		else
		{
			deadError("die");
		}
	}
	
	public void setName(String n)
	{
		name = n;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getGender()
	{
		if (isMale) return "male";
		else	    return "female";
	}
	
	public String getState()
	{
		if      (!isAlive)   return "dead";
		else if (isEating)   return "eating";
		else if (isSleeping) return "sleeping";
		else    		     return "error";
	}
	
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
		
		System.out.println("Error: " + name + " can't " + a + " because " + pronoun + " is dead.");
	}
}








