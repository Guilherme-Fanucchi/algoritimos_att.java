import java.util.Scanner;

public class laço_de_repeticao01 {
    public static void main(String[] args) {
       

        Scanner sc = new Scanner(System.in);

        System.out.println("inicio: ");

        int inicio = sc.nextInt();

        System.out.println("fim");

        int fim = sc.nextInt();

        for(int i = inicio; i<fim;i++){

            if (i%2==0){

                System.out.println("Os numeros pares: " + i);
            }
    }
    for (int i = inicio; i > fim;i= i-1){
        System.out.println("Os numeros impares: " + i);
    } 

}
}