package EJ4;

import EJ4.Entidades.Rectangulo;
import EJ4.Servicios.Servi;

public class EJ4Main {

    public static void main(String[] args) {

        Servi op = new Servi();
        Rectangulo rec = op.crear();

        rec.toString();
        System.out.println("El perimetro es: " + op.perimetro(rec));
        System.out.println("La superficie es:" + op.superficie(rec));
        op.imprimir(rec);

    }

}
