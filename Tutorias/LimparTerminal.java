import java.util.Scanner;

public class LimparTerminal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Limpa o terminal no Windows
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Terminal Limpo!");

        
    }
    
}
