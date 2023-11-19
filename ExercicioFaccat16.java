package exercicios;

import java.util.Scanner;

public class ExercicioFaccat16 {

	public static void main(String[] args) {
		try {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Digite o numero de maças compradas :");
			int macas = sc.nextInt();

			if (macas < 1)
			{
				System.out.println("Erro! O valor e negativo.");
				
			} 
			else if (macas < 12) 
			{
				double resultado = macas * 1.3;
				System.out.println("O valor a ser cobrado é : R$" + resultado);

			} 
			else
			{
				
				System.out.println("O valor a ser cobrado é : R$" + macas);
			}
			sc.close();
			
			} 
		catch (Exception e) 
		{
				System.out.println("Digite somente número inteiros e positivos"+e);
			}
	}
}
