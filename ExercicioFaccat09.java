package exercicios;

import java.util.Scanner;

public class ExercicioFaccat09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
			
		System.out.println("Digite o seu salário mensal atual:R$");
		float salario=sc.nextFloat();
		
		System.out.println("Digite a procentagem % de reajuste do seu salário");
		float porcentagem = sc.nextFloat();
		
		float aumentoReal=salario*porcentagem/100;
		float salarioFinal=aumentoReal+salario;
		System.out.println("O valor do seu novo salario é:R$ "+salarioFinal);
	}

}
