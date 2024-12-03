public class Aluno {
    private String nome;
    private Integer nota1;
    private Integer nota2;
    private Integer nota3;
    private Integer media;
    private String situacao;

    public Aluno(String nome, Integer nota1, Integer nota2, Integer nota3, Integer media, String situacao) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.media = media;
        this.situacao = situacao;
    }
    public Aluno(){}

    public void mediaAluno(){
        this.media = (nota1 + nota2 + nota3) / 3;

        if(media < 4){
            this.situacao = "Reprovado!!";
        } else if (media >= 4 && media <= 7) {
            this.situacao = "Recuperação!!";
        } else {
            this.situacao = "Aprovado!!";
        }
    }

    public void situacaoAluno(){
        System.out.println("Nome do aluno: " + this.nome);
        System.out.println("Media do aluno: " + this.media);
        System.out.println("Situação do aluno: " + this.situacao);
        System.out.println("");
    }
}
