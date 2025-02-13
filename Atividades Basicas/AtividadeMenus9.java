import java.util.Scanner;

public class AtividadeMenus9 {
    public static void main(String[] args) {

        int condicao = 0;
        double valorFinal = 0;

        
            Scanner sc = new Scanner(System.in);

            System.err.println("Digite o valor de A:");
            int a = sc.nextInt();

            System.err.println("Digite o valor de B:");
            int b = sc.nextInt();
            
        do{

            System.err.println("=== Menu das Operções ===");
            System.err.println("Código | Operções");
            System.err.println("1 | Adição");
            System.err.println("2 | Subtração");
            System.err.println("3 | Multiplicação");
            System.err.println("4 | Divisão");
            System.err.println("0 | Sair");

            System.err.println("Digite o Codigo:");
            condicao = sc.nextInt();

            switch (condicao) {
                case 1:

                    // Limpa o terminal
                    System.out.print("\033[H\033[2J");
                    System.out.flush();

                    valorFinal = a + b;

                    System.err.println("Soma dos valores de A mais B: "+valorFinal);
                    
                    break;

                case 2:

                    // Limpa o terminal
                    System.out.print("\033[H\033[2J");
                    System.out.flush();

                    valorFinal = a - b;

                    System.err.println("Subtração dos valores de A mais B: "+valorFinal);

                    break;
                    
                case 3:

                    // Limpa o terminal
                    System.out.print("\033[H\033[2J");
                    System.out.flush();

                    valorFinal = a * b;

                    System.err.println("Multiplicação dos valores de A mais B: "+valorFinal);

                    break;

                case 0:

                    // Limpa o terminal
                    System.out.print("\033[H\033[2J");
                    System.out.flush();

                    valorFinal = a / b;

                    System.err.println("Divisão dos valores de A mais B: "+valorFinal);

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
