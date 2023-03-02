
import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int custoFabrica = scan.nextInt();
        int porcentagemDistribuidor = scan.nextInt();
        int percentualImpostos = scan.nextInt();

        int custoConsumidor;

        int distribuidor = porcentagemDistribuidor * custoFabrica / 100;
        int valorImpostos = percentualImpostos * custoFabrica / 100;

        custoConsumidor = custoFabrica + distribuidor + valorImpostos;

        System.out.println(custoConsumidor);
    }
}
