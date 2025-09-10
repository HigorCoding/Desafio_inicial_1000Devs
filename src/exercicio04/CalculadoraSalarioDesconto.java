package exercicio04;

import java.util.Locale;
import java.util.Scanner;

public class CalculadoraSalarioDesconto {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double salario, salarioReajustado, descontoInss,descontoFgts, totalDesconto;

        System.out.print("Informe o salario: ");
        salario = scanner.nextDouble();

        salarioReajustado = salario * 1.15;
        descontoInss = salarioReajustado * 0.11;
        descontoFgts = salarioReajustado * 0.08;
        totalDesconto = descontoInss + descontoFgts;

        System.out.printf("Salario inicial: R$%.2f%n", salario);
        System.out.printf("Salario Reajustado: R$%.2f%n",salarioReajustado);
        System.out.printf("Desconto de 11%% INSS: R$%.2f%n", descontoInss);
        System.out.printf("Desconto de 8%% FGTS: R$%.2f%n", descontoFgts);
        System.out.printf("Total de desconto INSS+FGTS: R$%.2f%n", totalDesconto);
        System.out.printf("Salario final: R$%.2f%n", salarioReajustado - totalDesconto);

        scanner.close();

    }
}
