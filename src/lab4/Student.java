package lab4;

<<<<<<< HEAD
=======
import javax.servlet.http.Cookie;

>>>>>>> 526ef2923b06d9bc1fef9602eba99c549560945c
public class Student {

	static int count = 0;
	static final int NUMBER_OF_ASSIGNMENTS = 5;
<<<<<<< HEAD
	
	int id;	
	String firstName, lastName;	
	String email;
	String password;
	
	double[] scores = new double[NUMBER_OF_ASSIGNMENTS];
	
	public Student(String firstName, String lastName, String email, String password) {
		
		this.id = count++;
		
=======

	int id;
	String firstName, lastName;
	String email;
	String password;
	String cookie = "";

	double[] scores = new double[NUMBER_OF_ASSIGNMENTS];

	public Student(String firstName, String lastName, String email, String password) {

		this.id = count++;

>>>>>>> 526ef2923b06d9bc1fef9602eba99c549560945c
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
<<<<<<< HEAD
		
		// Randomly assign scores to this student;
		for (int i = 0; i < NUMBER_OF_ASSIGNMENTS; i++)
			scores[i] = Math.random() * 100;
				
=======

		// Randomly assign scores to this student;
		for (int i = 0; i < NUMBER_OF_ASSIGNMENTS; i++)
			scores[i] = Math.random() * 100;

	}

	public String getCookie() {
		return cookie;
	}

	public void setCookie(String cookie) {
		this.cookie = cookie;
>>>>>>> 526ef2923b06d9bc1fef9602eba99c549560945c
	}

	public String getFullName() {
		return firstName + " " + lastName;
	}
<<<<<<< HEAD
=======

>>>>>>> 526ef2923b06d9bc1fef9602eba99c549560945c
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

	public String getPassword() {
		return password;
	}
<<<<<<< HEAD
	
=======

>>>>>>> 526ef2923b06d9bc1fef9602eba99c549560945c
	public void setPassword(String password) {
		this.password = password;
	}

	public double[] getScores() {
		return scores;
	}

	public void setScores(double[] scores) {
		this.scores = scores;
	}

	public int getId() {
		return id;
	}
<<<<<<< HEAD
		
	
	
=======

>>>>>>> 526ef2923b06d9bc1fef9602eba99c549560945c
}
