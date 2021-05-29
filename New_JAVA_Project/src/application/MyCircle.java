package application;

import java.lang.Math;
import javafx.scene.paint.Color;
import javafx.scene.canvas.GraphicsContext;
/*
public class MyCircle extends MyOval {
	private double radius;
	double height, width;
	public MyCircle (double x, double y, double diameter, Color MyColor) {
		super(x, y, diameter, diameter, MyColor);
		this.height = diameter;
		this.width = diameter;
		this.radius = diameter/2;
	}
	public double getRadius() {
		return this.radius;
	}
	public double getArea() {
		return (Math.PI*Math.pow(this.radius,2));
	}
	public double getPerimeter() {
		return (2*Math.PI*this.radius);
	}
	public MyRectangle getMyBoundingRectangle() {
		return  new MyRectangle(super.getX(), super.getY(), 
				width,height, super.getColor());
	}
	public double getMyArea() {
		return getArea();
	}
	@Override
	public String toString() {
		return super.toString() + "Are: " + getArea() + ". The perimeter: " 
				+ getPerimeter() + "Radius: " + getRadius() + System.lineSeparator();
	}
	@Override
	public void draw(GraphicsContext gc) {
		gc.setLineWidth(3);
		gc.setFill(getColor());
		gc.strokeOval(super.getX()-radius, super.getY()-radius, width, height);
		gc.fillOval(super.getX()-radius, super.getY()-radius, width, height);
	}
}
*/

/*
public class MyCircle extends MyShape {
	
	private double radius;
	
	public MyCircle (double x, double y, double radius, Color MyColor) {
		super(x, y, MyColor);
		this.radius = radius;
	}
	public double getRadius() {
		return this.radius;
	}
	public double getArea() {
		return (Math.PI*Math.pow(this.radius,2));
	}
	public double getPerimeter() {
		return (2*Math.PI*this.radius);
	}
	@Override
	public String toString() {
		return super.toString() + " as the center. " 
				+ "The area of the circle is " + getArea() + ". The perimeter of the circle is " + getPerimeter() +
				", with the radius of " + getRadius() + System.lineSeparator();
	}
	@Override
	public void draw(GraphicsContext gc) {
		super.draw(gc);
		gc.setLineWidth(6);
		gc.setStroke(Color.BLACK);
		gc.strokeOval(super.getX()-radius, super.getY()-radius, radius*2,radius*2 );
		gc.fillOval(super.getX()-radius, super.getY()-radius, radius*2,radius*2 );
	}
}
*/
