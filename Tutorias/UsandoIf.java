import java.util.Scanner;

public class UsandoIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Digite sua idade:");
            int idade = sc.nextInt();

            if(idade <= 12){

                System.out.println("Você é uma criança, sua idade: "+idade);
            }

            if(idade >= 13 && idade <= 17){

                System.out.println("Você é um adolescente, sua idade: "+idade);

            }

            if(idade >= 18 && idade <= 59){

                System.out.println("Você é um adulto, sua idade: "+idade);
            }

            if(idade >= 60){

                System.out.println("Você é um idoso, sua idade: "+idade);
            }

    }
    
}

