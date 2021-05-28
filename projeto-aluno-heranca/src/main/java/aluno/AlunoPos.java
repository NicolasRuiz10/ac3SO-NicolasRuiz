/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aluno;

/**
 * @author fehig
 */

// Classe AlunoPos vai herdar as carácteristicas da classe Aluno
// "AlunoPos é um Aluno "
public class AlunoPos extends Aluno {
    
    // Atributos
    private Double notaMonografia;

    // Construtor
    // A classe herdeira possui os mesmos atributos da classe mãe
    // !!! A classe filha não herda os construtores da classe mãe   !!!
    public AlunoPos(Integer ra, String nome, Double notaContinuada, Double notaSemestral, Double notaMonografia) {
        // Apesar de não herdar o construtor da classe mãe, é possível chama-lo com o método super()        
        super(ra, nome, notaContinuada, notaSemestral); // equivale ao construtor da classe mãe      
        this.notaMonografia = notaMonografia;
    }
    
    // Métodos
    @Override // Sobrescrita do método da classe mãe calcularMedia()
    public Double calcularMedia() {
        return (notaContinuada + notaMonografia + notaSemestral) / 3;  
    }

    // Getters e Setters
    public Double getNotaMonografia() {
        return notaMonografia;
    }

    public void setNotaMonografia(Double notaMonografia) {
        this.notaMonografia = notaMonografia;
    }

    // Sobrescrita do método toString()
    @Override
    public String toString() {
        return super.toString() // Aqui é chamado o toString da classe mãe
                + String.format("\nNota monográfia: %.2f", notaMonografia); // Aqui são formadatas as informações da classe AlunoPos
    }

}
