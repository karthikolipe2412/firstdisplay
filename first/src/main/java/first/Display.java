package first;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
@WebServlet("/dis")
public class Display implements Servlet{
	public void init(ServletConfig scf) throws ServletException
	{
		
	}
	public void service(ServletRequest req,ServletResponse res) throws ServletException,IOException
	{
		String uName=req.getParameter("uname");
		String mId=req.getParameter("mid");
		String city=req.getParameter("city");
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		pw.println("=======Details======<br>");
		pw.println("Username:"+uName+"<br>");
		pw.println("Mail id:"+mId+"<br>");
		pw.println("city:"+city+"<br>");
	}
	public void destroy() {
		
	}
	public String getServletInfo() {
		return "";
	}
	public ServletConfig getServletConfig() {
		return this.getServletConfig();
	}
}
