import java.util.Scanner;

public class Uri1014 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int DistanciaTotal;
        double CombustivelTotal;
        
        //Entrada

        DistanciaTotal = entrada.nextInt();
        CombustivelTotal = entrada.nextDouble();

        //Processamento

        double Consumomedio = DistanciaTotal / CombustivelTotal;

        //Saida

        System.out.printf("%.3f km/l\n", Consumomedio);
        

        entrada.close();
    }
}
