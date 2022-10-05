/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJ2;

import EJ2.Entidades.Circunferencia;
import EJ2.Servicios.Service;

/**
 *
 * @author pikos
 */
public class EJ2Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Service sc = new Service();
    Circunferencia ec = sc.CrearCircunferencia();
    sc.CrearArea(ec);
    sc.CrearPerimetro(ec);
    
    
    }
    
}
