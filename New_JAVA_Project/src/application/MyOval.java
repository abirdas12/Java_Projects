package application;

import javafx.scene.canvas.GraphicsContext;
import java.lang.Math;

public class MyOval extends MyShape {
	double majorAxis;
	double minorAxis;
	double xCenter;
	double yCenter;
	double height;
	double width;
	public MyOval(double x, double y, double width, double height, MyColor Color) {
		super(x, y, Color);
		this.width = width;
		this.height = height;
		setCenter(width, height);
		setAxes();
	}
	public double getPerimeter() {
		return (2*Math.PI*Math.sqrt((Math.pow((width/2), 2) + 
				Math.pow((height/2), 2)/(2))));
	}
	public double getArea() {
		return (Math.PI*(height/2)*(width/2));
	}
	public void setCenter(double width, double height) {
		this.yCenter = (width)/2 + super.getY();
		this.xCenter = (height)/2 + super.getX();
	}
	public void setAxes() {
		this.minorAxis = height; 
		this.majorAxis = width;
	}
	public double getCenterX() {return xCenter;} 
	public double getCenterY() {return yCenter;};
	
	public MyRectangle getMyBoundingRectangle() {
		return  new MyRectangle(super.getX(), super.getY(), 
		this.majorAxis,this.minorAxis, super.getColor());
	}
	
	public double getMyArea() {
		return getArea();
	}
	
	@Override
	public String toString() {
		return super.toString() +  " Area: " + getArea() + 
		"| Parameter: " + getPerimeter()+"|" + " Major axis " + this.majorAxis + "|" + 
			" Minor axis " + this.minorAxis + "|" + System.lineSeparator();
	}
	@Override
	public void draw(GraphicsContext gc) {
		gc.setLineWidth(3);
		gc.strokeOval(super.getX(),super.getY(),width, height);
		gc.setFill(MyColor.Brown.getColor());
		gc.fillOval(super.getX(),super.getY(),width, height);
	}
}

//import javafx.scene.paint.Color;

/*
public double [][] getMyArea() {
	double [][] pointsofOval = new double[((int) width + 1) * ((int) height + 1)][2];
	double h = this.xCenter;
	double k = this.yCenter;
	int count = 0;
	for (int x = (int) super.getX(); x <= (width + super.getX()); x++) {
		for (int y = (int) super.getY(); y <= (height + super.getY()); y++) {
			double Point_P = Math.pow((x-h), 2)/Math.pow(this.majorAxis/2, 2);
			Point_P = Point_P + (Math.pow((y - k), 2) / Math.pow(this.minorAxis/2, 2));	
			if (Point_P <= 1)  {
				pointsofOval [count][0] = x;
				pointsofOval [count][1] = y;
				count++;
			}
		}
	}
	return pointsofOval;
}
*/
