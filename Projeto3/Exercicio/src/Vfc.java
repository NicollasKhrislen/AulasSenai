public class Vfc {
    public static void main(String[] args) {
        Lutador lutador1 = new Lutador("Charles do Bronxs", 60, "Brasil", 30, 2, 1);
        Lutador lutador2 = new Lutador("Michael Chandler", 60, "Estados unidos", 27, 2, 1);
        Arbitro arbitro = new Arbitro("Marc Godgard", "Estados unidos", 30);

        Luta luta = new Luta(lutador1, lutador2, arbitro, "Senai Taguantinga", 3);
    
        luta.lutar(lutador1, lutador2);

        System.out.println(lutador1.toString()); 
        System.out.println(lutador2.toString());
    }
}
