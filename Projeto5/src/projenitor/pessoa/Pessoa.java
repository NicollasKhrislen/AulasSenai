package projenitor.pessoa;

public abstract class Pessoa {
    protected String nome;
    protected String email;
    protected String sexo;
    protected double idade;

    public Pessoa(String nome, String email, String sexo, double idade) {
        this.nome = nome;
        this.email = email;
        this.sexo = sexo;
        this.idade = idade;
    }
    public Pessoa() {
    }

    public void fazerAniversario(){
        this.idade = this.idade ++;
    }

    public String getNome() {
        return nome;
    }
    public String getEmail() {
        return email;
    }
    public String getSexo() {
        return sexo;
    }
    public double getIdade() {
        return idade;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public void setIdade(double idade) {
        this.idade = idade;
    }
}
