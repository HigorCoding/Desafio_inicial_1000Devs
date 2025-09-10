package exercicio01;

import java.util.Locale;
import java.util.Scanner;

public class CalculadoraImobiliaria {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double areaFrente, areaLateral, valorMetroQuadrado, areaTotal, valorVenda;

        System.out.print("Quantos metros o terreno possui de frente: ");
        areaFrente = scanner.nextDouble();
        System.out.print("Quantos metros o terreno possui de lateral: ");
        areaLateral = scanner.nextDouble();
        System.out.print("Informe o valor do metro quadrado: ");
        valorMetroQuadrado = scanner.nextDouble();

        areaTotal = areaFrente * areaLateral;
        valorVenda = areaTotal * valorMetroQuadrado;

        System.out.printf("A area do terreno de %.2f mts de frente com mts de %.2f lateral é: " +
                "%.2f mts%n", areaFrente, areaLateral, areaTotal);
        System.out.printf("O valor desse terreno é: R$%.2f", valorVenda);

        scanner.close();
    }
}
