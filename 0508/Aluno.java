public class Aluno {
    private String nome;
    private int idade;
    private double nota;

    public Aluno(String nome, int idade, double nota) {
        this.nome = nome;
        this.idade = idade;
        this.nota = nota;
    }

    public void apresentar() {
        System.out.println("Oii, meu nome é " + nome + ", tenho " + idade + " anos.");
    }

    public void aprovar(){
        if (nota >= 6.0){
            System.out.println("Aprovado com nota:" + nota);
        } else {
            System.out.println("Reprovado com nota:" + nota);
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public static void main(String[] args){
        Aluno aluno1 = new Aluno("João", 20, 8.0);
        aluno1.apresentar();
        aluno1.aprovar();
        aluno1.setNome("Kalil");
        aluno1.setNota(5.0);
        aluno1.apresentar();
        aluno1.aprovar();
    }
}
