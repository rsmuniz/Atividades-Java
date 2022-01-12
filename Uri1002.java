import java.util.Scanner;

public class Uri1002 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double raio, n, area;

        n = 3.14159;

        //Entrada
        raio = entrada.nextDouble();

        //Processamento
        area = (raio * raio) * n;

        //Saida

        System.out.printf("A=%.4f %n", area);

        entrada.close();
    }
}
