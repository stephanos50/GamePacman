/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.personnage;

import control.Direction;
import java.util.List;
import model.Initial;
import model.Selection;
import static model.Selection.PACMAN;
import model.aliment.Aliment;

/**
 *
 * @author steohanos
 */
public class Pacman extends Personnage {
   
    private int nombreDeVie = 5;
    private int nombreDePoint ;
    Initial ini;
    
    public Pacman(int x, int y) {
        super(x, y);
        this.ini = new Initial(Selection.PACMAN.toString().charAt(0));
    }

    public Initial getIni() {
        return ini;
    }

    @Override
    public void move(Direction d) {
       
        switch(d) {
            case UP:
               
                
               break;
            case DOWN:
                
              
                break;
            case RIGHT:
               
              
                break;
            case LEFT:
                
              
                break;                
        }
        
        
    }

    @Override
    public void mange(Aliment aliment) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 
   
  
    
   
    
}
