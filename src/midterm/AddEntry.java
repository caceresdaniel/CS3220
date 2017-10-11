package midterm;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/midterm/AddTutor")
public class AddEntry extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Set the content type
		response.setContentType("text/html");

		// Get a reference to the PrintWriter that lets us talk to the client
		PrintWriter out = response.getWriter();

		// Generate the HTML
		out.println("<!DOCTYPE html>");
		out.println("<html lang=\"en\">");
		out.println("<head>");
		out.println(
				"    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\" integrity=\"sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u\" crossorigin=\"anonymous\">");
		out.println(
				"<link rel=\"stylesheet\" href=\"https://bootswatch.com/cyborg/bootstrap.min.css\" type=\"text/css\">");
		out.println("    <meta charset=\"UTF-8\">");

		/* Page Title goes here */
		out.println("    <title>Add Tutor</title>");
		out.println("</head>");

		/* Page Body goes here */
		out.println("<body>");
		out.println("<div class=\"container\">");

		out.println("<div class=\"page-header\">");
		out.println("    <h1>Tutor Registration<small>Tutor Center</small></h1>");
		out.println("</div>");

		out.println("<form action=\"AddTutor\" method=\"post\">");

		String firstNameError = (String) request.getAttribute("firstNameError");

		if (firstNameError != null)
			out.println("<p class=\"text-danger\">" + firstNameError + "</p>");

		String firstName = request.getParameter("firstName");
		if (firstName == null)
			firstName = "";

		//out.println("First Name: <input type=\"text\" name=\"firstName\" value=\"" + firstName + "\"><br>");
		out.println("<label for=\"firstName\"> First Name</label>");
		out.println("<input type=\"firstName\" class=\"form-control\" id=\"firstName\" placeholder=\"First Name\" name=\"firstName\"  value=\"" + firstName + "\"><br>");

		String lastNameError = (String) request.getAttribute("lastNameError");

		if (lastNameError != null)
			out.println("<p class=\"text-danger\">" + lastNameError + "</p>");

		String lastName = request.getParameter("lastName");
		if (lastName == null)
			lastName = "";

		out.println("<label for=\"lastName\"> Last Name</label>");
		out.println("<input type=\"lastName\" class=\"form-control\" id=\"lastName\" placeholder=\"Last Name\" name=\"lastName\"  value=\"" + lastName + "\"><br>");

		String emailError = (String) request.getAttribute("emailError");

		if (emailError != null)
			out.println("<p class=\"text-danger\">" + emailError + "</p>");

		String email = request.getParameter("email");
		if (email == null)
			email = "";

		out.println("<label for=\"email\"> Email </label>");
		out.println("<input type=\"email\" class=\"form-control\" id=\"email\" placeholder=\"Email\" name=\"email\"  value=\"" + email + "\"><br>");
		
		String coursesError = (String) request.getAttribute("coursesError");

		if (coursesError != null)
			out.println("<p class=\"text-danger\">" + coursesError + "</p>");

		String courses = request.getParameter("courses");
		if (courses == null)
			courses = "";

		out.println("<label for=\"courses\"> Courses</label>");
		out.println("<input type=\"courses\" class=\"form-control\" id=\"courses\" placeholder=\"Courses\" name=\"courses\"  value=\"" + courses + "\"><br>");
		
		
		out.println("<input type=\"submit\" name=\"addEntry\" value=\"Add Tutor\" class=\"btn btn-primary\">");
		out.println("</form>");

		out.println("</div>");
		out.println("</body>");

		out.println("</html>");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String email = request.getParameter("email");
		String courses = request.getParameter("courses");

		boolean isFirstNameError = firstName == null || firstName.trim().length() == 0;
		boolean isLastNameError = lastName == null || lastName.trim().length() == 0;
		boolean isEmailError = email == null || email.trim().length() == 0;
		boolean isCoursesError = courses == null || courses.trim().length() == 0;
		// Validate the input
		if (!isFirstNameError && !isCoursesError && !isLastNameError && !isEmailError) {

			// Create a new entry
			TutorEntry entry = new TutorEntry(firstName, lastName, email, courses);

			ArrayList<TutorEntry> entries = (ArrayList<TutorEntry>) getServletContext().getAttribute("entries");

			// Add the new entry to our array list of entries
			entries.add(entry);

			response.sendRedirect("TutorCenter");
		}

		if (isFirstNameError)
			request.setAttribute("firstNameError", "You must enter your first name");
		if (isLastNameError)
			request.setAttribute("lastNameError", "You must enter your last name");
		if (isEmailError)
			request.setAttribute("emailError", "You must enter a valid email address");
		if (isCoursesError)
			request.setAttribute("coursesError", "You must enter a proper list of courses");

		doGet(request, response);
	}

}
