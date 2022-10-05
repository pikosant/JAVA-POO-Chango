/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import ejercicios.poo.Libro;
import java.util.Scanner;

/**
 *
 * @author pikos
 */
public class servicioslibro {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Libro cargadatoslibro(){
        
        Libro a1 = new Libro();
        System.out.println(" Ingrese el nombre del autor ");
        a1.setAutor(leer.next());
        System.out.println(" Ingrese el ISBN ");
        a1.setISBN(leer.nextInt());
        System.out.println(" Ingrese el titulo ");
        a1.setTitulo(leer.next());
        System.out.println(" Ingrese el número de páginas ");
        a1.setNumerodepaginas(leer.nextInt());
        return a1;
   }
public void mostrar (Libro a1){
    System.out.println(a1.toString());
}
}

