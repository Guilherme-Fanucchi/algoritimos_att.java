import java.util.Scanner;
public class repeticao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Declare o valor de i: ");
        int i = sc.nextInt();

        System.out.println("Declare o valor final: ");
        int fim = sc.nextInt();

        while(i<= fim){
        
            if (i%2 == 0) {
                
                System.out.println("valor de i é " + i); 

            }
            i++;
        }
            while (i > fim){
                
                if (i%2 == 1)
                
                System.out.println("Valor de i: " + i);
                i--;
            }
          
    }
}
