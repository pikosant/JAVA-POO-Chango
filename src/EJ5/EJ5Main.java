package EJ5;

import java.util.Scanner;

public class EJ5Main {

    public static void main(String[] args) {

        Servicios cuenta = new Servicios();

        Scanner leer = new Scanner(System.in);
        int Num;
        int valor;
        do {
            System.out.println("---------------------------------");
                    
            System.out.println("1)Crear cuenta.\n2)Ingresar Saldo.\n3)Retirar.\n4)Extracción Rápida.\n5)Consultar Saldo.\n6)Consultar Datos.\n7)Salir.");
            Num = leer.nextInt();
            System.out.println("---------------------------------");
            switch (Num) {
                case 1:
                    cuenta.cuentaBank();
                    break;
                case 2:
                    System.out.println("Ingrese el valor.");
                    valor = leer.nextInt();
                    cuenta.ingreso(valor);
                    break;
                case 3:
                    System.out.println("Cuanto va a retirar.");
                    valor = leer.nextInt();
                    cuenta.retiro(valor);
                    break;
                case 4:
                    cuenta.extraccionRapida();
                    break;
                case 5:
                    cuenta.consultarSaldo();
                    break;
                case 6:
                    cuenta.consultarDatos();
                    break;
                case 7:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Número ingresado no valido.");
            }

        } while (Num != 7);

    }

}
