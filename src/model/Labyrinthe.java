/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;




import model.cases.Case;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Random;
import model.aliment.Champignon;
import model.aliment.Fruit;
import model.aliment.Gomme;
import model.cases.CaseClose;
import model.cases.CaseOpen;
import model.mur.Mur;
import model.personnage.Ghost;
import model.personnage.Pacman;









public class Labyrinthe extends Observable {
    
  
    private Case [][] plateau;   
    private Pacman pacman;
    private List<Ghost> ghosts;
    
    
    
    private static int[][] tab = {
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
            {1, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 1, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 1},
            {1, 5, 1, 1, 1, 4, 1, 1, 1, 1, 4, 1, 4, 1, 1, 1, 1, 4, 1, 1, 1, 5, 1},
            {1, 4, 1, 1, 1, 4, 1, 1, 1, 1, 4, 1, 4, 1, 1, 1, 1, 4, 1, 1, 1, 4, 1},
            {1, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 1},
            {1, 4, 1, 1, 1, 4, 1, 4, 1, 1, 1, 1, 1, 1, 1, 4, 1, 4, 1, 1, 1, 4, 1},
            {1, 4, 4, 4, 4, 4, 1, 4, 1, 1, 1, 1, 1, 1, 1, 4, 1, 4, 4, 4, 4, 4, 1},
            {1, 1, 1, 1, 1, 4, 1, 4, 4, 4, 4, 1, 4, 4, 4, 4, 1, 4, 1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1, 4, 1, 1, 1, 1, 4, 1, 4, 1, 1, 1, 1, 4, 1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1, 4, 1, 4, 4, 4, 4, 4, 4, 4, 4, 4, 1, 4, 1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1, 4, 1, 4, 1, 0, 0, 0, 0, 0, 1, 4, 1, 4, 1, 1, 1, 1, 1},
            {1, 4, 4, 4, 4, 4, 6, 4, 1, 3, 3, 0, 3, 3, 1, 4, 6, 4, 4, 4, 4, 4, 1},
            {1, 1, 1, 1, 1, 4, 1, 4, 1, 1, 1, 1, 1, 1, 1, 4, 1, 4, 1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1, 4, 1, 4, 4, 4, 4, 4, 4, 4, 4, 4, 1, 4, 1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1, 4, 1, 4, 1, 1, 1, 1, 1, 1, 1, 4, 1, 4, 1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1, 4, 1, 4, 1, 1, 1, 1, 1, 1, 1, 4, 1, 4, 1, 1, 1, 1, 1},
            {1, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 1, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 1},
            {1, 4, 1, 1, 1, 4, 1, 1, 1, 1, 4, 1, 4, 1, 1, 1, 1, 4, 1, 1, 1, 4, 1},
            {1, 5, 4, 4, 1, 4, 4, 4, 4, 4, 4, 2, 4, 4, 4, 4, 4, 4, 1, 4, 4, 5, 1},
            {1, 1, 1, 4, 1, 4, 1, 4, 1, 1, 1, 1, 1, 1, 1, 4, 1, 4, 1, 4, 1, 1, 1},
            {1, 4, 4, 4, 4, 4, 1, 4, 4, 4, 4, 1, 4, 4, 4, 4, 1, 4, 4, 4, 4, 4, 1},
            {1, 4, 1, 1, 1, 1, 1, 1, 1, 1, 4, 1, 4, 1, 1, 1, 1, 1, 1, 1, 1, 4, 1},
            {1, 4, 1, 1, 1, 1, 1, 1, 1, 1, 4, 1, 4, 1, 1, 1, 1, 1, 1, 1, 1, 4, 1},
            {1, 6, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 6, 1},
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}
        };
    private final static int LONGUEUR = tab.length ;
    private final static  int LARGEUR = tab[0].length;

    
    
    public Labyrinthe (){
        plateau = new Case[LONGUEUR][LARGEUR]; 
        ghosts = new ArrayList<>();
        for(int i = 0; i < plateau.length  ; ++i){
            for (int j = 0; j < plateau[i].length  ; ++j){
                if(tab[i][j] == Selection.PACMAN.ordinal()) {
                    pacman = new Pacman(i,j);
                    CaseOpen cases = new CaseOpen();
                    cases.setIni(pacman.getIni());
                    plateau[i][j] = cases;
                }
                
                else if(tab[i][j] == Selection.MUR.ordinal()) {
                    Mur mur = new Mur();
                    CaseClose cases = new CaseClose();
                    cases.setIni(mur.getIni());
                    plateau[i][j] = cases;
                
                }
                
                else if(tab[i][j] == Selection.GOMME.ordinal()){
                    Gomme gomme = new Gomme();
                    CaseOpen cases = new CaseOpen();
                    cases.setIni(gomme.getIni());
                    plateau[i][j] = cases;
                
                }
                else if(tab[i][j] == Selection.GHOST.ordinal()){
                    Ghost ghost = new Ghost(i,j);
                    ghosts.add(ghost);
                    CaseOpen cases = new CaseOpen();
                    cases.setIni(ghost.getIni());
                    plateau[i][j] = cases;
                }
                else if(tab[i][j] == Selection.FRUIT.ordinal()){
                    Fruit fruit = new Fruit();
                    CaseOpen cases = new CaseOpen();
                    cases.setIni(fruit.getIni());
                    System.out.println( fruit.getIni() );
                    plateau[i][j] = cases;
                }
                else if(tab[i][j] == Selection.CHAMPIGNON.ordinal()){
                    Champignon champ = new Champignon();
                    CaseOpen cases = new CaseOpen();
                    cases.setIni(champ.getIni());
                    System.out.println( champ.getIni() );
                    plateau[i][j] = cases;
                }
                
                
                else {
                     CaseOpen cases = new CaseOpen();
                     plateau[i][j] = cases;
                     
                }
               
            }
            
        }
    }

  

    public Pacman getPacman() {
        return pacman;
    }

    public List<Ghost> getGhosts() {
        return ghosts;
    }

    public Case[][] getPlateau() {
        return plateau;
    }

    public static int[][] getTab() {
        return tab;
    }
    
    
    
   
    
    
    
    public  static boolean estGomme(int x, int y){
        boolean valeur = false;
        if(tab[x][y] == Selection.GOMME.ordinal()){
            valeur =  true;
        }
        return valeur;
    }
    public static boolean estFruit(int x, int y){
        boolean valeur = false;
        if(tab[x][y] == Selection.FRUIT.ordinal()){
            valeur =  true;
        }
        return valeur;
    }
    public static boolean estChampigon(int x, int y){
        boolean valeur = false;
        if(tab[x][y] == Selection.CHAMPIGNON.ordinal()){
            valeur =  true;
        }
        return valeur;
    }
    public static boolean estMur(int x, int y){
        boolean valeur = false;
        if(tab[x][y] == Selection.MUR.ordinal()){
            valeur =  true;
        }
        return valeur;
    }
    
    
    
     
     
    
   

   
    

    
   
    
    /* Renvoie la position du Pacman */
    public  int getPositionPacman(){
        /* N'est pas correct  */
       
//        int pos = 0;
//        for( int i = 0; i < tabCase.length ; ++i ){
//            for( int j = 0;  j < tabCase[i].length  ; ++j ){
//                 if (Labyrinthe.getTab()[i][j] == Selection.PACMAN.ordinal()){
//                        return 
//                 }
//                
//            }
//        }
        return 0;
    }
    
   
    
    
    
  
     
   
    
    /* Deplace le pacman vers la gauche */
    public  void deplacerGauche(){
        
        int positionPacman = getPositionPacman();
        int allerGauche = positionPacman-1;
        
        refresh();   
    }
    /* Deplacer vers la Droite  */
    public  void deplacerDroite(){
        int positionPacman = getPositionPacman();
        int allerDroite = positionPacman+1;
       
        refresh();   
    }
    /* Deplacer vers le Haut  */
    public  void deplacerHaut(){
        
        int positionPacman = getPositionPacman();
        int allerHaut = positionPacman-23;
        
        refresh();   
    }
    /* Deplacer vers le Bas  */
    public  void deplacerBas(){
        
        int positionPacman = getPositionPacman();
        int allerBas = positionPacman+23;
        
        refresh();   
    }
    
    /* Permutation cyclique gauche  */
    public static  void modifier ( int [] list) {
          if(list.length  > 0) {
            int tmp = list[0];
            for(int k = 1; k < list.length; ++k){
              list[k - 1] = list[k];
            }
            list[list.length - 1] = tmp;
          }
    }
    
    /* Donner la position du ghost  */
    public static int getPositionGhost(int random){
//        Ghost ghost = (Ghost) model.ini.PlacerGhost.getGhost();
//        List arrayghost = new ArrayList<>();
//        int pos = 0;
//        for(int i = 0; i < listecases.size() ; ++i){
//            if( listecases.get(pos).equals(ghost)){
//                  arrayghost.add(pos);
//            }
//            ++pos;
//        }
//        ghost.setNombreDeGhost(arrayghost.size());
//        return (Integer)arrayghost.get(random);
        return 0;
    }
    
    
  
    
  
   
    
    
    
    
    private void notifier() {
        setChanged();
        notifyObservers(plateau);
    }
    public void refresh() {
        notifier();
    }
    public void setChangedAndNotify(List<Case> cases) {
        setChanged();
        notifyObservers(cases);
    }
    
    
  
   
    
}
        
    

    
    
    
    
    
   


   
        
         
    
   

    
   
    
    
    
    

