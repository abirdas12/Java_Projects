package application;
	
import java.io.FileNotFoundException;
import javax.swing.JOptionPane;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.canvas.Canvas;


public class Main extends Application {
	public static void main (String[] args) {
		launch(args);
	}
	@Override
	public void start (Stage primaryStage) throws FileNotFoundException {
		BorderPane P = new BorderPane();
		Canvas canvas = new Canvas(1000,700);
		Scene s = new Scene(P, 1000, 700, MyColor.White.getColor());
		GraphicsContext gc = canvas.getGraphicsContext2D();
		primaryStage.setScene(s);
		primaryStage.show();
		P.getChildren().add(canvas);
		
		int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Input n values"));
		HistogramAlphaBet test = new  HistogramAlphaBet(325,175,350,350,n,MyColor.White);
		test.draw(gc);
	}
}































//import java.util.Scanner;
//Scanner input = new Scanner(System.in);
//import javafx.scene.paint.Color;
//System.out.println(" Welcome to the Alice the Wonderland." + "\n\" Please enter the number of (n) values: ");
//MyOval Oval1 = new MyOval(255,200,300,300,MyColor.Aqua.getColor());
//Oval1.draw(gc);
//MyArc Arc1 = new MyArc(255,200,300,300,0,45,MyColor.Black.getColor());
//Arc1.draw(gc);
//MyArc Arc2 = new MyArc(255,200,300,300,45,45,MyColor.Brown.getColor());
//Arc2.draw(gc);
//MyArc Arc3 = new MyArc(155,200,300,300,-90,90, MyColor.Coral.getColor());
//Arc3.draw(gc);

//HistogramAlphaBet test = new HistogramAlphaBet();
//test.Alphabets();
//final JDesktopPane deskpane = new JDesktopPane();
/*
public class Main extends Application {
	public static void main (String[] args) {
		launch(args);
	}

	@Override
	public void start (Stage primaryStage) {
		BorderPane P = new BorderPane();
		Canvas canvas = new Canvas(1000,700);
		Scene s = new Scene(P, 1000, 700, MyColor.GreenYellow.getColor());
		GraphicsContext gc = canvas.getGraphicsContext2D();
		primaryStage.setScene(s);
		primaryStage.show();
		P.getChildren().add(canvas);
		
		MyRectangle Rectangle1 = new MyRectangle(255,200,490,300,MyColor.Lightyellow.getColor());
		Rectangle1.draw(gc);
		System.out.println("The bounding Rectangle 1 consist of: " + Rectangle1.getMyBoundingRectangle());
		MyOval Oval1 = new MyOval(255,200,490,300,MyColor.Aqua.getColor());
		Oval1.draw(gc);
		System.out.println("Oval 1 consist of: " + Oval1.toString());
		MyRectangle Rectangle2 = new MyRectangle(330,245,340,210,MyColor.GreenYellow.getColor());
		Rectangle2.draw(gc);
		System.out.println("The bounding Rectangle 2 consist of: " + Rectangle2.getMyBoundingRectangle());
		MyOval Oval2 = new MyOval(330,245,340,210,MyColor.Coral.getColor());
		Oval2.draw(gc);
		System.out.println("Oval 2 consist of: " + Oval2.toString());
		MyRectangle Rectangle3 = new MyRectangle(380,276,240,148,MyColor.Lightyellow.getColor());
		Rectangle3.draw(gc);
		System.out.println("The bounding Rectangle 3 consist of: " + Rectangle3.getMyBoundingRectangle());
		MyOval Oval3 = new MyOval(380,276,240,148,MyColor.SkyBlue.getColor());
		Oval3.draw(gc);
		System.out.println("Oval 3 consist of: " + Oval3.toString());
		MyLine Line1 = new MyLine(100,100,900,600, MyColor.red.getColor());
		Line1.draw(gc);
		System.out.println("Line 1 Consist of: " + Line1.toString());
		
		//Test for checking if the shapes overlaps. 
		System.out.println(MyShapeInterface.ovarlapMyShape(Rectangle1, Oval1) + System.lineSeparator());
		
		MyLine Line2 = new MyLine(100,100,100,600, MyColor.Navy.getColor());
		Line2.draw(gc);
		System.out.println("Line 2 Consist of: " + Line2.toString());
		MyLine Line3 = new MyLine(900,100,900,600, MyColor.DarkMagenta.getColor());
		Line3.draw(gc);
		System.out.println("Line 3 Consist of: " + Line3.toString());
		MyLine Line4 = new MyLine(100,100,900,100, MyColor.Brown.getColor());
		Line4.draw(gc);
		System.out.println("Line 4 Consist of: " + Line4.toString());
		MyLine Line5 = new MyLine(100,600,900,600, MyColor.Black.getColor());
		Line5.draw(gc);
		System.out.println("Line 5 Consist of: " + Line5.toString());
		primaryStage.setTitle("Abir Das : Assignment_2");
	}
}
*/


