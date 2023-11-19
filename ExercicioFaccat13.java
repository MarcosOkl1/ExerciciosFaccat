package exercicios;

import java.util.Scanner;

public class ExercicioFaccat13 {

	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Digite a primeira nota do aluno: ");
	        float n1=sc.nextFloat();

	        System.out.println("Digite a segunda nota do aluno:");
	        float n2=sc.nextFloat();

	        System.out.println("Digite a terceira nota do aluno:");
	        float n3=sc.nextFloat();

	        float notaFinal = (n1*2+n2*3+n3*5)/10;

	        System.out.println("A nota final do aluno é: "+notaFinal);

	    }

	}
