/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.cases;

import model.Initial;




/**
 *
 * @author steohanos
 */
public abstract class Case {
    
    Initial ini ;
    
    public Case(){
        char c = '_' ;
        Initial i = new Initial(c);
        this.ini = i;
    }
    
    public  abstract boolean estJouable();

    public void setIni(Initial ini) {
        this.ini = ini;
    }
    

   
    
    

    @Override
    public String toString() {
        return " " + ini ;
    }
    
    
    
}
