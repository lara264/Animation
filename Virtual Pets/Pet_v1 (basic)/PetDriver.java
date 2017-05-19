/**
 * A Pet can eat and sleep.
 *
 * @author Jon Cooper
 * @version Sept. 21, 2009
 */
 
 public class PetDriver
 {
 	public static void main(String[] args)
 	{
 		Pet pet1 = new Pet();
 		Pet pet2 = new Pet();
 		
 		pet1.eat();
 		pet2.sleep();
 		pet1.eat();	
 	}
 }