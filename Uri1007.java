import java.util.Scanner;

public class Uri1007 {
    

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n1, n2, n3, n4;
        //Entrada
        n1 = entrada.nextInt();
        n2 = entrada.nextInt();
        n3 = entrada.nextInt();
        n4 = entrada.nextInt();

        //Processamento

        int diferenca = (n1 * n2) - (n3 * n4);
        
        //Saida

        System.out.println("DIFERENCA = " + diferenca);
        
        entrada.close();
    }
}
