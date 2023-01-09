/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sobrecarga;



public class Cachorro extends Lobo {
    
    // polimorfismo SOBREPOSICAO
    // Sobrecarga de Sobreposicao
    
    @Override
    public void emitirSom(){
        System.out.println("EMitindo som: au au au!");
    }
    
    
    // Polimorfismo SOBRECARGA
    //Sobrecarga De Metodos
    public void reagir(String frase){
        if(frase == "comida" || frase == "oi"){
            System.out.println("Abanar e latir");
        }
        else{
            System.out.println("Rosar ggggr");
        }
    }
    
    public void reagir(Integer hora, Integer min){
        if(hora < 12){
            System.out.println("Manha: abanar");
        }
        else if(hora >= 18){
            System.out.println("Noite: Ignorar");
        }
        else{
            System.out.println("Tarde: abanar e latir");
        }
    }
    
    public void reagir(boolean dono){
        if(dono){
            System.out.println("Abanar pro dono");
        }
        else{
            System.out.println("Rosnar e latir, nao e dono");
        }
    }
    
    public void reagir(Integer idade, float peso){
        
        if(idade < 5){
            if(peso < 10){
                System.out.println("Abanar");
            }
            else{
                System.out.println("Latir");
            }
        }
        else{
            if(peso < 10){
                System.out.println("ROsar gg");
            }
            else{
                System.out.println("Ignorando..");
            }
        }
    }
    
    
    
}
