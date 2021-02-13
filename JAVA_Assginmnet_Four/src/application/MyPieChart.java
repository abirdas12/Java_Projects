package application;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javafx.scene.canvas.GraphicsContext;

public class MyPieChart {
	double width,height;
	MyColor Color;
	int numbeOfStudents;
	double x,y;
	HashMap<Character,Double>grades;
	HashMap<Character,Double>probabilityOfGrades;
	public MyPieChart(double x, double y, double width, double height, HashMap<Character,Double>grades,HashMap<Character,Double>probabilityOfGrades, MyColor Color) {
		this.width = width;
		this.height = height;
		this.grades = grades;
		this.probabilityOfGrades = probabilityOfGrades;
		this.x = x;
		this.y = y;
	}
	public void draw(GraphicsContext gc) {
		MyOval Circle = new MyOval (x, y, width, height, Color);
		Circle.draw(gc);
		double startAngle = 90;
		double y2 = 40;
		double sumOfProbability = 0;
		List <Map.Entry<Character, Double>> List = new ArrayList<>(grades.entrySet());
		List <Map.Entry<Character, Double>> List2 = new ArrayList<>(probabilityOfGrades.entrySet());
		MyColor [] colors = MyColor.values();
		Map.Entry<Character, Double> Set = null;
		Map.Entry<Character, Double> Set2 = null;
		for (int i = 0; i < List.size(); i++) {
			Set = List.get(i);
			Set2 = List2.get(i);
			sumOfProbability = sumOfProbability + Set2.getValue();
			y2 = y2 + 20;
			String str = Character.toString(Set2.getKey());
			String str2 = "---->";
			String str3 = Double.toString(Set.getValue());
			gc.setFill(colors[i].getColor());
			double centralAngle =  -360*Set2.getValue();
			MyArc Arc = new MyArc (x,y,width, height, startAngle, centralAngle, Color);
			Arc.draw(gc);
			startAngle = startAngle + centralAngle;
			gc.fillText(str, 50, y2);
			gc.fillText(str2, 65, y2);
			gc.fillText(str3, 100, y2);
		}
	}
}


//List for sorting in ascending order.
//import java.util.Map.Entry;
//import java.util.Collections;
//import java.util.Comparator;
//List <Map.Entry<Character, Double>> List2 = new ArrayList<>(grades.map);
//Collections.sort(sortedminList, new Comparator<Map.Entry<Character,Double>>() {
	//@Override
	//public int compare(Map.Entry<Character, Double> firstEntry, Map.Entry<Character, Double> secondEntry) {
		//return firstEntry.getValue().compareTo(secondEntry.getValue());
	//}
//});
/*
sumOfProbability = 1-sumOfProbability;
double centralAngle =  -360*sumOfProbability;
MyArc Arc2 = new MyArc (x,y,width, height, startAngle, centralAngle, Color);
gc.setFill(MyColor.blue.getColor());
Arc2.draw(gc);
startAngle = startAngle + centralAngle;
String str4 = Double.toString(sumOfProbability);
gc.fillText(str4, 500, 150);
String str5 = "All other alphabets:";
gc.fillText(str5, 380, 150);
*/
