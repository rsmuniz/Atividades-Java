import java.util.Scanner;

/**
 * Uri1009
 */
public class Uri1009 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String funcionario;
        Double salario,totalvendas;

        //Entrada

        funcionario = entrada.next();
        salario = entrada.nextDouble();
        totalvendas = entrada.nextDouble();

        //Processamento

        double total = totalvendas * 0.15;

        //Saida
        
        System.out.printf("TOTAL = R$ %.2f\n", salario + total);


        entrada.close();
    }
}