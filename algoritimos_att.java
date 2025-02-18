package projetos_att_senac;
import java.util.Scanner;

public class algoritimos_att {
    public static void main(String[] args) {
        /*Escreva um algoritmo capaz de calcular o salário de um trabalhador com
base na quantidade de horas trabalhadas e o valor de cada hora */

        Scanner scanner = new Scanner(System.in);
        double ht, vh, s;
        System.out.println("Informe a quantidade de horas trabalhadas:");
         ht = scanner.nextInt();
        System.out.println("Informe o valor da hora trabalhada:");
         vh = scanner.nextInt();
        s = ht * vh;
        System.out.printf("O salário do trabalhador é: %.2f\n", s);
    }
}