package jsf.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Hello")
public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Hello() {
        super();
    }

	protected void doGet(
			HttpServletRequest request,
			HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter HtmlOut = response.getWriter();
		
		HtmlOut.println("<html>\n<body>\n" +
	            "\n<h1>Zacmienie ksiezyca</h1><br>\n" +
               "<img width=\"200px\" src=\"images/eclipse.jpg\"><br>\n" +
               "<a href='http://localhost:8080/test'>Powrót</a>" +
	            "</body>\n</html>");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
