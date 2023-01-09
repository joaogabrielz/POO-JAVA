/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CevPooJavaAula2clessesObjetos;

public class Caneta {
    
    String modelo;
    String cor;
    float ponta;
    int carga; 
    boolean tampada;
    
    void status(){
        System.out.println("Caneta: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("tampada?: " + this.tampada);
    }
    
    void rabiscar(){
        if(this.tampada == true){
            System.out.println("Não posso escrever tampada");
        }
        else{
            System.out.println("Rabiscando...");
        }
    }
    void tampar(){
        this.tampada = true;
    }
    void destampar(){
        this.tampada = false;
    }
}
