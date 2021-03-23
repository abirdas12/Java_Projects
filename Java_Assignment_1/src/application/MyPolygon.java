package application;

import javafx.scene.canvas.GraphicsContext;

public class MyPolygon extends MyShape {
	int radius;
	int NumberOfSides = 6;
	
	public MyPolygon(double x, double y, int radius, MyColor Color) {
		super(x, y, Color);
		this.radius = radius;
	}

	public int getSide() {
		return radius; // since the radius of the hexagon from the center to any of 
					   // its vertex is same as its side lengths. 
	}
	public double getApothem() {
		return (radius/(2*Math.tan(Math.PI/NumberOfSides)));
	}
	public int getPerimeter() {
		return NumberOfSides*getSide();
	}
	public double getArea() {
		return (getPerimeter()*getApothem()/2);
	}
	public double getAngle() {
		return (180*(NumberOfSides-2))/(NumberOfSides);
	}
	@Override
	public String toString() {
		return super.toString() + " as the center. The polygon has a side length of " + getSide() + ". " + "It has " + 
				NumberOfSides + " sides with " + getAngle() + " degrees of interior angles. "
				+ "It has a perimeter of " + getPerimeter() + " and a area of " + getArea() + 
				System.lineSeparator();
	}
	@Override
	public void draw(GraphicsContext gc) {
		super.draw(gc);
		double[] x = new double [NumberOfSides];
		double[] y = new double [NumberOfSides];
		
		for (int i = 0; i < NumberOfSides; i++) {
			x[i] = super.getX() + radius * Math.sin(2*Math.PI*i/NumberOfSides);
			y[i] = super.getY() + radius * Math.cos(2*Math.PI*i/NumberOfSides);
		}
		gc.setLineWidth(6);
		gc.setStroke(MyColor.Black.colorOfShapes());
		gc.strokePolygon(x, y, NumberOfSides);
		gc.fillPolygon(x, y, NumberOfSides);
	}
}
