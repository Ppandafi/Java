//5-6. Feladat - circle osztaly es valtozoi
class Circle extends Shape {
	//private Point center;
	private double r;
	
	//7. Feladat - konstruktor
	public Circle(Point center, double r) {
		super(center);
		//this.center = center;
		this.r = r;
	}
	
	//9. Feladat - getterek, setterek, atmeretezes
	public Point getCenter() {
		return super.getAnchor();
	}
	
	
	public double getR() {
		return r;
	}
	
	public void setR(double r) {
		this.r = r;
	}
	
	public void resize(double newR) {
		this.r = newR;
	}
	
	//8. Feladat - print() metodus
	public void print() {
		System.out.println("kozeppont koordinatai: " + getCenter().getX() + ", " + getCenter().getY() + " Sugar: " + getR());
	}
	
	//11. Feladat - kerulet, terulet
	public double area() {
		return r * r * Math.PI;
	}
	
	public double perimeter() {
		return 2.0 * r * Math.PI;
	}
}