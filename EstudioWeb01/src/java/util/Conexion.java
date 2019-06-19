/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author OMAR_MONTES
 */
public class Conexion {

    public static EntityManagerFactory getEntityManager() {
        try {
            return Persistence.createEntityManagerFactory("EstudioWeb01PU");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
