/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cevpoojavaaula15projetofinalpt2;


public class CevPooJavaAula15ProjetoFinalpt2 {

    
    public static void main(String[] args) {
        
        
        //Pessoa p = new Pessoa(); // classes abstratas nao podem ser implementadas
        
       Video v[] = new Video[3];
       
       v[0] = new Video("Aula 1 POO");
       v[1] = new Video("Aula 14 PHP");
       v[2] = new Video("Aula 14 JAVA");
       
       System.out.println(v[0].getTitulo());
       System.out.println(v[1].getTitulo()); 
       System.out.println(v[2].getTitulo());
       
       
        System.out.println(" --xxx--- ");
        
        
        Gafanhoto g[] = new Gafanhoto[3];
        g[0] = new Gafanhoto("Jaum12", "Joao", 22, "M");
        g[1] = new Gafanhoto("Mari", "Mariana", 33, "F");
        
        System.out.println(g[0].getLogin() +  "\n" + g[0].getNome() +  "\n" + g[0].getIdade() +  "\n" +
                g[0].getSexo() +  "\n");
        
        System.out.println(" -- ");
        
         System.out.println(g[1].getLogin() +  "\n" + g[1].getNome() +  "\n" + g[1].getIdade() +  "\n" +
                g[1].getSexo() +  "\n");
         
         
         System.out.println(" --xxx--- ");
         
         Vizualizacao vizu[] = new Vizualizacao[3];
         
         vizu[0] = new Vizualizacao(g[0], v[1]); // joao assiste Aula 15 PHP
         
         vizu[1] = new Vizualizacao(g[0], v[2]); // joao assiste Aula 15 JAVA
         
         vizu[2] = new Vizualizacao(g[1], v[0]); // Mari assiste aula1 de POO
         
         
        vizu[0].avaliar(10);
         
        System.out.println(vizu[0].getEspectador().getNome() +  " - Assiste " + 
              vizu[0].getFilme().getTitulo() +  "\n Avaliacao: " + vizu[0].getFilme().getAvaliacao());
         
        vizu[1].avaliar(85, "%");
         
        System.out.println(vizu[1].getEspectador().getNome() +  " - Assiste " + 
              vizu[1].getFilme().getTitulo() +  "\n Avaliacao: " + vizu[1].getFilme().getAvaliacao()); 
         
        
        vizu[2].avaliar();
         
        System.out.println(vizu[2].getEspectador().getNome() +  " - Assiste " + 
              vizu[2].getFilme().getTitulo() +  "\n Avaliacao: " + vizu[2].getFilme().getAvaliacao()); 
         
         
         
    }
    
}
