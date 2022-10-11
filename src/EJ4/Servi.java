package EJ4.Servicios;

import EJ4.Entidades.Rectangulo;
import java.util.Scanner;

public class Servi {

    
    Scanner leer = new Scanner(System.in);
    int superficie;
    int perimetro;

    public Rectangulo crear() {
        Rectangulo rec = new Rectangulo();
        System.out.println("Ingrese la Base.");
        rec.setBase(leer.nextInt());
        System.out.println("Ingrese la Altura.");
        rec.setAltura(leer.nextInt());
        return rec;
    }

    public int superficie(Rectangulo rec) {
       return rec.getBase() * rec.getAltura();
      
    }

    public int perimetro(Rectangulo rec) {
        return rec.getBase() + rec.getAltura() * 2;
    
    }

    public void imprimir(Rectangulo rec) {
        String caracter;
        caracter = "* ";

        for (int i = 1; i <= rec.getAltura(); i++) {
            for (int j = 1; j <= rec.getBase(); j++) {
                if ((i == 1) || (i == rec.getAltura()) || (j == 1) || (j == rec.getBase())) {
                    System.out.print(caracter);
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println(" ");
        }
    }


}
