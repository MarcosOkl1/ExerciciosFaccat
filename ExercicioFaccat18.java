package exercicios;

import java.util.Scanner;

public class ExercicioFaccat18 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a sua idade :");
		int anoAtual=sc.nextInt();
		
		System.out.println("Digite o ano de nascimento :");
		int anoNascimento=sc.nextInt();
		
		int idade=anoAtual-anoNascimento;
		if (idade>=16) 
		{
			System.out.println("Você está autorizado à votar");
		}
		else 
		{
			System.out.println("Você não é autorizado à votar");

		}
		sc.close();
	}

}
