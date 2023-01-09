/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CevPooJavaAula3visibilidade;

/**
 *
 * @author kaliez
 */
public class CevPooJavaAula3visibilidade {

   
    public static void main(String[] args) {
       
        Caneta c1 = new Caneta();
        c1.modelo = "Bic cristal";
        c1.cor = "Azul";
        //c1.ponta = 0.5f; // private
        c1.carga = 80; // esta dentro de uma classe que utiliza classe caneta.
        //c1.tampada = true;
        c1.status();
        c1.tampar();
        
        c1.destampar();   
        c1.rabiscar();
        
     
        
        
    }
    
}
