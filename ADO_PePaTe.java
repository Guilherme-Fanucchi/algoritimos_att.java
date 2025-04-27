import java.util.Scanner;
import java.util.Random;
public class ADO_PePaTe {
public static void main(String[] args){

    // papel ganha de pedra
    // pedra ganha de tesoura
    // tesoura ganha de papel
    //empate
    //menu
    //CPU
    //Resultado

    int escolhaJogador = menu();
    int escolhaComputador = computador();
    int resultadoo = resultado(escolhaJogador, escolhaComputador);
    
    if (resultadoo == 0) {
        System.out.println("O jogo terminou em empate.");
    } else if (resultadoo == 1) {
        System.out.println("Parabéns, você venceu!");
    } else if (resultadoo == -1) {
        System.out.println("O computador venceu. Tente novamente!");
    }


    
}

public static int menu () {
Scanner sc = new Scanner (System.in);

System.out.println("---Jogo Pedra, Papel e Tesoura---");

System.out.println("escolha uma opção:");

System.out.println("0 - Pedra");

System.out.println("1 - Papel");

System.out.println("2 - Tesoura");
int op =  sc.nextInt();


if (op <0 || op >2){
    System.out.println("opção inválida, escolha novamente");
    op = menu();
}else if (op == 0){
    System.out.println("Você escolheu Pedra");
}else if (op == 1){
    System.out.println("Você escolheu Papel");
}else if (op == 2){
    System.out.println("Você escolheu Tesoura");
}else{
    System.out.println("opção inválida, escolha novamente");
    op = menu();
}
sc.close();
return op;
}

public static int computador (){
    Random rd = new Random();
    int cpu = rd.nextInt(3);
    if (cpu == 0){
        System.out.println("Computador escolheu Pedra");
    }else if (cpu == 1){
        System.out.println("Computador escolheu Papel");
    }else if (cpu == 2){
        System.out.println("Computador escolheu Tesoura");
    }else{
        System.out.println("opção inválida, escolha novamente");
        cpu = computador();
    }
    
    return cpu;

}
public static int resultado (int op, int cpu){
    if ( op == cpu ){
        System.out.println("Deu Empate!");
        return 0;
    }else if (op == 0 && cpu == 1){
        System.out.println("Adversário Venceu!");
        return -1;
    }else if (op == 1 && cpu == 2){
        System.out.println("Adversário Venceu!");
        return -1;
    }else if (op == 2 && cpu == 0){
        System.out.println("Adversário Venceu!");
        return -1;
    }else if (op == 1 && cpu == 0){
        System.out.println("Você Venceu!");
        return -2;
    }else if (op == 2 && cpu == 1){
        System.out.println("Você Venceu!");
        return -2;
    }else if (op == 0 && cpu == 2){
        System.out.println("Você Venceu!");
        return -2;
    }
    return -2;
}


    
}