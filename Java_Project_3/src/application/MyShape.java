package application;

import javafx.scene.canvas.GraphicsContext;

abstract class MyShape implements MyShapeInterface {
	
	private MyPoint point;
	private MyColor Color ;
	
	public MyShape(double x, double y, MyColor Color) {
		this.Color = Color;
		this.point = new MyPoint(x,y);
	}
	
	public void setColor (MyColor Color) {this.Color = Color;}
	public void setX (double x) {this.point.setXpoint(x);}
	public void setY (double y) {this.point.setYpoint(y);}
	
	public double getX() {return this.point.getXpoint();}
	public double getY() {return this.point.getYpoint();}
	public MyColor getColor() {return this.Color;}
	
	public String toString() {
		return "|Top left corner (" + getX() + "," + getY() + ")|";
	}
	
	public abstract void draw(GraphicsContext gc);
}



//import javafx.scene.paint.Color;
/*
//------------------- First Project ---------------------
public class MyShape {
	private double x, y;
	private MyColor Color;
	
	public MyShape(double x, double y, MyColor Color) {
		this.Color = Color;
		this.x = x;
		this.y = y;
	}
	public void setColor (MyColor Color) {
		this.Color = Color;
	}
	public void setX (double x) {
		this.x = x;
	}
	public void setY (double y) {
		this.y = y;
	}
	public double getX() {
		return this.x;
	}
	public double getY() {
		return this.y;
	}
	public MyColor getColor() {
		return this.Color;
	}
	public String toString() {
		return "has points (" + x + "," + y + ")";
	}
	public void draw(GraphicsContext gc) {
		gc.setStroke(Color.getColor());
		gc.setFill(Color.getColor());
	}
}
*/