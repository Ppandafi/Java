//4. Feladat - main() metodust tartalmazo osztaly
class shapeApp {
	/*public static void printShape(Shape[] shapes) {
		for (int i = 0; i < shapes.length; i++) {
			System.out.println((i + 1) + ". alakzat kerulete: " + shapes[i].perimeter() + ", terulete: " + shapes[i].area());
		}
	}*/
	
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
		
		/*
		Shape[] shapeArray = {c, rect};
		printShape(shapeArray);
		*/
		
		Circle d = new Circle(new Point(1.0, 2.0, 'Q'), 8.0);
		Shape[] shapeArr = new Shape[] {c, rect, d};
		for (int i = 0; i < shapeArr.length; i++) {
			System.out.println("Terulet: " + shapeArr[i].area() + " Kerulet: " + shapeArr[i].perimeter());
		}
		
		Drawable[] drawArr = new Drawable[] {
			c, rect, d
		};
		
		for(int i = 0; i < drawArr.length; i++) {
			drawArr[i].draw();
		}
	}
}