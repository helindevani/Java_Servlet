import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class servlet1 extends HttpServlet
{
    public void init()
    {
        System.out.println("INIT called");
    }
    public void service(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
    {
        res.setContentType("text/html");
        PrintWriter out= res.getWriter();
        out.println("service method called");
        String msg="hi";
        out.println("<h1>"+msg+"<h1>");
    }
    public void destroy()
    {
        System.out.println("destroy called");
    }
}