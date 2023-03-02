
import java.io.IOException;
import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int cont = 0;
        double media;
        double x = 0;
        double soma = 0;

        for (int i = 0; i < 6; i++) {
            x = leitor.nextDouble();

            if (x > 0) {
                cont++;
                soma = soma + x;
            }

        }

        media = soma / cont;
        System.out.println(cont + " valores positivos");
        System.out.println(String.format("%.1f", media));
    }
}
