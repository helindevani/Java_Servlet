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
       
        String username=req.getParameter("d1");
        String password=req.getParameter("d2");
       
        if(username.equals("admin")&&password.equals("admin"))
        {
            out.println("data valid");
            RequestDispatcher rd=req.getRequestDispatcher("servlet2");
            rd.forward(req,res);
        }
        else
        {
            out.println("data not valid ");
            RequestDispatcher rd=req.getRequestDispatcher("index.html");
            rd.include(req,res);
        }
    }
    public void destroy()
    {
        System.out.println("destroy called");
    }
}