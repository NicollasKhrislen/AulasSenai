public class Lutador {
    private String nome;
    private double peso;
    private String nacionalidade;
    private String categoria;
    private Integer vitorias;
    private Integer empates;
    private Integer derrotas;
    private Integer vida;

    public Lutador(String nome, double peso, String nacionalidade,  Integer vitorias, Integer empates,
        Integer derrotas) {
        this.nome = nome;
        this.peso = peso;
        this.nacionalidade = nacionalidade;
        this.categoria = definirCategoria(peso);
        this.vitorias = vitorias;
        this.empates = empates;
        this.derrotas = derrotas;
        this.vida = 100;
    }

    public Lutador(){}

    private String definirCategoria(Double Peso){
        if(Peso <= 51){
            return "Flyweight";
        } else if(Peso > 51 && Peso <= 54){
            return "Bantamweight";
        } else if(Peso > 54 && Peso <= 57){
            return "Featherweight";
        } else if(Peso > 57 && Peso <= 60){
            return "Lightweight";
        } else if(Peso > 60 && Peso <= 63.5){
            return "Middleweight";
        } else{
            return "Heavyheight";
        }
    }

    public void aprensentarLutador(){
        System.out.printf("Lutador com um cartel de %d vitorias, %d empates e %d derrotas. Lutando de %s, ele %s \n", this.vitorias, this.empates,this.derrotas, this.nacionalidade, this.nome);
    }

    public void treinar(){
        System.out.println("treinando....");
    }

    @Override
    public String toString() {
        return "Lutador [nome=" + nome + ", peso=" + peso + ", nacionalidade=" + nacionalidade + ", categoria="
                + categoria + ", vitorias=" + vitorias + ", empates=" + empates + ", derrotas=" + derrotas + ", vida="
                + vida + "]";
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public Integer getVitorias() {
        return vitorias;
    }
    public void setVitorias(Integer vitorias) {
        this.vitorias = vitorias;
    }
    public Integer getEmpates() {
        return empates;
    }
    public void setEmpates(Integer empates) {
        this.empates = empates;
    }
    public Integer getDerrotas() {
        return derrotas;
    }
    public void setDerrotas(Integer derrotas) {
        this.derrotas = derrotas;
    }
    public void setVida(Integer vida) {
        this.vida = vida;
    }
    public Integer getVida() {
        return vida;
    }




    
}
