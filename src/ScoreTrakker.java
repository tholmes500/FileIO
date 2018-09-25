import java.util.*;

public class ScoreTrakker {
	private ArrayList<Student> students;
	public void loadDataFromFile(String str) {
		
	}
	public void printInOrder() {
		Collections.sort(students);
		for (Student s: students) {
			System.out.println(s.toString());
		}
	}
	public void processFiles() {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
