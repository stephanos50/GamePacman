/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;

import java.util.List;
import java.util.Random;
import java.util.Observer;
import java.util.Observable;
import java.util.Scanner;


import model.Labyrinthe;
import control.Direction;
import model.cases.Case;






public class Vue implements Observer {
    
   
    
    private static final String NOMBREDE_VIE = "Nombre de vie : ";
    private static final String NOMBREDE_POINT = "Nombre de point : ";
    private static final String NOMBREDE_GHOST = "Nombre de Fantome : ";
    private static final String NOMBREDE_GOMME = "Nombre de gomme : ";
    
    private static int compteur = 0;
    private static int position = 0;
    
    
    

    
    
    /* Construction d'une vue */
    private static final Vue VUE = new Vue();
    /* Methode qui renvoie un Object (Instance) d'une vue au controleur*/
    public static Vue getInstance() {
        return VUE;
    }
    private Vue(){
        
        
    }

   /* Affiche le plateau */
    public  static void  afficherPlateau (Labyrinthe plateau){
        
      
        int position = 0;
        for (int i = 0 ; i < plateau.getPlateau().length ; ++i){
            for (int j = 0; j < plateau.getPlateau()[i].length; ++j){
                System.out.print( " " + plateau.getPlateau()[i][j] + " " );
                ++position;
            }
            System.out.println(" ");
        }
    }
   
    
    
    
    public static void initialisation(Labyrinthe plateau){
          
//       
    }
    
   
    /* Position du Pacman Intitiale */ 
   
    /* Renvoi une position aléatoire */
    private static int positionAleatoire(int pos){
        Random r = new Random();
        pos = r.nextInt(pos);
        return pos;
    }
    
   
    
    /* Verifie le choix de la  direction entree  par le joueur */
    public  static Direction saisirDirection(){
        int choixInt = trySaisirChoixDirection();
        while (choixInt == -1) {
            try {
               choixInt = trySaisirChoixDirection();
            } catch (NumberFormatException e) {

            }
    }
        
        /* getByInt() dans Enum Direction  */
        return Direction.getByInt(choixInt);
    }
   

    public static int trySaisirChoixDirection() {
        affMenu();
        return rangeValidationSaisie("Votre choix", Direction.values().length);
    }
    public static void affMenu() {
        StringBuilder sb = new StringBuilder("\nMenu\n");
        for (Direction choix : Direction.values()) {
            sb.append(choix.numero());
            sb.append(" : ");
            sb.append(choix.toString());
            sb.append("\n");
        }
        affMsg(sb.toString());
    }
    public static void affMsg(String msg) {
        System.out.println(msg);
    }
    private static int rangeValidationSaisie(String libelle, int nMax) {
        int choixJoeur = nombreSaisi(libelle + " (1 à "
                + nMax + ")? : ");
        if (choixJoeur < 1 || choixJoeur > nMax) {
            return -1;
        }
        return choixJoeur;
    }
    
   
    /*
    /* Vérifier la saisis de l'utilsateur 
    /+ On veut uniquement un Integer
    */
    public static int nombreSaisi(String msg) {
        afficheMessage(msg);
        int entree = 0;
        boolean entreeOK = false;
        while (!entreeOK) {
            try {
                entree = Integer.parseInt(INPUT.next());
                entreeOK = true;
            } catch (NumberFormatException e) {

            }
        }
        return entree;
    }
    
    public static void afficheMessage(String message){
        System.out.println(message);
    }
    public static void afficheInformation() {
        
        String sb = "\n Information \n";
//            + NOMBREDE_VIE + " " + vue.placerElement.PlacerPacman.getPacman().getNombreDeVie() +  "\n"
//            + NOMBREDE_POINT + " " +  vue.placerElement.PlacerPacman.getPacman().getNombreDePoint() + "\n"
//            + NOMBREDE_GHOST + " " + vue.placerElement.PlacerGhost.getGhost().getNombreDeGhost() + "\n"
//            + NOMBREDE_GOMME + " " + vue.placerElement.PlacerGomme.getGomme().getNombreDeGomme() ;
//            
                
                
        affMsg(sb);
    }
    
    
    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof Labyrinthe){
            Labyrinthe lab = (Labyrinthe) o;
            afficherPlateau(lab);
            afficheInformation();
        }
    }
    private static final Scanner INPUT = new Scanner(System.in);
}



        
        
    
    
    

