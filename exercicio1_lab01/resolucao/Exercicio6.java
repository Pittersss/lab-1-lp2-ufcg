import java.util.Scanner;

/* * * Laboratorio de Programacao 2 - Lab 1 * * @author Pedro Henrique Malaquias da Silva - 123110443 * */

public class Exercicio6 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String valores = sc.nextLine();
        String[] listaValores = valores.split(" ");
        int media = mediaLista(listaValores);

        System.out.println(verificadorLista(listaValores, media));
    }
    public static int mediaLista(String[] lista)
    {
        int soma = 0;
        int media = 0;
        for (String num: lista)
        {
            soma += Integer.parseInt(num);
        }
        media = soma/lista.length;
        return media;

    }
    public static String verificadorLista(String[] lista, int media)
    {
        String resultado = "";
        for (String num: lista)
        {
            if (Integer.parseInt(num) > media)
            {
                resultado += num + " ";
            }
        }
        return resultado.substring(0,resultado.length()-1);
    }
}
