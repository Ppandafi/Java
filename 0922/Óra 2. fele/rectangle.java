//10. Feladat - Rectangle osztaly letrehozasa
class Rectangle extends Shape {
	private Point corner;
	private double width;
	private double height;
	
	public Rectangle(Point corner, double width, double height) {
		//this.corner = corner;
		super(corner);
		this.width = width;
		this.height = height;
	}
	
	public Point getCorner() {
		return corner;
	}
	
	public void setCorner(Point corner) {
		this.corner = corner;
	}
	
	public double getWidth() {
		return width;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	//1. Feladat - kerulet, terulet
	public double area() {
		return width * height;
	}
	
	public double perimeter() {
		return 2.0 * (height + width);
	}
	
	@Override
	public void draw() {
		System.out.println("Height: " + height);
		System.out.println("Width: " + width);
	}
}