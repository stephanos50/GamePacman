
package control;


import model.Labyrinthe;
import vue.Vue;




public class Controleur {
    public static void main(String[] args) {
        Controleur game = new Controleur();
        game.lancer();
    }
    /* ####################################################################### */
     private static  Labyrinthe labyrinthe;
     
     
    /* ####################################################################### */
    public Controleur(){
        labyrinthe = new Labyrinthe();
        labyrinthe.addObserver(Vue.getInstance());
    }
    /* ####################################################################### */
    public void lancer() {
       initialiser();
        Direction choix = null;
            do {
                choix = Vue.saisirDirection();
                switch (choix) {
                    case RIGHT:
                        moveLeft();
                        break;
                    case LEFT:
                        moveRight();
                        break;
                    case UP:
                        moveUp();
                        break;
                    case DOWN:
                        moveDown();
                        break;
                }
            } while ( 10  >=0 );
            
    }
    /* Bouger à gauche */
    /* ################ */
    private  void  moveLeft(){
      labyrinthe.deplacerGauche();
      
      affichePlateau();
  }
    /* Bouger à droite */
    /* ################ */
    private void moveRight(){
       labyrinthe.deplacerDroite();
       affichePlateau();
       
    }
    /* Bouger vers le haut */
    /* ################ */
    private void moveUp(){
       labyrinthe.deplacerHaut();
       affichePlateau();
    }
    /* Bouger vers le bas */
    /* ################ */
    private void moveDown(){
        labyrinthe.deplacerBas();
        affichePlateau();
    }
    private void  affichePlateau(){
        Vue.afficherPlateau(labyrinthe);
        Vue.afficheInformation();
    }
    private void initialiser(){
        Vue.initialisation(labyrinthe);
        Vue.afficherPlateau(labyrinthe);
        Vue.afficheInformation();
        
       
    }
    
    
    
}




