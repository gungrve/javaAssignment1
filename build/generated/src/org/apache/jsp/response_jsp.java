package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;;

public final class response_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Data Inserted</title>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

        String fname=request.getParameter("fname");
        String lname=request.getParameter("lname");
        String area=request.getParameter("area");
        String addr1=request.getParameter("addrL1");
        String city=request.getParameter("addrCity");
        String state=request.getParameter("addrState");
        String pcode=request.getParameter("addrCode");
        String country=request.getParameter("addrCountry");
        String email=request.getParameter("email");
        String phone=request.getParameter("phone");
        String choice=request.getParameter("choice");
        String eventDate=request.getParameter("date");
        String size=request.getParameter("size");
        
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/conference?autoReconnect=true&useSSL=false", "root", "1234");
            Statement stmt = con.createStatement();
            stmt.executeUpdate("insert into conference.registration (first_name,last_name,area,address,city,state,post_code,country,email,phone_number,first_time,event_date,tshirt_size) values ('"+fname+"','"+lname+"',"
                    + "'"+area+"','"+addr1+"','"+city+"','"+state+"','"+pcode+"','"+country+"','"+email+"',"
                    + "'"+phone+"','"+choice+"','"+eventDate+"','"+size+"')");
            out.println("Data inserted");
            con.close();
            
        }catch(Exception e){
            out.print(e);
        }
        
        
      out.write("\n");
      out.write("        <br/><a href=\"index.jsp\">Back</a>\n");
      out.write("        <br/><a href=\"search.jsp\">Search tool</a>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
