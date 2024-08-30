import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);

        int escolha;
        System.out.println("\nSoma [1]\nDivisao [2]\nMedia [3]\nMultiplicacao [4]\nTabuada [5]\n");
        escolha = Entrada.nextInt();

        if (escolha == 1) {
            System.out.println("\nSoma!");
            somar();
        } else if (escolha == 2) {
            System.out.println("\nDivisao!");
            divisao();
        } else if (escolha == 3) {
            System.out.println("\nMedia!");
            media();
        } else if (escolha == 4) {
            System.out.println("\nMultiplicacao!");
            multiplicacao();
        } else if (escolha == 5) {
            System.out.println("\nTabuada!");
            tabuada();
        }

        System.out.println("Você chegou ao fim do programa!");
    }

    public static void somar() {
        Scanner Entrada = new Scanner(System.in);
        double Number1, Number2, Resultado;
        System.out.println("\nDigite o primeiro numero: ");
        Number1 = Entrada.nextDouble();
        System.out.println("\nDigite o segundo numero: ");
        Number2 = Entrada.nextDouble();

        Resultado = Number1 + Number2;
        System.out.println("\nResultado Soma: " + Resultado);
    }

    public static void divisao() {
        Scanner Entrada = new Scanner(System.in);
        double Number1, Number2, Resultado;
        System.out.println("\nDigite o primeiro numero: ");
        Number1 = Entrada.nextDouble();
        System.out.println("\nDigite o segundo numero: ");
        Number2 = Entrada.nextDouble();

        if (Number2 != 0) {
            Resultado = Number1 / Number2;
            System.out.println("\nResultado Divisao: " + Resultado);
        } else {
            System.out.println("\nErro: Divisão por zero não permitida.");
        }
    }

    public static void media() {
        Scanner Entrada = new Scanner(System.in);
        double Number1, Number2, Resultado;
        System.out.println("\nDigite o primeiro numero: ");
        Number1 = Entrada.nextDouble();
        System.out.println("\nDigite o segundo numero: ");
        Number2 = Entrada.nextDouble();

        Resultado = (Number1 + Number2) / 2;
        System.out.println("\nResultado Media: " + Resultado);
    }

    public static void multiplicacao() {
        Scanner Entrada = new Scanner(System.in);
        double Number1, Number2, Resultado;
        System.out.println("\nDigite o primeiro numero: ");
        Number1 = Entrada.nextDouble();
        System.out.println("\nDigite o segundo numero: ");
        Number2 = Entrada.nextDouble();

        Resultado = Number1 * Number2;
        System.out.println("\nResultado Multiplicacao: " + Resultado);
    }

    public static void tabuada() {
        Scanner Entrada = new Scanner(System.in);
        double Number1, Resultado;
        System.out.println("\nDigite o numero para calcular a tabuada: ");
        Number1 = Entrada.nextDouble();

        for (int i = 1; i <= 10; i++) {
            Resultado = Number1 * i;
            System.out.println("Resultado Tabuada de " + i + ": " + Resultado);
        }
    }
}
