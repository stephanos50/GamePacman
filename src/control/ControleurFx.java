/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.List;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.util.Duration;


import model.Labyrinthe;
import model.personnage.Ghost;
import vue.VueFx;
/**
 *
 * @author steohanos
 */
public class ControleurFx extends Application {
    
//    private static int [] list = model.Labyrinthe.getGhost().getPosGhost();
//    private static Personnage ghost = model.Labyrinthe.getGhost();
   
    private static Stage stage = new Stage();
    private static Labyrinthe plateau = new Labyrinthe() ; 
    private int animation = Animation.INDEFINITE;

    public static Labyrinthe getPlateau() {
        return plateau;
    }
    
    /* Je ne passe q'une seule fois dans la methode  */
    private   void joue() {
        
        KeyFrame frame  = new KeyFrame(Duration.millis(100),  ae -> actionPeriodique() );
        Timeline timeline = new Timeline(frame);
        timeline.setCycleCount(0);
        timeline.play();
        
        
    }
    
    /* Je passe plusieur fois dans la methode  */
    private  void actionPeriodique() {
        
//        model.ini.PlacerGhost.getGhost().move(Direction.randomDirection());
    }

    
    
    
    
    
    /* Constructeur */
    public ControleurFx(){
        plateau = new Labyrinthe();
        plateau.addObserver(VueFx.getInstance());
        
    }
    

    @Override
    public void start(Stage stage) {
        newWindows(stage);
        
        
    }
    
    public static void main(String[] args) {
        Application.launch(args);
    }
    
    private  void newWindows(Stage satge){
        
        VueFx.initialisation(plateau);
        VueFx.newWindows(stage);
//        model.Labyrinthe.getGhost().addObserver(VueFx.getInstance());
//        joue();
    }
    
    private void initialiser(){
        VueFx.initialisation(plateau);
        VueFx.afficheInformation();
       
    }
        

}

