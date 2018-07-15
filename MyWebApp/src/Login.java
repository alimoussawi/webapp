import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
public class Login extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String username = request.getParameter("username");
        String pass = request.getParameter("pass");
String sql1="select * from users where email='"+username+"'"+" and password='"+pass+"'";
String sql2="select * from admins where email='"+username+"'"+" and password='"+pass+"'";
       /* if(Validate.checkUser(username, pass)) {
            RequestDispatcher rs = request.getRequestDispatcher("Welcome");
            rs.forward(request, response);
        }
        else if (Validate.IsAdmin(username,pass)){
            RequestDispatcher rs = request.getRequestDispatcher("Admin");
            rs.forward(request, response);


        }*/
try {
    Class.forName("com.mysql.jdbc.Driver");
Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/app","student","student");
Statement stmt=conn.createStatement();
Statement stmt2=conn.createStatement();
ResultSet rs=stmt.executeQuery(sql1);
ResultSet rs2=stmt2.executeQuery((sql2));
if (rs.next()){
    RequestDispatcher rss=request.getRequestDispatcher("Welcome");
    rss.forward(request,response);
}
else if (rs2.next()){
    RequestDispatcher rss = request.getRequestDispatcher("Admin");
    rss.forward(request,response);
}
else {
        out.println("<div align=\"center\">"+"<span style=\"width:500px;margin-bottom:15px;color:blue;font-size:30px;font-weight:bold;\"> Username Or Password Incorrect </span> ");
        RequestDispatcher rss = request.getRequestDispatcher("index.jsp");
        rss.include(request, response);
    }
}
catch (Exception ex){
    ex.printStackTrace();
}


    }
}