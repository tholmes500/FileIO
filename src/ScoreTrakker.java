/**
 * ScoreTrakker reads in files with students and their scores, and organizes the data
 * and displays them in order.
 * @author Frank Enciso
 * @author Sean Little
 */
import java.util.*;
import java.io.*;

public class ScoreTrakker {
	private ArrayList<Student> students;
	private String[] files = {"scores.txt", "badscore.txt", "nofile.txt"};
	/**
	 * loadDataFromFile simply loads data from the text files. Uses a try-catch clause to
	 * handle any scores that are not numeric
	 * @param str - the current element in the files array that contains the name of
	 * the text file 
	 * @throws FileNotFoundException - thrown if the file is not found (nofile.txt)
	 */
	public void loadDataFromFile(String str) throws FileNotFoundException {
		students = new ArrayList<Student>();
		FileReader reader = new FileReader(str);
		Scanner in = new Scanner(reader);
		while (in.hasNextLine()) {
			String name = in.nextLine();
			String scoreString = in.nextLine();
			try {
				int score = Integer.parseInt(scoreString);
				Student s = new Student(name, score);
				if (!students.contains(s)) {
					students.add(s);
				}
				
			} catch (NumberFormatException e) {
				System.out.println("Incorrect format for " + name + ": not a valid score: " + scoreString);
				System.out.println();
			}
		}
		in.close();
	}
	/**
	 * Displays the data in order by name with a line break in between each text file
	 */
	public void printInOrder() {
		System.out.println("Student Score List");
		Collections.sort(students);
		for (Student s: students) {
			System.out.println(s.toString());
		}
	}
	/**
	 * Function calling for file loading and printing. Also handles the FileNotFoundException.
	 */
	public void processFiles() {
		for (String s: files) {
			try {
				loadDataFromFile(s);
				printInOrder();
			} catch (FileNotFoundException e) {
				System.out.println("Can't open file: " + s);
			}
			
			System.out.println();
		}
	}
	public static void main(String[] args) {
		ScoreTrakker st = new ScoreTrakker();
		st.processFiles();
	}
}