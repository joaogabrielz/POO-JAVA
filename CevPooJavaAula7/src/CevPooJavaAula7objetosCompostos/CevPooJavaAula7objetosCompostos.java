/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CevPooJavaAula7objetosCompostos;


public class CevPooJavaAula7objetosCompostos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      Lutador l[] = new Lutador[6];
      
      l[0] = new Lutador("Joao", "Brasil", 23, 1.63f, 77.0f, 1, 0, 0);
      l[0].ganharLuta();
      l[0].empatarLuta();
      
      l[0].apresentar();
      l[0].status();
      
      l[1] = new Lutador("Pedro", "Croacia", 33, 1.77f, 89.0f, 5, 2, 1);
      l[1].apresentar();
      l[1].status();
      
      
      l[2] = new Lutador("Hamilton", "suencia", 29, 1.88f, 100.0f, 10, 6, 5);
      l[2].apresentar();
      l[2].status();
    }
    
}
