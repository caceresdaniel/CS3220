package lab2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Labs/RequestSummary")
public class RequestSummary extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Set the content type
		response.setContentType("text/html");
		
		// Get a reference to the PrintWriter that lets us talk to the client
		PrintWriter out = response.getWriter();
		
		// Generate the HTML
		out.println("<!DOCTYPE html>");
		out.println("<html lang=\"en\">");
		out.println("<head>");
		out.println("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\" integrity=\"sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u\" crossorigin=\"anonymous\">");
		out.println("    <meta charset=\"UTF-8\">");
		
		/* Page Title goes here */
		out.println("    <title>Request Parameters</title>");
		out.println("</head>");
		
		/* Page Body goes here */
		out.println("<body>");
		out.println("<div class=\"container\">");
		
		out.println("<div class=\"page-header\">");
		out.println("    <h1>Request Parameters <small>Lab 2</small></h1>");
		out.println("<h3><small>The following " + " request was submitted on " + new java.util.Date() + ".</small></h3>");
		out.println("</div>");
		
		out.println("<div>");
		out.println("<h2> Request Parameters </h2>");
		out.println("<table class=\"table table-bordered table-hover table-striped\">");
		out.println("	<tr>");
		out.println("		<th>Parameter Name</th>");
		out.println("		<th>Parameter Value</th>");
		out.println("	</tr>");
		out.println("</table>");
		out.println("</div>");
		
		out.println("<div>");
		out.println("<h2> Header Information </h2>");
		out.println("<table class=\"table table-bordered table-hover table-striped\">");
		out.println("	<tr>");
		out.println("		<th>Header Field</th>");
		out.println("		<th>Header Value</th>");
		out.println("	</tr>");
		out.println("</table>");
		out.println("</div>");
		
		out.println("</div>");
		out.println("</body>");
		
		out.println("</html>");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
