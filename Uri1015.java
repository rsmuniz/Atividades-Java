import java.util.Scanner;

public class Uri1015 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double X1, X2, Y1, Y2;

        // Entrada

        X1 = entrada.nextDouble();
        Y1 = entrada.nextDouble();
        X2 = entrada.nextDouble();
        Y2 = entrada.nextDouble();

        // Processamento

        double DistanciaPontos = Math.sqrt(Math.pow(X2 - X1, 2) + Math.pow(Y2 - Y1, 2));

        // Saida

        System.out.printf("%.4f%n", DistanciaPontos);

        entrada.close();

    }
}
