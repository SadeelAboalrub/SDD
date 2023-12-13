package sddDemo;

/**
 * @author Dimah
 * @implNote this is a trail
 */

/**
 * @version 1.0
 * @see www.google.com
 */
public class Student {
	int id;
	String name;
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * returning student name
	 * @return name
	 */
	public String getName() {
		return name;
	}
	/**
	 * setting student name
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * Just saying hello method with student name
	 */
	public void sayHello() {
		System.out.println("Hello, my name is " + this.name);
	}
}
