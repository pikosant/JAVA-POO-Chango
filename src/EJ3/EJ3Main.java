package EJ3;

import EJ3.Servicios.Servic;

public class EJ3Main {

    public static void main(String[] args) {
        Servic Op = new Servic();
        Op.num();
        Op.suma();
        Op.resta();
        System.out.println("La division es: " + Op.division());
        System.out.println("La multiplicacion es: " + Op.multiplicacion());

    }

}
