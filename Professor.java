public class Professor extends Funcionario {
    private String disciplina;

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    public String getDisciplina() {
        return this.disciplina;
    }

    public Professor (String nome, int idade, String endereco, double salario, String disciplina){
        super(nome, idade, endereco, salario);
        this.disciplina = disciplina;
    }

    public Professor (){
        
    }
    
}

