import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class servlet4 extends HttpServlet
{
   
    public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
    {
        res.setContentType("text/html");
        PrintWriter out= res.getWriter();
        String msg;
        ServletContext cf=getServletContext();
        msg=cf.getInitParameter("User");
        out.println(msg);
    }
   
}