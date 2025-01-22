/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.personnage;


import control.Direction;
import java.util.List;
import java.util.Objects;
import model.Initial;
import model.aliment.Aliment;
import model.cases.Case;

/**
 *
 * @author steohanos
 */
public abstract class Personnage  {
    
   
    int x; // Plus toucher
    int y; // Plus toucher
    
    private int xInit; // Plus toucher
    private int yInit; // Plus toucher
    
    
    
    
    
    public abstract void move(Direction d);
    public abstract void mange(Aliment aliment);
    
    
    
    public Personnage(int x, int y){
        this.xInit = x;
        this.yInit = y;
    }
    
    


    
}
