package exercicios;

import java.util.Scanner;

public class ExercicioFaccat34 {
public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de x: ");
        int x = sc.nextInt();

        System.out.print("Digite o valor de y: ");
        int y = sc.nextInt();

        int z = x * y + 5;

        char resp;

        if (z > 100)
        {
            resp = 'A';
        } 
        else 
        {
            resp= 'B';
        }

        System.out.println("Resposta: " + resp);

        sc.close();

        System.out.println("\nTeste:");

        int[] valorX = {3, 150, 7, -2, 50};
        int[] valorY = {2, 3, -1, 5, 3};

        for (int i = 0; i < valorX.length; i++)
        {
            x = valorX[i];
            y = valorY[i];
            z = x * y + 5;
            resp = (z > 100) ? 'A' : 'B';
            System.out.println("Para x = " + x + " e y = " + y + ":");
            System.out.println("  z = " + z);
            System.out.println("  Resposta = " + resp);
            System.out.println(); 
        }
}
}
