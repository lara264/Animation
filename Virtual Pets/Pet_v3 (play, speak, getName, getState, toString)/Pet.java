public class Pet
{
	// fields
	private boolean isEating = false;
	private boolean isSleeping = true;
	private boolean isPlaying = false;
	private boolean isAlive = true;
	private String name;
	
	
	// constructors
	public Pet()
	{

	}
	
	public Pet(String n)
	{
		name = n;
	}
	
	// access methods
	public void setName(String n)
	{
		name = n;
	}	
	
	public void eat()
	{
		isEating = true;
		isSleeping = false;
		isPlaying = false;
		
		System.out.println(name + " goes \"chomp, chomp, chomp.\"");
	}

	public void sleep()
	{
		isEating = false;
		isSleeping = true;
		isPlaying = false;
		
		System.out.println(name + " goes \"zzzzzzzzzz..........\"");
	}
	
	public void play()
	{
		if (isAlive==true)
		{
			isEating = false;
			isSleeping = false;
			isPlaying = true;
			
			System.out.println(name + " goes \"yippee!\"");
		}
		else
		{
			System.out.println("Oh nos! " + name + " is already dead!");
		}
	}
	
	public void speak(String s)
	{
		System.out.println(name + " says, \"" + s + "\"");
	}
	
	public void die()
	{
		isEating = false;
		isSleeping = false;
		isPlaying = false;
		isAlive = false;
		
		System.out.println(name + " goes, \"aaaakkkkk!!!\" and dies.");
	}
	
	public void kill(Pet other)
	{
		if(isAlive==true)
		{
			System.out.println(name + " slays " + other.name + " in a most grizzly manner!");
			other.die();
		}
		else
		{
			System.out.println("Oh nos! " + name + " is already dead!");
		}
	}
	
	public String getState()
	{
		if (isAlive==false)
		{
			return "dead";
		}
		else if (isEating == true) 
		{
			return "eating";
		}
		else if (isSleeping == true)
		{
			return "sleeping";
		}
		else
		{
			return "playing";
		}
	}
}








