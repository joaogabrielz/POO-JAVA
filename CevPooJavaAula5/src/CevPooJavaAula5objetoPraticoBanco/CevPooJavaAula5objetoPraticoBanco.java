/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CevPooJavaAula5objetoPraticoBanco;

/**
 *
 * @author kaliez
 */
public class CevPooJavaAula5objetoPraticoBanco {

    
    public static void main(String[] args) {
       
        ContaBanco p1 = new ContaBanco(122, "joao");
        p1.setNumConta(221);
        p1.setDono("jao2");
        p1.abrirConta("cc");
       
        
        ContaBanco p2 = new ContaBanco(222, "maria");
        p2.setNumConta(333);
        p2.setDono("creuza");
        p2.abrirConta("cp");
        
        
        p1.depositar(100);
        p2.depositar(500);
        p2.sacar(1000);
        
        p1.sacar(150);
        p1.fecharConta();
        
        p1.status();
        p2.status();
      
    }
    
}
