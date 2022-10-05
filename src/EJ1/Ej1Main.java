/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJ1;

import Servicios.servicioslibro;
import ejercicios.poo.Libro;

/**
 *
 * @author pikos
 */
public class Ej1Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        servicioslibro SL=new servicioslibro();
        Libro L1=SL.cargadatoslibro();
         
    }
    
}
