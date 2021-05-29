package application;
/*
import java.lang.Math;
import javafx.scene.paint.Color;
import javafx.scene.canvas.GraphicsContext;

public class MyLine extends MyShape {
	double x2;
	double y2;
	
	public MyLine(double x1, double y1, double x2, double y2, Color MyColor) {
		super(x1,y1,MyColor);
		this.x2 = x2;
		this.y2 = y2;
	}
	public double getLength () {
		return (Math.sqrt(Math.pow((this.x2-super.getX()),2) + 
				Math.pow((this.y2-super.getY()),2)));
	}
	public double  get_xAngle () {
		return (Math.toDegrees((this.y2-super.getY())/(this.x2-super.getX())));
	}
	
	public double getMyArea() {
		return 0;
	}
	public MyRectangle getMyBoundingRectangle() {
		return  new MyRectangle(Math.min(super.getX(), this.x2), Math.min(super.getY(),this.y2), 
				x2-super.getX(),y2-super.getY(), super.getColor());
	}
	@Override
	public String toString() {
		return super.toString() + "End points " + "(" + 
				this.x2 + "," + this.y2 + ")|" + " The length of this line is " + 
				getLength() + ", and the angle it forms with x-axis is " + get_xAngle() 
				+ " degrees|" + System.lineSeparator();
	}
	@Override
	public void draw(GraphicsContext gc) {
		gc.setLineWidth(3);
		gc.strokeLine(super.getX(),super.getY(),this.x2,this.y2);
	} 
}
*/
/*
public double [][] getMyArea() {
	double [][] pointsofLine = new double[((int) super.getX()) * ((int) super.getY())][2];
	int count = 0;
	for (int x = (int) Math.min(super.getX(), this.x2); x <= Math.max(super.getX(), this.x2); x++) {
		for (int y = (int) Math.min(super.getY(), this.y2); y <= Math.max(super.getY(), this.y2); y++) {
			pointsofLine [count][0] = x;
			pointsofLine [count][1] = y;
			count++;
		}
	}
	return pointsofLine;
}
*/

/*
--------------------------------- First Project --------------------------------------
public class MyLine extends MyShape {
	double x2;
	double y2;
	
	public MyLine(double x1, double y1, double x2, double y2, Color MyColor) {
		super(x1,y1,MyColor);
		this.x2 = x2;
		this.y2 = y2;
	}
	public double getLength () {
		return (Math.sqrt(Math.pow((this.x2-super.getX()),2) + Math.pow((this.y2-super.getY()),2)));
	}
	public double  get_xAngle () {
		return (Math.toDegrees((this.y2-super.getY())/(this.x2-super.getX())));
	}
	@Override
	public String toString() {
		return super.toString() + " as a starting point, and has end points " + "(" + 
				this.x2 + "," + this.y2 + ")." + " The length of this line is " + 
				getLength() + ", and the angle it forms with x-axis is " + get_xAngle() + System.lineSeparator();
	}
	@Override
	public void draw(GraphicsContext gc) {
		super.draw(gc);
		gc.setLineWidth(5);
		gc.strokeLine(super.getX(),super.getY(),this.x2,this.y2);
	} 
}
*/
