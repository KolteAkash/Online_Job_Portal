/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.28
 * Generated at: 2024-08-15 08:58:29 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class adminlogindoubt_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/spring-webmvc-6.1.0.jar", Long.valueOf(1723712203372L));
    _jspx_dependants.put("jar:file:/C:/Users/asus/OneDrive/Desktop/7m_Mentor_Project/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/sm1/WEB-INF/lib/spring-webmvc-6.1.0.jar!/META-INF/spring-form.tld", Long.valueOf(1723459762000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005fform_0026_005fmodelAttribute_005fmethod_005faction;

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
    _005fjspx_005ftagPool_005fform_005fform_0026_005fmodelAttribute_005fmethod_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fform_005fform_0026_005fmodelAttribute_005fmethod_005faction.release();
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<title>Admin Login | SB</title>\r\n");
      out.write("<!-- <link rel=\"icon\" type=\"image\" href=\"data:image/jpeg;base64,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\">  -->\r\n");
      out.write("<style>\r\n");
      out.write("body {\r\n");
      out.write("	font-family: Arial, sans-serif;\r\n");
      out.write("	margin: 0;\r\n");
      out.write("	padding: 0;\r\n");
      out.write("	background-color: #f2f2f2;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".container {\r\n");
      out.write("	max-width: 800px;\r\n");
      out.write("	margin: 50px auto;\r\n");
      out.write("	padding: 20px;\r\n");
      out.write("	background-color: #fff;\r\n");
      out.write("	border-radius: 8px;\r\n");
      out.write("	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\r\n");
      out.write("	text-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("h1 {\r\n");
      out.write("	color: #333;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("p {\r\n");
      out.write("	color: #666;\r\n");
      out.write("	margin-bottom: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("img {\r\n");
      out.write("	max-width: 100%;\r\n");
      out.write("	height: auto;\r\n");
      out.write("	margin-bottom: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("input[type=\"text\"], input[type=\"password\"] {\r\n");
      out.write("	width: 100%;\r\n");
      out.write("	padding: 10px;\r\n");
      out.write("	margin: 10px 0;\r\n");
      out.write("	border: 1px solid #ccc;\r\n");
      out.write("	border-radius: 5px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("button {\r\n");
      out.write("	padding: 10px 20px;\r\n");
      out.write("	background-color: #007bff;\r\n");
      out.write("	color: #fff;\r\n");
      out.write("	border: none;\r\n");
      out.write("	border-radius: 5px;\r\n");
      out.write("	cursor: pointer;\r\n");
      out.write("	transition: background-color 0.3s;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("button:hover {\r\n");
      out.write("	background-color: #0056b3;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("	<div class=\"container\">\r\n");
      out.write("		<h1>Welcome to Admin Panel of Studdy Buddy</h1>\r\n");
      out.write("		<!--  -->\r\n");
      out.write("		<p>Please Login to access the Admin dashboard.</p>\r\n");
      out.write("\r\n");
      out.write("		");

		String msg = request.getParameter("msg");
		if (msg != null) {
		
      out.write("\r\n");
      out.write("\r\n");
      out.write("		<div style=\"color: red\">");
      out.print(msg);
      out.write("</div>\r\n");
      out.write("		");

		}
		
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("		");
      if (_jspx_meth_form_005fform_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
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

  private boolean _jspx_meth_form_005fform_005f0(jakarta.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    jakarta.servlet.jsp.PageContext pageContext = _jspx_page_context;
    jakarta.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  form:form
    org.springframework.web.servlet.tags.form.FormTag _jspx_th_form_005fform_005f0 = (org.springframework.web.servlet.tags.form.FormTag) _005fjspx_005ftagPool_005fform_005fform_0026_005fmodelAttribute_005fmethod_005faction.get(org.springframework.web.servlet.tags.form.FormTag.class);
    boolean _jspx_th_form_005fform_005f0_reused = false;
    try {
      _jspx_th_form_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_form_005fform_005f0.setParent(null);
      // /WEB-INF/views/adminlogindoubt.jsp(90,2) name = modelAttribute type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005fform_005f0.setModelAttribute("loginBean");
      // /WEB-INF/views/adminlogindoubt.jsp(90,2) name = method type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005fform_005f0.setMethod("POST");
      // /WEB-INF/views/adminlogindoubt.jsp(90,2) name = action type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005fform_005f0.setAction("login");
      int[] _jspx_push_body_count_form_005fform_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_form_005fform_005f0 = _jspx_th_form_005fform_005f0.doStartTag();
        if (_jspx_eval_form_005fform_005f0 != jakarta.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("			<label>Email:</label>\r\n");
            out.write("			<input type=\"text\" name=\"userName\" placeholder=\"Email\" required>\r\n");
            out.write("\r\n");
            out.write("			<label>Password:</label>\r\n");
            out.write("			<input type=\"password\" name=\"password\" placeholder=\"Password\"\r\n");
            out.write("				required>\r\n");
            out.write("			<button type=\"submit\">Login</button>\r\n");
            out.write("		");
            int evalDoAfterBody = _jspx_th_form_005fform_005f0.doAfterBody();
            if (evalDoAfterBody != jakarta.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_form_005fform_005f0.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_form_005fform_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_form_005fform_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_form_005fform_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fform_005fform_0026_005fmodelAttribute_005fmethod_005faction.reuse(_jspx_th_form_005fform_005f0);
      _jspx_th_form_005fform_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_form_005fform_005f0, _jsp_getInstanceManager(), _jspx_th_form_005fform_005f0_reused);
    }
    return false;
  }
}
