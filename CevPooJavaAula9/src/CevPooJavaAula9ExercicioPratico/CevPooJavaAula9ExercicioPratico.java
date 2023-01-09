/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CevPooJavaAula9ExercicioPratico;


public class CevPooJavaAula9ExercicioPratico {

    
    public static void main(String[] args) {
      
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
        
        p[0] = new Pessoa("Pedro", 22, "M");
        p[1] = new Pessoa("Maria", 31, "F");
        
        l[0] = new Livro("Php basico", "José da silva", 300, p[0]);
        l[1] = new Livro("POO com php", "Maria de souza", 500, p[0]);
        l[2] = new Livro("POO com Java", "Cleber machado", 800, p[1]);
        
        System.out.println(l[0].detalhes());
        l[0].abrir();
        l[0].folhear(80);
        l[0].avancarPag();
        l[0].voltarPag();
        System.out.println(l[0].detalhes());
        
        l[0].abrir();
        l[0].folhear(500);
        l[0].voltarPag(); // n deixa voltar pag
        System.out.println(l[0].detalhes());
        
        l[1].abrir();
        System.out.println(l[1].detalhes());
        l[2].folhear(10);
        System.out.println(l[2].detalhes());
        
    }
    
}
