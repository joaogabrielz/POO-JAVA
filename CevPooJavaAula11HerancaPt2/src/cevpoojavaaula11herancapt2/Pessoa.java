/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cevpoojavaaula11herancapt2;

/**
 *
 * @author kaliez
 */
abstract class Pessoa { // classe abstrata nao pode ser instanicada gera robjetos
    
    protected String nome;
    protected int idade;
    protected String sexo;
    
    
    public final void fazerAniver(){ // metodo final ,nao pode ser sobrescrito
        this.idade++;
    }

    
    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + '}';
    }

    
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    
}
