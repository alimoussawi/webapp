import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Login extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        String username = request.getParameter("username");
        String pass = request.getParameter("pass");


        if(Validate.checkUser(username, pass)) {
            RequestDispatcher rs = request.getRequestDispatcher("Welcome");
            rs.forward(request, response);
        }
        else if (Validate.IsAdmin(username,pass)){
            RequestDispatcher rs = request.getRequestDispatcher("Admin");
            rs.forward(request, response);


        }
        else {
            out.println("<div align=\"center\">"+"<span style=\"width:500px;margin-bottom:15px;color:blue;font-size:30px;font-weight:bold;\"> Username Or Password Incorrect </span> ");
            RequestDispatcher rs = request.getRequestDispatcher("index.jsp");
            rs.include(request, response);
        }

    }
}