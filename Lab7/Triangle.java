package Lab7;

public class Triangle {

	private int base;
	private int height;
	
	public Triangle() {
		this.base = 1;
		this.height = 1;
	}
	
	public Triangle(int base, int height) {
		this.base = base;
		this.height = height;
	}
	
	public double getHypotenuse() {
		double hypSquared = Math.pow(base, 2) + Math.pow(height, 2);
		return Math.sqrt(hypSquared);
	}
	
	public double getArea() {
		return base * height / 2;
	}
	
	public double getPerimeter () {
		return base + height + getHypotenuse();
	}
	
}
