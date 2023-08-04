import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class servlet1 extends HttpServlet
{
    
    public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
    {
        res.setContentType("text/html");
        PrintWriter out= res.getWriter();
        String unm=req.getParameter("usn");
        out.println("welcome" +unm);
        out.print("<a href='servlet2?uname="+unm+" '> visit </a>");
    }
}