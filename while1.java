import java.util.Scanner;

public class while1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        int op;
        float div,mut,soma,sub,n1,n2;
        do{
            System.out.println("Calculadora simples");
            
            System.out.println("-------------------");
            
            System.out.println("1 - soma");
            
            System.out.println("2 - subtração");
            
            System.out.println("3 - multiplicação");
            
            System.out.println("4 - divisão");
            
            System.out.println("operação:");
            op = sc.nextInt();
            
        }
        while(op <1 || op > 4);
        
        if (op == 1) {
            System.out.println("Digite o primeiro número: ");
            n1 = sc.nextInt();
            System.out.println("Digite o segundo número: ");
            n2 = sc.nextInt();
            soma = n1 + n2;
            System.out.println("soma é igual a: "+ soma);
        }
        else if(op == 2){
            System.out.println("Digite o primeiro número: ");
            n1 = sc.nextInt();
            System.out.println("Digite o segundo número: ");
            n2 = sc.nextInt();
            sub = n1 - n2;
            System.out.println("subtração é igual a: "+ sub);

        }else if(op == 3){
            System.out.println("Digite o primeiro número: ");
            n1 = sc.nextInt();
            System.out.println("Digite o segundo número: ");
            n2 = sc.nextInt();
            mut = n1 * n2;
            System.out.println("multiplição é igual a: "+ mut);

    
}else if(op == 4){
    System.out.println("Digite o primeiro número: ");
    n1 = sc.nextInt();
    System.out.println("Digite o segundo número: ");
    n2 = sc.nextInt();
    div = n1/n2;
    System.out.println("divisão é igual a: "+ div);

}
}
}