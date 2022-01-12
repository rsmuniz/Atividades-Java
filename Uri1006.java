import java.util.Scanner;

public class Uri1006 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double n1, n2, n3,media;

        //Entrada
        n1 = entrada.nextDouble();
        n2 = entrada.nextDouble();
        n3 = entrada.nextDouble();

        //Processamento

        media = ((n1 * 2) + (n2 * 3) + (n3 * 5))/10;


        //Saida

        System.out.printf("MEDIA = %.1f\n", media);


        entrada.close();
    }
}
