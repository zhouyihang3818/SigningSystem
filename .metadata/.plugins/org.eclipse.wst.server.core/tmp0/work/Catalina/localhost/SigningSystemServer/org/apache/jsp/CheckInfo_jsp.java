/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.23
 * Generated at: 2018-05-01 08:38:40 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class CheckInfo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
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

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
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

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("    <!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("    <html>\r\n");
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("        <META content=\"IE=11.0000\" http-equiv=\"X-UA-Compatible\">\r\n");
      out.write("        <title>Staff Check Info Page</title>\r\n");
      out.write("        <LINK href=\"./lib/easyui.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("        <LINK href=\"./lib/icon.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("        <LINK href=\"./lib/demo.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("        <SCRIPT src=\"./lib/jquery-1.11.3.min.js\" type=\"text/javascript\"></SCRIPT>\r\n");
      out.write("        <SCRIPT src=\"./lib/jquery.easyui.min.js\" type=\"text/javascript\"></SCRIPT>\r\n");
      out.write("        <script>\r\n");
      out.write("            window.onload = function() {\r\n");
      out.write("                if (sessionStorage.id == null) {\r\n");
      out.write("                    window.location.href = \"http://localhost:5716/SigningSystemServer/Login.jsp\";\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("        </script>\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        <div>\r\n");
      out.write("            <div style=\"float:left\">\r\n");
      out.write("                <input type=\"date\" class=\"form-control\" id=\"date\" />\r\n");
      out.write("                <button type=\"button\" onclick=\"searchCheckInfo()\">查询</button>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div style=\"float:left\">\r\n");
      out.write("                <table id=\"checkTab\" border=\"1\">\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <th>ID</th>\r\n");
      out.write("                        <th>DATE</th>\r\n");
      out.write("                        <th>SIGN IN</th>\r\n");
      out.write("                        <th>SIGN OUT</th>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </table>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <script type=\"text/javascript\">\r\n");
      out.write("            function searchCheckInfo() {\r\n");
      out.write("                var dateTemp;\r\n");
      out.write("                var dateTemp = $(\"#date\").val();\r\n");
      out.write("                var dateArray = dateTemp.split(\"-\");\r\n");
      out.write("                var month = parseInt(dateArray[1]);\r\n");
      out.write("                var day = parseInt(dateArray[2]);\r\n");
      out.write("                var date = dateArray[0].concat(\"/\", month.toString(), \"/\", day.toString());\r\n");
      out.write("                console.log(\"date info:\" + date);\r\n");
      out.write("                var table = document.getElementById(\"checkTab\");\r\n");
      out.write("                var tableChilds = table.childNodes;\r\n");
      out.write("                for (var i = 2; i < tableChilds.length; i++) {\r\n");
      out.write("                    table.removeChild(tableChilds[i]);\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("                jQuery.ajax({\r\n");
      out.write("                    url: \"");
      out.print(request.getContextPath());
      out.write("/SearchServlet\", //这里是传入的 servlet  \r\n");
      out.write("                    type: \"post\",\r\n");
      out.write("                    data: {\r\n");
      out.write("                        \"date\": date\r\n");
      out.write("                    }, //这里是传进去的参数  \r\n");
      out.write("                    dataType: \"json\",\r\n");
      out.write("                    success: function(json) { //这个json是servlet川归来的 json   ， 并且接到json  \r\n");
      out.write("                        showCheckInfo(json); //将json传给 dataShow方法   \r\n");
      out.write("                    }\r\n");
      out.write("                });\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            function showCheckInfo(data) {\r\n");
      out.write("                var checkInfo = eval(data.checkInfo);\r\n");
      out.write("                if (checkInfo != undefined) {\r\n");
      out.write("                    console.log(\"checkInfo.length info:\" + checkInfo.length);\r\n");
      out.write("                    var table = document.getElementById(\"checkTab\");\r\n");
      out.write("                    if (checkInfo.length > 0) {\r\n");
      out.write("                        for (var i in checkInfo) {\r\n");
      out.write("                            console.log(\"i info:\" + i);\r\n");
      out.write("                            var rowInfo = checkInfo[i];\r\n");
      out.write("                            var tr = document.createElement(\"tr\");\r\n");
      out.write("                            var td = new Array();\r\n");
      out.write("                            for (var j = 0; j < 4; j++) {\r\n");
      out.write("                                td[j] = document.createElement(\"td\");\r\n");
      out.write("                            }\r\n");
      out.write("                            td[0].innerHTML = rowInfo.id;\r\n");
      out.write("                            td[1].innerHTML = rowInfo.date;\r\n");
      out.write("                            td[2].innerHTML = rowInfo.signin;\r\n");
      out.write("                            td[3].innerHTML = rowInfo.signout;\r\n");
      out.write("                            for (var j = 0; j < 4; j++) {\r\n");
      out.write("                                tr.appendChild(td[j]);\r\n");
      out.write("                            }\r\n");
      out.write("                            table.appendChild(tr);\r\n");
      out.write("                        }\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("        </script>\r\n");
      out.write("    </body>\r\n");
      out.write("\r\n");
      out.write("    </html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
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
