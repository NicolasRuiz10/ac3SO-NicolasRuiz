/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aluno;

import java.util.ArrayList;

/**
 *
 * @author fehig
 */
public class Faculdade {
    // Atributos
    private String nome;
    private Integer vagas;
    private ArrayList<Aluno> listaAlunos;

    // Construtor
    public Faculdade(String nome, Integer vagas) { // Não é necessário passar a listaAlunos como parâmetro
        this.nome = nome;
        this.vagas = vagas;
        this.listaAlunos = new ArrayList();
    }

    // Métodos
    public void matricularAluno(Aluno aluno) {
        System.out.println("Cadastrando aluno...");            
            // Só é possível matricular um novo aluno se tamanho da lista for menor que a quantidade de vagas disponível
            // E se a lista já não conter esse aluno.
            // .size() retorna um valor inteiro equivalente ao tamanho da lista
            // .contains(T) verifica se a lista contém esse elemento T e retorna um boolean
        if (listaAlunos.size() < vagas && !listaAlunos.contains(aluno)) {            
            listaAlunos.add(aluno); // Adiciona o aluno a lista
            System.out.println("Matricula realizada com sucesso");
        } else {
            System.out.println("Falha ao cadastrar.");
            System.out.println("Verifique se o aluno já encontra-se matriculado ou a quantidade"
                    + " disponível de vagas");
        }

    }
    
    public void exibirAlunosMatriculados() {
        System.out.println("Buscando lista de alunos...");
        // .isEmpty verifica se a lista está vazia e retorna um boolean
        if (listaAlunos.isEmpty()) {
            System.out.println("A faculdade " + nome + " não possui alunos cadastrados");
        } else {
            for (Aluno a : listaAlunos) { // Para cada Aluno a existente na listaAlunos, ocorrerá um loop do for
                System.out.println(a) ; // Printa as informações do toString() do Aluno a
            }
            System.out.println("Busca concluída.");
        }
    }

    public void exibirAlunosPos() {
        System.out.println("Buscando lista de alunos cursando pós graduação...");
        if (listaAlunos.isEmpty()) {
            System.out.println("A faculdade " + nome + " não possui alunos cadastrados");
        } else {
            for (Aluno a : listaAlunos) {
                if (a instanceof AlunoPos) { // Verifica se o Aluno a é uma instância do tipo AlunoPos
                    System.out.println(a);
                }
            }
            System.out.println("Busca concluída.");
        }
    }

    // Sobrescrita do método toString
    @Override
    public String toString() {
        return String.format("=================\n"
                + "Nome: %s \n"
                + "Vagas: %d\n", nome, vagas);
    }

}
