package application;

import javafx.scene.canvas.GraphicsContext;

public class MyShape {
	public double x, y;
	public MyColor Color;
	
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
		gc.setStroke(Color.colorOfShapes());
		gc.setFill(Color.colorOfShapes());
	}
}
