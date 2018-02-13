import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Admin extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username=request.getParameter("username");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("Welcome  "+ username+" you are an admin");
        out.print("<form>\n"+
        "<input type=\"button\" value=\"Edit\" onclick=\"window.location.href='index2.jsp'\" />\n"+
        "</form>");
       // out.print("<href='index2.jsp'> Click here to add users </a>");
        out.println("<jsp:include page='index2.jsp' />");
        out.println("the admins are \n  "+Validate.map1.toString());
        out.println("the users are \n"+Validate.map.toString());

    }

}