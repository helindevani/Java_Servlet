import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class servlet1 extends HttpServlet
{
    public void init()
    {
        System.out.println("INIT called");
    }
    public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
    {
        res.setContentType("text/html");
        PrintWriter out= res.getWriter();
        out.println("Hello ");
       
       
    }
    public void destroy()
    {
        System.out.println("destroy called");
    }
}