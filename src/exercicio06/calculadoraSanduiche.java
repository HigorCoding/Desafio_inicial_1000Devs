package exercicio06;

import java.util.Locale;
import java.util.Scanner;

public class calculadoraSanduiche {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        final double queijo = 100.00;
        final double presunto = 50.00;
        final double hamburguer = 120.00;

        double totalSanduiche;

        System.out.print("Digite a quantidade de sanduiches: ");
        totalSanduiche = scanner.nextDouble();
        double totalQueijoKg =  totalSanduiche * queijo / 1000;
        double totalPresuntoKg  =  totalSanduiche * presunto / 1000;
        double totalHamburguerKg  =  totalSanduiche * hamburguer / 1000;


        System.out.println("Para produzir " + (int)totalSanduiche + " serão necessarios: ");
        System.out.printf("%.2f kgs de mussarela%n", totalQueijoKg);
        System.out.printf("%.2f kgs de mussarela%n", totalPresuntoKg);
        System.out.printf("%.2f kgs de mussarela%n", totalHamburguerKg);

        scanner.close();

    }
}
