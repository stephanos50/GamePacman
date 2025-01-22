/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.aliment;

import java.util.Objects;
import model.Initial;
import model.cases.Case;
import model.personnage.Pacman;
/**
 *
 * @author steohanos
 */
public abstract class Aliment {
    
    
    protected char c ;
    protected Initial ini; 

    public Aliment() {
        this.ini = new Initial(c);
    }

    public Initial getIni() {
        return ini;
    }
    
    
    
    
    public abstract int getNombreGomme();
    public abstract void setNombreGomme(int nombreGomme);

    public boolean estManger(Aliment aliment){
           return true;
    }

    @Override
    public String toString() {
        return " " + ini ;
    }
    
    

}
