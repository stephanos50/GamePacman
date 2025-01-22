/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author steohanos
 */
public enum Selection  {
    RIEN("V"),
    MUR("#"),
    PACMAN("P"),
    GHOST("G"),
    GOMME("."),
    FRUIT("F"),
    CHAMPIGNON("C"),
    VIDE("H"),
    SUPERPACMAN("S");
   
    
    private String caractere;
    
    Selection(String caractere){
        this.caractere = caractere;
    }

    
    
    
    
    @Override
    public String  toString(){
        return caractere;
    }
    
}
