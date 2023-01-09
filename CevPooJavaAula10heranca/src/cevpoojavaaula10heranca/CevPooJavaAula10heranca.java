/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cevpoojavaaula10heranca;

/**
 *
 * @author kaliez
 */
public class CevPooJavaAula10heranca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("Claudio");
        p4.setNome("Fabiana");
                 
        p1.setSexo("M");
        p4.setSexo("F");
        p2.setIdade(18);
        
        
        p2.setCurso("Informatica");
        p3.setSalario(2500.75f);
        p4.setSetor("Estoque");
        
        System.out.println(p1.toString());
        System.out.println(p2.toString() + " " + p2.getCurso() + " " + p2.getMatricula());
        System.out.println(p3.toString() + " " + p3.getEspecialidade() + " " + p3.getSalario());
        System.out.println(p4.toString() + " " + p4.getSetor()+ " " + p4.isTrabalhando());
        
            
        
    }
    
}
