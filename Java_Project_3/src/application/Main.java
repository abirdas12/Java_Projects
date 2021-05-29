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

