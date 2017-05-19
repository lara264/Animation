/**
 * A short story with Pets.
 *
 * @author  Jon Cooper
 * @version v5 Sept. 30, 2009
 */
rsion [                 ]
 */
 
 public class PetDriver
{
	public static void main(String[] args)
	{		
		// make three pets
		Pet pet1 = new Pet(true,  "Cosmo");
		Pet pet2 = new Pet(false, "Wanda");
		Pet pet3 = new Pet(true,  "Timmy");
				
		// make 'em do stuff
		pet2.speak("You're so stupid, " + pet1.getName() + "!");
		pet1.speak("Huh?");
		pet2.kill(pet1);
		pet2.speak("Ha ha ha ha...");
		pet2.eat();

		pet3.speak("Wanda, what did you do?!");
		
		System.out.println(pet3.getName() + " flushes " + pet1.getName() + " and " + pet2.getName());
		pet2.die();
		System.out.println("The End\n");
		
		// check states
		System.out.println(pet1);
		System.out.println(pet2);
		System.out.println(pet3);
	}
}