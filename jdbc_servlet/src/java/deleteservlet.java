import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class deleteservlet extends HttpServlet
{
    public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
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
                String sql="delete from student where name=?";
                PreparedStatement pst;
                pst=con.prepareStatement(sql);
       
                pst.setString(1,username);
                pst.executeUpdate();
                out.println("deleted");
          
          
        } 
        catch (ClassNotFoundException ex) 
        {
            Logger.getLogger(deleteservlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(deleteservlet.class.getName()).log(Level.SEVERE, null, ex);
        }
      
       
       
    }
}