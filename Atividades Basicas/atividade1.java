import java.util.Scanner;


public class atividade1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Digite o valor de a:");
            int a= sc.nextInt();
            System.out.println("Digite o valor de b:");
            int b= sc.nextInt();

            if (a > b){

                System.out.println("A é maior que B");
            }else{
                
                System.out.println("B é maior que A");
            }
           
        sc.close();
    }
    
}
