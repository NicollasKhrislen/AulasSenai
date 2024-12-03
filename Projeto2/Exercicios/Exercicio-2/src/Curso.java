public class Curso {
    private String nome;
    private Integer cargaTotal;
    private String descricao;

    public Curso(String nome, Integer cargaTotal, String descricao) {
        this.nome = nome;
        this.cargaTotal = cargaTotal;
        this.descricao = descricao;
    }
    public Curso() {}

    public void statusCurso(){
        System.out.println("Nome do curso: " + this.nome);
        System.out.println("Carga total de aulas do curso: " + this.cargaTotal);
        System.out.println("Descrição do curso: " + this.descricao);
        System.out.println("");
    }
}
