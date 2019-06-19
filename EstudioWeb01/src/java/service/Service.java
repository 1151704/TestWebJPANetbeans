/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import controller.LibroJpaController;
import java.util.List;
import model.Libro;
import util.Conexion;

/**
 *
 * @author OMAR_MONTES
 */
public class Service {

    public List<Libro> listaLibros() {
        LibroJpaController control = new LibroJpaController(Conexion.getEntityManager());

        return control.findLibroEntities();
    }

    public Libro guardarLibro(String titulo, String autor, int paginas, int anio) {

        LibroJpaController control = new LibroJpaController(Conexion.getEntityManager());

        Libro l = new Libro();
        l.setTitulo(titulo);
        l.setPaginas(paginas);
        l.setAnio(anio);
        l.setAutor(autor);

        control.create(l);

        return l;
    }

}
