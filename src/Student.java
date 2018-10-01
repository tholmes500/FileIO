/**
 * Creates student objects for use in ScoreTrakker class
 * @author Frank Enciso
 * @author Sean Little
 */
public class Student implements Comparable<Student> {
	private String name;
	private int score;
	/**
	 * Parameterized constructor that sets the private attributes
	 * @param name - name of the student
	 * @param score - the student's score
	 */
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	/**
	 * Getter for Student name
	 * @return name - gets the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * Converts the data to a user friendly output string
	 * @return - returns the easy to read string
	 */
	@Override
	public String toString() {
		return (name + " " + score);
	}
	/**
	 * The Comparable<Student> interface requires creating a compareTo function
	 * @return - returns the comparison result for 2 students
	 */
	@Override
	public int compareTo(Student other) {
		return (this.name).compareTo(other.name);
	}
}
