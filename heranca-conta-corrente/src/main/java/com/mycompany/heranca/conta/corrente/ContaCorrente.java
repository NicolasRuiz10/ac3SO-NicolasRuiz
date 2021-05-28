package com.mycompany.heranca.conta.corrente;

import java.util.ArrayList;
import java.util.List;

public class ContaCorrente {

    private String titular;
    private Integer cpf;
    private Double saldo;
    private List<Transacao> transacoes;

    public ContaCorrente(String titular, Integer cpf, Double saldo) {
        this.titular = titular;
        this.cpf = cpf;
        this.saldo = saldo;
        this.transacoes = transacoes;
        transacoes = new ArrayList();
    }

    public void depositar(Double valor, String descricao) {
        this.saldo += valor;
        Deposito b = new Deposito(valor, descricao);
        transacoes.add(b);
    }

    public void saque(Double valor, String descricao) {
        if(saldo - valor < 0) {
            System.out.println("Saldo insuficiente");
        } else {
            this.saldo -= valor;
            Saque b = new Saque(valor, descricao);
            transacoes.add(b);
        }
    }

    public void exibirDeposito() {
        System.out.println("");
        System.out.println("Lista depositos");
        for (Transacao b : transacoes) {
            if (b instanceof Deposito) {
                System.out.println(b);
            }
        }
    }

    public void exibirSaques() {
        System.out.println("");
        System.out.println("Lista depositos");
        for (Transacao b : transacoes) {
            if (b instanceof Saque) {
                System.out.println(b);
            }
        }
    }

    public Double getTotalSaques() {
        Double totalSaque = 0.0;
        for (Transacao b : transacoes) {
            if (b instanceof Saque) {
                totalSaque += b.getValor();
            }
        }
        return totalSaque;
    }

    public Double getTotalDepositos() {
        Double totalDep = 0.0;
        for (Transacao b : transacoes) {
            if (b instanceof Deposito) {
                totalDep += b.getValor();
            }
        }
        return totalDep;
    }

    public void exibirRelatorios() {
        System.out.println("");
        System.out.println("NOTA");
        System.out.println("Titular: " + titular);
        System.out.println("Cpf: " + cpf);
        System.out.println("Saldo: " + saldo);
        System.out.println("Transações");
        for (Transacao b : transacoes) {
              System.out.println(b);
        }
    }
    
    public void realizarPix (ContaCorrente c, Double valor) {
        saque(valor, "Saque - Pix");
        c.depositar(valor, "Deposito - Pix");
        System.out.println("");
        System.out.println("Pix realizado com sucesso");
    }


    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public List<Transacao> getTransacoes() {
        return transacoes;
    }

    public void setTransacoes(List<Transacao> transacoes) {
        this.transacoes = transacoes;
    }

}
