/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cevpoojavaaula11herancapt2;

/**
 *
 * @author kaliez
 */
public class Aluno extends Pessoa{
    
    private int matricula;
    private String curso;
    
    
    public void cancelarMatricula(){
      System.out.println("Matricula será cancelada ");
    }
    
    public void pagarMensalidade(){ // Metodos Final Não podem ser sobrepostos

      System.out.println("Pagando Mensalidade do aluno: <strong>" + this.nome + "</strong>");  // atributo portegido, pode ser acessado pelas subclasses
    }
    
    
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
  
    
    
    
}
