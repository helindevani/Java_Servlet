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
        Cookie c=new Cookie("user",unm);
        res.addCookie(c);
        out.println("Cookie added");
    }
}