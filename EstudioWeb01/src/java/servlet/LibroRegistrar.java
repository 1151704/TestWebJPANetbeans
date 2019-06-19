/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import controller.LibroJpaController;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Libro;
import service.Service;
import util.Conexion;

/**
 *
 * @author OMAR_MONTES
 */
public class LibroRegistrar extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        req.setCharacterEncoding("UTF-8");
        
        String titulo = req.getParameter("titulo");
        String autor = req.getParameter("autor");
        String anio = req.getParameter("anio");
        String paginas = req.getParameter("paginas");
        
        try {
            
            LibroJpaController control = new LibroJpaController(Conexion.getEntityManager());
            
            Libro l = new Libro();
            l.setTitulo(titulo);
            l.setPaginas(Integer.parseInt(paginas));
            l.setAnio(Integer.parseInt(anio));
            l.setAutor(autor);
            
            control.create(l);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        resp.sendRedirect("index.jsp");
        
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.sendRedirect("index.jsp");
    }
 
    
    
}
