import java.util.Scanner;

public class pratica2{

        public static void main(String[] args){

                
                int a = 0;
                int b = 0;
                int c = 25;
                int somaDeAMasB = 0;

                Scanner sc = new Scanner(System.in);

                        // Limpa o terminal no Windows
                        System.out.print("\033[H\033[2J");
                        System.out.flush();

                        System.err.println("Digite o valor de A:");
                        a = sc.nextInt();
                        System.err.println("Digite o valor de B:");
                        b = sc.nextInt();

                        somaDeAMasB = a + b;

                        if (somaDeAMasB > c) {
                                System.err.println("A soma de A mais B é superior a C. \nValor de C: "+c+" \t Valor das somas de A mais B: "+somaDeAMasB);
                                
                        }else{

                                System.err.println("A soma de A mais B é menor que C. \nValor de C: "+c+" \t Valor das somas de A mais B: "+somaDeAMasB);
                        }

                        

            
        }

}