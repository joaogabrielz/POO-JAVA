/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CevPooJavaAula3visibilidade;

public class Caneta {
    
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga; 
    private boolean tampada;
    
    public void status(){
        System.out.println("Caneta: " + this.cor);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("tampada?: " + this.tampada);
    }
    
    public void rabiscar(){
        if(this.tampada == true){
            System.out.println("Não posso escrever tampada");
        }
        else{
            System.out.println("Rabiscando...");
        }
    }
    public void tampar(){
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }
}
