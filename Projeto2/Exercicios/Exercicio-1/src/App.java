public class App {
    public static void main(String[] args) throws Exception {
        Aluno aluno = new Aluno("Nicollas", 10,7,8,0,"");
        Aluno aluno2 = new Aluno("Pedro", 2,2,2,0,"");
        Aluno aluno3 = new Aluno("Victor", 7,7,7,0,"");

        aluno.mediaAluno();
        aluno.situacaoAluno();

        aluno2.mediaAluno();
        aluno2.situacaoAluno();

        aluno3.mediaAluno();
        aluno3.situacaoAluno();
    }
}
