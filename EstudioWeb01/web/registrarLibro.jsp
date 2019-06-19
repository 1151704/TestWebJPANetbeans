<%-- 
    Document   : registrarLibro
    Created on : 18/06/2019, 05:03:04 PM
    Author     : OMAR_MONTES
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Registrar Libro</h1>
        <form action="LibroRegistrar" method="post">
            
            <div>
                <label>Titulo</label>
                <input type="text" name="titulo" required autofocus>
            </div>
            <div>
                <label>Autor</label>
                <input type="text" name="autor" required >
            </div>
            <div>
                <label>Año</label>
                <input type="text" name="anio" required >
            </div>
            <div>
                <label># de paginas</label>
                <input type="number" name="paginas" required>
            </div>
            <input type="submit" value="Guardar">
        </form>
    </body>
</html>
