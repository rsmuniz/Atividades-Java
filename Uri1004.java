import java.util.Scanner;

/**
 * Uri1004
 */
public class Uri1004 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n1, n2, prod;

        n1 = entrada.nextInt();
        n2 = entrada.nextInt();

        prod = n1 * n2;

        System.out.println("PROD = " + prod);

        entrada.close();
    }
}

