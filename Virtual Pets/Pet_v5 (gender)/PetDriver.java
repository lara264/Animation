public class PetDriver
{
	public static void main(String[] args)
	{
		// make three pets
		Pet pet1 = new Pet(true);
		Pet pet2 = new Pet(true, "Cosmo");
		Pet pet3 = new Pet(false);
		Pet pet4 = new Pet(false, "Wanda");
		
		// check Pets
		System.out.println(pet1);
		System.out.println(pet2);
		System.out.println(pet3);
		System.out.println(pet4);
	}
}

/* Gender method and rationale:
 *
 * I chose... because... , etc.
 *
 *
 *
 */