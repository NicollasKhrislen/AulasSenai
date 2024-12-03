public class Principal {
    public static void main(String[] args) {
        Carro carro = new Carro("Vermelho","FIAT","Palio",4);

        Carro carro2 = new Carro();
        carro2.setCor("Preto");
        carro2.setMarca("Mercedez");
        carro2.setModelo("C-200");
        carro2.setQtdPortas(4);

        carro.acelerar();
        carro.acelerar();
        carro.acelerar();
        carro.acelerar();
        carro.acelerar();
        carro.acelerar();
        carro.acelerar();
      

        carro.situacaoCarro();
        System.out.println();
        carro2.situacaoCarro();
    }
}
