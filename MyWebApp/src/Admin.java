import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Admin extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username=request.getParameter("username");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
       // out.print("<href='index2.jsp'> Click here to add users </a>");
        out.println("<jsp:include page='index2.jsp' />");
        out.println("<!doctype html>\n" +
                "<html>\n" +
                "<head>\n" +
                "  <meta charset=\"utf-9\">\n" +
                "  <title>Welcome Admin</title>\n" +
                "  <link rel=\"stylesheet\" href=\"style4.css\">\n" +
                "</head>\n" +
                "<body>\n" +
                "<div class=\"Welcome3\">"+
                "<h2>Welcome Admin You Are Signed In</h2>"+
                "<input type=\"button\" value=\"edit users\" onclick=window.location.href='index2.jsp' />"+
                "</div>\n" + "</body>\n" + "</html>");
        out.println("<!doctype html>\n" +
                "<html>\n" +
                "<head>\n" +
                "  <meta charset=\"utf-10\">\n" +
                "  <title>Welcome Admin</title>\n" +
                "  <link rel=\"stylesheet\" href=\"style4.css\">\n" +
                "</head>\n" +
                "<body>\n" +
                "<div class=\"Welcome4\">"+
                "the Users are : "+Validate.map.keySet()+
                "\n the Admins are : "+Validate.map1.keySet()+
                "</div>\n" + "</body>\n" + "</html>");
    }

}