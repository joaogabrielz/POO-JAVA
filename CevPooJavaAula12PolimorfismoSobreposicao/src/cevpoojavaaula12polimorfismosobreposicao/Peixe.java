/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cevpoojavaaula12polimorfismosobreposicao;

/**
 *
 * @author kaliez
 */
public class Peixe extends Animal {

    
    private String corEscama;
    
    public void soltarBolha(){
        System.out.println("Solotu uma bolha ..o..O...0");
    }
    
    
    @Override
    public void locomover() {
        System.out.println("Locomovendo: Nadando..");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo substancias");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe nao faz som..");  
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
    
    
}
