/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.37
 * Generated at: 2023-05-22 19:45:26 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import br.com.melfhcars.model.Carro;

public final class Anuncio_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
 List<Carro> listaCars = (List<Carro>) request.getAttribute("cars");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\"\r\n");
      out.write("        integrity=\"sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi\" crossorigin=\"anonymous\">\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js\"\r\n");
      out.write("        integrity=\"sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3\"\r\n");
      out.write("        crossorigin=\"anonymous\"></script>\r\n");
      out.write("        \r\n");
      out.write("    <link href=\"Anuncio.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"header.css\" rel=\"stylesheet\">\r\n");
      out.write("    <title>Comprar Carros</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("    <div class=\"bg-dark\">\r\n");
      out.write("        <div class=\"logo titulo\">\r\n");
      out.write("            <header>\r\n");
      out.write("                <div class=\"logo\">\r\n");
      out.write("                    <img src=\"img/Logo da Melph.png\" width=\"140px\" alt=\"Logo da empresa\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <nav>\r\n");
      out.write("                    <ul>\r\n");
      out.write("                        <li><a href=\"home.jsp\" >Home</a></li>\r\n");
      out.write("                        <li><a href=\"cadastroCarro.jsp\" >Vender Carro</a></li>\r\n");
      out.write("                        <li><a href=\"Anuncio.jsp\" >Comprar Carro</a></li>\r\n");
      out.write("                        <li><a href=\"sobre.html\" >Sobre Nós</a></li>\r\n");
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
      out.write("<br>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("    <div class=\"container1\">\r\n");
      out.write("<div class=\"sidebar\">\r\n");
      out.write("    <form action=\"/Anuncio\" method=\"get\">\r\n");
      out.write("    <div class=\"flex-shrink-0 p-3\" style=\"width: 280px;\">\r\n");
      out.write("        <svg class=\"bi pe-none me-2\" width=\"30\" height=\"24\"><use xlink:href=\"#bootstrap\"/></svg>\r\n");
      out.write("        <div class=\"input-group\">\r\n");
      out.write("            <input type=\"text\" id=\"buscar\" name=\"buscar\" class=\"form-control\">\r\n");
      out.write("            <button type=\"submit\" class=\"btn btn-primary\">Pesquisar</button>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</form>\r\n");
      out.write("    <ul class=\"list-unstyled ps-0 bg-dark\">\r\n");
      out.write("        <li class=\"mb-1\">\r\n");
      out.write("            <button class=\"btn btn-toggle d-inline-flex align-items-center rounded border-0 collapsed\" data-bs-toggle=\"collapse\" data-bs-target=\"#home-collapse\" aria-expanded=\"true\">\r\n");
      out.write("                Marca\r\n");
      out.write("            </button>\r\n");
      out.write("            <div class=\"collapse show\" id=\"home-collapse\">\r\n");
      out.write("                <ul class=\"btn-toggle-nav list-unstyled fw-normal pb-1 small\">\r\n");
      out.write("                    <li class=\"link-item\"><a href=\"/Anuncio?buscar=Toyota\" class=\"link-body-emphasis d-inline-flex text-decoration-none rounded\">Toyota</a></li>\r\n");
      out.write("                    <li><a href=\"/Anuncio?buscar=Honda\" class=\"link-body-emphasis d-inline-flex text-decoration-none rounded\">Honda</a></li>\r\n");
      out.write("                    <li><a href=\"/Anuncio?buscar=Fiat\" class=\"link-body-emphasis d-inline-flex text-decoration-none rounded\">Fiat</a></li>\r\n");
      out.write("                    <li><a href=\"/Anuncio?buscar=Tesla\" class=\"link-body-emphasis d-inline-flex text-decoration-none rounded\">Tesla</a></li>\r\n");
      out.write("                    <li><a href=\"/Anuncio?buscar=Chevrolet\" class=\"link-body-emphasis d-inline-flex text-decoration-none rounded\">Chevrolet</a></li>\r\n");
      out.write("                    <li><a href=\"/Anuncio?buscar=Volkswagen\" class=\"link-body-emphasis d-inline-flex text-decoration-none rounded\">Volkswagen</a></li>\r\n");
      out.write("                    <li><a href=\"/Anuncio?buscar=Nissan\" class=\"link-body-emphasis d-inline-flex text-decoration-none rounded\">Nissan</a></li>\r\n");
      out.write("                    <li><a href=\"/Anuncio?buscar=Mercedes-Benz\" class=\"link-body-emphasis d-inline-flex text-decoration-none rounded\">Mercedes-Benz</a></li>\r\n");
      out.write("                    <li><a href=\"/Anuncio?buscar=Audi\" class=\"link-body-emphasis d-inline-flex text-decoration-none rounded\">Audi</a></li>\r\n");
      out.write("                    <li><a href=\"/Anuncio?buscar=BMW\" class=\"link-body-emphasis d-inline-flex text-decoration-none rounded\">BMW</a></li>\r\n");
      out.write("                    <li><a href=\"/Anuncio?buscar=Hyundai\" class=\"link-body-emphasis d-inline-flex text-decoration-none rounded\">Hyundai</a></li>\r\n");
      out.write("                    <li><a href=\"/Anuncio?buscar=Kia\" class=\"link-body-emphasis d-inline-flex text-decoration-none rounded\">Kia</a></li>\r\n");
      out.write("                    <li><a href=\"/Anuncio?buscar=Mazda\" class=\"link-body-emphasis d-inline-flex text-decoration-none rounded\">Mazda</a></li>\r\n");
      out.write("                    <li><a href=\"/Anuncio?buscar=Subaru\" class=\"link-body-emphasis d-inline-flex text-decoration-none rounded\">Subaru</a></li>\r\n");
      out.write("\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li class=\"mb-1\">\r\n");
      out.write("            <button class=\"btn btn-toggle d-inline-flex align-items-center rounded border-0 collapsed\" data-bs-toggle=\"collapse\" data-bs-target=\"#dashboard-collapse\" aria-expanded=\"false\">\r\n");
      out.write("                Ano\r\n");
      out.write("            </button>\r\n");
      out.write("            <div class=\"collapse\"  id=\"dashboard-collapse\">\r\n");
      out.write("                <ul class=\"btn-toggle-nav list-unstyled fw-normal pb-1 small\">\r\n");
      out.write("                    <li><a href=\"#\" class=\"link-body-emphasis d-inline-flex text-decoration-none rounded\">2023</a></li>\r\n");
      out.write("                    <li><a href=\"#\" class=\"link-body-emphasis d-inline-flex text-decoration-none rounded\">2022</a></li>\r\n");
      out.write("                    <li><a href=\"#\" class=\"link-body-emphasis d-inline-flex text-decoration-none rounded\">2021</a></li>\r\n");
      out.write("                    <li><a href=\"#\" class=\"link-body-emphasis d-inline-flex text-decoration-none rounded\">2020</a></li>\r\n");
      out.write("                   <li><a href=\"#\" class=\"link-body-emphasis d-inline-flex text-decoration-none rounded\">2019</a></li>\r\n");
      out.write("                   <li><a href=\"#\" class=\"link-body-emphasis d-inline-flex text-decoration-none rounded\">2018</a></li>\r\n");
      out.write("                   <li><a href=\"#\" class=\"link-body-emphasis d-inline-flex text-decoration-none rounded\">2017</a></li>\r\n");
      out.write("                   <li><a href=\"#\" class=\"link-body-emphasis d-inline-flex text-decoration-none rounded\">2016</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li class=\"mb-1\">\r\n");
      out.write("            <button class=\"btn btn-toggle d-inline-flex align-items-center rounded border-0 collapsed\" data-bs-toggle=\"collapse\" data-bs-target=\"#orders-collapse\" aria-expanded=\"false\">\r\n");
      out.write("                Orders\r\n");
      out.write("            </button>\r\n");
      out.write("            <div class=\"collapse\" id=\"orders-collapse\">\r\n");
      out.write("                <ul class=\"btn-toggle-nav list-unstyled fw-normal pb-1 small\">\r\n");
      out.write("                    <li><a href=\"#\" class=\"link-body-emphasis d-inline-flex text-decoration-none rounded\">New</a></li>\r\n");
      out.write("                    <li><a href=\"#\" class=\"link-body-emphasis d-inline-flex text-decoration-none rounded\">New</a></li>\r\n");
      out.write("                    <li><a href=\"#\" class=\"link-body-emphasis d-inline-flex text-decoration-none rounded\">Processed</a></li>\r\n");
      out.write("                    <li><a href=\"#\" class=\"link-body-emphasis d-inline-flex text-decoration-none rounded\">Shipped</a></li>\r\n");
      out.write("                    <li><a href=\"#\" class=\"link-body-emphasis d-inline-flex text-decoration-none rounded\">Returned</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("            <div class=\"conatiner-fluid d-flex flex-wrap \">\r\n");
      out.write("\r\n");
      out.write("                ");
 if (listaCars != null) { 
      out.write("\r\n");
      out.write("                   ");
 for (int i = 0; i < listaCars.size(); i++) { 
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <div class=\"card\" style=\"width: 18rem;\">\r\n");
      out.write("                    <img src= \"");
      out.print(listaCars.get(i).getFotoCarro());
      out.write("\" class=\"card-img-top\" alt=\"...\">\r\n");
      out.write("                    <div class=\"card-body\">\r\n");
      out.write("\r\n");
      out.write("                        <h5 class=\"card-title\">\r\n");
      out.write("                            ");
      out.print(listaCars.get(i).getNomeCarro());
      out.write("\r\n");
      out.write("                        </h5>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <ul class=\"list-group list-group-flush\">\r\n");
      out.write("                        <li class=\"list-group-item\">\r\n");
      out.write("                            <label>");
      out.print(listaCars.get(i).getAno());
      out.write("</label>\r\n");
      out.write("                            <label> - </label>\r\n");
      out.write("                            <label>");
      out.print(listaCars.get(i).getKm());
      out.write("Km</label>\r\n");
      out.write("                            <label> - </label>\r\n");
      out.write("                            <label>");
      out.print(listaCars.get(i).getEstado());
      out.write("</label>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                    <div class=\"card-body\">\r\n");
      out.write("                        <a href=\"/descricao-carro?placa=");
      out.print(listaCars.get(i).getPlaca());
      out.write("\" class=\"card-link\">R$ ");
      out.print(listaCars.get(i).getValor());
      out.write("</a>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                ");
 } 
      out.write("\r\n");
      out.write("               ");
 } else { 
      out.write("\r\n");
      out.write("                    ");
      if (true) {
        _jspx_page_context.forward("/Anuncio");
        return;
      }
      out.write("\r\n");
      out.write("               ");
 } 
      out.write("\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
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
