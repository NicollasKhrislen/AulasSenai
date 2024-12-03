public class Carro {
    private String marca;
    private String modelo;
    private String cor;
    private int qtdPortas;
    private double velocidade;

    public Carro(String cor, String marca, String modelo, int qtdPortas) {
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
        this.qtdPortas = qtdPortas;
    }

    public Carro(){

    }


    public void situacaoCarro(){
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.getCor());
        System.out.println("Velocidade: " + this.getVelocidade());
    }
    

    public void acelerar(){
        this.velocidade += 5;
    }

    public void frear(){
        this.velocidade -= 5;
    }

    public void derrapar(){
        System.out.println("Derrapando");
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getQtdPortas() {
        return qtdPortas;
    }

    public void setQtdPortas(int qtdPortas) {
        this.qtdPortas = qtdPortas;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }


    
}
