public class PetDriver
{
	public static void main(String[] args)
	{
		// make two pets
		Pet pet1 = new Pet("Cosmo");
		Pet pet2 = new Pet("Wanda");
		
		// test the getter & toString methods
		System.out.println(pet1.getName());
		System.out.println(pet1.getState());
		System.out.println(pet1.toString());
		System.out.println(pet2); // .toString is implied if inside print statement
		
		// make 'em do stuff
		pet2.speak("I'm gonna get you, " + pet1.getName() + "!");
		pet1.die();
		pet2.speak("Ha ha ha ha...");
		pet2.eat();
		
		// make sure dead pets can't do stuff
		pet1.eat();
		pet1.sleep();
		pet1.speak("I'm dead.");
		pet1.die();
		
		// check states
		System.out.println(pet1);
		System.out.println(pet2);
	}
}