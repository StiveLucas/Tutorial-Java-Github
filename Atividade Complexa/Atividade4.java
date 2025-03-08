import java.util.ArrayList;
import java.util.Scanner;

public class Atividade4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in)
        ArrayList<String> list = new ArrayList<>();

        int codigo = 0;
        while (codigo != 4) {

            System.err.println("=== Menu ===");
            System.err.println("Código | Produto");
            System.err.println("1 | Cadastro");
            System.err.println("2 | Listar ");
            System.err.println("3 | Remover:");
            System.err.println("0 | Sair");

            System.err.println("Digite o Codigo:");
            codigo = sc.nextInt();

            switch (codigo) {
                case 1:
                
                    System.out.println("Digite o nome do usuário: ");
                    String nome = sc.next();
                    System.out.println("Digite o telefone do usuário: ");
                    String telefone = sc.next();
                    
                    break;
            
                default:
                    break;
            }

            
        }
    }
}