import java.util.Scanner;

/* * * Laboratorio de Programacao 2 - Lab 1 * * @author Pedro Henrique Malaquias da Silva - 123110443 * */

public class Exercicio5
{
    public static void main(String[] args) {
        {
            Scanner sc = new Scanner(System.in);
            String operacao = sc.nextLine();
            float resultado = 0;
            String status = "";
            if (operacao.equals("+"))
            {
                float num1 = sc.nextFloat();
                float num2 = sc.nextFloat();
                resultado = num1 + num2;
                status = "RESULTADO: " + resultado;
            }
            else if(operacao.equals("-"))
            {
                float num1 = sc.nextFloat();
                float num2 = sc.nextFloat();
                resultado = num1 - num2;
                status = "RESULTADO: " + resultado;
            }
            else if(operacao.equals("*"))
            {
                float num1 = sc.nextFloat();
                float num2 = sc.nextFloat();
                resultado = num1 * num2;
                status = "RESULTADO: " + resultado;
            }
            else if (operacao.equals("/"))
            {
                float num1 = sc.nextFloat();
                float num2 = sc.nextFloat();
                if (num2 != 0)
                {
                    resultado = num1/num2;
                    status = "RESULTADO: " + resultado;
                }
                else
                {
                    status = "ERRO";
                }
                
            }
            else
            {
                status = "ENTRADA INVALIDA";
            }
            System.out.println(status);
        }
    }
}
