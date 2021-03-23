package application;

import java.lang.Math;
import javafx.scene.canvas.GraphicsContext;

public class MyLine extends MyShape {
	double x2;
	double y2;
	
	public MyLine(double x1, double y1, double x2, double y2, MyColor Color ) {
		super(x1,y1, Color);
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
