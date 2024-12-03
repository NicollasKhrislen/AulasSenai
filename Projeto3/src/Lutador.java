public class Lutador {
    private String nome;
    private Double peso;
    private String nacionalidade;
    private String categoria;
    private Integer vitorias;
    private Integer empates;
    private Integer derrotas;

    public Lutador(String nome, Double peso, String nacionalidade, String categoria, Integer vitorias, Integer empates,
            Integer derrotas) {
        this.nome = nome;
        this.peso = peso;
        this.nacionalidade = nacionalidade;
        this.categoria = categoria;
        this.vitorias = vitorias;
        this.empates = empates;
        this.derrotas = derrotas;
    }

    public Lutador(){}

    public void statusLutador(){
        System.out.printf("Lutador com um cartel de %d vitorias, %d empates, %d derrotas, com um peso igual a %d, vindo diretamente do %s, %s",
        this.vitorias,this.empates,this.derrotas,this.peso,this.nacionalidade,this.nome);
    }

    public String getNome() {
        return nome;
    }
    public Double getPeso() {
        return peso;
    }
    public String getNacionalidade() {
        return nacionalidade;
    }
    public String getCategoria() {
        return categoria;
    }
    public Integer getVitorias() {
        return vitorias;
    }
    public Integer getEmpates() {
        return empates;
    }
    public Integer getDerrotas() {
        return derrotas;
    }

    
}
