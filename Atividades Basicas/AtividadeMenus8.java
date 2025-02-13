import java.util.Scanner;

public class AtividadeMenus8 {
     public static void main(String[] args) {

        int condicao = 0;

        do{
            Scanner sc = new Scanner(System.in);

            System.err.println("=== Menu ===");
            System.err.println("Código | Produto");
            System.err.println("1 | Mochila Escolar");
            System.err.println("2 | Mochila de Viagem");
            System.err.println("3 | Mochila Esportiva:");
            System.err.println("0 | Sair");

            System.err.println("Digite o Codigo:");
            condicao = sc.nextInt();

            switch (condicao) {
                case 1:

                    // Limpa o terminal
                    System.out.print("\033[H\033[2J");
                    System.out.flush();

                    System.err.println("\t\t=== Descrição ===");
                    System.err.println("Mochila Escolar: Compacta e ideal para estudantes");
                    System.err.println("\n");
                    
                    break;

                case 2:

                    // Limpa o terminal
                    System.out.print("\033[H\033[2J");
                    System.out.flush();

                    System.err.println("\t\t=== Descrição ===");
                    System.err.println("Mochila de Viagem: Espaçosa, ideal para longas jornadas");
                    System.err.println("\n");

                    break;
                    
                case 3:

                    // Limpa o terminal
                    System.out.print("\033[H\033[2J");
                    System.out.flush();

                    System.err.println("\t\t=== Descrição ===");
                    System.err.println("Mochila Esportiva: Leve, resistente e ergonômica");
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
