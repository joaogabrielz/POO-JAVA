/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cevpoojavaaula12polimorfismosobreposicao;


public class Ave extends Animal{

    private String corPena;
    
    
    public void fazerNinho(){
        System.out.println("Consturindo Ninho");
    }
    
    @Override
    public void locomover() {
        System.out.println("Locomovendo: Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("COmendo frutas...");
    }

    @Override
    public void emitirSom() {
        System.out.println("Emitindo som de Ave..");
    }

    
    
    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    
    
}
