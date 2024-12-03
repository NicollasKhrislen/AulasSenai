public class Aluno {
    private String nome;
    private String email;
    private String endereco;
    private Integer idade;
    private Integer matricula;

    public Aluno(String nome, String email, String endereco, Integer idade, Integer matricula) {
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
        this.idade = idade;
        this.matricula = matricula;
    }

    public Aluno() {
        
    }

    //metodods assessores
    public String getNome() {
        return nome;
    }
    public String getEmail() {
        return email;
    }
    public String getEndereco() {
        return endereco;
    }
    public int getIdade() {
        return idade;
    }
    public int getMatricula() {
        return matricula;
    }

    //metodos

    public void estudar(){
        System.out.println("O aluno " + this.nome + " esta estudando");
    }

    public void pagarMensalidade(){
        System.out.println("Pagando mensalidade");
    }

    public void fazerAniversario(){
        idade = idade++;
    }

    public void statusAluno(){
        System.out.println("Nome" + this.nome);
        System.out.println("Idade" + this.idade);
        System.out.println("Matricula" + this.matricula);
        System.out.println("Email" + this.email);
        System.out.println("Endereco" + this.endereco);
    }
}
