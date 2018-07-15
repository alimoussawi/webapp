import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Admin extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username=request.getParameter("username");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<jsp:include page='index2.jsp' />");
        RequestDispatcher rs=request.getRequestDispatcher("index4.jsp");
        rs.forward(request, response);
        out.println("<jsp:include page='index4.jsp' />");

    }

}