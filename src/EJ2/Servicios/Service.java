/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJ2.Servicios;

import EJ2.Entidades.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author pikos
 */
public class Service {
   public Circunferencia CrearCircunferencia(){
       Scanner leer = new Scanner(System.in);
       System.out.println("Ingrese el Radio.");
       Circunferencia c1 = new Circunferencia(leer.nextDouble());
       return c1;
              
   }
    public void CrearArea(Circunferencia c1){
        double Area = Math.PI * Math.pow(c1.getRadio(), 2);
        
        System.out.println("El Área es:" + Area);
              
        
    }
public void CrearPerimetro(Circunferencia c1){
        double Perimetro = Math.PI * Math.pow(c1.getRadio(), 2);
        
        System.out.println("El Perimetro es:" + Perimetro);
}
}
