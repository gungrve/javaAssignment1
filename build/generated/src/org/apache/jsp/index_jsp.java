package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Conference Online Registration</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Conference Online Registration</h1>\n");
      out.write("        <h5>Conference Online Registration</h5>\n");
      out.write("        \n");
      out.write("        <form action=\"\">\n");
      out.write("            <pre>\n");
      out.write("                Full Name:*\n");
      out.write("                <input type=\"text\" name=\"fname\" placeholder=\"Firstname\">  <input type=\"text\" name=\"lname\" placeholder=\"Lastname\"><br><br>\n");
      out.write("                Area:*\n");
      out.write("                <select name=\"area\">\n");
      out.write("                    <option value=\"Kuala Lumpur\">Kuala Lumpur</option>\n");
      out.write("                    <option value=\"Johor\">Johor</option>\n");
      out.write("                    <option value=\"Kedah\">Kedah</option>\n");
      out.write("                    <option value=\"Sabah\">Sabah</option>\n");
      out.write("                    <option value=\"Sarawak\">Sarawak</option>\n");
      out.write("                </select><br>\n");
      out.write("                Address:*\n");
      out.write("                <input type=\"text\" name=\"addrL1\" placeholder=\"Address line 1\"><br>\n");
      out.write("                <input type=\"text\" name=\"addrL2\" placeholder=\"Address line 2\"><br>\n");
      out.write("                <input type=\"text\" name=\"addrCity\" placeholder=\"City\">  <input type=\"text\" name=\"addrState\" placeholder=\"State\"><br>\n");
      out.write("                <input type=\"text\" name=\"addrCode\" placeholder=\"Postal Code\">  Country: <select name=\"addrCountry\">\n");
      out.write("                    <option value=\"Malaysia\">Malaysia</option>\n");
      out.write("                    <option value=\"Singapore\">Singapore</option>\n");
      out.write("                    <option value=\"Brunei\">Brunei</option>\n");
      out.write("                    <option value=\"Indonesia\">Indonesia</option>\n");
      out.write("                </select>\n");
      out.write("                \n");
      out.write("                Email:*\n");
      out.write("                <input type=\"email\" name=\"email\" placeholder=\"ex: myname@example.com\">\n");
      out.write("\n");
      out.write("                Phone Number:*\n");
      out.write("                <input type=\"text\" name=\"phone\">\n");
      out.write("\n");
      out.write("                First time to attend this conference?*\n");
      out.write("                <select name=\"choice\">\n");
      out.write("                    <option value=\"Yes\">Yes</option>\n");
      out.write("                    <option value=\"No\">No</option>\n");
      out.write("                </select>\n");
      out.write("\n");
      out.write("                I will attend: *\n");
      out.write("                <input type=\"checkbox\" name=\"date1\" value=\"Date 1\">Date 1\n");
      out.write("                <input type=\"checkbox\" name=\"date2\" value=\"Date 2\">Date 2\n");
      out.write("                <input type=\"checkbox\" name=\"date3\" value=\"Date 3\">Date 3\n");
      out.write("\n");
      out.write("                What's your t-shirt size?\n");
      out.write("                <select name=\"size\">\n");
      out.write("                    <option value=\"s\">S</option>\n");
      out.write("                    <option value=\"m\">M</option>\n");
      out.write("                    <option value=\"l\">L</option>\n");
      out.write("                    <option value=\"xl\">XL</option>\n");
      out.write("                </select>\n");
      out.write("\n");
      out.write("                Registration fee:*\n");
      out.write("\n");
      out.write("                <input type=\"radio\" id=\"fee1\" name=\"regfee\" value=\"500\"><label for=\"fee1\">Conference Registration <b>500.00 MYR</b></label>\n");
      out.write("                <input type=\"radio\" id=\"fee1\" name=\"regfee\" value=\"500\"><label for=\"fee1\">Student Registration <b>300.00 MYR</b></label>\n");
      out.write("                \n");
      out.write("                <a href=\"calculate.jsp\">Calculate</a>\n");
      out.write("            </pre>\n");
      out.write("            \n");
      out.write("        </form>\n");
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
