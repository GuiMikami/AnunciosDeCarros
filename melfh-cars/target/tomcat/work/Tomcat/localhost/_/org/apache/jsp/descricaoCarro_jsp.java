/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.37
 * Generated at: 2023-05-24 22:32:21 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class descricaoCarro_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("  <meta charset=\"UTF-8\">\r\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("  <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\"\r\n");
      out.write("    integrity=\"sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi\" crossorigin=\"anonymous\">\r\n");
      out.write("  <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js\"\r\n");
      out.write("    integrity=\"sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3\"\r\n");
      out.write("    crossorigin=\"anonymous\"></script>\r\n");
      out.write("  <link href=\"descricaocarro.css\" rel=\"stylesheet\">\r\n");
      out.write("  <link href=\"header.css\" rel=\"stylesheet\">\r\n");
      out.write("  <title>Descrição do Carro</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("     <header\r\n");
      out.write("        <div class=\"Logo\">\r\n");
      out.write("          <a href=\"home.jsp\"</a>\r\n");
      out.write("            <img src=\"img/Logo da Melph.png\" width=\"140px\" alt=\"Logo da empresa\">\r\n");
      out.write("            </div>\r\n");
      out.write("                <nav>\r\n");
      out.write("                    <ul>\r\n");
      out.write("                        <li><a href=\"home.jsp\">Home</a></li>\r\n");
      out.write("                        <li><a href=\"cadastroCarro.jsp\">Vender Carro</a></li>\r\n");
      out.write("                        <li><a href=\"Anuncio.jsp\">Comprar Carro</a></li>\r\n");
      out.write("                        <li><a href=\"sobre.html\">Sobre Nós</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </nav>\r\n");
      out.write("                <div class=\"user\">\r\n");
      out.write("                    <a href=\"login.jsp\">Entrar</a>\r\n");
      out.write("                    <a href=\"cadastroCliente.html\">Cadastrar-se</a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </header>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("  <div class=\"containerInfo\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("      <div class=\"imagem\">\r\n");
      out.write("          <img src=\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.descricao.fotoCarro}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(" \" alt=\"Foto do carro\">\r\n");
      out.write("        <div class=\"carInfo\">\r\n");
      out.write("            <h2 id=\"nome-car\">\r\n");
      out.write("        ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.descricao.nomeCarro}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("            </h2>\r\n");
      out.write("          <h3 id=\"valor-car\">R$ ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.descricao.valor}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</h3>\r\n");
      out.write("\r\n");
      out.write("          <div class=\"detalhes\">\r\n");
      out.write("              <span id=\"ano-car\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.descricao.ano}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(" - </span>\r\n");
      out.write("\r\n");
      out.write("              <span id=\"estado-car\"> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.descricao.estado}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(" - </span>\r\n");
      out.write("\r\n");
      out.write("              <span id=\"Km-car\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.descricao.km}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(" Km </span>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("            <button id=\"Chamar-no-Zap\" class=\"btn btn-outline-success\">\r\n");
      out.write("                Voltar para Página Inicial\r\n");
      out.write("            </button>\r\n");
      out.write("        <button id=\"Chamar-no-Zap\" class=\"btn btn-outline-success\">\r\n");
      out.write("          Chamar no zap\r\n");
      out.write("        </button>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"text-center\">\r\n");
      out.write("      <h1>Caracteristicas</h1>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <h3>Geral</h3>\r\n");
      out.write("    <ul class=\"descricao\">\r\n");
      out.write("      <li>Transmissão: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.descricao.transmissao}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("      </li>\r\n");
      out.write("      <li>Acionamento de Rodas: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.descricao.acionamento}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</li>\r\n");
      out.write("      <li>Final da Placa: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.descricao.finalPlaca}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</li>\r\n");
      out.write("    </ul>\r\n");
      out.write("    <ul class=\"descricao\">\r\n");
      out.write("      <li>N° de Portas: 4</li>\r\n");
      out.write("      <li>Documentação: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.descricao.documento}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</li>\r\n");
      out.write("      <li>Estado de Uso: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.descricao.condicoes}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</li>\r\n");
      out.write("    </ul>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
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
