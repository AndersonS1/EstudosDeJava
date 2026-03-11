import java.util.HashMap;

public class EstudoHashMap {
    public static void main(String[] args) {
        HashMap<String, Double> notasAlunos = new HashMap<>();
        notasAlunos.put("Alice", 10.5);
        notasAlunos.put("Matheus", 8.0);
        notasAlunos.put("Maria", 9.9);

        for (String nome : notasAlunos.keySet()){
            double nota = notasAlunos.get(nome);
            System.out.println(nome + " : " + nota);
        }
    }
}
