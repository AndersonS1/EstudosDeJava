package classificador_idade;

import java.util.Scanner;

public class classificador_idade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Criando o leitor

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt(); // Lê um número inteiro do usuário

        if (idade <= 12){
            System.out.println("Você é uma criança");
        }else if (idade >=13 && idade <=17){
            System.out.println(" Você é um adolecente");
        }else if (idade >=18 && idade <=59){
            System.out.println("Você é um adulto");
        }else {
            System.out.println("Você é um idoso");
        }

        scanner.close();
    }
}
