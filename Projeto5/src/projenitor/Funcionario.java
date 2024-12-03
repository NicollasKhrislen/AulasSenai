package projenitor;

import projenitor.pessoa.Pessoa;

public class Funcionario extends Pessoa {
    private String setor;

    public Funcionario(String nome, String email, String sexo, double idade, String setor) {
        super(nome, email, sexo, idade);
        this.setor = setor;
    }

    public Funcionario() {
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getSetor() {
        return setor;
    }
}
