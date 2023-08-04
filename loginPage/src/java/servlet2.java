import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class servlet2 extends HttpServlet
{
    public void init()
    { 
        System.out.println("INIT called");
    }
    public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
    {
       
        PrintWriter out= res.getWriter();
        out.println("welcome "+req.getParameter("d1"));
    }
    public void destroy()
    {
        System.out.println("destroy called");
    }
}