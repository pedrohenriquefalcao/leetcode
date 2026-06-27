package palindrome_number;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Desafio [9] - Verificador de Palíndromo (inteiro)");
        System.out.println("Insira o número (inteiro): ");

        int numeroEscolhido = scanner.nextInt();
        scanner.nextLine(); //limpador

        String valorOriginal = String.valueOf(numeroEscolhido);
        StringBuilder tratamento = new StringBuilder(valorOriginal);
        tratamento.reverse();
        String valorInvertido = tratamento.toString();

        if (valorOriginal.equals(valorInvertido)) {
            System.out.println("É palíndromo!");
        } else {
            System.out.println("Erro não identificado! Tente novamente!");
        }
    }
}


