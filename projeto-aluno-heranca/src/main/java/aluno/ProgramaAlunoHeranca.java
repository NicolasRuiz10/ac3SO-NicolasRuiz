/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aluno;

/**
 *
 * @author fehig
 */
public class ProgramaAlunoHeranca {
    public static void main(String[] args) {
        // Instanciação dos objetos
        Aluno aluno1 = new Aluno(202101, "Tom", 7.0, 6.5);
        Aluno aluno2 = new Aluno(202102, "Jerry", 9.0, 10.0);
        AlunoPos alunoPos = new AlunoPos(202103, "Scooby", 6.0, 7.0, 8.5);
        Faculdade faculdade = new Faculdade("Facul Dade", 2);
        
        // Testando método calcularMedia
        System.out.println("----- Média dos alunos -----");
        System.out.println("O aluno "  +aluno1.getNome()+" tem média " + aluno1.calcularMedia() + "\n");
        System.out.println("O aluno "  +aluno2.getNome()+" tem média " + aluno2.calcularMedia() + "\n");
        System.out.println("O aluno de pós graduação "  +aluno1.getNome()+" tem média " + aluno1.calcularMedia()+ "\n" );
        
        // Testando métodos toString()
        System.out.println("----- Informações dos alunos -----");
        System.out.println(aluno1);
        System.out.println(aluno2);
        System.out.println(alunoPos);
        System.out.println("");
        
        // Cadastrando alunos        
        faculdade.matricularAluno(aluno1);        
        System.out.println("");
        
        faculdade.matricularAluno(alunoPos);        
        System.out.println("");        
        
        faculdade.matricularAluno(aluno2);        
        System.out.println("");
        
        // Exibindo todos os alunos
        faculdade.exibirAlunosMatriculados();        
        System.out.println("");
        
        // Exibindo alunos da pós
        faculdade.exibirAlunosPos();
        
        // Exibindo info da faculdade
        System.out.println(faculdade);
        
    }
}
