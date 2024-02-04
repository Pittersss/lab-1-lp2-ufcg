import java.util.Scanner;

/* * * Laboratorio de Programacao 2 - Lab 1 * * @author Pedro Henrique Malaquias da Silva - 123110443 * */

public class Exercicio7 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            String sequencia = sc.nextLine();
            if (temWally(sequencia.split(" ")))
            {
                break;
            }
            System.out.println(possivelNome(sequencia.split(" ")));
        }

    }
    public static boolean temWally(String[] sequencia)
    {
        for (String nome: sequencia)
        {
            if (nome.toLowerCase().equals("wally"))
            {
                return true;
            }
        }
        return false;
    }
    public static String possivelNome(String[] sequencia)
    {
        for (int i = sequencia.length-1; i >= 0; i--)
        {
            if (sequencia[i].length() == 5)
            {
                return sequencia[i];
            }
        }
        return "?";
    }
}
