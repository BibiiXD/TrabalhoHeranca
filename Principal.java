public class Principal {
    public static void main(String[] args){
        Aluno aluno1 = new Aluno("Gabi", 17, "Etec", "2° Semestre", "Informática");
        Professor professor = new Professor("Isaque", 39, "Palmital", 10000, "PWII");
        Funcionario funcionario = new Funcionario("Silvana", 49, "Palmital", 3800);

        System.out.println("Nome do aluno:" + aluno1.getNome());
        System.out.println("Idade do aluno:" + aluno1.getIdade());
        System.out.println("Endereço do aluno:" + aluno1.getEndereço());
        System.out.println("Semestre do aluno:" + aluno1.getSemestre());
        System.out.println("Curso do aluno:" + aluno1.getCurso() + "\n");

        System.out.println("Nome do professor:" + professor.getNome());
        System.out.println("Idade do professor:" + professor.getIdade());
        System.out.println("Endereço do professor:" + professor.getEndereço());
        System.out.println("Salario do professor:" + professor.getSalario());
        System.out.println("Disciplina do professor:" + professor.getDisciplina() + "\n");

        System.out.println("Nome do Funcionario:" + funcionario.getNome());
        System.out.println("Idade do Funcionario:" + funcionario.getIdade());
        System.out.println("Endereço do Funcionario:" + funcionario.getEndereço());
        System.out.println("Salario do Funcionario:" + funcionario.getSalario() + "\n");


       

    }
}
