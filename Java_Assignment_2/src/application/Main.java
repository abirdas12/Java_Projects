package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	public static void main (String[] args) {
		launch(args);
	}
	@Override
	public void start (Stage primaryStage) {
		BorderPane P = new BorderPane();
		Canvas canvas = new Canvas(1000,700);
		Scene s = new Scene(P, 1000, 700, MyColor.GreenYellow.colorOfShapes());
		GraphicsContext gc = canvas.getGraphicsContext2D();
		primaryStage.setScene(s);
		primaryStage.show();
		P.getChildren().add(canvas);
		
		MyRectangle Rectangle1 = new MyRectangle(255,200,490,300,MyColor.Lightyellow);
		Rectangle1.draw(gc);
		System.out.println("The bounding Rectangle 1 consist of: " + Rectangle1.getMyBoundingRectangle());
		MyOval Oval1 = new MyOval(255,200,490,300,MyColor.Aqua);
		Oval1.draw(gc);
		System.out.println("Oval 1 consist of: " + Oval1.toString());
		MyRectangle Rectangle2 = new MyRectangle(330,245,340,210,MyColor.GreenYellow);
		Rectangle2.draw(gc);
		System.out.println("The bounding Rectangle 2 consist of: " + Rectangle2.getMyBoundingRectangle());
		MyOval Oval2 = new MyOval(330,245,340,210,MyColor.Coral);
		Oval2.draw(gc);
		System.out.println("Oval 2 consist of: " + Oval2.toString());
		MyRectangle Rectangle3 = new MyRectangle(380,276,240,148,MyColor.Lightyellow);
		Rectangle3.draw(gc);
		System.out.println("The bounding Rectangle 3 consist of: " + Rectangle3.getMyBoundingRectangle());
		MyOval Oval3 = new MyOval(380,276,240,148,MyColor.SkyBlue);
		Oval3.draw(gc);
		System.out.println("Oval 3 consist of: " + Oval3.toString());
		MyLine Line1 = new MyLine(100,100,900,600, MyColor.red);
		Line1.draw(gc);
		System.out.println("Line 1 Consist of: " + Line1.toString());
		
		//Test for checking if the shapes overlaps. 
		System.out.println(MyShapeInterface.ovarlapMyShape(Rectangle1, Oval1) + System.lineSeparator());
		
		MyLine Line2 = new MyLine(100,100,100,600, MyColor.Navy);
		Line2.draw(gc);
		System.out.println("Line 2 Consist of: " + Line2.toString());
		MyLine Line3 = new MyLine(900,100,900,600, MyColor.DarkMagenta);
		Line3.draw(gc);
		System.out.println("Line 3 Consist of: " + Line3.toString());
		MyLine Line4 = new MyLine(100,100,900,100, MyColor.Brown);
		Line4.draw(gc);
		System.out.println("Line 4 Consist of: " + Line4.toString());
		MyLine Line5 = new MyLine(100,600,900,600, MyColor.Black);
		Line5.draw(gc);
		System.out.println("Line 5 Consist of: " + Line5.toString());
		primaryStage.setTitle("Abir Das : Assignment_2");
	}
}
