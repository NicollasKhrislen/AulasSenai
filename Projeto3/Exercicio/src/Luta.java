
import java.util.Objects;
import java.util.Random;

public class Luta {
    private Lutador desafiante;
    private Lutador desafiado;
    private Arbitro arbitro;
    private String local;
    private Integer rounds;



    public Luta(Lutador desafiante, Lutador desafiando, Arbitro arbitro, String local, Integer rounds) {
        this.desafiante = desafiante;
        this.desafiado = desafiando;
        this.arbitro = arbitro;
        this.local = local;
        this.rounds = rounds;
    }


    public Luta(){

    }


    private boolean marcarLuta(Lutador l1, Lutador l2){
        if(!Objects.equals(this.desafiante.getCategoria(), this.desafiado.getCategoria())){
            return false;  
        } else if (Objects.equals(this.desafiante.getNome(), this.desafiado.getNome())){
            return false;
        } else{
            this.desafiante = l1;
            this.desafiado = l2;
            return true;
        }
    }

    public void lutar(Lutador l1, Lutador l2){

        if( marcarLuta(l1, l2) ){

           this.desafiado.aprensentarLutador();
           this.desafiante.aprensentarLutador();
           System.out.println("");
            
           while(l1.getVida() > 0 && l2.getVida() > 0) {
            Random random = new Random();
            int golpe = random.nextInt(2);

            switch (golpe) {
                case 0:
                    l2.setVida(l2.getVida()-10);
                    System.out.printf("O %s deu um golpe em %s\n", l1.getNome(), l2.getNome());
                    break;
                case 1:
                    l1.setVida(l1.getVida()-10);
                    System.out.printf("O %s deu um golpe em %s\n", l2.getNome(), l1.getNome());
                    break;
            }
        }
        
        if(l2.getVida() <= 0){
            this.desafiante.setVitorias(this.desafiante.getVitorias() + 1);
            this.desafiado.setDerrotas(this.desafiado.getDerrotas() + 1);
            System.out.printf("\nLutador %s ganhou!\n\n", this.desafiante.getNome());
        } else if(l1.getVida() <= 0){
            this.desafiado.setVitorias(this.desafiado.getVitorias() + 1);
            this.desafiante.setDerrotas(this.desafiante.getDerrotas() + 1);
            System.out.printf("\nLutador %s ganhou!\n\n", this.desafiado.getNome());
        }

        } else{
            System.out.println("Luta nao pode acontecer");
        }
    }




    public Lutador getDesafiante() {
        return desafiante;
    }
    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }
    public Lutador getDesafiado() {
        return desafiado;
    }
    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }
    public Arbitro getArbitro() {
        return arbitro;
    }
    public void setArbitro(Arbitro arbitro) {
        this.arbitro = arbitro;
    }
    public String getLocal() {
        return local;
    }
    public void setLocal(String local) {
        this.local = local;
    }
    public Integer getRounds() {
        return rounds;
    }
    public void setRounds(Integer rounds) {
        this.rounds = rounds;
    }






    
}
