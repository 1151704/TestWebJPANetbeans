<%-- 
    Document   : listar
    Created on : 18/06/2019, 06:39:04 PM
    Author     : OMAR_MONTES
--%>

<%@page import="dao.Conexion"%>
<%@page import="dao.LibroJpaController"%>
<%@page import="dto.Libro"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    LibroJpaController control = new LibroJpaController(Conexion.getEntityManager());
    List<Libro> libros = control.findLibroEntities();

%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Lista de libros!</h1>


        <table border="1">

            <thead>
                <tr>
                    <th>titulo</th>
                    <th>Autor</th>
                    <td>Eliminar</td>
                </tr>
            </thead>
            <tbody>
                <% if (libros != null && !libros.isEmpty()) { %>
                <% for (Libro l : libros) {%>
                <tr>
                    <td><%=l.getTitulo()%></td>
                    <td><%=l.getAutor()%></td>
                    <td>
                        <a href="EliminarLibro?id=<%=l.getId()%>">Eliminar</a>
                    </td>
                </tr>
                <% } %>
                <% } else {%>
                <tr>
                    <td colspan="3">No exiten libros</td>
                </tr>
                <% }%>
            </tbody>
        </table>
    </body>
</html>
