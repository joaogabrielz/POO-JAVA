/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CevPooJavaAula8agregacaoObjetos;


public class Lutador {
    
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias, derrotas, empates;

    
    
    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    
    
    
   
    public void apresentar(){
        
        System.out.println("");
        System.out.println("Itss timee");
        System.out.println("Lutador: " +this.getNome());
        System.out.println("Origem: " +this.getNacionalidade());
        System.out.println("Idade: " +this.getIdade());
        System.out.println("Altura: " +this.getAltura());
        System.out.println("Ganhou: " +this.getVitorias());
        System.out.println("Perdeu: " +this.getDerrotas());
        System.out.println("Empatou: " +this.getEmpates());
        System.out.println("");   
        
      
    }
    
    public void status(){
        System.out.println("**Status**");
        System.out.println(this.getNome());
        System.out.println("Peso: " +this.getCategoria());
        System.out.println("Ganhou: " +this.getVitorias());
        System.out.println("Perdeu: " +this.getDerrotas());
        System.out.println("Empatou: " +this.getEmpates());
        System.out.println(" -- ");
    }
    
    public void ganharLuta(){
        this.setVitorias(this.getVitorias() +1);
    }
    
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() -1);
    }
    public void empatarLuta(){
        this.setEmpates(this.getEmpates() +1);
    }
    
    
    
    
   
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria() {
        
    if(this.getPeso() < 52.2){
      this.categoria = "Inv??lido";
    }
    else if(this.getPeso() <= 70.3){
      this.categoria = "Leve";
    }
    else if(this.getPeso() <= 83.9){
      this.categoria = "M??dio";
    }
    else if(this.getPeso() <= 120.2){
      this.categoria = "Pesado";
    }
    else{
      this.categoria = "Inv??lido";
    }
    
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    

    
    
}
