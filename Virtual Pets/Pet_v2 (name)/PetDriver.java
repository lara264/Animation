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
	}
}