package Clase64;

import java.util.Scanner;

public class variableInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numeros = new int[3];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        scanner.close();

        int mayor = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }

        System.out.println("El mayor número ingresado es: " + mayor);
	}

}
