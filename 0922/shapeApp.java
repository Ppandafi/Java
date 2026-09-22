//4. Feladat - main() metodust tartalmazo osztaly
class shapeApp {
	public static void main(String[] args) {
		System.out.println("Shape app main metodusa");
		Point p = new Point(5.0, 4.0, 'p');
		
		System.out.println("X: " + p.getX());
		System.out.println("Y: " + p.getY());
		System.out.println("Label: " + p.getLabel());
		
		Circle c = new Circle(p, 5.3);
		c.print();
		c.resize(7.0);
		c.print();
		
		Rectangle rect = new Rectangle(new Point(4.0, 6.0, 'r'), 10.0, 15.0);
	}
}