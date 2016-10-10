package brandt.jorgensen;

public class Person {


	// Private variables
	private String firstName, lastName;
	
	/*
	 * CONSTRUCTOR
	 */
	public Person( String first, String last ) {
		firstName = first;
		lastName = last;
	}
	
	/*
	 * Custom Method to return concatenated name
	 */
	public String getFullName() {
		return firstName + " " + lastName;
	}
	
	/*
	 * PUBLIC getters and setters for these PRIVATE variables
	 */
	public String getFirstName(){
		return firstName;
	}
	
	public void setFirstName( String first ){
		firstName = first;
	}
	
	public String getLastName(){
		return lastName;
	}
	
	public void setLastName( String last ){
		lastName = last;
	}
}
