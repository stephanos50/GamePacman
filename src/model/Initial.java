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
public class Initial {
    char initial ;
    
    public Initial(char c){
        this.initial = c;
    }

    @Override
    public String toString() {
        return " " + initial;
    }
    
    
}
