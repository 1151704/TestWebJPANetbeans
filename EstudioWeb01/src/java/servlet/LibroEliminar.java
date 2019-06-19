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
import util.Conexion;

/**
 *
 * @author OMAR_MONTES
 */
public class LibroEliminar extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        String id = req.getParameter("id");
        
        try {
            
            int _id = Integer.parseInt(id);
            
            LibroJpaController control = new LibroJpaController(Conexion.getEntityManager());
            
            control.destroy(_id);
            
        } catch (Exception e) {
        }
        
        resp.sendRedirect("index.jsp");
        
    }
    
}
