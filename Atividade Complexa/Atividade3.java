import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        ArrayList<String> palavras = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 10 palavras:");

        for(int x = 0; x < 10; x++){
            System.out.println("Digite a "+ (x + 1) +"º palavra: ");
            String palavra = sc.next();
            palavras.add(palavra);
        }

         // Imprime os valores da lista
        System.out.println("\nLista antes da ordenação:");
        for (String s : palavras) {
            System.out.println(s);
        }
        
        // Ordena a lista
        Collections.sort(palavras);
        
        // Imprime os valores ordenados da lista
        System.out.println("\nLista após a ordenação:");
        for (String s : palavras) {
            System.out.println(s);
        }
        
        sc.close();
    }

        
}
