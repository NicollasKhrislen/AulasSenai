public class App {
    public static void main(String[] args) throws Exception {
        Professores professor = new Professores("Marcos",27,1,0);
        Professores professor2 = new Professores("Mario",35,2,0);
        Professores professor3 = new Professores("Edu",57,3,0);

        professor.valoresProfessor();
        professor2.valoresProfessor();
        professor3.valoresProfessor();

        professor.statusProfessor();
        professor2.statusProfessor();
        professor3.statusProfessor();
    }
}
