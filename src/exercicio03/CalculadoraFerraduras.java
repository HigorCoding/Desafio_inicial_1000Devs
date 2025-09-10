package exercicio03;

import java.util.Locale;
import java.util.Scanner;

public class CalculadoraFerraduras {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double cavalo, ferradura, valorFerraduraTotal;

        System.out.print("Informe a quantidade de cavalos: ");
        cavalo = scanner.nextDouble();
        System.out.print("Informe o valor de cada ferradura R$: ");
        ferradura = scanner.nextDouble();

        valorFerraduraTotal = ferradura * (cavalo *4);

        System.out.printf("A quantidade de ferraduras necessarias: R$%.2f%n", cavalo * 4);
        System.out.printf("O valor total para compra das ferraduras é de: R$%.2f", valorFerraduraTotal);

        scanner.close();




    }
}
