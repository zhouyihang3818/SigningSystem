/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.23
 * Generated at: 2018-05-01 08:32:22 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.util.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("java.io");
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
      out.write("    \r\n");
      out.write("        <html>\r\n");
      out.write("\r\n");
      out.write("        <head>\r\n");
      out.write("            <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("            <title>考勤系统</title>\r\n");
      out.write("            <style type=\"text/css\">\r\n");
      out.write("                body {\r\n");
      out.write("                    font-size: 12px;\r\n");
      out.write("                    background-color: #ffffff\r\n");
      out.write("                }\r\n");
      out.write("                \r\n");
      out.write("                td {\r\n");
      out.write("                    font-size: 12px;\r\n");
      out.write("                }\r\n");
      out.write("                \r\n");
      out.write("                span {\r\n");
      out.write("                    font-size: 12px;\r\n");
      out.write("                }\r\n");
      out.write("                \r\n");
      out.write("                .outer_box {\r\n");
      out.write("                    position: absolute;\r\n");
      out.write("                    width: 428px;\r\n");
      out.write("                    height: 296px;\r\n");
      out.write("                    left: 50%;\r\n");
      out.write("                    top: 50%;\r\n");
      out.write("                    margin-left: -214px;\r\n");
      out.write("                    margin-top: -148px;\r\n");
      out.write("                }\r\n");
      out.write("                \r\n");
      out.write("                .prompt {\r\n");
      out.write("                    width: 428px;\r\n");
      out.write("                    height: 296px;\r\n");
      out.write("                    text-align: left;\r\n");
      out.write("                    display: block;\r\n");
      out.write("                    filter: progid: DXImageTransform.Microsoft.AlphaImageLoader(enabled=true, sizingMethod=scale, src=\"images/prompt_bg.png\" mce_src=\"images/prompt_bg.png\");\r\n");
      out.write("                    background: url(images/prompt_bg.png);\r\n");
      out.write("                    _background: none;\r\n");
      out.write("                    overflow: hidden;\r\n");
      out.write("                }\r\n");
      out.write("                \r\n");
      out.write("                .prompt h1 {\r\n");
      out.write("                    float: left;\r\n");
      out.write("                    font-size: 14px;\r\n");
      out.write("                    font-weight: bold;\r\n");
      out.write("                    text-align: left;\r\n");
      out.write("                    margin: 18px 0 0 20px;\r\n");
      out.write("                    color: #334f67;\r\n");
      out.write("                    display: inline;\r\n");
      out.write("                }\r\n");
      out.write("                \r\n");
      out.write("                .prompt .close {\r\n");
      out.write("                    position: relative;\r\n");
      out.write("                    float: right;\r\n");
      out.write("                    margin: 7px 18px 0 0;\r\n");
      out.write("                }\r\n");
      out.write("                \r\n");
      out.write("                .prompt h2 {\r\n");
      out.write("                    clear: both;\r\n");
      out.write("                    margin: 0 0 25px 28px;\r\n");
      out.write("                    line-height: 18px;\r\n");
      out.write("                    font-size: 13px;\r\n");
      out.write("                    font-weight: bold;\r\n");
      out.write("                    text-align: left;\r\n");
      out.write("                    color: #334f67;\r\n");
      out.write("                }\r\n");
      out.write("                \r\n");
      out.write("                .prompt h3 {\r\n");
      out.write("                    margin: 0px 0 6px 60px;\r\n");
      out.write("                    text-align: left;\r\n");
      out.write("                    font-size: 14px;\r\n");
      out.write("                }\r\n");
      out.write("                \r\n");
      out.write("                .prompt h3 .input_t {\r\n");
      out.write("                    position: relative;\r\n");
      out.write("                    border: #c4c7c8 1px solid;\r\n");
      out.write("                    width: 186px;\r\n");
      out.write("                    height: 20px;\r\n");
      out.write("                    line-height: 20px;\r\n");
      out.write("                }\r\n");
      out.write("                \r\n");
      out.write("                .prompt h4 {\r\n");
      out.write("                    margin: 0 0 10px 80px;\r\n");
      out.write("                    font-size: 12px;\r\n");
      out.write("                }\r\n");
      out.write("                \r\n");
      out.write("                .prompt .ts5 {\r\n");
      out.write("                    float: left;\r\n");
      out.write("                    border: 1px solid #000;\r\n");
      out.write("                    margin: -27px 0px 0 230px;\r\n");
      out.write("                    height: 20px;\r\n");
      out.write("                    line-height: 20px;\r\n");
      out.write("                    background: #fffce9;\r\n");
      out.write("                    border: 1px solid #edddab;\r\n");
      out.write("                    padding: 0 5px;\r\n");
      out.write("                    color: #c0880f;\r\n");
      out.write("                    display: inline;\r\n");
      out.write("                }\r\n");
      out.write("                \r\n");
      out.write("                .prompt h4 .input_c {\r\n");
      out.write("                    position: relative;\r\n");
      out.write("                }\r\n");
      out.write("                \r\n");
      out.write("                .prompt h4 span {\r\n");
      out.write("                    float: left;\r\n");
      out.write("                    margin-left: 5px;\r\n");
      out.write("                    height: 30px;\r\n");
      out.write("                    line-height: 30px;\r\n");
      out.write("                }\r\n");
      out.write("                \r\n");
      out.write("                .prompt h4 span a:link {\r\n");
      out.write("                    position: relative;\r\n");
      out.write("                    color: #fd6c01;\r\n");
      out.write("                    text-decoration: underline;\r\n");
      out.write("                }\r\n");
      out.write("                \r\n");
      out.write("                .prompt h4 span a:visited {\r\n");
      out.write("                    position: relative;\r\n");
      out.write("                    color: #fd6c01;\r\n");
      out.write("                    text-decoration: underline;\r\n");
      out.write("                }\r\n");
      out.write("                \r\n");
      out.write("                .prompt h4 .bottom {\r\n");
      out.write("                    position: relative;\r\n");
      out.write("                    float: left;\r\n");
      out.write("                    margin-left: 4px;\r\n");
      out.write("                    width: 88px;\r\n");
      out.write("                    height: 30px;\r\n");
      out.write("                    background: url(images/bottom.gif) no-repeat;\r\n");
      out.write("                    border: none;\r\n");
      out.write("                    cursor: pointer;\r\n");
      out.write("                    font-size: 14px;\r\n");
      out.write("                    font-weight: bold;\r\n");
      out.write("                    color: #fff;\r\n");
      out.write("                }\r\n");
      out.write("            </style>\r\n");
      out.write("            <script type=\"text/javascript\" src=\"./lib/md5.js\"></script>\r\n");
      out.write("            <script src=\"./lib/jquery.min.js\"></script>\r\n");
      out.write("        </head>\r\n");
      out.write("\r\n");
      out.write("        <body>\r\n");
      out.write("            <table>\r\n");
      out.write("                <div id=\"loginattach\" style=\"position: absolute; width: 428px; height: 296px; left: 739px; top: 148px; z-index: 10002;\">\r\n");
      out.write("                    <div class=\"prompt\">\r\n");
      out.write("                        <h1>用户登录</h1><span class=\"close\"><img src=\"images/close.gif\" onclick=\"do_close()\"></span>\r\n");
      out.write("                        <h2><br>感谢使用管理员考勤系统，请登录：</h2>\r\n");
      out.write("                        <h3>账　号：<input name=\"id\" id=\"id\" type=\"text\" class=\"input_t\" onmouseover=\"this.style.borderColor='#7dbde2'\" onmouseout=\"this.style.borderColor='#c4c7c8'\" onclick=\"this.value='';this.focus();\" style=\"border-color: rgb(196, 199, 200);\"></h3>\r\n");
      out.write("                        <h3>密　码：<input name=\"password\" id=\"password\" type=\"password\" class=\"input_t\" onmouseover=\"this.style.borderColor='#7dbde2'\" onmouseout=\"this.style.borderColor='#c4c7c8'\" onclick=\"this.value='';this.focus();\" style=\"border-color: rgb(196, 199, 200);\"></h3>\r\n");
      out.write("                        <h4><input type=\"button\" name=\"login\" value=\"登录\" class=\"bottom\" onclick=\"Login()\"><input type=\"button\" name=\"register\" value=\"注册\" class=\"bottom\" onclick=\"Register()\"></h4>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </table>\r\n");
      out.write("\r\n");
      out.write("            <script type=\"text/javascript\">\r\n");
      out.write("                function Login() {\r\n");
      out.write("                    var id = document.getElementById(\"id\").value;\r\n");
      out.write("                    var password = document.getElementById(\"password\").value;\r\n");
      out.write("                    jQuery.ajax({\r\n");
      out.write("                        url: \"");
      out.print(request.getContextPath());
      out.write("/LoginServlet\", //这里是传入的 servlet  \r\n");
      out.write("                        type: \"post\",\r\n");
      out.write("                        data: {\r\n");
      out.write("                            \"id\": id,\r\n");
      out.write("                            \"password\": password,\r\n");
      out.write("                            \"usertype\": \"manager\"\r\n");
      out.write("                        }, //这里是传进去的参数  \r\n");
      out.write("                        dataType: \"text\",\r\n");
      out.write("                        success: function(data) {\r\n");
      out.write("                            if (data == \"SUCCEEDED\")\r\n");
      out.write("                                sessionStorage.id = id;\r\n");
      out.write("                            window.location.href = \"http://localhost:5716/SigningSystemServer/Main.jsp\";\r\n");
      out.write("                        }\r\n");
      out.write("                    });\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("                function Register() {\r\n");
      out.write("                    // 重定向到新地址\r\n");
      out.write("                    window.location.href = \"http://localhost:5716/SigningSystemServer/Register.jsp\";\r\n");
      out.write("                }\r\n");
      out.write("            </script>\r\n");
      out.write("        </body>\r\n");
      out.write("\r\n");
      out.write("        </html>");
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
