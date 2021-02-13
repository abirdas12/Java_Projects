package application;

public interface MyShapeInterface {
	
	MyRectangle getMyBoundingRectangle();
	public double getMyArea();
	
	public static boolean ovarlapMyShape(MyShape ShapeOne, MyShape ShapeTwo) {
		
		double x1 = ((MyRectangle) ShapeOne).getX();
		double y1 = ((MyRectangle) ShapeOne).getY();
		double w1 = ((MyRectangle) ShapeOne).getWidth();
		double h1 = ((MyRectangle) ShapeOne).getHeight();
				
		double x2 = ((MyOval)ShapeTwo).getX();
		double y2 = ((MyOval)ShapeTwo).getY();
		double w2 = ((MyOval)ShapeTwo).majorAxis;
		double h2 = ((MyOval)ShapeTwo).minorAxis; 
					
		if (y1 + h1 < y2 || y1 > y2 + h2) {return false;}
		if (x1 + w1 < x2 || x1 > x2 + w2) {return false;}
	
		else {
			double x3 = x1; 
			double y3 = y2;
			System.out.print( "One of the intersecting points of two shapes is: "
					+ "" + "(" + x3 + "," + y3 + "). Therefore it is " );
			return true;
			}
	}
}