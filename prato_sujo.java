
import java.util.Scanner;

public class prato_sujo {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dgite o numero de pratos sujos: ");
        int ps = sc.nextInt();
        
        while (ps > 0){
            System.out.println("lavando...");
            
            System.out.println("Lavando pratos: " + ps);
            ps--;
            if (ps == 0){
                System.out.println("Todos os pratos lavados!");
            }
        } 
        }
    }


