/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cevpoojavaaula12polimorfismosobreposicao;


public class Cachorro extends Mamifero{
    
    
    @Override
    public void emitirSom(){
        System.out.println("Latindo: au au au");
    }
    
    
    public void enterrarOsso() {
        System.out.println("Enterrando osso");
    }
    
    public void abanarRabo() {
        System.out.println("Abanando Rabo..");
    }
}
