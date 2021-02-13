package application;

public class MyPoint {
	private double x, y;
	
	MyPoint (double x, double y) {
		this.x = x;
		this.y = y;
	}
	public double getXpoint() {return this.x;}
	public double getYpoint() {return this.y;}
	public void setXpoint(double x) {this.x = x;}
	public void setYpoint(double y) {this.y = x;}
}
