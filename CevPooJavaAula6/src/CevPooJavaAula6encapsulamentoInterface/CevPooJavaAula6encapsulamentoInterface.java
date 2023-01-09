/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CevPooJavaAula6encapsulamentoInterface;

/**
 *
 * @author kaliez
 */
public class CevPooJavaAula6encapsulamentoInterface {

    
    public static void main(String[] args) {
        
        ControleRemoto c = new ControleRemoto();
        c.abrirMenu();
        
        c.maisVolume();
        c.abrirMenu();
        
        c.ligar();
        c.play();
        c.maisVolume();
        c.maisVolume();
        c.maisVolume();
        c.maisVolume();
        c.maisVolume();
        c.menosVolume();
        
        c.abrirMenu();
       
    }
    
}
