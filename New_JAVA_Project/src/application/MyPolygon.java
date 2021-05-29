package application;

/*
import java.lang.Math;
import javafx.scene.paint.Color;
import javafx.scene.canvas.GraphicsContext;

public class MyPolygon extends MyShape {
	int radius;
	int diameter;
	int NumberOfSides = 6;
	double xCenter, yCenter;
	
	public MyPolygon(double x, double y, int diameter,int diameter1, Color MyColor) {
		super(x, y, MyColor);
		this.radius = diameter/2;
		this.diameter = diameter;
		setCenter(diameter, diameter);
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
	public MyRectangle getMyBoundingRectangle() {
		return  new MyRectangle(super.getX(), super.getY(), this.diameter, this.diameter, super.getColor());
	}
	public void setCenter(double width, double height) {
		this.yCenter = radius + super.getY();
		this.xCenter = radius + super.getX();
	}
	public double getMyArea() {
		return getArea();
	}
	@Override
	public String toString() {
		return super.toString() + "Side Length: " + getSide() + ". " + "Number of Sides " + 
				NumberOfSides + " Interior angle: " + getAngle() + " Perimeter: " + 
				getPerimeter() + " Area: " + getArea() + System.lineSeparator();
	}
	@Override
	public void draw(GraphicsContext gc) {
		double[] x = new double [NumberOfSides];
		double[] y = new double [NumberOfSides];
		for (int i = 0; i < NumberOfSides; i++) {
			x[i] = super.getX() + radius * Math.sin(2*Math.PI*i/NumberOfSides);
			y[i] = super.getY() + radius * Math.cos(2*Math.PI*i/NumberOfSides);
		}
		gc.setLineWidth(3);
		gc.strokePolygon(x, y, NumberOfSides);
		gc.setFill(getColor());
		gc.fillPolygon(x, y, NumberOfSides);
	}
}
*/

/*
public class MyPolygon extends MyShape {
	int radius;
	int NumberOfSides = 6;
	
	public MyPolygon(double x, double y, int radius, Color MyColor) {
		super(x, y, MyColor);
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
		gc.setStroke(Color.BLACK);
		gc.strokePolygon(x, y, NumberOfSides);
		gc.fillPolygon(x, y, NumberOfSides);
	}
}
*/

/*
public double [][] getMyArea() {
	double [][] pointsofPolygon = new double[((int)this.diameter + 1) * ((int)this.diameter + 1)][2];
	double h = this.xCenter;
	double k = this.yCenter;
	int count = 0;
	for (int x = (int) super.getX(); x <= (diameter + super.getX()); x++) {
		for (int y = (int) super.getY(); y <= (diameter + super.getY()); y++) {
			double Point_P = Math.pow((x-h), 2)/Math.pow(radius, 2);
			Point_P = Point_P + (Math.pow((y - k), 2) / Math.pow(radius, 2));	
			if (Point_P <= 1)  {
				pointsofPolygon [count][0] = x;
				pointsofPolygon [count][1] = y;
				count++;
			}
		}
	}
	return pointsofPolygon;
}
*/