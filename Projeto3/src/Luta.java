import java.util.Objects;

public class Luta {
    private Lutador desafiante;
    private Lutador desafiado;
    
    public Luta(Lutador desafiante, Lutador desafiado) {
        this.desafiante = desafiante;
        this.desafiado = desafiado;
    }

    public Luta() {}

    private boolean marcarLuta(Lutador l1, Lutador l2){
        if(!Objects.equals(this.desafiante.getCategoria(), this.desafiado.getCategoria())){
            return false;
        } else if(Objects.equals(this.desafiante.getNome(), this.desafiado.getNome())){
                return false;
        } else{
            
        }
                return false;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }
}
