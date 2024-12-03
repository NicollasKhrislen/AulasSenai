public class Repteis extends Animal{
    private Integer escamas;
    private String tipoPele;
    private String Sexo;

    public Repteis(String especieAnimal, String nomeAnimal, Integer idadeAnimal, String nacionalidadeAnimal,
            Integer escamas, String tipoPele, String sexo) {
        super(especieAnimal, nomeAnimal, idadeAnimal, nacionalidadeAnimal);
        this.escamas = escamas;
        this.tipoPele = tipoPele;
        Sexo = sexo;
    }

    public Repteis() {
    }

    public void statusAnimal(){
        System.out.printf("\n\nSeu animal e do tipo REPTIL, a especie dele(a) e %s, com o seguinte nome %s, ele(a) possui %d anos, ele(a) nasceu no %s, ele(a) possui %d escamas e a pele dele(a) e %s, ele(a) e do sexo %s."
        ,especieAnimal, nomeAnimal, idadeAnimal, nacionalidadeAnimal, escamas, tipoPele, Sexo);
    }

    public Integer getEscamas() {
        return escamas;
    }

    public String getTipoPele() {
        return tipoPele;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setEscamas(Integer escamas) {
        this.escamas = escamas;
    }

    public void setTipoPele(String tipoPele) {
        this.tipoPele = tipoPele;
    }

    public void setSexo(String sexo) {
        Sexo = sexo;
    }
}
