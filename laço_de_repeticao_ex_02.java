import java.util.Random;
import java.util.Scanner;

public class laço_de_repeticao_ex_02{
    public static void main(String[] args) {
        
        Random rnd = new Random();
        
        
        int numeroOculto = rnd.nextInt(100);
        
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Digite a quantidade de tentativas permitidas: ");
        int tentativasMaximas = scanner.nextInt();
        
        int tentativasRestantes = tentativasMaximas;
        boolean acertou = false;
        
        
        while (tentativasRestantes > 0 && !acertou) {
            System.out.println("Você tem " + tentativasRestantes + " tentativas restantes.");
            System.out.print("Digite um número entre 0 e 99: ");
            int numeroUsuario = scanner.nextInt();
            
            
            if (numeroUsuario == numeroOculto) {
                System.out.println("Parabéns! Você acertou o número!");
                acertou = true;
            } else {
                
                if (numeroUsuario < numeroOculto) {
                    System.out.println("MAIOR");
                } else {
                    System.out.println("MENOR");
                }
            }
            
            
            tentativasRestantes--;
        }
        
        
        if (!acertou) {
            System.out.println("Você não conseguiu acertar o número. O número correto era " + numeroOculto + ".");
        }
        
        
        scanner.close();
    }
}
