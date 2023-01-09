/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cevpoojavaaula13polimorfismosobrecarga.SobreposicaoRevisao;


public class index {
    
    // POLIMORFISMO DE SOBRECARGA:
    // Mesmo Nome Metodo, Assinaturas Diferentes(Diferente Quantidade e Tipo de parametro(s)) na
    // Mesma Classe
    
    
    public static void main(String[] args) {
        
        
        // PolimorfismoSobreposicao
        
       //Animal a1 = new Animal(); // Classe abstrata nao pode se instanciada
        
        Mamifero c1 = new Mamifero();
        
        c1.emitirSom();
        
            System.out.println("");
        
        Lobo l1 = new Lobo();
        
        l1.emitirSom();
        
            System.out.println("");
        
        Cachorro ca1 = new Cachorro();
        
        ca1.emitirSom();
        
        
    }
}
