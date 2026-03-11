import java.util.Scanner;

public class logica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá, Digite o seu nome: ");
        String nome=scanner.nextLine();

        System.out.println("Digite a sua idade");
        int idade=scanner.nextInt();
        System.out.println("Olá " +nome);
        System.out.println("Você possui " +idade + " anos");

        if (idade>=0 && idade<=17){
            System.out.println(nome + " Você não possui idade para dirigir !");
        } else {
            System.out.println(nome + " você possui idade para dirigir");

        }
    }
}
