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
            out.println("<span style=\"width:100px;margin-top:20px;color:black;font-size:60px;font-weight:bold;\">Successfully Added A New User</span>    " );

            RequestDispatcher rs = request.getRequestDispatcher("index2.jsp");
            rs.include(request, response);
        }
else {
            Validate.map.remove("","");
            out.println("<span style=\"width:500px;margin-bottom:15px;color:black;font-size:60px;font-weight:bold;\"> Username And Password Cannot be Empty</span>");
            RequestDispatcher rs = request.getRequestDispatcher("index2.jsp");
            rs.include(request, response);
        }



    }
}