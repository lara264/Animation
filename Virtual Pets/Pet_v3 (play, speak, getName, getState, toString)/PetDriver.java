public class PetDriver
{
	public static void main(String[] args)
	{
		// make two pets
		Pet pet1 = new Pet();
		Pet pet2 = new Pet("Wanda");
		
		// make 'em do stuff
		pet1.eat();
		pet2.sleep();
		
		
		pet1.setName("Cosmo");
		pet1.sleep();
		pet1.eat();
		pet1.sleep();
		pet1.play();
		pet2.play();
		pet1.speak("Ashton is the best!");
		//pet2.die();
		pet2.play();
		
		pet1.kill(pet2);
		pet1.kill(pet2);
		
		//System.out.println(pet1.name);
		
		System.out.println( pet2.getState() );
		
		// hypothetical class might have something like...
		if (pet2.getState()=="playing")
		{
			// some code to draw a playing pet
		}
	}
}