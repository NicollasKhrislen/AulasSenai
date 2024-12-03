
import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.println("Informe um numero entre 0 e 10: ");
            int c = 0;
            System.out.println("Infome um numero: ");
            int n = scanner.nextInt();

            //Enquanto a condicao for verdadeira, execute o bloco de codigo.
            while (n < 0 || n > 10) { 
                c++;
                System.out.println("Numero nao esta entre 0 e 10");
                n = scanner.nextInt();
            }

            System.out.println(c);


        scanner.close();
    }
}
