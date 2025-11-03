public class arraysList {
    public static void main(String[] args) {
        //declaração de array
        int[] numeros= {10,20,30,40,50};


        // Outro modo de declarar arrays
        String[] frutas = new String[]{"Maça", "Morango", "Mamão"};


        for(int posicao = 0; posicao <numeros.length; posicao++){
            System.out.println(numeros[posicao]);
        }

        int[] idades = {18, 21, 25, 30, 27};
        int soma = 0;

        for (int i = 0; i < idades.length; i++) {
            soma += idades[i];
        }

        double media = (double) soma / idades.length;
        System.out.println("A média das idades é: " + media);
    }





}
