import java.util.Scanner;

public class AtividadeMenus7 {
    public static void main(String[] args) {

        int condicao = 0;

        do{
            Scanner sc = new Scanner(System.in);

            System.err.println("=== Menu ===");
            System.err.println("Código | Produto");
            System.err.println("1 | Caneta Esferográfica");
            System.err.println("2 | Caneta Gel: Tinta ");
            System.err.println("3 | Caneta Tinteiro:");
            System.err.println("0 | Sair");

            System.err.println("Digite o Codigo:");
            condicao = sc.nextInt();

            switch (condicao) {
                case 1:

                    // Limpa o terminal
                    System.out.print("\033[H\033[2J");
                    System.out.flush();

                    System.err.println("\t\t=== Descrição ===");
                    System.err.println("Caneta Esferográfica: Econômica e de longa duração");
                    System.err.println("\n");
                    
                    break;

                case 2:

                    // Limpa o terminal
                    System.out.print("\033[H\033[2J");
                    System.out.flush();

                    System.err.println("\t\t=== Descrição ===");
                    System.err.println("Caneta Gel: Tinta mais pigmentada e escrita suave");
                    System.err.println("\n");

                    break;
                    
                case 3:

                    // Limpa o terminal
                    System.out.print("\033[H\033[2J");
                    System.out.flush();

                    System.err.println("\t\t=== Descrição ===");
                    System.err.println("Caneta Tinteiro: Clássica e elegante, usada para caligrafia");
                    System.err.println("\n");

                    break;

                case 0:

                    // Limpa o terminal
                    System.out.print("\033[H\033[2J");
                    System.out.flush();

                    System.err.println("Saindo do programa . . .");
                    System.err.println("\n");

                    break;

                default:

                    // Limpa o terminal
                    System.out.print("\033[H\033[2J");
                    System.out.flush();

                    System.err.println("Opção inválida. tente novamente.");
                    System.err.println("\n");

                    break;
            }

        } while(condicao != 0);
        
    }
    
}
