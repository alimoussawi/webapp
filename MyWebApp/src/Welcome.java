import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class Welcome extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username=request.getParameter("username");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
  out.println("<!doctype html>\n" +
          "<html>\n" +
          "<head>\n" +
          "  <meta charset=\"utf-8\">\n" +
          "  <title>Welcome User</title>\n" +
          "  <link rel=\"stylesheet\" href=\"style3.css\">\n" +
          "</head>\n" +
          "<body>\n" +
          "<div class=\"Welcome\">"+
          "<h2>Welcome User You Are Signed In</h2>"+
          "<input type=\"button\" value=\"return home\" onclick=window.location.href='index.jsp' />"+
          "</div>\n" + "</body>\n" + "</html>");
    out.println("<!doctype html>\n" +
            "<html>\n" +
            "<head>\n" +
            "  <meta charset=\"utf-8\">\n" +
            "  <title>Welcome User</title>\n" +
            "  <link rel=\"stylesheet\" href=\"style3.css\">\n" +
            "</head>\n" +
            "<body>\n" +
            "<div class=\"Welcome2\">"+
            "the logged user is : "+username+
            "</div>\n" + "</body>\n" + "</html>");
    }

}