package application;

import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.HashMap;
//import java.util.List;
import java.util.Map;
import java.util.Scanner;

///import java.util.Map.Entry;
//import java.util.Collections;
///import java.util.Comparator;
//import java.util.List;
//import java.sql.ResultSetMetaData;

public class MyDatabase {
	
	public static Connection getDataBaseConnection() {
		try {
			Connection conn = null;
			String Driver = "com.mysql.cj.jdbc.Driver";
			String URL = "jdbc:mysql://localhost:3306/StudentDatabase?user=root";
			String Username = "root";
			String Password = "!CinkaraSqL07";
			Class.forName(Driver);
			conn = DriverManager.getConnection(URL, Username, Password);
			if (conn != null) {
				System.out.println("Connection Successful!");
				//conn.close();
			}
			return conn;
		} catch (SQLException ex) {
			System.out.println("SQLException: " + ex.getMessage());
			ex.printStackTrace();
		} catch (Exception ex) {
			System.out.println("Exception: " + ex.getMessage());
			ex.printStackTrace();
		}
		return null;
	}
	public static void createStudentTable() throws Exception {
		try {
			Connection conn = getDataBaseConnection();
			PreparedStatement stmt = conn.prepareStatement("CREATE TABLE Student_Table" +
					"(Empl_ID INT UNSIGNED NOT NULL AUTO_INCREMENT," +
					"PRIMARY KEY (Empl_ID), First_Name varchar(255),Last_Name varchar(255), Email varchar(255), Sex Enum('M', 'F', 'U'))");
			stmt.executeUpdate();
			System.out.println("Table creation complete");
		}catch (SQLException ex) {
			System.out.println("SQLException: " + ex.getMessage());
			ex.printStackTrace();
		}
	}
	public static void insertStudentTable() throws Exception {
		
		Scanner myObj = new Scanner(System.in);
		
		System.out.print("Enter the number of students: ");
		int numberOfStudents = Integer.parseInt(myObj.nextLine());
		
		for (int i = 0; i < numberOfStudents; i++) {
		
			System.out.print("Enter your EMPL ID: ");
			int Empl_ID = Integer.parseInt(myObj.nextLine()); 
			
			System.out.print("Enter your First Name: ");
			String First_Name = myObj.nextLine();
			
			System.out.print("Enter your Last Name: ");
			String Last_Name = myObj.nextLine();
			
			System.out.print("Enter your Email: ");
			String Email = myObj.nextLine();
			
			System.out.print("Enter your Sex: ");
			String Sex = myObj.nextLine();
		
			try {
				Connection conn = getDataBaseConnection();
				PreparedStatement stmt = conn.prepareStatement("INSERT Student_Table (Empl_ID, First_Name, Last_Name, Email, Sex) VALUES "
						+ "('"+Empl_ID+"','" +First_Name+"','" +Last_Name+"','"+Email+"','"+Sex+"')");
				stmt.executeUpdate();
				System.out.println("Insertion data to student table is complete");
			}catch (SQLException ex) {
				System.out.println("SQLException: " + ex.getMessage());
				ex.printStackTrace();
			}
		}
	}
	public static void insertCoursesTable() throws Exception {
		
		Scanner myObj = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int numberOfStudents = Integer.parseInt(myObj.nextLine());
		
		for (int i = 0; i < numberOfStudents; i++) {
			
			System.out.print("Enter your Course ID: ");
			int Course_ID = Integer.parseInt(myObj.nextLine()); 
			
			System.out.print("Enter your Course Title: ");
			String Course_Title = myObj.nextLine(); 
			
			System.out.print("Enter your Department: ");
			String Department = myObj.nextLine(); 
	
			try {
				Connection conn = getDataBaseConnection();
				PreparedStatement stmt = conn.prepareStatement("INSERT Courses_Table " + "(Course_ID, Course_Title, Department) VALUES ('"+Course_ID+"','" +Course_Title+"','"+Department+"')");
				stmt.executeUpdate();
				System.out.println("Insertion data to Courses table is complete");
			} catch (SQLException ex) {
				System.out.println("SQLException: " + ex.getMessage());
				ex.printStackTrace();
			}
		}
	}
	public static void insertClassesTable() throws Exception {
		Scanner myObj = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int numberOfStudents = Integer.parseInt(myObj.nextLine());
		
		for (int i = 0; i < numberOfStudents; i++) {
			
			System.out.print("Enter your Course ID: ");
			int Course_ID = Integer.parseInt(myObj.nextLine()); 
			
			System.out.print("Enter your Student ID: ");
			int Student_ID = Integer.parseInt(myObj.nextLine());
			
			System.out.print("Enter your Section Number: ");
			int Section_NO = Integer.parseInt(myObj.nextLine());
			
			System.out.print("Enter the year: ");
			int Year = Integer.parseInt(myObj.nextLine());
			
			System.out.print("Enter your Semester: ");
			String Semester = myObj.nextLine();
			
			System.out.print("Enter your Grade: ");
			String Grade = myObj.nextLine();
			
			try {
				Connection conn = getDataBaseConnection();
				PreparedStatement stmt = conn.prepareStatement("INSERT Classes_Table " + "(Course_ID, Student_ID, Section_NO, Year, Semester, Grade) "+ "VALUES ('"+Course_ID+"','" +Student_ID+"','" +Section_NO+"','" +Year+"','" +Semester+"','"+Grade+"')");
				stmt.executeUpdate();
				System.out.println("Insertion data to Classes table is complete");
			} catch (SQLException ex) {
				System.out.println("SQLException: " + ex.getMessage());
				ex.printStackTrace();
			}
		}
	}
	public static void createCoursesTable() throws Exception {
		try {
			Connection conn = getDataBaseConnection();
			PreparedStatement stmt = conn.prepareStatement("CREATE TABLE Courses_Table" +
					"(Course_ID INT UNSIGNED NOT NULL AUTO_INCREMENT," +
					"PRIMARY KEY (Course_ID), Course_Title varchar(255),Department varchar(255))");
			stmt.executeUpdate();
			System.out.println("Table creation complete");
		}catch (SQLException ex) {
			System.out.println("SQLException: " + ex.getMessage());
			ex.printStackTrace();
		}
	}
	public static void createClassesTable() throws Exception {
		try {
			Connection conn = getDataBaseConnection();
			PreparedStatement stmt = conn.prepareStatement("CREATE TABLE Classes_Table" +
					"(Course_ID INT UNSIGNED NOT NULL AUTO_INCREMENT, Student_ID INT UNSIGNED NOT NULL, Section_NO INT UNSIGNED NOT NULL," + 
					"PRIMARY KEY (Course_ID, Student_ID, Section_NO),"
					+ "Year INT UNSIGNED, Semester Enum('Fall', 'Winter', 'Spring', 'Summer'), Grade Enum('A', 'B', 'C', 'D', 'F', 'W'))");
			stmt.executeUpdate();
			System.out.println("Table creation complete");
		}catch (SQLException ex) {
			System.out.println("SQLException: " + ex.getMessage());
			ex.printStackTrace();
		}
	}
	public static ArrayList<String> getGrade() throws Exception {
		try {
			Connection conn = getDataBaseConnection();
			PreparedStatement stmt = conn.prepareStatement("SELECT Grade FROM Classes_Table");
			ResultSet result = stmt.executeQuery();
			
			ArrayList<String> array = new ArrayList<String>();
			while (result.next()) {
				System.out.println(result.getString("Grade"));
				array.add(result.getString("Grade"));
			}
			System.out.println("All selected");
			return array;
		} catch(Exception e) { System.out.println(e);}
		return null;
	}
	public static HashMap<Character, Double> grades() throws FileNotFoundException {
		double countA = 0;
		double countB = 0;
		double countC = 0;
		double countD = 0;
		double countF = 0;
		double countW = 0;
	
		HashMap<Character, Double> map = new HashMap <Character, Double>();
		try {
			Connection conn = getDataBaseConnection();
			PreparedStatement stmt = conn.prepareStatement("SELECT Grade FROM Classes_Table");
			ResultSet result = stmt.executeQuery();
			String grades = " ";
			while (result.next()) {
				grades = result.getString("Grade");
				for (int i = 0; i < grades.length(); i++) {
					char ch = grades.charAt(i);
					if (ch == 'A') {
						countA = countA + 1;
						map.put('A', countA);
					}
					if (ch == 'B') {
						countB = countB + 1;
						map.put('B', countB);
					}
					if (ch == 'C') {
						countC = countC + 1;
						map.put('C', countC);
					}
					if (ch == 'D') {
						countD = countD + 1;
						map.put('D', countD);
					}
					if (ch == 'F') {
						countF = countF + 1;
						map.put('F', countF);
					}
					if (ch == 'W') {
						countW = countW + 1;
						map.put('W', countW);
					}
				}
			}
			for (HashMap.Entry<Character,Double> entry : map.entrySet()) {
				System.out.println(entry.getKey()+"--->"+entry.getValue());
			}
			return map;
		}catch(Exception e) { System.out.println(e);}
		return null;
	}
	public static HashMap<Character, Double> probabilityOfGrades() throws FileNotFoundException {
		double countA = 0;
		double countB = 0;
		double countC = 0;
		double countD = 0;
		double countF = 0;
		double countW = 0;
	
		HashMap<Character, Double> map = new HashMap <Character, Double>();
		try {
			Connection conn = getDataBaseConnection();
			PreparedStatement stmt = conn.prepareStatement("SELECT Grade FROM Classes_Table");
			ResultSet result = stmt.executeQuery();
			String grades = " ";
			while (result.next()) {
				grades = result.getString("Grade");
				for (int i = 0; i < grades.length(); i++) {
					char ch = grades.charAt(i);
					if (ch == 'A') {
						countA = countA + 1;
						map.put('A', countA);
					}
					if (ch == 'B') {
						countB = countB + 1;
						map.put('B', countB);
					}
					if (ch == 'C') {
						countC = countC + 1;
						map.put('C', countC);
					}
					if (ch == 'D') {
						countD = countD + 1;
						map.put('D', countD);
					}
					if (ch == 'F') {
						countF = countF + 1;
						map.put('F', countF);
					}
					if (ch == 'W') {
						countW = countW + 1;
						map.put('W', countW);
					}
				}
			}
			for (HashMap.Entry<Character,Double> entry : map.entrySet()) {
				System.out.println(entry.getKey()+"--->"+entry.getValue());
			}
			double sum = 0;
			double probabilityEntry = 0;
			for (HashMap.Entry<Character,Double> entry : map.entrySet()) {
				sum = sum + entry.getValue();
			}
			System.out.println("Total:" + sum);
			HashMap <Character,Double> Probability = new HashMap<Character,Double>();
			//Finding the Probability
			for (HashMap.Entry<Character,Double> entry : map.entrySet()) {
				probabilityEntry = entry.getValue()/sum;
				Probability.put(entry.getKey(), probabilityEntry);
			}
			for (Map.Entry<Character,Double> entry : Probability.entrySet()) {
				System.out.println(entry.getKey() + "-->" + entry.getValue());
			}
			return Probability;
		}catch(Exception e) { System.out.println(e);}
		return null;
	}
}


