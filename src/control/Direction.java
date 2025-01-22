/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.Random;

/**
 *
 * @author steohanos
 */
public enum Direction {
    
    RIGHT("Gauche"),
    LEFT("Droite"),
    UP("Haut"),
    DOWN("Bas");
    
    
    
    public int numero() {
        return ordinal() + 1;
    }

    private final String msg;
    Direction(String msg) {
        this.msg = msg;
    }
    
    

    private static final Random rand = new Random();
    
    public static Direction randomDirection() {
        
        return Direction.values()[rand.nextInt(Direction.values().length)];
    }
    
    
    
    
    @Override
    public String toString() {
        return msg;
    }
    
    
    /* 
    /* Verifie le choix entree par l'utilisateur  
    */
    public static Direction getByInt(int choix) throws IndexOutOfBoundsException {
        if (choix < 1 || choix > Direction.values().length) {
            throw new IndexOutOfBoundsException();
        }
        return Direction.values()[choix - 1];
    }
    
}
