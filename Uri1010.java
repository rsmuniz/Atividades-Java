import java.util.Scanner;

public class Uri1010 {

public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

    int cod_peca1, cod_peca2, qtd_peca1, qtd_peca2;
    double valor_peca1, valor_peca2, valor_total;

    cod_peca1 = entrada.nextInt();
    qtd_peca1 = entrada.nextInt();
    valor_peca1 = entrada.nextDouble();
    cod_peca2 = entrada.nextInt();
    qtd_peca2 = entrada.nextInt();
    valor_peca2 = entrada.nextDouble();

    valor_total = qtd_peca1 * valor_peca1 + qtd_peca2 * valor_peca2;

    System.out.printf("VALOR A PAGAR: R$ %.2f",valor_total);
    System.out.println();

    entrada.close();

}
}