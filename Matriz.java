public class Matriz{
public static void main(String[] args) {
     
    // Criando Uma Matriz de Forma Direta
    
    int [][] NomeMatriz = {{1,-2,3},{-4,5,6},{-7,8,-9}};

    // imprimindo a matriz (endereço de memória)
    
    System.out.println(NomeMatriz);

    //Imprimindo elemento 8 da Matriz
    System.out.println(NomeMatriz[2][1]);

    //Atribuindo um valor ao elemento de NomeMatriz (Matriz)

    NomeMatriz [2][1] = 80;
    System.out.println(NomeMatriz[2][1]);

    //Percorrendo a Matriz NomeMatriz

    for(int i = 0; i<NomeMatriz.length;i++){
        for(int j =0; j<NomeMatriz[i].length;j++){
            System.out.printf("NomeMatriz[%d][%d] : %d\n",i,j,NomeMatriz[i][j]);

        }
    }

    //contar numeros negativos presente na Matriz

    int cont = 0;
    for(int i=0; i<NomeMatriz.length;i++){
        for(int j =0;j < NomeMatriz[i].length;j++){
            if(NomeMatriz[i][j] <0){
                cont++;
            }
        }
    }
    System.out.println("Quantidade de Negativos: "+ cont);

        //imprimir os elementos negativos

        for(int i=0; i<NomeMatriz.length;i++){
            for(int j =0;j < NomeMatriz[i].length;j++){
                if(NomeMatriz[i][j] <0){
                    System.out.println("Negativos: " + NomeMatriz[i][j]);
                }
            }
        }


}

}