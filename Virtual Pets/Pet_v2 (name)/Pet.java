public class Pet
{
	// fields
	private boolean isEating = false;
	private boolean isSleeping = true;
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
	public void eat()
	{
		isEating = true;
		isSleeping = false;
		
		System.out.println(name + " goes \"chomp, chomp, chomp.\"");
	}

	public void sleep()
	{
		isEating = false;
		isSleeping = true;
		
		System.out.println(name + " goes \"zzzzzzzzzz..........\"");
	}
	
	public void setName(String n)
	{
		name = n;
	}
}








