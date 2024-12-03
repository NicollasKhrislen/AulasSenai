public abstract class Animal {
    protected String especieAnimal;
    protected String nomeAnimal;
    protected Integer idadeAnimal;
    protected String nacionalidadeAnimal;

    public Animal(String especieAnimal, String nomeAnimal, Integer idadeAnimal, String nacionalidadeAnimal) {
        this.especieAnimal = especieAnimal;
        this.nomeAnimal = nomeAnimal;
        this.idadeAnimal = idadeAnimal;
        this.nacionalidadeAnimal = nacionalidadeAnimal;
    }

    public Animal() {
    }

    public String getNomeAnimal() {
        return nomeAnimal;
    }

    public Integer getIdadeAnimal() {
        return idadeAnimal;
    }

    public String getNacionalidadeAnimal() {
        return nacionalidadeAnimal;
    }

    public String getEspecieAnimal() {
        return especieAnimal;
    }

    public void setNomeAnimal(String nomeAnimal) {
        this.nomeAnimal = nomeAnimal;
    }

    public void setIdadeAnimal(Integer idadeAnimal) {
        this.idadeAnimal = idadeAnimal;
    }

    public void setNacionalidadeAnimal(String nacionalidadeAnimal) {
        this.nacionalidadeAnimal = nacionalidadeAnimal;
    }

    public void setEspecieAnimal(String especieAnimal) {
        this.especieAnimal = especieAnimal;
    }
}
