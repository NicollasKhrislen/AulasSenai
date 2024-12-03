public class App {
    public static void main(String[] args) throws Exception {
        Curso curso = new Curso("Analise e Desenvolvimento de Sistemas",1000,"Curso de desenvolvimento de sistemas.");
        Curso curso2 = new Curso("Informatica",200,"Curso de montagem de computadores.");

        curso.statusCurso();
        curso2.statusCurso();
    }
}
