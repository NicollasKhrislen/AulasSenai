public class Professores {
    private String nome;
    private Integer idade;
    private Integer nivel;
    private Integer salario;

    public Professores(String nome, Integer idade, Integer nivel, Integer salario) {
        this.nome = nome;
        this.idade = idade;
        this.nivel = nivel;
        this.salario = salario;
    }
    public Professores(){}

    public void valoresProfessor(){
        if(this.nivel == 1){
            this.salario = 12;
        } else if(this.nivel == 2){
            this.salario = 17;
        } else if(this.nivel == 3){
            this.salario = 25;
        } else{
            System.out.println("Nivel inexistente!!");
        }
    }

    public void statusProfessor(){
        System.out.println("Nome do professor: " + this.nome);
        System.out.println("Idade do professor: " + this.idade);
        System.out.println("Nivel do professor: " + this.nivel);
        System.out.println("Salario do professor por hora: " + "R$" + this.salario);
        System.out.println("");
    }
}
