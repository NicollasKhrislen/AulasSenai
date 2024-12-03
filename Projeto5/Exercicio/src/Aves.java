public class Aves extends Animal{
    private Integer Penas;
    private Integer Asas;
    private String Sexo;

    public Aves(String especieAnimal, String nomeAnimal, Integer idadeAnimal, String nacionalidadeAnimal, Integer penas,
            Integer asas, String sexo) {
        super(especieAnimal, nomeAnimal, idadeAnimal, nacionalidadeAnimal);
        Penas = penas;
        Asas = asas;
        Sexo = sexo;
    }

    public Aves() {
    }

    public void statusAnimal(){
        System.out.printf("\n\nSeu animal e do tipo AVE, a especie dele(a) e %s, com o seguinte nome %s, ele(a) possui %d anos, ele(a) nasceu no %s, ele(a) possui %d penas e %d asas, ele(a) e do sexo %s."
        ,especieAnimal, nomeAnimal, idadeAnimal, nacionalidadeAnimal, Penas, Asas, Sexo);
    }

    public Integer getPenas() {
        return Penas;
    }

    public Integer getAsas() {
        return Asas;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setPenas(Integer penas) {
        Penas = penas;
    }

    public void setAsas(Integer asas) {
        Asas = asas;
    }

    public void setSexo(String sexo) {
        Sexo = sexo;
    }
}
