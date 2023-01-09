/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CevPooJavaAula8agregacaoObjetos;


public class CevPooJavaAula8agregacaoObjetos {

  
    public static void main(String[] args) {
      Lutador l[] = new Lutador[6];
      
      l[0] = new Lutador("Joao", "Brasil", 23, 1.63f, 77.0f, 1, 0, 0);
//      l[0].ganharLuta();
//      l[0].empatarLuta();
//      
//      l[0].apresentar();
//      l[0].status();
      
      l[1] = new Lutador("Pedro", "Croacia", 33, 1.77f, 57.8f, 5, 2, 1);
//      l[1].apresentar();
//      l[1].status();
      
      
      l[2] = new Lutador("Hamilton", "suencia", 29, 1.88f, 80.9f, 10, 6, 5);
//      l[2].apresentar();
//      l[2].status();

        

      l[3] = new Lutador("goeh", "indonesia", 27, 1.69f, 81.6f, 3, 3, 3);
      
        Luta uec01 = new Luta();
        // uec01.marcarLuta(l[0], l[1]);
        // uec01.lutar();
        // l[0].status();
        // l[1].status();

        // MESMO LUTADOR
        // uec01.marcarLuta(l[1], l[1]);
        // uec01.lutar();
        // l[1].status();
        // l[1].status();

        //Pesos mt diferentes/ Diferentes categorias
        // uec01.marcarLuta(l[1], l[3]);
        // uec01.lutar();
        // l[1].status();
        // l[3].status();


        uec01.marcarLuta(l[2], l[3]);
        uec01.lutar();
        l[2].status();
        l[3].status();
    }
    
}
