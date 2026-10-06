import java.io.*;
//4. Feladat - main() metodust tartalmazo osztaly
class shapeApp {
	/*public static void printShape(Shape[] shapes) {
		for (int i = 0; i < shapes.length; i++) {
			System.out.println((i + 1) + ". alakzat kerulete: " + shapes[i].perimeter() + ", terulete: " + shapes[i].area());
		}
	}*/
	
	public static void main(String[] args) {
		shapeApp app = new shapeApp();
		//app.readCircleFromKeyboard();
		//Circle circ = app.readCircleFromKeyboard();
		//circ.draw();
		
		Shape[] shapes = new ShapeStorage("data.txt");
		for(int i=0; shapes.length; i++) {
			i.draw();
		}
		
		
		try {
			storage.readShapes();
			//storage.WriteShapes("igen");
			//storage.readShapes();
		} catch(IOException e) {
			e.printStackTrace();
			System.err.print("File error");
		}
	}
	 /*
	public Circle readCircleFromKeyboard() {
		BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
		
		double x = 0.0, y = 0.0;
		
		try {
			System.out.print("Center x: ");
			String line = keyboard.readLine();
			x = Double.parseDouble(line);
			System.out.print("Center y: ");
			line = keyboard.readLine();
			y = Double.parseDouble(line);
			keyboard.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			System.err.println("Wrong number");
		}
		
		return new Circle(new Point(x, y, 'P'), 1.0);
	}
	
	public Rectangle readRectangleFromKeyboard() {
		double x = 0.0, y = 0.0, width = 0.0, height = 0.0;
		
		try {
			System.out.print("Corner x: ");
			String line = keyboard.readLine();
			x = Double.parseDouble(line);
			
			System.out.print("Corner y: ");
			line = keyboard.readLine();
			y = Double.parseDouble(line);
			
			System.out.print("Width: ");
			line = keyboard.readLine();
			width = Double.parseDouble();
			
			System.out.print("Height: ");
			line = keyboard.readLine();
			height = Double.parseDouble();
			
			keyboard.close();
			
		} catch (IOException e) {
			e.printStackTrace();
			
		} catch (NumberFormatException e) {
			System.err.println("Wrong number");
		}
		
		return new Rectangle(new Point(x, y, 'P'), width, height);
	}
	*/
	
	public void start() {
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
		//d.setRadius(-5.0);
		
		Shape[] shapeArr = new Shape[] {c, rect, d};
		for (int i = 0; i < shapeArr.length; i++) {
			System.out.println("Terulet: " + shapeArr[i].area() + " Kerulet: " + shapeArr[i].perimeter());
		}
		
		Drawable[] drawArr = new Drawable[] {
			c, rect, d
		};
		
		/*
		for(int i = 0; i < drawArr.length; i++) {
			drawArr[i].draw();
		}
		*/
	}
}