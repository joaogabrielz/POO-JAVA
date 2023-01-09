/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CevPooJavaAula4getterSetter;

public class CevPooJavaAula4getterSetter {

  
    public static void main(String[] args) {
       
        Caneta c1 = new Caneta("Nik", 0.5f, false ,"Verde");
        
        //c1.setModelo("Bicer"); //metodo acessor
        //c1.modelo = "Bicer"; //direto
        
       // c1.setPonta(1.2f); //
        //c1.ponta = "0.5f" //privado nao muda diretamente, somente com acessor
        
      //  c1.status();
        
        System.out.println("Tenho caneta "+ c1.getModelo());
        System.out.println("De ponta "+ c1.getPonta());
    }
    
}
