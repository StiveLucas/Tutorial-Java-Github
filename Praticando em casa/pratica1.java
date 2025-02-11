import java.util.Scanner;


public class pratica1 {

    public static void main(String[] args) {

        double notaFinal = 0;
        double media = 0;

        Scanner sc = new Scanner(System.in);
            System.err.println("Digite seu nome:");
            String nomeAluno = sc.next();
            System.err.println("Digite sua idade:");
            int idadeAluno = sc.nextInt();
            
            int x = 0;
            int y = 1;
            while(x < 3){
                System.err.println("Digite sua "+y+"º nota:");
                double nota = sc.nextDouble();

                x++;
                y++;
                
                notaFinal += nota;
            }

            media = notaFinal / 3;

            System.err.println("A Média do aluno "+nomeAluno+", com a idade de "+idadeAluno+", é: "+media);

    }
}