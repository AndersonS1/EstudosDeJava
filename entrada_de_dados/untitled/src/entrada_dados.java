import java.util.Scanner;

public class entrada_dados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá digite seu nome:");
        String nome= scanner.nextLine();
        System.out.println("Seu nome é : "+nome);
    }
}
