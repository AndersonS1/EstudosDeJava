import java.util.ArrayList;
import java.util.List;

public class arraysList {
    public static void main(String[] args) {
        // Sintaxe do ArrayList
        List<String> listaDeCompras = new ArrayList<>();
        listaDeCompras.add("Mamão");
        listaDeCompras.add("Maçã");
        listaDeCompras.add("Macarrão");

        //Metodo para adicionar um elemento no ArrayList ( primeiro passa a posiçao " 1 " e depois o nome do item
        listaDeCompras.add(1, "Banana");

        // FOR para interar sobre o ArrayList
        for (String item : listaDeCompras) {
            System.out.println(item);
        }

        // Metodo para pegar/chamar o item na posiçao 3
        String item = listaDeCompras.get(3);
        System.out.println("Na posição 3 eu tenho:" + item);

        // Nesse FOR , é para exibir a impressão acima - Importante mudar para item2
        for (String item2 : listaDeCompras){
            System.out.println(item2);
        }
        // Verificar se a lista está vazia ( isEmpty )
        boolean eVazia = listaDeCompras.isEmpty();

        // Verifica o tamnho da lista
        int tamanho = listaDeCompras.size();

        //Verifica se existe dentro da lista a palavra " Arroz "
        boolean contem = listaDeCompras.contains("Arroz");

        System.out.println(" A lista esta vazia? " + eVazia + ", qual o tamanho da lista? " + tamanho + ", a lista contem o item Arroz? " + contem );

        // USando o forEach para interar sobre o ArrayList
        listaDeCompras.forEach(produto -> System.out.println(produto));

        // Limpar a lista " clear "
        listaDeCompras.clear();
        System.out.println("A lista de compras está vazia? " + listaDeCompras.isEmpty());


    }
}
