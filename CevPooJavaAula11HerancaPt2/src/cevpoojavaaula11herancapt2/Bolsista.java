/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cevpoojavaaula11herancapt2;

/**
 *
 * @author kaliez
 */
public class Bolsista extends Aluno{//classes Final, É obrigatoriamente folha, não pode ter filhos
    
    private float bolsa;
    
    public void renovarBolsa(){
        System.out.println("Renovando bolsa de " + this.nome);
    }
    
    
    
    //POLIMORFISMO
    // @Override, sobrescrevendo o metodo da classe heradada
    
    @Override
    public final void pagarMensalidade(){// Metodos final, não podem ser Sobrescritos
        System.out.println(this.nome + " é bolsista! pagamento com desconto");// atributo portegido, pode ser acessado pelas subclasses
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    
    
    
}
