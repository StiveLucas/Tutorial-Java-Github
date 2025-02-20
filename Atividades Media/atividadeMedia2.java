import java.util.Scanner;

public class atividadeMedia2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[2];
        int soma = 0;
        double media = 0;

        for(int x = 0; x < numeros.length; x++){
            System.out.println("Digite o valor do "+ (x + 1) + "º número: ");
            numeros[x] = sc.nextInt();
            soma += numeros[x];

        }

        media = soma / 2;

        System.out.println("Média dos números: "+media);

    }
    
}
