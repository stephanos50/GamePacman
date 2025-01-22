/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.mur;

import model.Initial;
import model.Selection;
import static model.Selection.MUR;
import model.cases.Case;

/**
 *
 * @author steohanos
 */
public class Mur  {
    
    Initial ini;
    
    public Mur(){
        this.ini = new Initial(Selection.MUR.toString().charAt(0));
    }

    public Initial getIni() {
        return ini;
    }
    @Override 
     public String toString(){
        return MUR.toString();
    }
     
     

    
    
    
}
