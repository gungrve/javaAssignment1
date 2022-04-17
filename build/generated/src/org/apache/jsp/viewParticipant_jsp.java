package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;;

public final class viewParticipant_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>View Participant</title>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>View Participant</h1>\n");
      out.write("        ");

            
            String choice = request.getParameter("choice");
            
            if (choice == "all"){
                
                
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/conference?autoReconnect=true&useSSL=false", "root", "1234");
                    Statement stmt = con.createStatement();
                    ResultSet rs = stmt.executeQuery("select * from conference.registration");

                    
      out.write("\n");
      out.write("                    <table border=\"1\" align=\"center\" style=\"text-align: center\">\n");
      out.write("                        <tr>\n");
      out.write("                            <th>ID</th>\n");
      out.write("                            <th>Full name</th>\n");
      out.write("                            <th>Area</th>\n");
      out.write("                            <th>Address</th>\n");
      out.write("                            <th>City</th>\n");
      out.write("                            <th>State</th>\n");
      out.write("                            <th>Post Code</th>\n");
      out.write("                            <th>Country</th>\n");
      out.write("                            <th>Email</th>\n");
      out.write("                            <th>Phone Number</th>\n");
      out.write("                            <th>T-shirt Size</th>\n");
      out.write("                        </tr>\n");
      out.write("\n");
      out.write("                    ");


                    while(rs.next()){
                        String ID = rs.getString("id");
                        String FullName = rs.getString("first_name")+" "+rs.getString("last_name");
                        String Area = rs.getString("area");
                        String Addr = rs.getString("address");
                        String City = rs.getString("city");
                        String State = rs.getString("state");
                        String Code = rs.getString("post_code");
                        String Country = rs.getString("country");
                        String Email = rs.getString("email");
                        String Pnumber = rs.getString("phone_number");
                        String Size = rs.getString("tshirt_size");
                        
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td> ");
      out.print( ID );
      out.write(" </td>\n");
      out.write("                            <td> ");
      out.print( FullName );
      out.write(" </td>\n");
      out.write("                            <td> ");
      out.print( Area );
      out.write(" </td>\n");
      out.write("                            <td> ");
      out.print( Addr );
      out.write(" </td>\n");
      out.write("                            <td> ");
      out.print( City );
      out.write(" </td>\n");
      out.write("                            <td> ");
      out.print( State );
      out.write(" </td>\n");
      out.write("                            <td> ");
      out.print( Code );
      out.write(" </td>\n");
      out.write("                            <td> ");
      out.print( Country );
      out.write(" </td>\n");
      out.write("                            <td> ");
      out.print( Email );
      out.write(" </td>\n");
      out.write("                            <td> ");
      out.print( Pnumber );
      out.write(" </td>\n");
      out.write("                            <td> ");
      out.print( Size );
      out.write(" </td>\n");
      out.write("                        </tr>\n");
      out.write("                        ");

                    }
                    
      out.write("\n");
      out.write("                    </table>\n");
      out.write("                    ");


                    con.close();
                } catch (Exception e) {
                    out.print(e);
                }
            }else if(choice == "student"){
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/conference?autoReconnect=true&useSSL=false", "root", "1234");
                    Statement stmt = con.createStatement();
                    ResultSet rs = stmt.executeQuery("select * from conference.registration");

                    
      out.write("\n");
      out.write("                    <table border=\"1\" align=\"center\" style=\"text-align: center\">\n");
      out.write("                        <tr>\n");
      out.write("                            <th>ID</th>\n");
      out.write("                            <th>Full name</th>\n");
      out.write("                            <th>Area</th>\n");
      out.write("                            <th>Address</th>\n");
      out.write("                            <th>City</th>\n");
      out.write("                            <th>State</th>\n");
      out.write("                            <th>Post Code</th>\n");
      out.write("                            <th>Country</th>\n");
      out.write("                            <th>Email</th>\n");
      out.write("                            <th>Phone Number</th>\n");
      out.write("                            <th>T-shirt Size</th>\n");
      out.write("                        </tr>\n");
      out.write("\n");
      out.write("                    ");


                    while(rs.next()){
                        String ID = rs.getString("id");
                        String FullName = rs.getString("first_name")+" "+rs.getString("last_name");
                        String Area = rs.getString("area");
                        String Addr = rs.getString("address");
                        String City = rs.getString("city");
                        String State = rs.getString("state");
                        String Code = rs.getString("post_code");
                        String Country = rs.getString("country");
                        String Email = rs.getString("email");
                        String Pnumber = rs.getString("phone_number");
                        String Size = rs.getString("tshirt_size");
                        
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td> ");
      out.print( ID );
      out.write(" </td>\n");
      out.write("                            <td> ");
      out.print( FullName );
      out.write(" </td>\n");
      out.write("                            <td> ");
      out.print( Area );
      out.write(" </td>\n");
      out.write("                            <td> ");
      out.print( Addr );
      out.write(" </td>\n");
      out.write("                            <td> ");
      out.print( City );
      out.write(" </td>\n");
      out.write("                            <td> ");
      out.print( State );
      out.write(" </td>\n");
      out.write("                            <td> ");
      out.print( Code );
      out.write(" </td>\n");
      out.write("                            <td> ");
      out.print( Country );
      out.write(" </td>\n");
      out.write("                            <td> ");
      out.print( Email );
      out.write(" </td>\n");
      out.write("                            <td> ");
      out.print( Pnumber );
      out.write(" </td>\n");
      out.write("                            <td> ");
      out.print( Size );
      out.write(" </td>\n");
      out.write("                        </tr>\n");
      out.write("                        ");

                    }
                    
      out.write("\n");
      out.write("                    </table>\n");
      out.write("                    ");


                    con.close();
                } catch (Exception e) {
                    out.print(e);
                }
            }else if(choice == "normal"){
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/conference?autoReconnect=true&useSSL=false", "root", "1234");
                    Statement stmt = con.createStatement();
                    ResultSet rs = stmt.executeQuery("select * from conference.registration");

                    
      out.write("\n");
      out.write("                    <table border=\"1\" align=\"center\" style=\"text-align: center\">\n");
      out.write("                        <tr>\n");
      out.write("                            <th>ID</th>\n");
      out.write("                            <th>Full name</th>\n");
      out.write("                            <th>Area</th>\n");
      out.write("                            <th>Address</th>\n");
      out.write("                            <th>City</th>\n");
      out.write("                            <th>State</th>\n");
      out.write("                            <th>Post Code</th>\n");
      out.write("                            <th>Country</th>\n");
      out.write("                            <th>Email</th>\n");
      out.write("                            <th>Phone Number</th>\n");
      out.write("                            <th>T-shirt Size</th>\n");
      out.write("                        </tr>\n");
      out.write("\n");
      out.write("                    ");


                    while(rs.next()){
                        String ID = rs.getString("id");
                        String FullName = rs.getString("first_name")+" "+rs.getString("last_name");
                        String Area = rs.getString("area");
                        String Addr = rs.getString("address");
                        String City = rs.getString("city");
                        String State = rs.getString("state");
                        String Code = rs.getString("post_code");
                        String Country = rs.getString("country");
                        String Email = rs.getString("email");
                        String Pnumber = rs.getString("phone_number");
                        String Size = rs.getString("tshirt_size");
                        
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td> ");
      out.print( ID );
      out.write(" </td>\n");
      out.write("                            <td> ");
      out.print( FullName );
      out.write(" </td>\n");
      out.write("                            <td> ");
      out.print( Area );
      out.write(" </td>\n");
      out.write("                            <td> ");
      out.print( Addr );
      out.write(" </td>\n");
      out.write("                            <td> ");
      out.print( City );
      out.write(" </td>\n");
      out.write("                            <td> ");
      out.print( State );
      out.write(" </td>\n");
      out.write("                            <td> ");
      out.print( Code );
      out.write(" </td>\n");
      out.write("                            <td> ");
      out.print( Country );
      out.write(" </td>\n");
      out.write("                            <td> ");
      out.print( Email );
      out.write(" </td>\n");
      out.write("                            <td> ");
      out.print( Pnumber );
      out.write(" </td>\n");
      out.write("                            <td> ");
      out.print( Size );
      out.write(" </td>\n");
      out.write("                        </tr>\n");
      out.write("                        ");

                    }
                    
      out.write("\n");
      out.write("                    </table>\n");
      out.write("                    ");


                    con.close();
                } catch (Exception e) {
                    out.print(e);
                }
            }
        
      out.write("\n");
      out.write("        <br/> <a href=\"index.jsp\">Insert Data</a>\n");
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
