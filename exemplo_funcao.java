package funcao;

import java.util.Scanner;

public class exemplo_funcao {

public static int entrada_de_dados(){

    System.out.println("*--Entranda de Dados--*");

    Scanner sc = new Scanner(System.in);

    System.out.println("Digite um Numero:");
    int n = sc.nextInt();

    return n;
}

public static int menor(int n1, int n2) {

    System.out.println("--Menor--");
    
    if (n1 <= n2) {
        return n1;
    }else{
        return n2;
    }
}

public static void imprimir(int num){

System.out.println("Resultado = " + num);

}

public static void main (String[]args){
    
    int n1 = entrada_de_dados();
   
    int n2 = entrada_de_dados();

    int min = menor(n1,n2);
   
    imprimir(min);
}
}