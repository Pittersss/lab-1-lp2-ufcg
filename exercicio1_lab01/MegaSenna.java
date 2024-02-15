package pacote;
import java.util.*;

public class MegaSenna 
{
	public static final int LIMITESORTEIO = 60;
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int jogadores = sc.nextInt();
		for (int i = 0; i < jogadores * 10; i++)
		{
			System.out.println(GerarBilhete());
		}
		
	}
	public static String GerarBilhete()
	{
		Random rn = new Random();
		int[] numerosSorteados = new int[6];
		int numeroSorteado;
		String bilhete = "";
		for (int i = 0; i < numerosSorteados.length; i++)
		{
		 do{
			numeroSorteado = rn.nextInt(LIMITESORTEIO) + 1; 
		 }while(EhRepetido(numeroSorteado, numerosSorteados));
		 numerosSorteados[i] = numeroSorteado;
		}
		
		Arrays.sort(numerosSorteados);
			
		for (int j = 0; j < 6; j++)
		{
			if (numerosSorteados[j] < 10)
			{
			 bilhete += "0"+numerosSorteados[j] + " ";
			 continue;
			}
			bilhete += numerosSorteados[j] + " ";
		}
		return bilhete.substring(0,  bilhete.length()-1);
	}
	public static boolean EhRepetido(int elem, int[] lista)
	{
		for (int i = 0; i < lista.length;i++)
		{
			if (lista[i] == elem)
			{
				return true;
			}
		}
		return false;
	}
}
