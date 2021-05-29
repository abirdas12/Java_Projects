
package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javafx.scene.canvas.GraphicsContext;

public class MyPieChart {
	double width,height;
	int n;
	MyColor Color;
	double x,y;
	HashMap<Character,Double>Alphabets;
	
	public MyPieChart(double x, double y, double width, double height, 
					HashMap<Character,Double>Alphabets, int n, MyColor Color) {
		this.width = width;
		this.height = height;
		this.Alphabets = Alphabets;
		this.n = n;
		this.x = x;
		this.y = y;
	}
	public void draw(GraphicsContext gc) {
		MyOval Circle = new MyOval (x, y, width, height, Color);
		Circle.draw(gc);
		double startAngle = 90;
		double y2 = 40;
		double sumOfProbability = 0;
		
		//List for sorting in ascending order.
		List <Map.Entry<Character, Double>> sortedminList = new ArrayList<>(Alphabets.entrySet());
		Collections.sort(sortedminList, new Comparator<Map.Entry<Character,Double>>() {
			@Override
			public int compare(Map.Entry<Character, Double> firstEntry, Map.Entry<Character, Double> secondEntry) {
				return firstEntry.getValue().compareTo(secondEntry.getValue());
			}
		});
		
		MyColor [] colors = MyColor.values();
		Map.Entry<Character,Double> minSet = null;
		
		for (int i = 0; i < n; i++) {
			minSet = sortedminList.get(i);
			sumOfProbability = sumOfProbability + minSet.getValue();
			y2 = y2 + 20;
			
			String str = Character.toString(minSet.getKey());
			String str2 = "---->";
			String str3 = Double.toString(minSet.getValue());
			gc.setFill(colors[i].getColor());
			double centralAngle =  -360*minSet.getValue();
			MyArc Arc = new MyArc (x,y,width, height, startAngle, centralAngle, Color);
			Arc.draw(gc);
			startAngle = startAngle + centralAngle;
			gc.fillText(str, 50, y2);
			gc.fillText(str2, 65, y2);
			gc.fillText(str3, 100, y2);
		}
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
	}
}









//Alphabets.remove(minSet.getKey());
//gc.setFill(Color.BLACK);
//System.out.println(minSet.getKey());
/*
double xCenter;
double yCenter;
double majorAxis;
double minorAxis;
*/
//import java.util.Map.Entry;
//import java.util.Set;
/*
Map.Entry<Character,Double> minSet = null;
for (Map.Entry<Character,Double> entry : Alphabets.entrySet()) {
	if (entry.getValue() < minSet.getValue()) {
		minSet = entry;
	}
	
}
*/