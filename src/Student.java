/**
 * Reads data from a file
 * @author Frank Enciso
 * @author Sean Little
 */
public class Student implements Comparable<Student> {
	private String name;
	private int score;
	
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	

	@Override
	public String toString() {
		return "Student [name=" + name + ", score=" + score + "]";
	}


	@Override
	public int compareTo(Student arg0) {
		// TODO Auto-generated method stub
		
		return 0;
	}

}
