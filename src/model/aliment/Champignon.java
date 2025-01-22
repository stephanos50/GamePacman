/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.aliment;

import model.Initial;
import model.Selection;
import static model.Selection.CHAMPIGNON;
import model.cases.Case;

/**
 *
 * @author steohanos
 */
public class Champignon extends Aliment{

    
    
    public Champignon(){
        this.c = Selection.CHAMPIGNON.toString().charAt(0);
        this.ini = new Initial(c);
    }
    
    
   
    @Override 
     public String toString(){
        return CHAMPIGNON.toString();
    }

    @Override
    public int getNombreGomme() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setNombreGomme(int nombreGomme) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


   

  

   
    
}
