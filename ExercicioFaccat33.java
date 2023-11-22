package exercicios;

import java.util.Scanner;

public class ExercicioFaccat33 {
	 public static void main(String[] args) {
		 
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Digite o 1 valor: ");
	        double valor1 = sc.nextDouble();

	        System.out.print("Digite o 2 valor: ");
	        double valor2 = sc.nextDouble();

	        if (valor1 == valor2) {
	            System.out.println(" Você digitou números iguais.");
	        } else if (valor1 > valor2) {
	            System.out.println("O primeiro valor é maior.");
	        } else {
	            System.out.println("O segundo valor é maior.");
	        }

	        sc.close();
	    }
}
