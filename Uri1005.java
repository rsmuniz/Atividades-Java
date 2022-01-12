import java.util.Scanner;

public class Uri1005 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double NA, NB, media;

        //ENTRADA

        NA = entrada.nextDouble();
        NB = entrada.nextDouble();

        //PROCESSAMENTO

        media = (NA * 3.5 + NB * 7.5)/11;

        //SAIDA


        System.out.printf("MEDIA = %.5f\n", media);


        entrada.close();

    }
}
