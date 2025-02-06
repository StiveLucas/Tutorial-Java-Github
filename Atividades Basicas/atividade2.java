
import java.util.Scanner;

public class atividade2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
            int a = 1;
            while (a > 0){

                System.out.println("Digite um negativo(-) para parar");
                System.out.println("Digite um número seu Gay:");
                a = sc.nextInt();
                
            }

            System.out.println("Você não é mais gay :(");

        sc.close();
    }
}
