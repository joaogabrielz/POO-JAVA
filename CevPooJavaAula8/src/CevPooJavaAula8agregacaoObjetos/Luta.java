/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CevPooJavaAula8agregacaoObjetos;

import java.util.Random;

/**
 *
 * @author kaliez
 */
public class Luta {
    
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    
    
    
    
    public void marcarLuta(Lutador l1, Lutador l2){
    if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
      this.setAprovada(true);
      this.setDesafiado(l1);
      this.setDesafiante(l2);
    }
    else{
      this.setAprovada(false);
      this.setDesafiado(null);
      this.setDesafiante(null);
    }
    }
    
    
    public void lutar(){

    if(this.isAprovada()){
      System.out.println("Desafiado: ");
      this.getDesafiado().apresentar();
      System.out.println("Desafiante: ");
      this.getDesafiante().apresentar();
      
      Random aleatorio = new Random();
      int vencedor = aleatorio.nextInt(3); // 0 ou 1 ou 2
      switch (vencedor) {
        case 0:
          System.out.println("Emaptou");
          this.desafiado.empatarLuta();
          this.desafiante.empatarLuta();
        break;

        case 1:
          System.out.println(this.desafiado.getNome() + " Venceu");
          this.desafiado.ganharLuta();
          this.desafiante.perderLuta();
        break;

        case 2:
          System.out.println(this.desafiante.getNome() + " Venceu");
          this.desafiante.ganharLuta();
          this.desafiado.perderLuta();
        break;

        // default:
        //   # code...
        // break;
      }
    }
    else{
        System.out.println("Luta nao pode acontecer !");
    }

  }
    
    
    
    
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    
}
