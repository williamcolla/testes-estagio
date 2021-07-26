/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author willi
 */
public class Valores {
    private String romanos;
    private Integer arabicos;
    private Boolean escolha;
    
    public Valores() {
        
    }
    
    public Valores(String romanos, Integer arabicos, Boolean escolha) {
        this.romanos = romanos;
        this.arabicos = arabicos;
        this.escolha = escolha;
    }
    
    public Boolean getEscolha() {
        return escolha;
    }
    
    public void setEscolha(Boolean escolha) {
        this.escolha = escolha;
    }
    
    public String getRomanos() {
        return romanos;
    }
    
    public void setRomanos(String romanos) {
        this.romanos = romanos;
    }
    
    public Integer getArabicos() {
        return arabicos;
    }
    
    public void setArabicos(Integer arabicos) {
        this.arabicos = arabicos;
    }
}
