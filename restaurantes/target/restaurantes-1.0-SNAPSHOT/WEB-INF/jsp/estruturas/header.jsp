
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!------ Include the above in your HEAD tag ---------->



<!--div class="span4 offset2" style="margin-top:15px;">
<!--button class="btn pull-right" type="button">Login</button> -->
<!--a class="btn pull-right" type="button" href="login">Login</a>
<a class="btn pull-left" type="button" href="cadastrar">Cadastrar</a>
<!--input class="btn pull-right" type="button" onclick="window.open('/WEB-INF/jsp/loguin.jsp')" value="Login" -->
<!--/div-->


<!-- Navigation -->
<div class="fixed-top">
    <header class="topbar">
        <div class="container">
            <div class="row">
                <!-- social icon-->
                <div class="col-sm-12">
                    <ul class="social-network">
                        <li><a class="waves-effect waves-dark" href="https://pt-br.facebook.com/" target="_blank"><i class="fa fa-facebook"></i></a></li>
                        <li><a class="waves-effect waves-dark" href="https://twitter.com/login?lang=pt" target="_blank"><i class="fa fa-twitter"></i></a></li>
                        <li><a class="waves-effect waves-dark" href="https://br.linkedin.com/" target="_blank"><i class="fa fa-linkedin"></i></a></li>
                        <li><a class="waves-effect waves-dark" href="https://br.pinterest.com/" target="_blank"><i class="fa fa-pinterest"></i></a></li>
                    </ul>
                </div>               
            </div>
        </div>
    </header>
    <nav class="navbar navbar-expand-lg navbar-dark mx-background-top-linear">
        <div class="container col-md-12">
            <a class="navbar-brand" href="paginaInicial">Conta Restaurante</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarResponsive">

                <ul class="navbar-nav ml-auto">

                    <li class="nav-item active">
                        <a class="nav-link" href="paginaInicial">Página Inicial
                            <span class="sr-only">(current)</span>
                        </a>
                    </li>
                        <li class="nav-item">
                            <a class="nav-link" href="/restaurantes/cadastrar-cliente">Cadastrar</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="/restaurantes/cadastrar-produtos">Cadastrar</a>
                        </li>
                </ul>
            </div>
        </div>
    </nav>
</div> 


