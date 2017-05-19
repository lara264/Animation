public class Pet
{
	// fields
	private boolean isAlive;
	private boolean isEating;
	private boolean isSleeping;
	private String name;
	
	
	// constructors
	public Pet()
	{
		isAlive = true;
		isEating = false;
		isSleeping = true;
	}
	
	public Pet(String n)
	{
		isAlive = true;
		isEating = false;
		isSleeping = true;
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
			showDeadError();
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
			showDeadError();
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
			showDeadError();
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
			showDeadError();
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
	
	public String getState()
	{
		if	    (!isAlive)   return "dead";
		else if (isEating)   return "eating";
		else if (isSleeping) return "sleeping";
		else    		     return "error";
	}
	
	public String toString()
	{
		return name + ":" + getState();
	}
	
	
	// helper methods
	private void showDeadError()
	{
		System.out.println("Error: " + name + " is dead.");
	}
}








