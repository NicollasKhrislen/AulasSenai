public class Mamiferos extends Animal{
    private Integer Patas;
    private Integer Pelos;
    private String Sexo;

    public Mamiferos(String especieAnimal,String nomeAnimal, Integer idadeAnimal, String nacionalidadeAnimal, Integer patas, Integer pelos,
            String sexo) {
        super(especieAnimal, nomeAnimal, idadeAnimal, nacionalidadeAnimal);
        Patas = patas;
        Pelos = pelos;
        Sexo = sexo;
    }

    public Mamiferos() {
    }

    public void statusAnimal(){
        System.out.printf("\n\nSeu animal e do tipo MAMIFERO, a especie dele(a) e %s, com o seguinte nome %s, ele(a) possui %d anos, ele(a) nasceu no %s, ele(a) possui %d patas e %d pelos, ele(a) e do sexo %s."
        ,especieAnimal, nomeAnimal, idadeAnimal, nacionalidadeAnimal, Patas, Pelos, Sexo);
    }

    public Integer getPatas() {
        return Patas;
    }

    public Integer getPelos() {
        return Pelos;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setPatas(Integer patas) {
        Patas = patas;
    }

    public void setPelos(Integer pelos) {
        Pelos = pelos;
    }

    public void setSexo(String sexo) {
        Sexo = sexo;
    }
}
