/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.37
 * Generated at: 2023-05-22 15:47:33 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cadastroCarro_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  <head>\r\n");
      out.write("    <html lang=\"pt-br\">\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\"\r\n");
      out.write("      integrity=\"sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi\" crossorigin=\"anonymous\">\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js\"\r\n");
      out.write("      integrity=\"sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3\"\r\n");
      out.write("      crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <link href=\"cadastroCarro.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"header.css\" rel=\"stylesheet\">\r\n");
      out.write("    <title>Document</title>\r\n");
      out.write("\r\n");
      out.write("  </head>\r\n");
      out.write("\r\n");
      out.write("  <body>\r\n");
      out.write("    <header>\r\n");
      out.write("      <div class=\"logo\">\r\n");
      out.write("        <img src=\"img/Logo da Melph.png\" width=\"140px\" alt=\"Logo da empresa\">\r\n");
      out.write("      </div>\r\n");
      out.write("      <nav>\r\n");
      out.write("        <ul>\r\n");
      out.write("          <li><a href=\"home.jsp\">Home</a></li>\r\n");
      out.write("          <li><a href=\"cadastroCarro.jsp\">Vender Carro</a></li>\r\n");
      out.write("          <li><a href=\"Anuncio.jsp\">Comprar Carro</a></li>\r\n");
      out.write("          <li><a href=\"sobre.html\">Sobre Nós</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </nav>\r\n");
      out.write("      <div class=\"user\">\r\n");
      out.write("        <a href=\"login.jsp\">Entrar</a>\r\n");
      out.write("        <a href=\"cadastroCliente.html\">Cadastrar-se</a>\r\n");
      out.write("      </div>\r\n");
      out.write("    </header>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("      <form action=\"/cadastro-carro\" method=\"post\" enctype=\"multipart/form-data\">\r\n");
      out.write("\r\n");
      out.write("        <label for=\"placa\">Placa:</label>\r\n");
      out.write("        <input type=\"text\" id=\"placa\" name=\"placa\" minlength=\"7\" maxlength=\"7\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.placa}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" required>\r\n");
      out.write("\r\n");
      out.write("        <label for=\"marca\">Marca/Modelo:</label>\r\n");
      out.write("        <input type=\"text\" id=\"marca\" name=\"marca\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.nomeCarro}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" placeholder=\"Modelo e Marca do seu carro\"\r\n");
      out.write("          required>\r\n");
      out.write("\r\n");
      out.write("        <label for=\"finalplaca\">Final da Placa:</label>\r\n");
      out.write("        <input type=\"text\" id=\"finalplaca\" name=\"finalplaca\" maxlength=\"1\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.finalPlaca}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" required>\r\n");
      out.write("\r\n");
      out.write("        <label for=\"ano\">Ano:</label>\r\n");
      out.write("        <input type=\"text\" id=\"ano\" name=\"ano\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.ano}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" required>\r\n");
      out.write("\r\n");
      out.write("        <label for=\"Km\">Quilometragem:</label>\r\n");
      out.write("        <input type=\"number\" id=\"km\" name=\"km\" maxlength=\"13\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.km}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" required>\r\n");
      out.write("\r\n");
      out.write("        <label for=\"valor\">Preço:</label>\r\n");
      out.write("        <input type=\"number\" id=\"valor\" step=\"0.01\" name=\"valor\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.valor}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" required>\r\n");
      out.write("\r\n");
      out.write("        <label for=\"transmissao\">Transmissão</label>\r\n");
      out.write("        <select id=\"transmissao\" name=\"transmissao\" required>\r\n");
      out.write("          <option value=\"\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.transmissao}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</option>\r\n");
      out.write("          <option value=\"automatico\">Automatico</option>\r\n");
      out.write("          <option value=\"manual\">Manual</option>\r\n");
      out.write("        </select>\r\n");
      out.write("\r\n");
      out.write("        <label for=\"acionamento\">Acionamento de rodas:</label>\r\n");
      out.write("        <select id=\"acionamento\" name=\"acionamento\" required>\r\n");
      out.write("          <option value=\"\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.acionamento}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</option>\r\n");
      out.write("          <option value=\"2X4\">2X4</option>\r\n");
      out.write("          <option value=\"4x4\">4X4</option>\r\n");
      out.write("        </select>\r\n");
      out.write("\r\n");
      out.write("        <label for=\"documento\">Os documentos do seu carro estão:</label>\r\n");
      out.write("        <select id=\"documento\" name=\"documento\" required>\r\n");
      out.write("          <option value=\"\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.documento}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</option>\r\n");
      out.write("          <option value=\"emdia\">Em Dia</option>\r\n");
      out.write("          <option value=\"Atrasado\">Atrasado</option>\r\n");
      out.write("        </select>\r\n");
      out.write("\r\n");
      out.write("        <label for=\"condicao\">Condição que seu carro se encontra?</label>\r\n");
      out.write("        <select id=\"condicao\" name=\"condicao\" required>\r\n");
      out.write("          <option value=\"\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.condicoes}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</option>\r\n");
      out.write("          <option value=\"novo\">Novo</option>\r\n");
      out.write("          <option value=\"usado\">Usado</option>\r\n");
      out.write("          <option value=\"regular\">Regular</option>\r\n");
      out.write("          <option value=\"danificado\">Danificado</option>\r\n");
      out.write("        </select>\r\n");
      out.write("\r\n");
      out.write("        <div>\r\n");
      out.write("          <label for=\"file\">Choose file</label>\r\n");
      out.write("          <input type=\"file\" name=\"file\" id=\"file\" accept=\"image/jpeg\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.imagem}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(">\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"local\">\r\n");
      out.write("          <h5>Localização</h5>\r\n");
      out.write("          <label for=\"estado\">Estado:</label>\r\n");
      out.write("          <input type=\"text\" id=\"estado\" name=\"estado\" maxlength=\"40\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.estado}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" required>\r\n");
      out.write("\r\n");
      out.write("          <section class=\"but\" id=\"but\">\r\n");
      out.write("            <button type=\"submit\" style=\"border-radius: 5px;\">Cadastrar</button>\r\n");
      out.write("          </section>\r\n");
      out.write("      </form>\r\n");
      out.write("    </div>\r\n");
      out.write("  </body>\r\n");
      out.write("\r\n");
      out.write("  </html>");
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