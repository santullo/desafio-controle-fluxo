package br.com.santullo;

import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        try (Scanner terminal = new Scanner(System.in)) {
            System.out.println("Digite o primeiro numero: ");
            int num1 = terminal.nextInt();
            System.out.println("Digite o segundo numero: ");
            int num2 = terminal.nextInt();

            contar(num1, num2);

        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }

    }

    /**
     * Realiza a contagem entre dois números e imprime os valores no console.
     *
     * @param numero1 Primeiro número de entrada. Deve ser menor ou igual ao segundo número.
     * @param numero2 Segundo número de entrada. Deve ser maior ou igual ao primeiro número.
     * @throws ParametrosInvalidosException Se o primeiro número for maior que o segundo.
     * @apiNote Esse método imprime todos os números de 1 até a diferença entre numero2 e numero1.
     */
    public static void contar(int numero1, int numero2) throws ParametrosInvalidosException {

        if (numero1 > numero2) {
            throw new ParametrosInvalidosException();
        }

        int contador = numero2 - numero1;

        for (int i = 1; i <= contador; i++) {
            System.out.printf("Imprimindo o número %d %n", i);
        }
    }
}
