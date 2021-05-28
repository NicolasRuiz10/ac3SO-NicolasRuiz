
package com.mycompany.heranca.conta.corrente;


public class Transacao {
    private Double valor;
    private String descricao;

    public Transacao(Double valor, String descricao) {
        this.valor = valor;
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    @Override
    public String toString() {
        return "Transacao{" + "valor=" + valor + ", descricao=" + descricao + '}';
    }
}
