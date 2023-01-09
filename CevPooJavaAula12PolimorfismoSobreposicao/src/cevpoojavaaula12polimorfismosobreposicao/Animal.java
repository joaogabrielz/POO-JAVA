/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cevpoojavaaula12polimorfismosobreposicao;


abstract class Animal { // Nao pode ser instanciada
    
    protected float peso;
    protected Integer idade;
    protected Integer membros;
    
    
    public abstract void locomover();
    
    public abstract void alimentar();
    
    public abstract void emitirSom();

    
    
    
    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Integer getMembros() {
        return membros;
    }

    public void setMembros(Integer membros) {
        this.membros = membros;
    }
    
    
}
