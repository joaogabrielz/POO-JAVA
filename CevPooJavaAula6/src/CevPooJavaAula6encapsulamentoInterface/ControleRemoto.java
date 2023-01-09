/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CevPooJavaAula6encapsulamentoInterface;


public class ControleRemoto implements Controlador{

    
  private int volume;
  private boolean ligado;
  private boolean tocando;

  
  
    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }


    
    
    
    @Override
    public void ligar() {
        this.ligado = true;
    }

    @Override
    public void desligar() {
       this.ligado = false;
    }

    @Override
    public void abrirMenu() {
    System.out.println(" Está ligado? :" + this.isLigado());
    System.out.println(" Está tocando? :" + this.isTocando());
    System.out.println("Volume: " + this.getVolume());
 
    for (int i=0; i <= this.getVolume(); i+=10) {
        System.out.print("|");
    }
     System.out.println("");
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu");
    }

    @Override
    public void maisVolume() {
      if (this.isLigado())
          this.setVolume(this.getVolume() + 5);
      else
          System.out.println("Impossivel diminuir volume 'desligado'");
    }

    @Override
    public void menosVolume() {
        if (this.isLigado())
          this.setVolume(this.getVolume() - 5);
        else
           System.out.println("Impossivel diminuir volume 'desligado'");
    }

    @Override
    public void ligarMudo() {
        if (this.isLigado() && this.getVolume() > 0)
            this.setVolume(0);
    }

    @Override
    public void desligarMudo() {
        if (this.isLigado() && this.getVolume() == 0)
            this.setVolume(50);
    }

    @Override
    public void play() {
      if(this.isLigado() && !this.isTocando())
           this.setTocando(true);
    }

    @Override
    public void pause() {
      if(this.isLigado() && this.isTocando())
           this.setTocando(false);
    
    }
    
    
    
      
  
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
}
