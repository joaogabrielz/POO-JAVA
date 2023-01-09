/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sobrecarga;


public class index {
    
    // POLIMORFISMO DE SOBRECARGA:
    // Mesmo Nome Metodo, Assinaturas Diferentes(Diferente Quantidade e Tipo de parametro(s)) na
    // Mesma Classe
    
    
    public static void main(String[] args) {
        
       Cachorro c1 = new Cachorro();
       
       c1.emitirSom();
       
       c1.reagir("oi");
       c1.reagir("vai apanhar");
       
      System.out.println("----");
        
        c1.reagir(11,45f);
        c1.reagir(21, 00f);
        
       System.out.println("----");
       
       c1.reagir(true);
       c1.reagir(false);
       
      System.out.println("----");
      
      c1.reagir(2, 12.5f);
      c1.reagir(17, 4.5f);   
    }
}
