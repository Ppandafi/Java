//1. Feladat - Point osztaly letrehozasa
class Point {
	private double x;
	private double y;
	private char label;
	
	//2. Feladat - konstruktor letrehozasa
	public Point(double x, double y, char label) {
		this.x = x;
		this.y = y;
		this.label = label;
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
}
