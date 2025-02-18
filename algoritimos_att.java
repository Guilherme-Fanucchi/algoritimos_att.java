package projetos_att_senac;
import java.util.Scanner;

public class algoritimos_att {
    public static void main(String[] args) {

        /*Escreva um algoritmo capaz de calcular o salário de um trabalhador com
base na quantidade de horas trabalhadas e o valor de cada hora */

       /*  Scanner scanner = new Scanner(System.in);
        double ht, vh, s;
        System.out.println("Informe a quantidade de horas trabalhadas:");
         ht = scanner.nextInt();
        System.out.println("Informe o valor da hora trabalhada:");
         vh = scanner.nextInt();
        s = ht * vh;
        System.out.printf("O salário do trabalhador é: %.2f\n", s);*/

        /*Escreva um algoritmo para calcular o estoque médio de uma peça, sendo
que: estoque médio = (quantidade mínima + quantidade máxima) / 2 */
            
           /* Scanner scanner = new Scanner(System.in);
            double qmin, qmax, em;
            System.out.println("Informe a quantidade mínima:");
            qmin = scanner.nextInt();
            System.out.println("Informe a quantidade máxima:");
            qmax = scanner.nextInt();
            em = (qmin + qmax) / 2;
            System.out.printf("O estoque médio é: %.2f\n", em);*/

             /*um algoritmo que lê um número e imprime o quadrado deste número */
             /*double nq;
             Scanner scanner = new Scanner(System.in);
            System.out.println("Informe o número:");
            nq = scanner.nextInt();
            nq = Math.pow(nq, 2);
            System.out.printf("O quadrado do número é: %.2f\n", nq);*/

            /*. Escreva um algoritmo que lê dois números A e B e imprima o resultado de
            A elevado a B*/
                /*double A,B,AB;
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Informe o A e B respectivamente:");
                    A = scanner.nextInt();
                    B = scanner.nextInt();
                    AB = Math.pow(A, B);
                    System.out.printf("A elevado a B é: %.2f\n", AB);*/

                    /*Escreva um algoritmo que leia a cotação do dólar e a quantidade de
dólares a ser comprada. Converta o valor para real e mostre o resultado*/
            /*double c, d, r;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Informe a cotação do dólar:");
            c = scanner.nextDouble();
            System.out.println("Informe a quantidade de dólares:");
            d = scanner.nextDouble();
            r = c * d;
            System.out.printf("O valor em reais é: %.2f\n", r);*/

            /*. Crie um algoritmo para calcular o pagamento de comissão de vendedores
de peças, levando em consideração que sua comissão será de 5% do total
da venda e que você tem os seguintes dados:
 - identificação do vendedor
- código da peça
- preço unitário da peça
- quantidade vendida
O algoritmo deve imprimir a identificação do vendedor, o total vendido pelo
vendedor e o valor da comissão da venda.
*/   
            double id, cp, pu, qv, tv, c;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Informe a identificação do vendedor:");
            id = scanner.nextDouble();
            System.out.println("Informe o código da peça:");
            cp = scanner.nextDouble();
            System.out.println("Informe o preço unitário da peça:");
            pu = scanner.nextDouble();
            System.out.println("Informe a quantidade vendida:");
            qv = scanner.nextDouble();
            tv = pu * qv;
            c = tv * 0.05;
            System.out.printf("O total vendido pelo vendedor é: %.2f\n", tv);
            System.out.printf("O valor da comissão da venda é: %.2f\n", c);
    }
}
