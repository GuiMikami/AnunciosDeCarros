/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.37
 * Generated at: 2023-05-25 22:16:37 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

 String erro=(String) request.getAttribute("erro"); 
      out.write("\r\n");
      out.write("    \r\n");
      out.write("        <!DOCTYPE html>\r\n");
      out.write("        <html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("        <head>\r\n");
      out.write("            <meta charset=\"UTF-8\">\r\n");
      out.write("            <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("            <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("            <title>Página de Login</title>\r\n");
      out.write("            <link rel=\"stylesheet\" href=\"login.css\">\r\n");
      out.write("        </head>\r\n");
      out.write("\r\n");
      out.write("        <body>\r\n");
      out.write("\r\n");
      out.write("        ");

        if (session.getAttribute("cpfLogado") != null) {
            response.sendRedirect("/tela-perfil");
        }
        
      out.write("\r\n");
      out.write("            <div class=\"login\">\r\n");
      out.write("                <form action=\"/login\" method=\"post\">\r\n");
      out.write("                    <img src=\"img/Logo da Melph.png\" width=\"140px\" alt=\"\">\r\n");
      out.write("                    <h2>Seja bem vindo!</h2>\r\n");
      out.write("                    <h2>Faça seu login para iniciar a sessão</h2>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"box-user\">\r\n");
      out.write("                        <input type=\"text\" id=\"email\" name=\"email\" required>\r\n");
      out.write("                        <label>E-mail</label>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"box-user\">\r\n");
      out.write("                        <input type=\"password\" id=\"password\" name=\"password\" required>\r\n");
      out.write("                        <label>Senha</label>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"entrar\">\r\n");
      out.write("                        <input type=\"submit\" value=\"Entrar\">\r\n");
      out.write("                        <p>\r\n");
      out.write("                            ");
 if(erro!=null){ out.print(erro); }
      out.write("\r\n");
      out.write("                        </p>\r\n");
      out.write("                        <c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty requestScope.invalidPasswordMessage}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("                            <span id=\"invalid-password-message\"\r\n");
      out.write("                                style=\"color: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.invalidPasswordColor}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(';');
      out.write('"');
      out.write('>');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.invalidPasswordMessage}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</span>\r\n");
      out.write("                        </c:if>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"register\">\r\n");
      out.write("                        <p> Não possui uma conta? <a href=\"cadastroCliente.html\">Fazer Cadastro</a></p>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("        </body>\r\n");
      out.write("\r\n");
      out.write("        </html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
