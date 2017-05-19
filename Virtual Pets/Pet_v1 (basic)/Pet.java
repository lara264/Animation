/**
 * A Pet can eat and sleep.
 *
 * @author Jon Cooper
 * @version Sept. 21, 2009
 */
 
 public class Pet
 {
 	// fields
 	private boolean isSleeping;
 	private boolean isEating;
 	
 	
 	// constructors
 	public Pet()
 	{
 		isSleeping = true;
 		isEating = false;
  	}
 	
 	
 	// access methods
 	public void eat()
 	{
 		isEating = true;
 		isSleeping = false;
 		
 		System.out.println("chomp, chomp, chomp.");
 	}
 	
 	public void sleep()
 	{
 		isEating = false;
 		isSleeping = true;

 		System.out.println("zzzzzzzzz........");
 	}
 	
 }