import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class filter1 implements Filter{
    public void init(FilterConfig cf)
    {
        System.out.println("INIT called");
    }
    public void doFilter(ServletRequest req,ServletResponse res,FilterChain fch)throws IOException,ServletException
    {
        
        PrintWriter out= res.getWriter();
        out.println("Inside filter ");
        fch.doFilter(req, res);
        out.println("Back to filter ");
       
       
    }
    public void destroy()
    {
        System.out.println("destroy called");
    }

  
    
    
}
