package exercicios;

import java.util.Scanner;

public class ExercicioFaccat14 {

	public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);

			System.out.println("Digite um valor :");
			int valor = sc.nextInt();
			
			if(valor<10) 
			{
				System.out.println("O valor não é maior que 10");
			}
			else if(valor == 10)
			{
				System.out.println("O valor é igual a 10");
			}
			else 
			{
				System.out.println("O valor é maior que 10");
			}
			sc.close();
		}

}
