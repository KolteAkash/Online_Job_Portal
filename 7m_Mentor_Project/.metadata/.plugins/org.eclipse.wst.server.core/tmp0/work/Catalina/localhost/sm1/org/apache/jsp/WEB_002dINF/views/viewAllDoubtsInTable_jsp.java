/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.28
 * Generated at: 2024-08-15 08:59:17 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import entities.QuestionPostEntity;
import entities.AllCourses;
import java.util.List;

public final class viewAllDoubtsInTable_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = new java.util.LinkedHashSet<>(4);
    _jspx_imports_classes.add("entities.AllCourses");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("entities.QuestionPostEntity");
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html lang=\"en\">\r\n");

List<QuestionPostEntity> list = (List<QuestionPostEntity>) request.getAttribute("alldoubts");
String message = (String) request.getAttribute("msg");

String messages = (String) session.getAttribute("adminMsg");
if (messages == null) {

      if (true) {
        _jspx_page_context.forward("adminlogindoubt.jsp");
        return;
      }
      out.write('\r');
      out.write('\n');

}

      out.write("\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<title>Question Details</title>\r\n");
      out.write("<style>\r\n");
      out.write("table {\r\n");
      out.write("	width: 100%;\r\n");
      out.write("	border-collapse: collapse;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("th, td {\r\n");
      out.write("	padding: 10px;\r\n");
      out.write("	text-align: left;\r\n");
      out.write("	border-bottom: 1px solid #ddd;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("th {\r\n");
      out.write("	background-color: #f2f2f2;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("tr:hover {\r\n");
      out.write("	background-color: #f5f5f5;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".btn-container {\r\n");
      out.write("	text-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".btn {\r\n");
      out.write("	padding: 5px 10px;\r\n");
      out.write("	border: none;\r\n");
      out.write("	cursor: pointer;\r\n");
      out.write("	border-radius: 5px;\r\n");
      out.write("	text-decoration: none;\r\n");
      out.write("	color: #fff;\r\n");
      out.write("	display: inline-block;\r\n");
      out.write("	margin: 5px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".btn-edit {\r\n");
      out.write("	background-color: #007bff;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".btn-add-solution {\r\n");
      out.write("	background-color: #28a745;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("@media only screen and (max-width: 768px) {\r\n");
      out.write("	.btn-container {\r\n");
      out.write("		text-align: left;\r\n");
      out.write("	}\r\n");
      out.write("	.btn {\r\n");
      out.write("		display: block;\r\n");
      out.write("		margin-bottom: 5px;\r\n");
      out.write("	}\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<h2 style=\"color: blue;\">Admin Panel doubts dashboard</h2>\r\n");
      out.write("	");

	String msg = (String) session.getAttribute("status");
	
      out.write("\r\n");
      out.write("\r\n");
      out.write("	");

	if (message != null) {
	
      out.write("\r\n");
      out.write("	<h2 style=\"color: red;\">");
      out.print(msg);
      out.write("</h2>\r\n");
      out.write("\r\n");
      out.write("	");

	}
	
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<table>\r\n");
      out.write("		<tr>\r\n");
      out.write("			<th>ID</th>\r\n");
      out.write("			<th>Title</th>\r\n");
      out.write("			<th>Problem Detail</th>\r\n");
      out.write("			<th>Expecting</th>\r\n");
      out.write("			<th>Tags</th>\r\n");
      out.write("			<th>Solution</th>\r\n");
      out.write("			<th>Created At</th>\r\n");
      out.write("			<th>Likes</th>\r\n");
      out.write("			<th>Dislikes</th>\r\n");
      out.write("			<th>Actions</th>\r\n");
      out.write("			<!-- New column for buttons -->\r\n");
      out.write("		</tr>\r\n");
      out.write("		<!-- Sample data row, replace with actual data from database -->\r\n");
      out.write("		");

		for (QuestionPostEntity qpe : list) {
		
      out.write("\r\n");
      out.write("		<tr>\r\n");
      out.write("			<td>");
      out.print(qpe.getId());
      out.write("</td>\r\n");
      out.write("			<td>");
      out.print(qpe.getTitle());
      out.write("</td>\r\n");
      out.write("			<td>");
      out.print(qpe.getDetails());
      out.write("</td>\r\n");
      out.write("			<td>");
      out.print(qpe.getExpectation());
      out.write("</td>\r\n");
      out.write("			<td>");
      out.print(qpe.getTags());
      out.write("</td>\r\n");
      out.write("			<td>");
      out.print(qpe.getSolution());
      out.write("</td>\r\n");
      out.write("			<td>");
      out.print(qpe.getCretaedAt());
      out.write("</td>\r\n");
      out.write("			<td>");
      out.print(qpe.getLikeSolution());
      out.write("</td>\r\n");
      out.write("			<td>");
      out.print(qpe.getDisLikeSolution());
      out.write("</td>\r\n");
      out.write("			<td class=\"btn-container\">\r\n");
      out.write("				");

				if (qpe.getSolution() == null) {
				
      out.write(" <a\r\n");
      out.write("				href=\"admin-add-solution-doubts/");
      out.print(qpe.getId());
      out.write("\"\r\n");
      out.write("				class=\"btn btn-edit\">Add Solution</a> ");

 }
 
      out.write(" <a\r\n");
      out.write("				href=\"admin-add-solution-doubts/");
      out.print(qpe.getId());
      out.write("\"\r\n");
      out.write("				class=\"btn btn-edit\">Edit</a> <a\r\n");
      out.write("				href=\"delete-doubt/");
      out.print(qpe.getId());
      out.write("\" class=\"btn btn-edit\">Delete</a>\r\n");
      out.write("\r\n");
      out.write("			</td>\r\n");
      out.write("		</tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("		");

		}
		
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("		<!-- Additional rows here -->\r\n");
      out.write("	</table>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
