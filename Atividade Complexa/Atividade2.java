import java.util.ArrayList;
import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 10 números inteiros.");

        for(int x = 0; x < 10; x++){
            System.out.println("Digite o "+(x + 1)+"º número: ");
            int numero = sc.nextInt();
            numeros.add(numero);
            
            if (numero == 10 || numero == 100 || numero == 1000) {
                System.out.println("Você ganhou um bônus de R$ 50,00!");
            }
    }

        System.out.println("Números informados: " + numeros);

        sc.close();
      
    }
    
}
