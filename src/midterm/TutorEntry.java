package midterm;

import java.util.Date;

public class TutorEntry {

	int id;
	Date created;
	String firstName;
	String lastName;
	String email;
	String courses;

	static int count = 0;

	public TutorEntry(String firstName, String lastName, String email, String courses) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.courses = courses;
		this.email = email;
		this.id = count++;
		this.created = new Date();
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCourses() {
		return courses;
	}

	public void setCourses(String courses) {
		this.courses = courses;
	}

	public int getId() {
		return id;
	}

}
