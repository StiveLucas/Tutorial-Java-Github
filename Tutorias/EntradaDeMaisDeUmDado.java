
import java.util.Scanner;

public class EntradaDeMaisDeUmDado {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Digite seu Nome:");
            String nome=sc.next();
            System.out.println("Digite sua Idade:");
            double idade=sc.nextDouble();
            System.out.println("Olá "+nome+" sua idade é "+idade);

        sc.close();
    }
    
}
