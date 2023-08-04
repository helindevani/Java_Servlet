import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class insretservlet extends HttpServlet
{
    public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
    {
        res.setContentType("text/html");
        PrintWriter out= res.getWriter();
       
        String username=req.getParameter("name");
        String password=req.getParameter("div");
        
       String url="jdbc:mysql://localhost:3306/student_db";
        try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection(url,"root","");
                if(con!=null)
                {
                    System.out.println("sucessfully connected");
                }
                String sql="insert into student values(?,?)";
                PreparedStatement pst;
                pst=con.prepareStatement(sql);
       
                pst.setString(1,username);
                pst.setString(2,password);
                int r=pst.executeUpdate();
                
                out.println("inserted");  
            } 
        catch (ClassNotFoundException ex) 
        {
            Logger.getLogger(insretservlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(insretservlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}