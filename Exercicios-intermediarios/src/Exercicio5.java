
import java.io.IOException;
import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double renda = leitor.nextDouble();
        double imposto = 0;
        double excedente = 0;
        if (renda <= 2000) {
            System.out.println("Isento");
        } else {
            renda = renda - 2000;
            if (renda > 2500) {
                excedente = renda - 2500;
                imposto = imposto + excedente * 0.28;
                renda = 2500;
            }
            if (renda > 1000) {
                excedente = renda - 1000;
                imposto = imposto + excedente * 0.18;
                renda = 1000;
            }
            imposto = imposto + renda * 0.08;
            System.out.println("R$ " + String.format("%.2f", imposto));
        }

    }
}
