abstract class Shape implements Drawable {
	private Point anchor;
	
	public Shape(Point anchor) {
		this.anchor = anchor;
	}
	
	public Point getAnchor() {
		return anchor;
	}
	
	public abstract double area();
	public abstract double perimeter();
}