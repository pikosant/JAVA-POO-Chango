package EJ3.Servicios;

import EJ3.Entidades.Calculo;
import java.util.Scanner;

public class Servic {

    Scanner leer = new Scanner(System.in);
    Calculo num = new Calculo();
    int suma;
    int division;
    int resta;
    int multiplicacion;

    public void num() {

        System.out.println("Ingresar el primer número.");
        num.setNum1(leer.nextInt());
        System.out.println("Ingrese el segundo número.");
        num.setNum2(leer.nextInt());

    }

    public void suma() {
        suma = num.getNum1() + num.getNum2();
        System.out.println("La suma es: " + suma);
    }

    public void resta() {
        resta = num.getNum1() - num.getNum2();
        System.out.println("La resta es: " + resta);

    }

    public int division() {
        if (num.getNum1() == 0 || num.getNum2() == 0) {
            division = 0;
            System.out.println("ERROR!");
        } else {
            division = num.getNum1() / num.getNum2();

        }
        return division;
    }

    public int multiplicacion() {
        if (num.getNum1() != 0 || num.getNum2() != 0) {
            multiplicacion = num.getNum1() * num.getNum2();

        } else {
            System.out.println("Error!");
            multiplicacion = 0;

        }
        return multiplicacion;
    }
}
