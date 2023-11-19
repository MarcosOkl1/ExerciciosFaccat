package exercicios;

public class ExercicioFaccat29 {

	public static void main(String[] args) {

		        Scanner sc = new Scanner(System.in);

		        int num1, num2, num3, maior1, maior2;

		        System.out.print("Digite o primeiro número: ");
		        num1 = sc.nextInt();

		        System.out.print("Digite o segundo número: ");
		        num2 = sc.nextInt();

		        System.out.print("Digite o terceiro número: ");
		        num3 = sc.nextInt();

		 

		        if (num1 > num2 && num1 > num3) 
		        {
		            maior1 = num1;
		            
		            if (num2 > num3)
		            {
		                maior2 = num2;

		            } 
		            else 
		            {
		            	maior2 = num3;

		            }

		        } else if (num2 > num1 && num2 > num3) {

		            maior1 = num2;

		            if (num1 > num3) {

		                maior2 = num1;

		            } else
		            {
		                maior2 = num3;
		            }

		        } 
		        else 
		        {
		        	maior1 = num3;

		            if (num1 > num2) 
		            {
		            	maior2 = num1;

		            }
		            else 
		            {
		            	maior2 = num2;

		            }

		        }

		        System.out.println("Soma dos 2 maiores números: " + (maior1 + maior2));
	}

}
