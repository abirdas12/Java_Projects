package application;

import javafx.scene.canvas.GraphicsContext;

public class MyRectangle extends MyShape {
	private double height,width;
	
	public MyRectangle(double x, double y, double width, double height, MyColor Color) {
		super(x, y, Color);
		this.height = height;
		this.width = width;
	}
	public double getWidth() {return this.width;}
	public double getHeight() {return this.height;}
	public double getPerimeter() {return (2*width + 2*height);}
	public double getArea() {return getWidth()*getHeight();}
	public double setWidth() {return this.width;}
	public double setHeight() {return this.height;}
	
	public MyRectangle getMyBoundingRectangle() {
		return  new MyRectangle(super.getX(), super.getY(), width,height, super.getColor());
	}
	public double getMyArea() {
		return getArea();
	}
	@Override
	public String toString() {
		return (super.toString() + " Width: " + getWidth() 
		+ "| Height: " + getHeight() + "| Perimeter: " 
		+ getPerimeter() + "| Area: " + getArea()) + "|" + System.lineSeparator();
	}
	@Override
	public void draw(GraphicsContext gc) {
		gc.setLineWidth(3);
		gc.strokeRect(super.getX(), super.getY(), getWidth(), getHeight());
		gc.setFill(getColor().colorOfShapes());
		gc.fillRect(super.getX(), super.getY(), getWidth(), getHeight());
	}
}
