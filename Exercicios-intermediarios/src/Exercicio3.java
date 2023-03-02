
import java.io.IOException;
import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double A = leitor.nextDouble();
        double B = leitor.nextDouble();
        double C = leitor.nextDouble();
        double perimetro;
        double area;
        boolean triangulo = false;
        double soma1 = A + B;
        double soma2 = B + C;
        double soma3 = A + C;

        if ((A < soma2) && (B < soma3) && (C < soma1)) {
            triangulo = true;
        }

        if (triangulo) {
            perimetro = A + B + C;
            System.out.println("Perimetro = " + perimetro);
        } else {
            area = ((A + B) * C) / 2;
            System.out.println("Area = " + area);
        }

    }
}
