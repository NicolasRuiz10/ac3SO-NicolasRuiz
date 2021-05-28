
package com.mycompany.heranca.conta.corrente;

public class App {
    public static void main(String[] args) {
//      Primeira Conta
        ContaCorrente c = new ContaCorrente("Nicolas", 564738, 1800.0);
//      Saque
        c.saque(5789.0, "Saque");       
        c.saque(150.0, "Saque");
//      Deposito

        c.depositar(120.00, "Deposito");        
        c.depositar(130.00, "Deposito");
        c.depositar(140.00, "Deposito");        
        c.depositar(150.00, "Deposito");  
        
        c.exibirSaques();
        
        c.exibirDeposito();
        
        System.out.println("");
        System.out.println("Valor total saques: "+ c.getTotalSaques());
        System.out.println("");
        System.out.println("Valor total depositos: "+ c.getTotalDepositos());  
        c.exibirRelatorios();
        
//      Objeto da segunda conta
        ContaCorrente d = new ContaCorrente("Nicolas2", 675893, 100.0);
//      Saques
        d.saque(50.0, "Saque");       
        d.saque(9.50, "Saque");        
        d.saque(2.50, "Saque");

//      depositos
        d.depositar(1000.00, "Deposito");              
        d.depositar(150.00, "Deposito");  
        d.exibirSaques();
        d.exibirDeposito();
        
        d.realizarPix(c, 10.0);
        
        System.out.println("");
        System.out.println("Valor total saques: "+ d.getTotalSaques());
        System.out.println("");
        System.out.println("Valor total depositos: "+ d.getTotalDepositos());  
        d.exibirRelatorios();
    }
}
