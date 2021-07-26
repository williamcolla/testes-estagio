<%-- 
    Document   : paginaInicial
    Created on : 23/07/2021, 22:15:57
    Author     : willi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <%@include file="/WEB-INF/jsp/estruturas/imports.jsp"%>
        <script src="<%=request.getContextPath()%>/resources/js/controle-inputs.js"></script>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Conversão Números Romanos X Decimais</title>
    </head>
    <body>
        <%@include file="/WEB-INF/jsp/estruturas/header.jsp"%>
        <div class="container">
            <br>
            <br>
            <div class="row justify-content-center">
                ${erro}
            </div>
            <div class="row justify-content-center" id="main">

                <div class="col-md-8 well" id="rightPanel">
                    <div class="row">
                        <div class="col-md-12">
                            <form name="formPaginaInicial" action="converterValores" id="formPaginaInicial" commandName="Valores" method="POST">
                                <hr class="colorgraph">
                                <div class="row justify-content-center">
                                    <div clas="col-xs-12 col-sm-6 col-md-6">
                                        <div class="form-group">
                                            <div class="box">
                                                <select id="escolha" path="escolha" name="escolha" class="form-control" required="required" data-tootle="tooltip">
                                                    <option value="0">-- Selecione qual você quer converter --</option>
                                                    <option value="true">Romanos</option>
                                                    <option value="false">Arábico</option>
                                                </select>
                                            </div>
                                        </div>                                
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-xs-12 col-sm-6 col-md-6">
                                        <div class="form-group">
                                            <input type="text" path="arabicos" name="arabicos" id="romanos" class="form-control input-lg" placeholder="Digite um número arábico"/>
                                        </div>
                                    </div>
                                    <div class="col-xs-12 col-sm-6 col-md-6">		
                                        <div class="form-group">
                                            <input type="text" path="romanos" name="romanos" id="arabicos" class="form-control input-lg" placeholder="Digite um número romano"/>
                                        </div>
                                    </div>
                                </div>
                                <div class="row justify-content-center">
                                    <p> Resultado = ${resultadoArabico}
                                        ${resultadoRomanos}</p>
                                </div>
                                <hr class="colorgraph">
                                <div class="row justify-content-center">
                                    <div class="col-xs-12 col-md-6"><button type="submit" class="btn btn-success btn-block btn-lg">Converter</button></div>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>      
        <br />
    </body>

    <%@include file="/WEB-INF/jsp/estruturas/footer.jsp" %>
</html>
