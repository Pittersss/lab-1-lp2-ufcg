import java.util.Scanner;
import java.util.ArrayList;

/* * * Laboratorio de Programacao 2 - Lab 1 * * @author Pedro Henrique Malaquias da Silva - 123110443 * */

public class Exercicio8 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> notas = new ArrayList<Integer>();
        while (true)
        {
           String valor = sc.nextLine();
           if (valor.equals("-"))
           {
            break;
           }
           notas.add(Integer.parseInt(valor.split(" ")[1]));
        }

        System.out.println("maior: " + Maior(notas));
        System.out.println("menor: " + Menor(notas));
        System.out.println("media: " + Media(notas));
        System.out.println("acima: " + MaioresSetecentos(notas));
        System.out.println("abaixo: " + MenoresSetecentos(notas));
    }
    public static int Maior(ArrayList<Integer> lista)
    {
        int maior = lista.get(0);
        for (int numero: lista)
        {
            if (numero > maior)
            {
                maior = numero;
            }
        }
        return maior;
    }
    public static int Menor(ArrayList<Integer> lista)
    {
        int menor = lista.get(0);
        for (int numero: lista)
        {
            if (numero < menor)
            {
                menor = numero;
            }
        }
        return menor;
    }
    public static int Media(ArrayList<Integer> lista)
    {
        int soma = 0;
        for (int numero: lista)
        {
            soma += numero;
        }
        return soma/lista.size();
    }
    public static int MenoresSetecentos(ArrayList<Integer> lista)
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
    public static int MaioresSetecentos(ArrayList<Integer> lista)
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
}
