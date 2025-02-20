import java.util.ArrayList;
import java.util.Scanner;

public class Atividade1 {

    public static void main(String[] args) {
        int condicao = 0;
        ArrayList<String> telefones = new ArrayList<>(); // Lista para armazenar os telefones
        Scanner sc = new Scanner(System.in);

        do {
            // Limpa o terminal
            System.out.print("\033[H\033[2J");
            System.out.flush();

            System.err.println("=== Menu ===");
            System.err.println("Código | Produto");
            System.err.println("1 | Cadastrar Telefone");
            System.err.println("2 | Exibir Telefones");
            System.err.println("3 | Excluir Telefone");
            System.err.println("0 | Sair");

            System.err.print("Digite o Código: ");
            condicao = sc.nextInt();
            sc.nextLine(); // Limpa o buffer do scanner

            switch (condicao) {
                case 1:
                    // Cadastrar Telefone
                    System.out.print("Digite o telefone: ");
                    String telefone = sc.nextLine();
                    telefones.add(telefone);
                    System.err.println("Telefone cadastrado com sucesso!");
                    break;

                case 2:
                    // Exibir Telefones
                    System.err.println("=== Telefones Cadastrados ===");
                    for (String tel : telefones) {
                        System.err.println(tel);
                    }
                    break;

                case 3:
                    // Excluir Telefone
                    System.out.print("Digite o telefone a ser excluído: ");
                    String telefoneParaExcluir = sc.nextLine();
                    if (telefones.remove(telefoneParaExcluir)) {
                        System.err.println("Telefone excluído com sucesso!");
                    } else {
                        System.err.println("Telefone não encontrado!");
                    }
                    break;

                case 0:
                    System.err.println("Saindo...");
                    break;

                default:
                    System.err.println("Opção inválida! Tente novamente.");
                    break;
            }

            // Pausa para o usuário ver a mensagem
            System.out.print("Pressione Enter para continuar...");
            sc.nextLine();

        } while (condicao != 0);

        sc.close(); // Fecha o scanner
    }
}