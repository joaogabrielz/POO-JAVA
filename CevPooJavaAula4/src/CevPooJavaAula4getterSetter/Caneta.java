/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CevPooJavaAula4getterSetter;

public class Caneta {
    
   public String modelo;
   private float ponta;
   private boolean tampada;
   private String cor;

   //crlt + i -> (InsertCOde)
   
    public Caneta(String modelo, float ponta, boolean tampada, String cor) {
        this.modelo = modelo;
        this.ponta = ponta;
        this.tampada = tampada;
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
   
//   public Caneta() {
//       this.tampar();
//       this.cor = "Azul";
//   }
//   
//   public Caneta(String modelo, float ponta, String cor){
//       this.modelo = modelo;
//       this.setPonta(ponta);
//       this.cor = cor;
//       this.tampar();
//   }
//   
//   public void status() {
//       System.out.println("About caneta");
//       System.out.println("Modelo: "+ this.modelo);
//       System.out.println("Ponta: "+ this.ponta);
//       System.out.println("Cor: " + this.cor);
//       System.out.println("Tampada? " + this.tampada);
//   }
//   
//   public String getModelo() {
//       return this.modelo;
//   }
//   public void setModelo(String modelo){
//       this.modelo = modelo;
//   }
//   
//   public float getPonta() {
//       return this.ponta;
//   }
//   public void setPonta(float ponta) {
//       this.ponta = ponta;
//   }
//   
//   public void tampar() {
//       this.tampada = true;
//   }
//   public void destampar() {
//       this.tampada = false;
//   }
}
