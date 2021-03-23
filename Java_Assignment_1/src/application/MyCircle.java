package application;

import java.lang.Math;
import javafx.scene.canvas.GraphicsContext;

public class MyCircle extends MyShape {
	
	private double radius;
	
	public MyCircle (double x, double y, double radius, MyColor Color) {
		super(x, y, Color);
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
	public void draw (GraphicsContext gc) {
		super.draw(gc);
		gc.setLineWidth(6);
		gc.setStroke(MyColor.Black.colorOfShapes());
		gc.strokeOval(super.getX()-radius, super.getY()-radius, radius*2,radius*2 );
		gc.fillOval(super.getX()-radius, super.getY()-radius, radius*2,radius*2 );
	}
}
