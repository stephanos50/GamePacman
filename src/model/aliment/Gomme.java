/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.aliment;

import model.Initial;
import model.Selection;
import static model.Selection.GOMME;
import model.cases.Case;

/**
 *
 * @author steohanos
 */
public class Gomme extends Aliment {
    
    private  int nombreGomme = 0; ;
    
    
    public Gomme(){
        this.c = Selection.GOMME.toString().charAt(0);
        this.ini = new Initial(c);
        
        
    }
    
  

    @Override
    public int getNombreGomme() {
        return nombreGomme;
    }

    @Override
    public void setNombreGomme(int nombreGomme) {
        this.nombreGomme = nombreGomme;
    }
    
    public boolean estGomme(){
        return true;
    }

    

     
     

   
 

   

    

    

    

    

    
    
    
    
    
    
}
