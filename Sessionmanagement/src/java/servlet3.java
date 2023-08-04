import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class servlet3 extends HttpServlet
{
    
    public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
    {
        res.setContentType("text/html");
        PrintWriter out= res.getWriter();
        Cookie c=new Cookie("user","");
        c.setMaxAge(0);
        res.addCookie(c);
        out.println("Cookie deleted");
       
       
    }
   
}  