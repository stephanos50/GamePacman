package vue;


import java.util.Deque;

import model.cases.Case;
import model.Labyrinthe;




import java.util.List;
import java.util.Observable;
import java.util.Observer;

import javafx.event.EventHandler;

import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.paint.*;

import model.Selection;
import static model.Selection.GOMME;
import model.Labyrinthe;
import model.aliment.*;

import model.personnage.*;







public class VueFx implements Observer {
    
    
    
    
    private final static Image pacmanImg = new Image("file:images/pacman_normal.png");
    private final static Image superPacamn = new Image("file:images/superPacman.png");
    private final static Image gommeImg = new Image("file:images/gomme.png");
    private final static Image murImg = new Image("file:images/mur03.png");
    private final static Image centreImg = new Image("file:images/mur03.png");
    private static  Image ghostImg = new Image("file:images/enemy_normal.png");
    private  static  Image enemyghostImg = new Image("file:images/enemy_blue.png");
    private final static  Image fruitImg  = new Image("file:images/fruit.png");
    private final static  Image cheminImg  = new Image("file:images/chemin.png");
    private final static  Image champignonImg  = new Image("file:images/champignon.png");
    
    private static final String NOMBREDE_VIE = "Vie : ";
    private static final String NOMBREDE_POINT = "Point : ";
    private static final String NOMBREDE_GHOST = "Fantome : ";
    private static final String NOMBREDE_GOMME = "Gomme : ";
    
//    private  final int TAILLE = 100;
    
     private static final int TAILLE = 40;
  
 
    
    private static Stage myStage = new Stage(); 
    private static Canvas canvas = new Canvas(690,750);
    private static BorderPane root = new BorderPane();
    private static GraphicsContext gc = canvas.getGraphicsContext2D();
    private static Scene scene = new Scene(root,690,770);
    private static Label information = new Label();
    private static  VueFx VUEFX = new VueFx();
    
    /* Constructeur */
    public static VueFx getInstance() { return VUEFX; }
    public VueFx() {}
    
    public static  void newWindows(Stage myStage){
        startStage(myStage);
    }
    
 
    /*  Cadre Secondaire  SCENE  */  
    private static void startStage(Stage myStage) {
        
        information.setText(afficheInformation());
        information.setFont(Font.font("Times New Roman", FontWeight.BOLD, 16));
        information.setTextFill(Color.DARKBLUE);
        
        canvas.setFocusTraversable(false);
        canvas.requestFocus();
        
        aficheCanvas(gc);
        root.setRight(canvas);
        root.setBottom(information);
        myStage.setResizable(true);
        myStage.setTitle("Pacman");
        
        myStage.setScene(scene);
        
        canvas.requestFocus();
        canvas.setFocusTraversable(false);
        canvas.setOnKeyPressed((KeyEvent event) -> {
            switch (event.getCode()) {
                case UP:    control.ControleurFx.getPlateau().deplacerHaut();     break;
                case DOWN:  control.ControleurFx.getPlateau().deplacerBas();      break;
                case LEFT:  control.ControleurFx.getPlateau().deplacerGauche();   break;
                case RIGHT:   control.ControleurFx.getPlateau().deplacerDroite(); break;

            }
        });
        
        
        
        myStage.show();
    }   

   
    
    
    
    
    public static void aficheCanvas(GraphicsContext gc ) {
        int position = 0;
        for (int i = 0 ; i < Labyrinthe.getTab().length ; ++i){
            for (int j = 0; j < Labyrinthe.getTab()[i].length; ++j){
                if(  model.Labyrinthe.estMur(i,j)  ){
                    gc.drawImage(murImg, 30 * j, 30 * i, 30,30);
                } 
                else if( model.Labyrinthe.estChampigon(i,j)  ){
                    gc.drawImage(champignonImg, 30 * j, 30 * i, 30, 30);
                } 
                else if( model.Labyrinthe.estFruit(i,j) ){
                    gc.drawImage(fruitImg, 30 * j, 30 * i, 30, 30);
                } 
                else if( model.Labyrinthe.estGomme(i,j) ){
                    gc.drawImage(gommeImg, 30 * j, 30 * i, 30, 30);
                }
                else {
                    gc.drawImage(cheminImg, 30 * j, 30 * i, 30, 30);
                }
                 ++position;
                 
            }
        }
    }
    
    
    

    public static Image getGhostImg() {
        return ghostImg;
    }

    public static Image getEnemyghostImg() {
        return enemyghostImg;
    }

    public static void setGhostImg(Image ghostImg) {
        VueFx.ghostImg = ghostImg;
    }

    public static void setEnemyghostImg(Image enemyghostImg) {
        VueFx.enemyghostImg = enemyghostImg;
    }

    

    
    
    
    

    
    
    
    
    public static String  afficheInformation() {
//        Personnage pacman = model.ini.PlacerPacman.getPacman();
//        int nombreDeVie = pacman.getNombreDeVie();
//        int nombreDePoint = pacman.getNombreDePoint();
//        int nombreDeGhost = model.ini.PlacerGhost.getGhost().getNombreDeGhost();
//        int nombreDeGomme = model.ini.PlacerGomme.getGomme().getNombreGomme(); ;
       
        StringBuilder sb = new StringBuilder (  " " + " " 
//                " " + NOMBREDE_VIE + " " + nombreDeVie
//            + " - " + NOMBREDE_POINT + " " + nombreDePoint
//            + " - " + NOMBREDE_GHOST + " " + nombreDeGhost
//            + " - " + NOMBREDE_GOMME + " " + nombreDeGomme
        );
        
        return sb.toString();
    }
    
    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof Labyrinthe){
            aficheCanvas(gc);
            information.setText(afficheInformation());
            
        }
        if (arg instanceof Ghost) {
            aficheCanvas(gc);
            

        }
        
    }
    /* Place les Personnage et Aliments à leurs positions initiale   */
    public static void initialisation(Labyrinthe plateau){
          
          
            
    }
   
    
    
}
        
    
    
    


        

    
    
    
    
    

   

    
   
    
   
   
   

   



   
