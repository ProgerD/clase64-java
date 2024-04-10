package Clase64;

import java.util.Scanner;

public class variableDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] numeros = new double[3];
		Scanner scanner = new Scanner(System.in);

  
        double[] numeros = new double[3];


        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
        }


        double mayor = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }


        System.out.println("El mayor elemento ingresado es: " + mayor);

        scanner.close();
	}

}
