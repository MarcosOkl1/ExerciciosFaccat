package exercicios;
import java.util.Scanner;

public class ExercicioFaccat21 {
	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);

		int horaInicio=24;
		int horaFinal = 24;

		while ((horaInicio < 0) || (horaInicio > 23)) 
		{
			System.out.println("Digite o horário que começou a partida de Xadrez :");
			horaInicio = sc.nextInt();
		}
		while ((horaFinal < 0) || (horaFinal > 23)) 
		{
			System.out.println("Digite o horário que terminou a partida de Xadrez :");
			horaFinal = sc.nextInt();
		}
		
		int HorasJogo = horaFinal - horaInicio;
		if (HorasJogo < 0)
		{
			HorasJogo = HorasJogo + 24;
			System.out.println("A quantidade de horas jogadas corresponde a :" + HorasJogo + " horas");
		} 
		else if (HorasJogo == 0) 
		{
			System.out.println("Fim do jogo, a duração da partidas chegou a 24 horas");
		} else {
			System.out.println("As horas jogadas corresponde a :" + HorasJogo + " horas");
		}

	}

}
