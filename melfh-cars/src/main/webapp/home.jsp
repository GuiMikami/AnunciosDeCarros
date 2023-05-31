<%@page import="java.util.List"%>
<%@page import="br.com.melfhcars.model.Carro"%>
<% List<Carro> listaCars = (List<Carro>) request.getAttribute("cars");%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<%@ page contentType="text/html; charset=UTF-8" %>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"
                integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3"
        crossorigin="anonymous"></script>
        <link href="home.css" rel="stylesheet">
        <title>Página Inicial</title>

    </head>
    <form>
        <body>
        <div class="container">
            <div class="">
                <div class="logo titulo">
                    <header
                        class="d-flex flex-wrap align-items-center justify-content-center justify-content-md-between py-3 mb-4 border-bottom">
                        <a href="/" class="d-flex align-items-center col-md-3 mb-2 mb-md-0 text-white text-decoration-none">
                            <img src="img/Logo da Melph.png" width="140px" alt="">
                        </a>

                        <ul class="nav col-12 col-md-auto mb-2 justify-content-center mb-md-0">
                            <li><a href="cadastroCarro.jsp" class="nav-link px-2 link-dark1">Vender carro</a>
                            <li><a href="Anuncio.jsp" class="nav-link px-2 link-dark1">Comprar carro </a></li>
                            <li><a href="sobre.html" class="nav-link px-2 link-dark1">Um pouco sobre nós</a></li>
                        </ul>

                        <div class="col-md-3 text-end">

                            <a href="login.jsp"> <button type="button" class="btn btn-outline-primary me-2">Entrar</button></a>
                             <a href="cadastroCliente.jsp"><button type="button" class="btn btn-primary">Cadastrar-se</button></a>

                        </div>
                    </header>

        <div id="carouselExampleCaptions" class="carousel slide">
            <div class="carousel-indicators">
                <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="0" class="active"
                        aria-current="true" aria-label="Slide 1"></button>
                <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="1"
                        aria-label="Slide 2"></button>
                <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="2"
                        aria-label="Slide 3"></button>
            </div>
            <div class="container">
                <div class="carousel-inner">
                    <div class="carousel-item active">
                        <img src="img/Ferrari.jpg" class="d-block w-100" alt="...">
                        <div class="carousel-caption d-none d-md-block">
                            <h5>Gosta de Carros Luxuosos ?</h5>
                            <p>Aqui você pode vender ou comprar seu carro de luxuoso</p>
                        </div>
                    </div>
                    <div class="carousel-item">
                        <img src="img/Fusca.jpg" class="d-block w-100" alt="...">
                        <div class="carousel-caption d-none d-md-block">
                            <h5>Está afim de reviver os velhos tempos?</h5>
                            <p>Que tal poder achar o seu fusca ?</p>
                        </div>
                    </div>
                    <div class="carousel-item">
                        <img src="img/Tesla.jpg" class="d-block w-100" alt="...">
                        <div class="carousel-caption d-none d-md-block">
                            <h5>Conhece Elon Musk!!!???</h5>
                            <p>Ta fabricando seu possivel carro!</p>
                        </div>
                    </div>
                </div>
            </div>
            <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide="prev">
                <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                <span class="visually-hidden">Previous</span>
            </button>
            <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide="next">
                <span class="carousel-control-next-icon" aria-hidden="true"></span>
                <span class="visually-hidden">Next</span>
            </button>


        </div>

                <div></div>
  <h1 style="color: #fff; text-align: center;"> Ultimos Lançamentos!!! 🔥🔥🔥</h1>
        <br><br>

        <div class="container">

            <div class="conatiner-fluid d-flex flex-wrap ">

                <% if (listaCars != null) { %>
                   <% for (int i = 0; i < listaCars.size(); i++) { %>
                <div class="card" style="width: 18rem;">
                    <img src= "<%=listaCars.get(i).getFotoCarro()%>" class="card-img-top" alt="...">
                    <div class="card-body">

                        <h5 class="card-title">
                            <%=listaCars.get(i).getNomeCarro()%>
                        </h5>

                    </div>
                    <ul class="list-group list-group-flush">
                        <li class="list-group-item">
                            <label><%=listaCars.get(i).getAno()%></label>
                            <label> - </label>
                            <label><%=listaCars.get(i).getKm()%>Km</label>
                            <label> - </label>
                            <label><%=listaCars.get(i).getEstado()%></label>
                        </li>
                    </ul>
                    <div class="card-body">
                        <a href="/descricao-carro?placa=<%=listaCars.get(i).getPlaca()%>" class="card-link">R$ <%=listaCars.get(i).getValor()%></a>

                    </div>
                </div>
                <% } %>
               <% } else { %>
                    <jsp:forward page="/mostrar-carro" />
               <% } %>



            </div>

        </div>


    </form>
</body>

</html>