

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>

        <%@include file="/WEB-INF/jsp/estruturas/imports.jsp"%>

        <title>Cadastrar Produtos</title>
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
                            <form:form action="salvarProduto" commandName="Produtos" method="POST">
                                <div class="row justify-content-center">
                                    <h3 class="text-center text-info">Cadastrar Cliente</h3>
                                </div>
                                <hr class="colorgraph">
                                <div class="row">
                                    <div class="form-group">
                                        <div class="col-xs-12 col-sm-6 col-md-6">
                                            <form:input type="text" path="nomeProduto" name="nome" id="nome" class="form-control input-lg" placeholder="Nome" required="required"></form:input>
                                            </div>
                                            <div class="col-xs-12 col-sm-6 col-md-6">
                                                <form:input type="text" path="valorProduto" name="nome" id="nome" class="form-control input-lg" placeholder="Nome" required="required"></form:input>
                                            </div>
                                        </div>
                                    </div>
                                    <hr class="colorgraph">
                                    <div class="row justify-content-center">
                                        <div class="col-xs-12 col-md-6"><button type="submit" class="btn btn-success btn-block btn-lg">Cadastrar Produto</button></div>
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


