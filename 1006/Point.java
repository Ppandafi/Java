//1. Feladat - Point osztaly letrehozasa
class Point implements Drawable {
	private double x;
	private double y;
	private char label;
	
	//2. Feladat - konstruktor letrehozasa
	public Point(double x, double y, char label) {
		this.x = x;
		this.y = y;
		this.label = label;
	}
	
	public Point() {
		this.x = 0.0;
		this.y = 0.0;
		this.label = 'P';
	}
	
	//3. Feladat - moveTo es translate fuggvenyek
	public void moveTo(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public void translate(double deltaX, double deltaY) {
		this.x = this.x + deltaX;
		this.y = this.y + deltaY;
	}
	
	//Getterek, setterek
	public double getX() {
		return x;
	}
	
	public void setX(double x) {
		this.x = x;
	}
	
	public double getY() {
		return y;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
	public char getLabel() {
		return label;
	}
	
	public void setLabel(char label) {
		this.label = label;
	}
	
	public void draw() {
		System.out.println("X: " + x);
		System.out.println("Y: " + y);
	}
}