import java.util.Scanner;

public class Uri1008 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numerofuncionario, horastbralhadas;
        Double valorhora;




        //Entrada

        numerofuncionario = entrada.nextInt();
        horastbralhadas = entrada.nextInt();
        valorhora = entrada.nextDouble();


        //Processamento

        double salario = horastbralhadas * valorhora;

        //Saida

        System.out.println("NUMBER = " + numerofuncionario);
        System.out.printf("SALARY = U$ %.2f\n", salario);

        entrada.close();
    }
}
