/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cevpoojavaaula11herancapt2;

/**
 *
 * @author kaliez
 */
public class CevPooJavaAula11HerancaPt2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       // Pessoa p1 = new Pessoa(); // Classes abstratas nao podem ser insanicadas
          
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        
        Visitante v1 = new Visitante();// Hernaça pobre(Herança de Implementação) herda tudo da progenitora
       // Hernaça pobre(Herança de Implementação)
        
          
        v1.setNome("Juvenil");
        v1.setIdade(34);
        v1.setSexo("M");
        v1.fazerAniver();
          System.out.println("");
        System.out.println(v1.toString());
       
      
        Aluno a1 = new Aluno();// Herança para Diferença
        // Herança para Diferença
        
        a1.setNome("Pedro");
        a1.setMatricula(1211);
        a1.setIdade(16);
        a1.setSexo("M");
        a1.setCurso("Informatica");
        a1.pagarMensalidade();
        System.out.println(a1.toString());
        
        
        Professor p1 = new Professor(); // Herança para Diferença
        // Herança para Diferença
        
        p1.setNome("zezinho");
        p1.setIdade(39);
        p1.setSexo("M");
        p1.setSalario(1500.00f);
        p1.setEspecialidade("Matematica");
        p1.receberAumento(1000);
        p1.fazerAniver();
          System.out.println("");
        System.out.println(p1.toString());
        
        
        
        Bolsista b1 = new Bolsista(); // Especialização de Aluno
         // Herança para Diferença

         b1.setNome("Jubileus");
         b1.setMatricula(3322);
         b1.setIdade(17);
         b1.setSexo("M");
         b1.setCurso("Administração");
         b1.setBolsa(12.5f);
         b1.pagarMensalidade();
           System.out.println("");
         System.out.println(b1.toString());

        
         
         Tecnico t1 = new Tecnico(); // Especialização de Aluno
         // Herança para Diferença
         
         t1.setNome("Tecnilda");
         t1.setMatricula(1666);
         t1.setIdade(19);
         t1.setSexo("F");
         t1.setCurso("Segurança do Trabalho");
         t1.setRegistroProfissional(666);
         t1.fazerAniver();
         t1.pagarMensalidade();
         t1.praticar();
         System.out.println("");
         System.out.println(t1.toString());
         
      
        
    }
    
}
