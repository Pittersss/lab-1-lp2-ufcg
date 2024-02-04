import java.util.Scanner;

/* * * Laboratorio de Programacao 2 - Lab 1 * * @author Pedro Henrique Malaquias da Silva - 123110443 * */

public class Exercicio3
{
 public static void main(String[] args)
 {
  Scanner sc = new Scanner(System.in);
  float nota1 = sc.nextFloat();
  float nota2 = sc.nextFloat();
  float media = (nota1 + nota2)/2;
  String status = "";

  if (media >= 7)
  {
   status = "pass: True!";
  }
  else
  {
   status = "pass: False!";
  }
  System.out.println(status);
	
 }
}
