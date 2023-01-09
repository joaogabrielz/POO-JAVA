/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CevPooJavaAula2clessesObjetos;

/**
 *
 * @author kaliez
 */
public class CevPooJavaAula2clessesObjetos {

   
    public static void main(String[] args) {
        
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampada = false;
        c1.tampar();
        c1.destampar();
        c1.status();
        //c1.tampar();
        c1.rabiscar();
        
        System.out.println("---------------");
        
        Caderno cad1 = new Caderno();
        cad1.cor = "Preto";
        cad1.nFolhas = 80;
        cad1.tipoCapa = "Dura";
        cad1.fechado = true;
        cad1.abrir();
        cad1.status();
        cad1.fechar();
        cad1.serEscrito();
        
    }
    
}
