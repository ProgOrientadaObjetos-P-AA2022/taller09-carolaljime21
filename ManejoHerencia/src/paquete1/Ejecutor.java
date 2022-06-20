package paquete1;

import java.util.Locale;
import java.util.Scanner;
import paquete2.*;
import paquete3.*;
import paquete4.*;

public class Ejecutor {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int op;
        int op2;

        do {
            System.out.println("Ingrese la opción que desea: ");
            System.out.println("1. Prestamo automovil");
            System.out.println("2. Prestamo educativo");
            op = entrada.nextInt();
            entrada.nextLine();
            if (op == 1 || op == 2) {
                System.out.println("-------------------------------");
                System.out.println("Datos del beneficiario: ");
                System.out.println("Nombre:");
                String nom = entrada.nextLine();
                System.out.println("Apellido:");
                String ape = entrada.nextLine();
                System.out.println("Username:");
                String uss = entrada.nextLine();
                System.out.println("Meses a diferir el préstamo: ");
                int meses = entrada.nextInt();
                entrada.nextLine();
                System.out.println("Ciudad del prestamo:");
                String ciudad = entrada.nextLine();
                System.out.println("-------------------------------");
                Persona ben = new Persona(nom, ape, uss);

                switch (op) {
                    case 1:

                        System.out.println("Datos automovil: ");
                        System.out.println("Tipo:");
                        String tipo = entrada.nextLine();
                        System.out.println("Marca:");
                        String marca = entrada.nextLine();
                        System.out.println("Valor del automovil:");
                        double valorA = entrada.nextDouble();
                        System.out.println("-------------------------------");
                        System.out.println("Dstos garante: ");
                        entrada.nextLine();
                        System.out.println("Nombre: ");
                        String nomGarante = entrada.nextLine();
                        System.out.println("Apellido:");
                        String apeGarante = entrada.nextLine();
                        System.out.println("Username:");
                        String ussGarante = entrada.nextLine();
                        System.out.println("-------------------------------");

                        Persona garante = new Persona(nomGarante, apeGarante,
                                ussGarante);
                        garante.establecerNombre(nomGarante);
                        garante.establecerApellido(apeGarante);
                        garante.establecerUsername(ussGarante);

                        PrestamoAutomovil presAuto = new PrestamoAutomovil(
                                meses, ciudad.toLowerCase(),
                                tipo, marca, ben, garante, valorA);
                        presAuto.establecerValorMensualPago();

                        System.out.printf("%s\n", presAuto);
                        break;

                    case 2:
                        System.out.println("Datos institucion");
                        System.out.println("Nivel de estudio: "
                                + "\nMuy bueno/bueno/regular/malo");
                        String nivel = entrada.nextLine();
                        System.out.println("Nombre del centro edcativo:");
                        String nomInstitucion = entrada.nextLine();
                        System.out.println("Siglas del centro educstivo:");
                        String sig = entrada.nextLine();
                        System.out.println("Valor de la carrera:");
                        double valorCarrera = entrada.nextDouble();
                        System.out.println("-------------------------------");

                        InstitucionEducativa institucion = new InstitucionEducativa
                        (nomInstitucion, sig);

                        PrestamoEducativo prestamoEdu = new PrestamoEducativo
                        (nivel, institucion, valorCarrera, ben, meses, ciudad);
                        
                        prestamoEdu.establecerValorMensualCarrera();
                        System.out.printf("%s\n", prestamoEdu);
                        break;
                }

            } else {
                if (op != 1 || op != 2) {
                    System.out.println("ERROR: opcion no valida");
                }
            }

            System.out.println("-------------------------------");
            System.out.println("Ingrese 0 para cerrar el programa");
            System.out.println("Ingrese 9 para continuar");
            op2 = entrada.nextInt();
            System.out.println("-------------------------------");

        } while (op2 != 0);

    }
}
