/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cevpoojavaaula15projetofinalpt2;


public class Vizualizacao { // AGREGACAO
    
    private Gafanhoto espectador;
    private Video filme;

    
    
    public Vizualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.filme.setViews(this.filme.getViews() + 1);
        this.espectador.setTotAssitido(this.espectador.getTotAssitido() +1);
    }
    
    
  // POLIMORFISMO, SOBRECARGA 
 
    public void avaliar(){
        this.filme.setAvaliacao(5);
    }
    
    public void avaliar(Integer nota){
        this.filme.setAvaliacao(nota);
    }
    
    public void avaliar(Integer porcentagem, String porcento){
        
        Integer novaNota = 0;
        
        if(porcentagem <= 20){
            novaNota = 3;
        }
        else if(porcentagem <= 50){
            novaNota = 5;
        }
        else if(porcentagem <= 90){
            novaNota = 8;
        }
        else{
            novaNota = 10;
        }
        
        this.filme.setAvaliacao(novaNota);
    }
    
    

    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }
    
    
    
}
