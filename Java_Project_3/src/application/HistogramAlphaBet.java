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
