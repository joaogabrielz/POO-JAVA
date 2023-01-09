/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cevpoojavaaula12polimorfismosobreposicao;


public class Reptil extends Animal{

    private String corEscama;
    
    
    @Override
    public void locomover() {
        System.out.println("Locomovendo: Rastejando..");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo vegetais..");
    }

    @Override
    public void emitirSom() {
        System.out.println("Emitindo som de Reptil..");   
    }

    
    
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
    
    
    
}
