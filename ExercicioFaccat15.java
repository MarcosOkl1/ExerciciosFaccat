package exercicios;

import java.util.Scanner;

public class ExercicioFaccat15 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número :");
		int valor=sc.nextInt();
		
		if (valor>=0) 
		{
			System.out.println("O Número digitado é positivo");
		} 
		else 
		{
			System.out.println("O Número digitado é negativo");
		}
		sc.close();
	}

}
