/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import controller.LibroJpaController;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import model.Libro;
import service.Service;

/**
 *
 * @author OMAR_MONTES
 */
public class Main {

    public static void main(String[] args) {

        Service s = new Service();

        Libro l = s.guardarLibro("libro 2", "autor", 111, 1998);

        System.out.println("libro: " + l.getId());
    }

}
