public class IfElse {
    public static void main(String[] args) {
        int n = 0;

        //A codicional if-else sera utilizada em situacoes que se tenham uma condicao lógica podendedo ser simples, ou seja, se nao for uma coisa é outra. E pode tbm ser composta onde pode existir varias possibilidades. O else sera a ultima opcao, se noa for nenhuma das opcoes acima ele sera executado.
        if (n > 0) {
            System.out.println("É maior que 0 ");
        } else if(n < 0){ 
            System.out.println("Não é maior que 0 ");
        } else{
            System.out.println("O numero é 0");

        }
    }
}
