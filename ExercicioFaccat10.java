package exercicios;

import java.util.Scanner;

public class ExercicioFaccat10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do custo de fabricação do automovel:");
		float valorAutomovel=sc.nextFloat();
		float distribuidor=valorAutomovel*28/100;
		float imposto= valorAutomovel*45/100;
		float valorFinal = valorAutomovel+distribuidor+imposto;
		
		System.out.println("O valor final do automóvel corresponde : R$"+valorFinal);
		
		sc.close();
		

	}

}
