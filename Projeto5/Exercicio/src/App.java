public class App {
    public static void main(String[] args) throws Exception {
        Mamiferos m = new Mamiferos("Cachorro","Paçoca", 3, "Brasil", 4, 10000,"M");
        m.statusAnimal();

        Repteis r = new Repteis("Dragão de Comodo","Brutos", 15, "Japão", 10000, "Pele impermeável","M");
        r.statusAnimal();

        Aves a = new Aves("Arara azul","Jade", 7, "Brasil", 10000, 2,"F");
        a.statusAnimal();
    }
}
