import java.lang.System;

public class ShereTester {
	public static void main(String[] args) {
		Sphere s1 = new Sphere(5.0);
		Sphere s2 = new Sphere(3.5);
		Sphere s3 = new Sphere(3.5);
		
		System.out.println(s1.getSurfaceArea());
		System.out.println(s2.getVolume());
		
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		
		System.out.println(s1.compareTo(s2));
		System.out.println(s2.compareTo(s1));
		System.out.println(s2.compareTo(s3));
	}
}
