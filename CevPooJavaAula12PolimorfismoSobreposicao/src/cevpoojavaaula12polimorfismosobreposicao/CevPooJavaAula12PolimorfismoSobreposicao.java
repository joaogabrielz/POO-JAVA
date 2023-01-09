/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cevpoojavaaula12polimorfismosobreposicao;

/**
 *
 * @author kaliez
 */
public class CevPooJavaAula12PolimorfismoSobreposicao {

   
    public static void main(String[] args) {
        
        
     // SUPERCLASSE DOS TIPOS DE ANIMAIS, E ANCESTRAIS DOS ANIMAIS ESPECIFICOS
     //Animal a1 = new Animal(); // classes abstratas nao podem ser instanciadas
        
        Mamifero m1 = new Mamifero();
        Reptil r1 = new Reptil();
        Peixe p1 = new Peixe();
        Ave a1 = new Ave();

    // POLIMORFISMO DE SOBREPOSICAO:
    // Mesmo Nome Metodo, Assinaturas Iguais(Mesma Quantidade e Tipo de parametro(s)) em
    // Classes Diferentes

    // SUBCLASSES DE ANIMAL
    
    m1.setPeso(85.0f);
    m1.setIdade(2);
    m1.setMembros(4);
    m1.locomover(); // correndio
    m1.alimentar(); // mamando
    m1.emitirSom(); // som mamifero
    
     System.out.println("Memifero: " + "peso, idade, membros " + m1.idade + " - " + m1.peso + " - " + m1.membros);
     System.out.println("");
     
    p1.setPeso(0.35f);
    p1.setIdade(1);
    p1.setMembros(0);
    p1.locomover(); 
    p1.alimentar(); 
    p1.emitirSom(); 
     System.out.println("");
     
     
     System.out.println("Peixe: " + "peso, idade, membros " + p1.idade + " - " + p1.peso + " - " + p1.membros);
     System.out.println("");
     
     
    a1.setPeso(0.89f);
    a1.setIdade(2);
    a1.setMembros(2);
    a1.locomover(); 
    a1.alimentar(); 
    a1.emitirSom(); 
     System.out.println("");
     
     
     System.out.println("Ave: " + "peso, idade, membros " + a1.idade + " - " + a1.peso + " - " + a1.membros);
     System.out.println("");
     
     
    r1.setPeso(5.3f);
    r1.setIdade(3);
    r1.setMembros(0);
    r1.locomover(); 
    r1.alimentar(); 
    r1.emitirSom(); 
     System.out.println("");
     
     
     System.out.println("Reptil: " + "peso, idade, membros " + r1.idade + " - " + r1.peso + " - " + r1.membros);
     System.out.println("");
     
        System.out.println("xxxxxxxxxxxxxxxx");
        
    Mamifero m2 = new Mamifero();
        
    m2.setPeso(5.7f);
    m2.setIdade(8);
    m2.setMembros(4);
    m2.locomover(); 
    m2.alimentar(); 
    m2.emitirSom(); 
     System.out.println("");
     
     
     System.out.println("Mamifero: " + "peso, idade, membros " + m2.idade + " - " + m2.peso + " - " + m2.membros);
     System.out.println("");
     
     
    Canguru can1 = new Canguru();// É mamifero
        
    can1.setPeso(55.30f);
    can1.setIdade(3);
    can1.setMembros(4);
    can1.locomover(); // saltando
    can1.alimentar(); 
    can1.emitirSom(); 
     System.out.println("");
     
     
     System.out.println("canguru: " + "peso, idade, membros " + can1.idade + " - " + can1.peso + " - " + can1.membros);
     System.out.println("");
     
     
     // SUBCLASSES DAS SUBCLASSES
     
    Cachorro ca1 = new Cachorro();// É mamifero
        
    ca1.setPeso(55.30f);
    ca1.setIdade(3);
    ca1.setMembros(4);
    ca1.locomover(); // correr
    ca1.alimentar(); 
    ca1.emitirSom(); 
     System.out.println("");
     
     
     System.out.println("Cachorro: " + "peso, idade, membros " + ca1.idade + " - " + ca1.peso + " - " + ca1.membros);
     System.out.println("");
     
     
     
     
    }
    
}
