package exercicio02;

import java.util.Locale;
import java.util.Scanner;

public class QuantidadeSalarios {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double salarioMinimo, salarioFuncionario, totalSalarioMinimo;

        System.out.print("Informe o valor do salario minimo: ");
        salarioMinimo = scanner.nextDouble();
        System.out.print("Informe o valor do salario do funcionario: ");
        salarioFuncionario = scanner.nextDouble();

        totalSalarioMinimo = salarioFuncionario / salarioMinimo;

        System.out.printf("O funcionarioo recebe %.1f salarios minimos!", totalSalarioMinimo);

        scanner.close();

    }
}
