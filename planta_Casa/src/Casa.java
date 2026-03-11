public class Casa {
    public static void main(String[] args) {
     // Criando o objeto casa
     PlantaCasa casa = new PlantaCasa();

     // Inicializando os atributos (Variaveis) (Caracteristicas) casa
        casa.numeroBanheiros = 2;
        casa.numeroQuartos = 3;
        casa.metragem = 70;
        casa.material = "Tijolo";
        casa.cor = "Cinza";

        // Chamada da função 
        casa.construir();
        casa.pintar();
    }
}
