
public class Sphere implements Comparable<Sphere> {

	private double radius;
	
	public Sphere(double radius) {
		this.radius = radius;
	}
	
	public double getVolume() {
		return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
	}
	
	public double getSurfaceArea() {
		return 4.0 * Math.PI * Math.pow(radius, 2);		
	}
	
	public int compareTo(Sphere other) {
		
		double r1 = this.radius;
		double r2 = other.radius;
		
		if (r1 < r2) {
			return -1;
		}
		else if (r1 > r2){
			return 1;
		}
		else {
			return 0;
		}
	}

	public boolean equals(Object other) {
		double r1 = this.radius;
		double r2 = ((Sphere)other).radius;

		return r1 == r2;
	}
}
