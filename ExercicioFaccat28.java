package exercicios;

import java.util.Scanner;

public class ExercicioFaccat28 {

	public static void main(String[] args) {
		        try {

		            Scanner sc = new Scanner(System.in);

		            System.out.println("Digite um numero inteiro: ");
		            int n1 = sc.nextInt();

		            System.out.println("Digite um segundo numero inteiro: ");
		            int n2 = sc.nextInt();

		            System.out.println("Digite um terceiro numero inteiro: ");
		            int n3 = sc.nextInt();

		            if ((n1 > n2) && (n1 > n3))
		            {
		                System.out.println("O maior numero é: "+n1);
		            }else if ((n2 > n1) && (n2 >n3))
		            {
		                System.out.println("O maior numero é: "+n2);
		            }else if((n3 > n1) && (n3 >n2))
		            {
		                System.out.println("O maior numero é: "+n3);
		            }
		            } catch (Exception e) {
		            System.out.println("Digite um numero inteiro!!! "+e);
		        }

		    }
	}

