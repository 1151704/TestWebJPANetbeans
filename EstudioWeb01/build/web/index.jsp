<%-- 
    Document   : index
    Created on : 18/06/2019, 05:02:47 PM
    Author     : OMAR_MONTES
--%>

<%@page import="util.Conexion"%>
<%@page import="controller.LibroJpaController"%>
<%@page import="model.Libro"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    LibroJpaController controlLibro = new LibroJpaController(Conexion.getEntityManager());
    List<Libro> lista = controlLibro.findLibroEntities();
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Libros</h1>

        <a href="registrarLibro.jsp">Registrar</a>
        <table>
            <thead>
                <tr>
                    <th>id</th>
                    <th>titulo</th>
                    <th>autor</th>
                    <th>paginas</th>
                    <th>año</th>
                    <th>Eliminar</th>
                </tr>
            </thead>
            <tbody>
                <% for (Libro l : lista) {%>
                <tr>
                    <td><%=l.getId()%></td>
                    <td><%=l.getTitulo()%></td>
                    <td><%=l.getAutor()%></td>
                    <td><%=l.getPaginas()%></td>
                    <td><%=l.getAnio()%></td>
                    <td><a href="LibroEliminar?id=<%=l.getId()%>">Eliminar</a></td>
                </tr>
                <% }%>
            </tbody>
        </table>
    </body>
</html>
