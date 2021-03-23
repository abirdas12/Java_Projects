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
		//MyShape shape = new MyShape (600, 900, Color.RED);
		//shape.draw(gc);
		MyPolygon Poly1 = new MyPolygon(500,350,180, MyColor.Lightyellow);
		Poly1.draw(gc);
		System.out.println("The first polygon with Lightyellow color " + Poly1.toString());
		MyCircle Circle1 = new MyCircle(500,350,155, MyColor.Aqua);
		Circle1.draw(gc);
		System.out.println("The first circle with Aqua color " + Circle1.toString());
		MyPolygon Poly2 = new MyPolygon(500,350,152,MyColor.Brown);
		Poly2.draw(gc);
		System.out.println("The second polygon with Brown color " + Poly2.toString());
		MyCircle Circle2 = new MyCircle(500,350,130, MyColor.Coral);
		Circle2.draw(gc);
		System.out.println("The second circle with Coral color " + Circle2.toString());
		MyPolygon Poly3 = new MyPolygon(500,350,128, MyColor.SkyBlue);
		Poly3.draw(gc);
		System.out.println("The third polygon with Skyblue color " + Poly3.toString());
		MyLine Line1 = new MyLine(100,100,900,600, MyColor.red);
		Line1.draw(gc);
		System.out.println("The first line with Red color " + Line1.toString());
		MyLine Line2 = new MyLine(900,100,100,600, MyColor.blue);
		Line2.draw(gc);
		System.out.println("The second line with Blue color " + Line2.toString());
		MyLine Line3 = new MyLine(100,100,100,600, MyColor.Navy);
		Line3.draw(gc);
		System.out.println("The third line with Navy color " + Line3.toString());
		MyLine Line4 = new MyLine(900,100,900,600, MyColor.DarkMagenta);
		Line4.draw(gc);
		System.out.println("The fourth line with Darkmagenta color " + Line4.toString());
		MyLine Line5 = new MyLine(100,100,900,100, MyColor.Brown);
		Line5.draw(gc);
		System.out.println("The fifth line with Brown color " + Line5.toString());
		MyLine Line6 = new MyLine(100,600,900,600, MyColor.Black);
		Line6.draw(gc);
		System.out.println("The sixth line with Black color " + Line6.toString());
	}
}
