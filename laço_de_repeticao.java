import java.util.Scanner;

public class laço_de_repeticao {
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    int soma = 0, n;
    
    for(int i =1; i <10; i++){
        System.out.println("Digite um número: ");
        n =  sc.nextInt();
        soma = soma + n;
    }
    System.out.println("soma é" + soma);
    }
}

    