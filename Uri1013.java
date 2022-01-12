import java.util.Scanner;

/**
 * Uri1013
 */
public class Uri1013 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int ValorA, ValorB, ValorC;

        // Entrada
        ValorA = entrada.nextInt();
        ValorB = entrada.nextInt();
        ValorC = entrada.nextInt();

        // Processamento

        int MaiorAB = (ValorA + ValorB + Math.abs(ValorA - ValorB)) / 2;
        int ValorMaior = (MaiorAB + ValorC + Math.abs(MaiorAB - ValorC)) / 2;

        // Saida

        System.out.println(ValorMaior + " eh o maior");

        entrada.close();
    }
}