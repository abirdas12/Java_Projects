package application;
	
import java.io.FileNotFoundException;
import java.util.Scanner;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;

public class Main extends Application {
	@Override
	public void start (Stage primaryStage) throws FileNotFoundException {
		BorderPane P = new BorderPane();
		Canvas canvas = new Canvas(1000,700);
		Scene s = new Scene(P, 1000, 700, MyColor.White.getColor());
		GraphicsContext gc = canvas.getGraphicsContext2D();
		primaryStage.setScene(s);
		primaryStage.show();
		P.getChildren().add(canvas);
		MyPieChart test = new MyPieChart (325,175,350,350,MyDatabase.grades(),MyDatabase.probabilityOfGrades(), MyColor.White);
		test.draw(gc);
	}
	public static void main(String[] args) throws Exception {
		Scanner myObj = new Scanner(System.in);
		MyDatabase.getDataBaseConnection();
		System.out.println("Where do you want to add your data? Please select from the following list: "
				+ "(1) Student_Table, (2) Course_Table, (3) Classes_Table: ");
		int Choice = myObj.nextInt();
		
		if (Choice == 1) {
			System.out.println("Selected Student_Table");
			MyDatabase.insertStudentTable();
		}
		else if (Choice == 2) {
			System.out.println("Selected Course_Table");
			MyDatabase.insertCoursesTable();
		}
		else if (Choice == 3) {
			System.out.println("Selected Classes_Table");
			MyDatabase.insertClassesTable();
			MyDatabase.grades();
			launch(args);
		}
	}
}





//import java.sql.Connection;
//import javax.swing.JOptionPane;
//System.out.print("How many students would you like to add: ");
//int numberOfStudents = Integer.parseInt(myObj.nextLine());