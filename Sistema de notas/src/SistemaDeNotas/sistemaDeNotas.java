package SistemaDeNotas;
import java.util.Scanner;

public class sistemaDeNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua nota");
        double nota = scanner.nextInt();

        if(nota <0 || nota >10){
            System.out.println("Nota inválida! Digite um valor entre 0 e 10.");
        }else if (nota >= 7) {
            System.out.println("Aprovado");
        } else if (nota >= 5) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }

        scanner.close();


    }
}
