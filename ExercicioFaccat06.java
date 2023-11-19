package exercicios;

import java.util.Scanner;

public class ExercicioFaccat06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Programa que calcula aula area do triângulo"+"\n");
		
		System.out.println("Digite o valor da base do triângulo: ");
		float base= sc.nextInt();
		
		System.out.println("Digite o valor da altura do triângulo: ");
		float altura= sc.nextInt();
		
		float area = base*altura; 
		
		System.out.println("A área do triangulo é: "+area);
		
	}

}
