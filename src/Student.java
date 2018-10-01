/**
 * Creates student objects for use in ScoreTrakker class
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
	
	

	public String getName() {
		return name;
	}



	@Override
	public String toString() {
		return (name + " " + score);
	}


	@Override
	public int compareTo(Student other) {
		return (this.name).compareTo(other.name);
	}
}
