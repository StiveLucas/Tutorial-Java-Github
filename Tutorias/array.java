import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int []numeros = new int[5];
        int soma = 0;

        for(int i = 0; i< numeros.length; i++){
            System.out.println("Digite o numero "+(i+1)+":");
            numeros[i] = sc.nextInt();
            soma+=numeros[i];

        }

        System.out.println("A soma dos elementos do araay é "+soma);;
        sc.close();;
    }
    
}