/*	
public static HashMap<Character, Double> grades() throws FileNotFoundException {
	double countA = 0;
	double countB = 0;
	double countC = 0;
	double countD = 0;
	double countF = 0;
	double countW = 0;

	HashMap<Character, Double> map = new HashMap <Character, Double>();
	try {
		Connection conn = getDataBaseConnection();
		PreparedStatement stmt = conn.prepareStatement("SELECT Grade FROM Classes_Table");
		ResultSet result = stmt.executeQuery();
		String grades = " ";
		while (result.next()) {
			grades = result.getString("Grade");
			for (int i = 0; i < grades.length(); i++) {
				char ch = grades.charAt(i);
				if (ch == 'A') {
					countA = countA + 1;
					map.put('A', countA);
				}
				if (ch == 'B') {
					countB = countB + 1;
					map.put('B', countB);
				}
				if (ch == 'C') {
					countC = countC + 1;
					map.put('C', countC);
				}
				if (ch == 'D') {
					countD = countD + 1;
					map.put('D', countD);
				}
				if (ch == 'F') {
					countF = countF + 1;
					map.put('F', countF);
				}
				if (ch == 'W') {
					countW = countW + 1;
					map.put('W', countW);
				}
			}
		}
		double sum = 0;
		double probabilityEntry = 0;
		for (HashMap.Entry<Character,Double> entry : map.entrySet()) {
			System.out.println(entry.getKey()+"--->"+entry.getValue());
		}
		for (HashMap.Entry<Character,Double> entry : map.entrySet()) {
			sum = sum + entry.getValue();
		}
		System.out.println("Total:" + sum);
		HashMap <Character,Double> Probability = new HashMap<Character,Double>();
		//Finding the Probability
		for (HashMap.Entry<Character,Double> entry : map.entrySet()) {
			probabilityEntry = entry.getValue()/sum;
			Probability.put(entry.getKey(), probabilityEntry);
		}
		for (Map.Entry<Character,Double> entry : Probability.entrySet()) {
			System.out.println(entry.getKey() + "-->" + entry.getValue());
		}
		return Probability;
	}catch(Exception e) { System.out.println(e);}
	return null;
}
}
*/













































