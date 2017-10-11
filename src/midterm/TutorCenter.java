package midterm;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/midterm/TutorCenter")
public class TutorCenter extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void init(ServletConfig config) throws ServletException {
		super.init(config);

		ArrayList<TutorEntry> entries = new ArrayList<TutorEntry>();
		entries.add(new TutorEntry("John", "Boyega", "john@boyega.com", "CS2011, CS2012, CS2013"));
		entries.add(new TutorEntry("Mary", "Jane", "mary@jane.com", "CS3337, CS3112"));
		entries.add(new TutorEntry("Joe", "Howard", "joe@howard.com", "CS3220, CS2013, CS2012"));

		ServletContext context = this.getServletContext();
		context.setAttribute("entries", entries);
	}

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
		out.println("    <title>Available Tutors</title>");
		out.println("</head>");

		/* Page Body goes here */
		out.println("<body>");
		out.println("<div class=\"container\">");

		out.println("<div class=\"page-header\">");
		out.println("    <h1>Available Tutors<small> Tutor Center</small></h1>");
		out.println("</div>");

		out.println("<a class=\"btn btn-primary pull-right\" href=\"AdminCenter\">Admin Center</a>");

		out.println("<form class=\"form-inline\" action=\"TutorCenter\" method=\"get\">");
		out.println("	<div class=\"form-group\">");
		out.println(
				"		<input class=\"form-control\" type=\"text\" name=\"query\" placeholder=\"Enter your search term(s)\">");
		out.println("		<input class=\"form-control btn btn-primary\" type=\"submit\" value=\"Search\">");
		out.println("	</div>");
		out.println("</form>");

		out.println("<hr>");
		out.println("<table class=\"table table-bordered table-striped table-hover\">");
		out.println("<tr>");
		out.println("  <th>First Name</th><th>Last Name</th><th>Email</th><th>Courses</th><th>Date Applied</th>");
		out.println("</tr>");

		String query = "";
		if (request.getParameter("query") != null) {
			query = request.getParameter("query");
		}

		ArrayList<TutorEntry> entries = (ArrayList<TutorEntry>) getServletContext().getAttribute("entries");

		for (TutorEntry entry : entries) {
			if (entry.getFirstName().toLowerCase().contains(query.toLowerCase())
					|| entry.getLastName().toLowerCase().contains(query.toLowerCase())
					|| entry.getEmail().toLowerCase().contains(query.toLowerCase())
					|| entry.getCourses().toLowerCase().contains(query.toLowerCase())) {
				out.println("<tr>");
				out.println("  <td>" + entry.getFirstName() + "</td>");
				out.println("  <td>" + entry.getLastName() + "</td>");
				out.println("  <td>" + entry.getEmail() + "</td>");
				out.println("  <td>" + entry.getCourses() + "</td>");
				out.println("  <td>" + entry.getCreated() + "</td>");
				out.println("</tr>");
			}

		}

		out.println("</table>");

		out.println("<a class=\"btn btn-primary\" href=\"AddTutor\">Add a Tutor</a>");

		out.println("</div>");
		out.println("</body>");

		out.println("</html>");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
