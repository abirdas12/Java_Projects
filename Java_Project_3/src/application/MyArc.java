package application;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.shape.ArcType;

public class MyArc extends MyShape {
	
	double radiusX;
	double radiusY;
	double startAngle;
	double centralAngle;
	
	public MyArc(double x, double y, double radiusX, double radiusY, 
			double startAngle, double centralAngle,  MyColor Color) {
		super(x, y, Color);
		this.radiusX = radiusX;
		this.radiusY = radiusY;
		this.startAngle = startAngle;
		this.centralAngle = centralAngle;
	}
	public double getRadiusX() {return this.radiusX;}
	public double getRadiusY() {return this.radiusY;}
	public double getStartAngle() {return this.startAngle;}
	public double getCentralAngle() {return this.centralAngle;}
	public double getMyArea() {return Math.PI*(Math.pow(radiusX, 2))*(centralAngle/360);}
	public MyRectangle getMyBoundingRectangle() {return  new MyRectangle(super.getX(), 
												super.getY(), radiusX, radiusY, super.getColor());}
	public String toString() {
		return "Dimensions -->"  + "Radius: " + getRadiusX() + "Start Angle: " + getStartAngle() + 
				"Central Angle: "+ getCentralAngle() + "Arc Area: " + getMyArea();
	}
	@Override
	public void draw(GraphicsContext gc) {
		gc.setLineWidth(3);
		gc.strokeArc(super.getX(), super.getY(), radiusX, radiusY, startAngle, centralAngle, ArcType.ROUND);
		gc.fillArc(super.getX(), super.getY(), radiusX, radiusY, startAngle, centralAngle, ArcType.ROUND);
	}
}






