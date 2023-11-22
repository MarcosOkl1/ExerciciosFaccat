package exercicios;

import java.util.Scanner;

public class ExercicioFaccat31 {
	 public static void main(String[] args) {
		 
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Digite o valor do lado A: ");
	        double A = sc.nextDouble();

	        System.out.print("Digite o valor do lado B: ");
	        double B = sc.nextDouble();

	        System.out.print("Digite o valor do lado C: ");
	        double C = sc.nextDouble();

	        if ((A < B + C) && (B < A + C) && (C < A + B)) {
	            System.out.println("Os valores formam um triângulo.");
	        } else {
	            System.out.println("Os valores não formam um triângulo.");
	        }
	        
	        sc.close();
	    }


}
