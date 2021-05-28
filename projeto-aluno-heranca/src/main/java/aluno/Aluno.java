/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aluno;

/**
 * @author fehig
 */
public class Aluno {
    // Atributos da classe
    // Modificador de acesso Protected: permite que os atributos sejam acessados pelas classes herdeiras
    protected Integer ra;
    protected String nome;
    protected Double notaContinuada;
    protected Double notaSemestral;
    
    // Construtor
    public Aluno(Integer ra, String nome, Double notaContinuada, Double notaSemestral) {
        this.ra = ra;
        this.nome = nome;
        this.notaContinuada = notaContinuada;
        this.notaSemestral = notaSemestral;
    }
    
    // Métodos
    public Double calcularMedia(){
        return notaContinuada*0.4+notaSemestral*0.6;
    }

    // Getters e Setters
    public Integer getRa() {
        return ra;
    }

    public String getNome() {
        return nome;
    }

    public Double getNotaContinuada() {
        return notaContinuada;
    }

    public Double getNotaSemestral() {
        return notaSemestral;
    }

    // Override do método toString
    @Override
    public String toString() {
        // Uso do método String.format() para formatar a saida da String
        return String.format("================="
                + "\nNome: %s"
                + "\nRA:: %d"
                + "\nNota continuada: %.2f"
                + "\nNota semestral: %.2f"
                + "\nMédia final: %.2f", 
                nome,
                ra,
                notaContinuada,
                notaSemestral,
                calcularMedia());
    }
    
    
    
    
    
}
