import java.util.Scanner;

public class SistemaPedidos {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, digite o seu nome:"); //Anderson
        String nome = scanner.nextLine();

        System.out.println("Digite o valor do produto:"); // 300
        int valorProduto = scanner.nextInt();

        System.out.println("Digite a quantidade comprada do produto:"); // 1
        int quantidade = scanner.nextInt();

        int totalProduto = valorProduto * quantidade;

        System.out.println("Total da compra: " + totalProduto); // total da compra 300

        if (totalProduto <= 100) {
            System.out.println("Sua compra não tem direito a desconto");
        } else if (totalProduto > 100 && totalProduto <= 300) {
            System.out.println("Você recebeu 10% de desconto");
        } else {
            System.out.println("Você recebeu 15% de desconto");
        }

        int percentualDesconto = 0;

        if (totalProduto > 300) {
            percentualDesconto = 15;
        } else if (totalProduto > 100) {
            percentualDesconto = 10;
        }

        double valorDesconto = totalProduto * percentualDesconto / 100.0;
        double valorFinal = totalProduto - valorDesconto;

        double frete;
        if (valorFinal <= 200) {
            frete = 20;
        } else {
            frete = 0;
        }

        double totalComFrete = valorFinal + frete;

        System.out.println("Desconto aplicado: " + percentualDesconto + "%");
        System.out.println("Valor do desconto: R$ " + valorDesconto);
        System.out.println("Valor final sem frete: R$ " + valorFinal);
        System.out.println("Frete: R$ " + frete);
        System.out.println("Total com frete: R$ " + totalComFrete);
    }

}