/*

MyRectangle Rectangle4 = new MyRectangle(50,50,240,148,MyColor.Lightyellow.getColor());
Rectangle4.draw(gc);
MyOval Oval4 = new MyOval(700,100,340,210,MyColor.Coral.getColor());
Oval4.draw(gc);
System.out.println(MyShapeInterface.ovarlapMyShape(Rectangle4, Oval4));
*/
		/*
		//System.out.print(System.lineSeparator());
		//double [][] output = Oval5.getMyArea();
		//double [][] output1 = MyShapeInterface.overlapMyShape(Oval4, Oval5);
		//for (int i = 0; i < output.length; i++) {
			//System.out.println(output[i][0] + " , " + output[i][1]);
		//}
		MyRectangle Rectangle4 = new MyRectangle(60,50,25,30,MyColor.Lightyellow.getColor());
		Rectangle4.draw(gc);
		System.out.println(MyShapeInterface.ovarlapMyShape(Rectangle4, Oval4));
	}
}
/*
public class Main extends Application {
	public static void main (String[] args) {
		launch(args);
	}
	
	@Override
	public void start (Stage primaryStage) {
		BorderPane P = new BorderPane();
		Canvas canvas = new Canvas(1000,700);
		Scene s = new Scene(P, 1000, 700, MyColor.GreenYellow.getColor());
		GraphicsContext gc = canvas.getGraphicsContext2D();
		primaryStage.setScene(s);
		primaryStage.show();
		P.getChildren().add(canvas);
		//MyShape shape = new MyShape (600, 900, Color.RED);
		//shape.draw(gc);
		MyPolygon Poly1 = new MyPolygon(500,350,180, MyColor.Lightyellow.getColor());
		Poly1.draw(gc);
		System.out.println("The first polygon with Lightyellow color " + Poly1.toString());
		MyCircle Circle1 = new MyCircle(500,350,155, MyColor.Aqua.getColor());
		Circle1.draw(gc);
		System.out.println("The first circle with Aqua color " + Circle1.toString());
		MyPolygon Poly2 = new MyPolygon(500,350,152,MyColor.Brown.getColor());
		Poly2.draw(gc);
		System.out.println("The second polygon with Brown color " + Poly2.toString());
		MyCircle Circle2 = new MyCircle(500,350,130, MyColor.Coral.getColor());
		Circle2.draw(gc);
		System.out.println("The second circle with Coral color " + Circle2.toString());
		MyPolygon Poly3 = new MyPolygon(500,350,128, MyColor.SkyBlue.getColor());
		Poly3.draw(gc);
		System.out.println("The third polygon with Skyblue color " + Poly3.toString());
		MyLine Line1 = new MyLine(100,100,900,600, MyColor.red.getColor());
		Line1.draw(gc);
		System.out.println("The first line with Red color " + Line1.toString());
		MyLine Line2 = new MyLine(900,100,100,600, MyColor.blue.getColor());
		Line2.draw(gc);
		System.out.println("The second line with Blue color " + Line2.toString());
		MyLine Line3 = new MyLine(100,100,100,600, MyColor.Navy.getColor());
		Line3.draw(gc);
		System.out.println("The third line with Navy color " + Line3.toString());
		MyLine Line4 = new MyLine(900,100,900,600, MyColor.DarkMagenta.getColor());
		Line4.draw(gc);
		System.out.println("The fourth line with Darkmagenta color " + Line4.toString());
		MyLine Line5 = new MyLine(100,100,900,100, MyColor.Brown.getColor());
		Line5.draw(gc);
		System.out.println("The fifth line with Brown color " + Line5.toString());
		MyLine Line6 = new MyLine(100,600,900,600, MyColor.Black.getColor());
		Line6.draw(gc);
		System.out.println("The sixth line with Black color " + Line6.toString());
	}
}
*/
