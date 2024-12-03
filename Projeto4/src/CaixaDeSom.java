import java.util.TimerTask;

import java.util.Timer;

public class CaixaDeSom implements InterfaceCaixaDeSom {

    private boolean ligada;
    private String modelo;
    private boolean tocando;
    private Double bateria;
    private double volume;

    public CaixaDeSom(String modelo) {
        this.ligada = false;
        this.modelo = "BoomBox";
        this.tocando = false;
        this.bateria = 100.0;
        this.volume = 10.0;
    }

    public void FuncionamentoCaixaDeSom() {
        Timer timer1 = new Timer();
        Timer cronometro = new Timer();

        int milissegundos = 5000;
        
        while (this.bateria > 0) {
            TimerTask tarefa = new TimerTask() {
                @Override
                public void run() {
                    System.out.println("Teste");
                }
            };

            cronometro.schedule(tarefa, milissegundos);
        }
    }

    @Override
    public void Ligar() {
        if (this.ligada == false && tocando == false && bateria > 0) {
            System.out.println("Ligando a caixinha...");
            this.ligada = true;
            System.out.printf("Sua caixinha esta ligada com %d% de bateria, com o seguinte modelo %s.", bateria,
                    modelo);
        }
    }

    @Override
    public void Desligar() {
        if (this.ligada == true) {
            System.out.println("Desligando a caixinha...");
            this.ligada = false;
            this.tocando = false;
        }

    }

    @Override
    public void aumentarVolume() {
        if (this.ligada == true && this.volume <= 95) {
            System.out.println("Aumentando o volume da caixinha...");
            this.volume = this.volume + 5;
        }

    }

    @Override
    public void diminuirVolume() {
        if (this.ligada == true && this.volume >= 5) {
            System.out.println("Diminuindo o volume da caixinha...");
            this.volume = this.volume - 5;
        }

    }

    @Override
    public void avancarMusica() {
        // TODO Auto-generated method stub

    }

    @Override
    public void voltarMusica() {
        // TODO Auto-generated method stub

    }

    @Override
    public void play() {
        if (this.ligada == true && this.tocando == false) {
            System.out.println("Iniciando a musica da caixinha...");
            this.tocando = true;
        }
    }

    @Override
    public void pause() {
        if (this.ligada == true && this.tocando == true) {
            System.out.println("Pausando a musica da caixinha...");
            this.tocando = false;
        }
    }

    public void abrirMenu() {

    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    public void setBateria(Double bateria) {
        this.bateria = bateria;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public boolean isLigada() {
        return ligada;
    }

    public String getModelo() {
        return modelo;
    }

    public boolean isTocando() {
        return tocando;
    }

    public Double getBateria() {
        return bateria;
    }

    public double getVolume() {
        return volume;
    }

    public CaixaDeSom(boolean ligada, String modelo, boolean tocando, Double bateria, double volume) {
        this.ligada = ligada;
        this.modelo = modelo;
        this.tocando = tocando;
        this.bateria = bateria;
        this.volume = volume;
    }

}
