package exercicios;

import java.util.Scanner;

public class ExercicioFaccat32 {

		 public static void main(String[] args) {
			 
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Digite o nome do 1 time: ");
		        String time1 = sc.nextLine();

		        System.out.print("Digite o nome do 2 time: ");
		        String time2 = sc.nextLine();

		        System.out.print("Digite a quantidade de gols marcados pelo time: " + time1 + ": ");
		        int gols1 = sc.nextInt();

		        System.out.print("Digite a quantidade de gols marcados pelo time: " + time2 + ": ");
		        int gols2 = sc.nextInt();
		        
		        if (gols1 > gols2) {
		            System.out.println("O ganhador é o time " + time1 + ".");
		        } else if (gols2 > gols1) {
		            System.out.println("O ganhador é o time " + time2 + ".");
		        } else {
		            System.out.println("EMPATE!.");
		        }
		    }
	}

