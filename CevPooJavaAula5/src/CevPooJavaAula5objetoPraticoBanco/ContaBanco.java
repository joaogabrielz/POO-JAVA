/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CevPooJavaAula5objetoPraticoBanco;


public class ContaBanco {
    
    public int numConta;
    protected String tipo; //cc ou cp
    private String dono;
    private double saldo;
    private boolean status; 

    public ContaBanco(int numConta, String dono) {
        this.numConta = numConta;
       // this.tipo = tipo;
        this.dono = dono;
        
        this.setSaldo(0);
        this.setStatus(false);
    }
    
    public void status() {
        System.out.println("");
        System.out.println("Status--");
        System.out.println("numConta: "+ this.getNumConta());
        System.out.println("Tipo: "+ this.getTipo());
        System.out.println("Dono: "+ this.getDono());
        System.out.println("status? "+ this.isStatus());
        System.out.println("saldo: " + this.getSaldo());
        System.out.println("");
    }
    
    public void abrirConta(String type) {
        
        this.setTipo(type);
        this.setStatus(true);
        
        if(type == "cc"){
            setSaldo(50.00);
            System.out.println("Conta corrente aberta");
        }
        if(type == "cp"){
            setSaldo(150.00);
            System.out.println("Conta Poupança aberta");
            
        } 
    }
    public void fecharConta(){
        if(this.saldo > 0){
            System.out.println("Conta possui dinheiro");
        }
        else if(this.getSaldo() < 0){
            System.out.println("Conta em Debito pendente x");
        }
        else{
            System.out.println("Conta fechada x");
            this.setStatus(false);
        }
    }
    public void depositar(double deposito) {
        if(this.isStatus()){
            this.setSaldo(this.getSaldo() + deposito);
            System.out.println("Deposito feito!");
        }
        else{
            System.out.println("A conta tem q estar aberta para deposito..");
        }
    }
    public void sacar(double saque) {
        if(this.status = true && saque <= this.saldo){
            this.setSaldo(this.getSaldo() - saque);
            System.out.println("Saque feito com sucesso");
        }
        else{
            System.out.println("Saldo insuficiente");
        }
    }
    
    public void pagarMensal() {
        
        double v = 0;
        
        if(this.getTipo() == "cc"){
            v = 12;
        }
        else if(this.getTipo() == "cp"){
            v = 20;
        }
        
        if(this.isStatus()){
            if(this.getSaldo() > v){
                setSaldo(getSaldo() - v);
            }
            else{
                System.out.println("Saldo insuficiente");
            }
        }
        else{
            System.out.println("Impossivel pagar conta nao aberta");
        }
        
    }

    public int getNumConta() {
        return this.numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return this.dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
}
