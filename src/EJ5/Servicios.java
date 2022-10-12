package EJ5;

import java.util.*;

public class Servicios {

    Entidades cuenta = new Entidades();
    Scanner leer = new Scanner(System.in);
    double n20, valor;

    public void cuentaBank() {
        System.out.println("Ingrese datos del usuario.\nIngrese N° de cuenta.\nIngrese el DNI.");
        cuenta.setCuentaBank(leer.nextInt());
        cuenta.setDNI(leer.nextLong());
        

    }

    public void ingreso(int ingreso) {

        cuenta.setSaldo(cuenta.getSaldo() + ingreso);
        System.out.println("Valor ingresado: " + ingreso);

    }

    public void retiro(int retiro) {

        if (retiro > cuenta.getSaldo()) {
            System.out.println("Retiraste: " + cuenta.getSaldo() + " Tu saldo quedó en 0 ");
            cuenta.setSaldo(0);
        } else {
            cuenta.setSaldo(cuenta.getSaldo() - retiro);
            System.out.println("Retiraste: " + retiro + " y tu cuenta quedó en " + cuenta.getSaldo());
        }
    }

    public void extraccionRapida() {
        n20 = cuenta.getSaldo() * 0.2;
        System.out.println("Ingrese el valor que quiera extraer ");
        valor = leer.nextDouble();
        boolean flag = true;
        do {
            if (valor > n20) {
                System.out.println("El valor que ingresaste es mayor que el %20. Ingrese un nuevo valor.");
                valor = leer.nextDouble();
            } else {
                System.out.println("El valor retirado es: " + valor);
                cuenta.setSaldo(cuenta.getSaldo() - (int) valor);
            flag = false;
            }

        } while (flag==true);
    }

    public void consultarSaldo() {
        System.out.println("Su saldo actual es: " + cuenta.getSaldo());
    }

    public void consultarDatos() {
        System.out.println("Tu numero de cuenta es: " + cuenta.getCuentaBank());
        System.out.println("Tu D.N.I. es: " + cuenta.getDNI());
    }
}
