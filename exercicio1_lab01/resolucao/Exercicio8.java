package pacote;
import java.util.Arrays;
import java.util.Scanner;

public class Exercicio8 {
	
	public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] notas = new int[10];
        int contadorIndex = 0;
        while (true)
        {
           String valor = sc.nextLine();
           if (valor.equals("-"))
           {
            break;
           }
           if (ArraySemEspaco(contadorIndex, notas))
           {
        	   DuplicarArray(notas);
           }
           notas[contadorIndex] = (Integer.parseInt(valor.split(" ")[1]));
           contadorIndex += 1;
        }

        System.out.println("maior: " + Maior(notas));
        System.out.println("menor: " + Menor(notas));
        System.out.println("media: " + Media(notas));
        System.out.println("acima: " + MaioresSetecentos(notas));
        System.out.println("abaixo: " + MenoresSetecentos(notas));
    }
    public static int Maior(int[] lista)
    {
        int maior = lista[0];
        for (int numero: lista)
        {
            if (numero > maior)
            {
                maior = numero;
            }
        }
        return maior;
    }
    public static int Menor(int[] lista)
    {
        int menor = lista[0];
        for (int numero: lista)
        {
            if (numero < menor)
            {
                menor = numero;
            }
        }
        return menor;
    }
    public static int Media(int[] lista)
    {
        int soma = 0;
        for (int numero: lista)
        {
            soma += numero;
        }
        return soma/lista.length;
    }
    public static int MenoresSetecentos(int[] lista)
    {
        int counter = 0;
        for (int numero: lista)
        {
            if (numero < 700)
            {
                counter += 1;
            }
        }
        return counter;
    }
    public static int MaioresSetecentos(int[] lista)
    {
        int counter = 0;
        for (int numero: lista)
        {
            if (numero >= 700)
            {
                counter += 1;
            }
        }
        return counter;
    }
    public static boolean ArraySemEspaco(int indexPreenchido, int[] lista)
    {
     if (indexPreenchido == (lista.length-1))
     {
    	 return true;
     }
    	
     return false;
    }
    public static void DuplicarArray(int[] listaAntiga)
    {
    	int novoTamanho = listaAntiga.length * 2;
    	int[] novaLista = new int[novoTamanho];
    	
    	for (int i = 0; i < listaAntiga.length; i++)
    	{
    		novaLista[i] = listaAntiga[i];
    	}
    	
    	//listaAntiga = novaLista.clone();
    	
    	
    }
 }
