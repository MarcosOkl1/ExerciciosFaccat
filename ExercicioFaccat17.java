package exercicios;

import java.util.Scanner;

public class ExercicioFaccat17 {
	public static void main(String[] args) {

		try {
			
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor da 1º Nota :");
		float nota1 = sc.nextFloat();
		
		System.out.println("Digite o valor da 2º Nota :");
		float nota2 = sc.nextFloat();
		
		float media = (nota1 + nota2) / 2;

		if ((media < 0) || (media > 10)) 
		{
			System.out.println("Erro! Digite um numero entre 0 e 10 !");
		} 
		else if (media >= 6) 
		{
			System.out.println("Aluno(a) aprovado(a). Com media final de: " + media);
		} 
		else 
		{
			System.out.println("Aluno(a) reprovado(a).Com media final de: " + media);
		}
		sc.close();
		} 
		catch (Exception e) 
		{
			System.out.println("Não é possivel fazer operçoes com caracteres."+e);
		}

}
}