/*
	if(map.containsKey(ch)) {
count = map.get(ch);
count++;
map.replace(ch, count);
}
else {
map.put(ch, 1.0);
}
if (ch == 'A') {
countA = countA + 1;
map.put('A', countA);
}
if (ch == 'B') {
countB = countB + 1;
map.put('B', countB);
}
if (ch == 'C') {
countC = countC + 1;
map.put('C', countC);
}
if (ch == 'D') {
countD = countD + 1;
map.put('D', countD);
}
if (ch == 'F') {
countF = countF + 1;
map.put('F', countF);
}
if (ch == 'W') {
countW = countW + 1;
map.put('W', countW);
}
*/


/*
public static void showResults(String tableName, ResultSet rSet) {
try {
ResultSetMetaData rsmd = rSet.getMetaData();
int numColumns = rsmd.getColumnCount();
String resultString = null;
if (numColumns > 0) {
resultString = "\nTable: " + tableName + "\n" +
"=======================================================\n";
for (int colNum = 1; colNum <= numColumns; colNum++)
resultString += rsmd.getColumnLabel(colNum) + " ";
}
System.out.println(resultString);
System.out.println(
"=======================================================");
while (rSet.next()) {
resultString = "";
for (int colNum = 1; colNum <= numColumns; colNum++) {
String column = rSet.getString(colNum);
if (column != null) {
resultString += column + " ";
}
}
System.out.println(resultString + '\n'+ "------------------------------------------------------------");
}
} catch (SQLException ex) {
System.out.println("SQLException: " + ex.getMessage());
ex.printStackTrace();
}
}
public static void showColumns(Connection conn) {
try {
Statement stmt = conn.createStatement();
ResultSet rset = stmt.executeQuery("SHOW COLUMNS FROM Student_Table");
MyDatabase.showResults("Student_Table", rset);
} catch (SQLException ex) {
System.out.println("SQLException: " + ex.getMessage());
ex.printStackTrace();
}
}
public static void showValues(Connection conn){
try {
Statement stmt = conn.createStatement();
ResultSet rset = stmt.executeQuery("SELECT * FROM Student_Table");
MyDatabase.showResults("Student_Table", rset);
} catch (SQLException ex) {
System.out.println("SQLException: " + ex.getMessage());
ex.printStackTrace();
}
}
			List <Map.Entry<Character, Double>> probabilityList = new ArrayList<>(Probability.entrySet());
			Map.Entry<Character, Double> Entry = null;
			HashMap<Character,Double> max = new HashMap<Character,Double>();
			for (int i = 0; i < numbeOfStudents; i++) {
				Entry = probabilityList.get(i);
				max.put(Entry.getKey(),Entry.getValue());
			}
*/
