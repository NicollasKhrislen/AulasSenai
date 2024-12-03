public class SwitchCase {
    public static void main(String[] args) {
        int opcao = 4;


        // A estrutura switch case sera utilizada em situações que se tenha uma opção de escolha, nunca quando for uma operacao logico.
        
        switch(opcao){
            case 1:
                System.out.println("Hambuguer");
                break;
            case 2:
                System.out.println("Cachorro Quente");
                break;
            case 3:
                System.out.println("X-tudo de frango");
                break;

            default:
                System.out.println("Lanche invalido");
                break;

        }

    }
}
