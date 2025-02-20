import java.util.Scanner;

public class atividadeMedia1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int qntdDeAluno = 0;

        System.out.println("Digite a quantidade de alunos:");
        qntdDeAluno = sc.nextInt();

        String[] alunos = new String[qntdDeAluno];

        for(int x = 0; x < qntdDeAluno; x++){
            System.out.println("Digite o nome do "+(x + 1)+"º aluno: ");
            alunos[x] = sc.next();

        }

        for(int x = 0; x < qntdDeAluno; x++){
            System.out.println("Nome do "+(x + 1)+"º aluno: "+alunos[x]);
        }
        
    }
       
}