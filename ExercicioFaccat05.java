package exercicios;

import java.util.Scanner;

public class ExercicioFaccat05 {

	public static void main(String[] args) {
		
		System.out.println("Digite um numero para saber o seu antecessor: ");
		
		Scanner sc = new Scanner(System.in) ;
		
		int valor =sc.nextInt();
		int antecessor = valor-1 ;
		
		System.out.println("O numero antecessor é: "+antecessor);

	}

}
