import java.util.Scanner;

/* * * Laboratorio de Programacao 2 - Lab 1 * * @author Pedro Henrique Malaquias da Silva - 123110443 * */

public class Exercicio4
{
 public static void main(String[] args)
 {
 int[] valores = new int[4];
 Scanner sc = new Scanner(System.in);
 String status = "";
 for (int i = 0; i < 4; i++)
 {
    valores[i] = sc.nextInt();
 }

 if (valores[0] > valores[1])
 {
    status = seguePadraoDesc(valores);
 }
 else if (valores[0] < valores[1])
 {
    status = SeguePadraoCres(valores);
 }
 else
 {
   status = "FUNCAO NAO ESTRITAMENTE CRES/DECR";
 }

System.out.println(status);

 }
 public static String seguePadraoDesc(int[] valores)
 {
   String valor = "";
   for (int i = 1; i < 4; i ++)
   {
    if (valores[i] >= valores[i-1])
    {
        valor = "FUNCAO NAO ESTRITAMENTE CRES/DECR";
        return valor;
    }
   }
   valor = "POSSIVELMENTE ESTRITAMENTE DECRESCENTE";
   return valor;
 }
 public static String SeguePadraoCres(int[] valores)
 {
    String valor = "";
    for (int i = 1; i < 4; i ++)
   {
    if (valores[i] <= valores[i-1])
    {
        valor = "FUNCAO NAO ESTRITAMENTE CRES/DECR";
        return valor;
    }
   }
   valor = "POSSIVELMENTE ESTRITAMENTE CRESCENTE";
   return valor;
 }

}
