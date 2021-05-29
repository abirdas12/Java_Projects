package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javafx.scene.canvas.GraphicsContext;

public class HistogramAlphaBet {
	
	private double width;
	private double height;
	private int n;
	private double x,y;
	MyColor Color;
	
	public HistogramAlphaBet(double x, double y, double width, double height,  int n, MyColor Color) {
		this.width = width;
		this.height = height;
		this.n = n;
		this.x = x;
		this.y = y;
		this.Color = Color;
	}
	File file = new File ("C:\\Users\\abird\\Desktop\\Alice in Wonderland.txt");
	HashMap <Character,Double> frequency = new HashMap<Character, Double>();

	public HashMap<Character, Double> Alphabets() throws FileNotFoundException {
		Scanner scan = new Scanner (file);
		String str = "";
		char ch;
		double count;
		while(scan.hasNextLine()) {
			str = str.concat(scan.nextLine());
			str = str.toUpperCase();
			str = str.replaceAll("[^a-zA-Z]", "");
		}
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			if(frequency.containsKey(ch)) {
				count = frequency.get(ch);
				count++;
				frequency.replace(ch, count);
			}
			else {
				frequency.put(ch, 1.0);
			}
		}
		double sum = 0;
		double probabilityEntry = 0;
		//Finding the total
		for (HashMap.Entry<Character,Double> entry : frequency.entrySet()) {
			sum = sum + entry.getValue();
		}
		HashMap <Character,Double> Probability = new HashMap<Character,Double>();
		//Finding the Probability
		for (HashMap.Entry<Character,Double> entry : frequency.entrySet()) {
			probabilityEntry = entry.getValue()/sum;
			Probability.put(entry.getKey(), probabilityEntry);
		}
		//Sorting the probability
		List <Map.Entry<Character, Double>> sortedList = new ArrayList<>(Probability.entrySet());
		Collections.sort(sortedList, new Comparator<Map.Entry<Character,Double>>() {
			@Override
			public int compare(Map.Entry<Character, Double> firstEntry, Map.Entry<Character, Double> secondEntry) {
				return firstEntry.getValue().compareTo(secondEntry.getValue());
			}
		});
		//Finding Max until n number
		Map.Entry<Character, Double> maxEntry = null;
		HashMap<Character,Double>max = new HashMap<Character,Double>();
		for (int i = 0; i < n; i++) {
			maxEntry = sortedList.get(25-i);
			max.put(maxEntry.getKey(),maxEntry.getValue());
		}
		return max;
	}
	public void draw(GraphicsContext gc) throws FileNotFoundException {
		MyPieChart Chart = new MyPieChart(x, y, width, height, Alphabets(), n, Color);
		Chart.draw(gc);
	}
}




//import java.util.Set;
/*Finding frequency
for (HashMap.Entry<Character,Double> entry : frequency.entrySet()) {
		//System.out.println(entry.getKey() + "-->" + entry.getValue());
}
*/
//System.out.println("Total" + " = " + sum);
//System.out.println(" Max values ");
//System.out.println(maxEntry);
/*
for (Map.Entry<Character,Double> entry : Probability.entrySet()) {
	//System.out.println(entry.getKey() + "-->" + entry.getValue());
}
*/
//
//Map.Entry<Character, Double> maxEntry = null;
/*
for (Map.Entry<Character,Double> entry: sortedList) {
	System.out.println(entry.getKey() + "-->" + entry.getValue());
	sortList.put(entry.getKey(), entry.getValue());
}
*/
//Creating map for the sorted list
//HashMap <Character,Double> sortList = new HashMap<Character,Double>();
/*
for (Map.Entry<Character,Double> entry: sortedList) {
	System.out.println(entry.getKey() + "-->" + entry.getValue());
	sortList.put(entry.getKey(), entry.getValue());
}
*/
/*
for (Map.Entry<Character,Double> entry: max.entrySet()) {
	System.out.println(entry.getKey()+ "-->" +entry.getValue());
}
*/
//max.put(sortList.getKey(sortedList.get(25-i), sorted[25-i]);
;
/*
Map.Entry<Character,Double> maxEntry = null;
for (Map.Entry<Character,Double> entry : sortList.entrySet()) {
	sortList.get(n);
	if (maxEntry == null || entry.getValue() > maxEntry.getValue()) {
		maxEntry = entry;
	}
}
sortList.remove(maxEntry.getKey());
max.put(maxEntry.getKey(), maxEntry.getValue());
}
*/	
/*
double majorAxis;
double minorAxis;
double xCenter;
double yCenter;
*/

//setCenter(width, height);
//setAxes();
/*
public double getCenterX() {return xCenter;} 
public double getCenterY() {return yCenter;};
public void setAxes() {
	this.minorAxis = height; 
	this.majorAxis = width;
}
public double getX() {
	return this.x;
}
public double getY() {
	return this.y;
}
public void setCenter(double width, double height) {
	this.xCenter = (width)/2 + getX();
	this.yCenter = (height)/2 + getY();
}
*/
/*
public HistogramAlphaBet() throws FileNotFoundException {	
	Scanner scan = new Scanner (file);
	String str = "";
	char ch;
	double count;
	while(scan.hasNextLine()) {
		str = str.concat(scan.nextLine());
		str = str.toUpperCase();
		str = str.replaceAll("[^a-zA-Z]", "");
	}
	for (int i = 0; i < str.length(); i++) {
		ch = str.charAt(i);
		if(frequency.containsKey(ch)) {
			count = frequency.get(ch);
			count++;
			frequency.replace(ch, count);
		}
		else {
			frequency.put(ch, 1.0);
		}
	}
}
*/
/*
for (Map.Entry<Character,Double> entry : Probability.entrySet()) {
	if (maxEntry == null || entry.getValue() > maxEntry.getValue()) {
		maxEntry = entry;
	}
}
Probability.remove(maxEntry.getKey());
max.put(maxEntry.getKey(), maxEntry.getValue());
}
*/
//import java.util.Map.Entry;