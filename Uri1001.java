import java.util.Scanner;

public class Uri1001 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        

        int A, B, X;
         
        //Entrada
        A = entrada.nextInt();
        B = entrada.nextInt();

        //Processamento
        X = A + B;

        //Saida

        System.out.println("X = "+ X);

        entrada.close();

    }
}
