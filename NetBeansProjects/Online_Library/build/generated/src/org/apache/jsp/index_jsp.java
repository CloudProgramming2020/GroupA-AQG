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
      out.write("        <title>Books'House</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1> Objective:\n");
      out.write("Reading a book is a hobby of many people recently. Many of the authors have pen down many books. These books can be found of different genre.  And people love to read those books. But due to the lack of facilities, many of the people are not able to read the book of their choice. \n");
      out.write("The main objective of this program is to take the order of the people online and deliver at the door steps.\n");
      out.write("•\tPurpose:\n");
      out.write("For the project, I propose to build an online bookstore. The online bookstore will contain books of different Genre and be available to all the people. Many students find textbooks too expensive to buy at school bookstores and many courses only use the required textbooks a few days in a semester. This becomes very wasteful and frustrating for students. This online bookstore provides a solution to this. It will \n");
      out.write("provide a service in which students can rent books online and not have to buy them. There will be free shipping on-campus. There will also be options to buy new or used books. \n");
      out.write("Students do not need to register to buy new or used books from the site.\n");
      out.write("•\t\n");
      out.write("They do need to register with the site in order to rent books. Payment information will be requested and stored as part of registration so as to place a deposit on the rentals.\n");
      out.write("</h1>\n");
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
