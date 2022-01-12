import java.util.Scanner;

/**
 * Uri1012
 */
public class Uri1012 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Double EntradaA, EntradaB, EntradaC;

        // Entrada

        EntradaA = entrada.nextDouble();
        EntradaB = entrada.nextDouble();
        EntradaC = entrada.nextDouble();

        // Processamento

        // Área do triângulo retângulo
        double AreaTR = (EntradaA * EntradaC) / 2;
        // A área do círculo de raio C.
        double AreaC = 3.14159 * EntradaC * EntradaC;
        // A área do trapézio
        double AreaT = ((EntradaB + EntradaA) * EntradaC) / 2;
        // A área do quadrado
        double AreaQ = EntradaB * EntradaB;
        // A área do retângulo
        double AreaR = EntradaA *EntradaB;

        // Saida

        // Saida área do triângulo retângulo
        System.out.printf("TRIANGULO: %.3f\n", AreaTR);
        // Saida área do círculo de raio C.
        System.out.printf("CIRCULO: %.3f\n", AreaC);
        // Saida área do trapézio
        System.out.printf("TRAPEZIO: %.3f\n", AreaT);
        // Saida área do quadrado
        System.out.printf("QUADRADO: %.3f\n", AreaQ);
        //Saida área do retângulo
        System.out.printf("RETANGULO: %.3f\n", AreaR);



        entrada.close();
    }
}