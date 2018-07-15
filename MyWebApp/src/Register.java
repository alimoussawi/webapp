import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
public class Register extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username=request.getParameter("username");
        String pass=request.getParameter("pass");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        Validate.map.put(username,pass);
        String sql1="INSERT INTO users values('"+username+"','"+pass+"')";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/app","student","student");
            Statement stmt=conn.createStatement();
            ResultSet rs2=stmt.getResultSet();
            if (username!=""&&pass!=""){
                RequestDispatcher rss=request.getRequestDispatcher("index2.jsp");
                rss.include(request,response);
                stmt.executeUpdate(sql1);
                out.println("<div align=\"center\">\n"+"<span style=\"width:50px;margin-top:20px;color:black;font-size:30px;font-weight:bold;\">Successfully Added A New User</span>"+"</div>" );

            }

            else {
                out.println("<span style=\"width:500px;margin-bottom:15px;color:black;font-size:60px;font-weight:bold;\"> Username And Password Cannot be Empty</span>");
                RequestDispatcher rss = request.getRequestDispatcher("index2.jsp");
                rss.include(request, response);
            }
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
       /* if (username!=""&&pass!="") {
            out.println("<div align=\"center\">\n"+"<span style=\"width:50px;margin-top:20px;color:black;font-size:30px;font-weight:bold;\">Successfully Added A New User</span>"+"</div>" );
            out.println("<div align=\"center\">\n"+"<div class=\"Admin2\">"+"<span style=\"width:500px;margin-top:20px;color:black;font-size:30px;font-weight:bold;\">All Users : </span> "+"<h2>"+Validate.map.keySet()+"</h2>"+"</div>\n");
            RequestDispatcher rs = request.getRequestDispatcher("index2.jsp");
            rs.include(request, response);
        }
else {
            Validate.map.remove("","");
            out.println("<span style=\"width:500px;margin-bottom:15px;color:black;font-size:60px;font-weight:bold;\"> Username And Password Cannot be Empty</span>");
            RequestDispatcher rs = request.getRequestDispatcher("index2.jsp");
            rs.include(request, response);
        }*/



    }
}