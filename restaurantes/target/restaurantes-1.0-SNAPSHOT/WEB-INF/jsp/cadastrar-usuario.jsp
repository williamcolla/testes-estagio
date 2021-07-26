

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>

        <%@include file="/WEB-INF/jsp/estruturas/imports.jsp"%>


        <title>Cadastrar Clientes</title>
    </head>
    <body>
        <%@include file="/WEB-INF/jsp/estruturas/header.jsp"%>

        <div class="container">
            <br>
            <br>
            <div class="row justify-content-center">
                ${erro}
                ${status}
            </div>
            <div class="row justify-content-center" id="main">

                <div class="col-md-8 well" id="rightPanel">
                    <div class="row">
                        <div class="col-md-12">
                            <form:form action="salvarCliente" commandName="Clientes" method="POST">
                                <div class="row justify-content-center">
                                    <h3 class="text-center text-info">Cadastrar Cliente</h3>
                                </div>
                                <hr class="colorgraph">
                                <div class="form-group">
                                    <form:input type="text" path="nomeCliente" name="nome" id="nome" class="form-control input-lg" placeholder="Nome" required="required"></form:input>
                                </div>
                                <hr class="colorgraph">
                                <div class="row justify-content-center">
                                    <div class="col-xs-12 col-md-6"><button type="submit" class="btn btn-success btn-block btn-lg">Cadastrar</button></div>
                                </div>
                            </form:form>
                        </div>
                    </div>
                </div>
            </div>
        </div>      
        <br />
        <%@include file="/WEB-INF/jsp/estruturas/footer.jsp"%> 
    </body>

</html>


