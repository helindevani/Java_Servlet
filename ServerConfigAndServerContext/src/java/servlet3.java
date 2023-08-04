import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class servlet3 extends HttpServlet
{
   
    public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
    {
        res.setContentType("text/html");
        PrintWriter out= res.getWriter();
        String msg;
//        ServletConfig cf=getServletConfig();
        ServletContext cf=getServletContext();
        msg=cf.getInitParameter("User");
        out.println(msg);
    }
   
}