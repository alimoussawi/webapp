import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Register extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username=request.getParameter("username");
        String pass=request.getParameter("pass");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        Validate.map.put(username,pass);
        if (username!=""&&pass!="") {
            out.println("successfully added new user  :  " + username + " " + " users are " + Validate.map.toString());
            RequestDispatcher rs = request.getRequestDispatcher("index2.jsp");
            rs.include(request, response);
        }
else {
            out.println("please fill the required places");
            RequestDispatcher rs = request.getRequestDispatcher("index2.jsp");
            rs.include(request, response);
        }



    }
}