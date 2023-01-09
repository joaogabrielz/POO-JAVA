/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CevPooJavaAula2clessesObjetos;


public class Caderno {
    
    int nFolhas;
    String tipoCapa;
    String cor;
    boolean fechado;
    
    
    void status(){
        System.out.println("N folhas: " + this.nFolhas);
        System.out.println("Tipo capa: "+ this.tipoCapa);
        System.out.println("Cor: "+ this.cor);
        System.out.println("fechado:? " + this.fechado);
    }
    
    void serEscrito(){
        if(this.fechado == true){
            System.out.println("nao posso ser escrito Fechado");
        }
        else{
            System.out.println("Sendo Escrito...");
        }
    }
    
    void fechar(){
        this.fechado = true;
    }
    
    void abrir(){
        this.fechado = false;
    }
}
