package exercicio05;

import java.util.Locale;
import java.util.Scanner;

public class calculadoraGranja {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        final double chipIdenticacao = 4.00;
        final double chipAlimento = 7.00;
        double quantidadeFrango;
        double totalValorChip;

        System.out.print("Digite a QTDE de frangos: ");
        quantidadeFrango = scanner.nextDouble();

        totalValorChip =(quantidadeFrango * chipIdenticacao) + (chipAlimento* quantidadeFrango);

        System.out.printf("O valor total para identificar os frangos é: R$%.2f", totalValorChip);

        scanner.close();
    }
}
