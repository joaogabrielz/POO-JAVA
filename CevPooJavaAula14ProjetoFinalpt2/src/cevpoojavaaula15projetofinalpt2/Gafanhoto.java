/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cevpoojavaaula15projetofinalpt2;


public class Gafanhoto extends Pessoa{
    
    private String login;
    private Integer totAssitido;
    
    public void assistirMaisUm(){
        this.totAssitido++;
    }

    public Gafanhoto(String login, String nome, Integer idade, String sexo) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssitido = 0;
    }
    
    
    
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Integer getTotAssitido() {
        return totAssitido;
    }

    public void setTotAssitido(Integer totAssitido) {
        this.totAssitido = totAssitido;
    }
    
    
}
