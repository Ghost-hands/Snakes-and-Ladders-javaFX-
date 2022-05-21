

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;
import static <<packagename>>.Globalvariables.player1score;
import static <<packagename>>.Globalvariables.player1x;
import static <<packagename>>.Globalvariables.player1y;
import static <<packagename>>.Globalvariables.player2score;
import static <<packagename>>.Globalvariables.player2x;
import static <<packagename>>.Globalvariables.player2y;
/**
 *
 * @author Ahmed Amin
 * Disclaimer: THIS GAME IS ONLY FOR THE HARDCORE SNAKES AND LADDERS FANS!
 */
public class SALAhmedAmin extends Application {
    
     @Override
    @SuppressWarnings("empty-statement")
    public void start(Stage primaryStage)throws Exception{ 
        /*
....................................................................................................
CREATING 5x5 GAMEBOARD & LABELING CELLS:
....................................................................................................
        */
       Pane Fullgame = new Pane ();//to contain all the nodes, and be able to show the win image without destroying the 5x5 table borders.
       Fullgame.setStyle("-fx-background-color: #ffffff;");//makes background WHITE.
       int i;
       int j;
       int rownumber;
       int columnnumber;
       rownumber = 5;
       columnnumber = 5;
       //Loop within a loop to generate the 5x5 game board. Each cell has its own address (i, j) as a result.
        Rectangle [][] cell = new Rectangle[rownumber][columnnumber];
        GridPane board = new GridPane();
        for (i =0; i<rownumber; i++){
        for (j=0; j<columnnumber; j++){
             cell[i][j] = new Rectangle();
                cell[i][j].setWidth(150);
                cell[i][j].setHeight(150);
                cell[i][j].setFill(Color.LIGHTYELLOW);
                board.setAlignment(Pos.CENTER);
                board.setGridLinesVisible(true);//makes gridlines visible!
                board.setHgap(1);
                board.setVgap(1);
                GridPane.setRowIndex(cell[i][j], i);
                GridPane.setColumnIndex(cell[i][j], j);
                board.getChildren().add(cell[i][j]);


                
        }
    }
        //Long winded set of 25 codes that each represent a label  on the 5x5 game board.
        Label celllabel1 = new Label("1") ;
        celllabel1.setStyle("-fx-text-fill:RED;");
        celllabel1.setPadding(new Insets(5, 10, 120, 5));
        celllabel1.setWrapText(true);
        board.add(celllabel1, 0 , 4 ); 

        Label celllabel2 = new Label("2") ;
        celllabel2.setStyle("-fx-text-fill:RED;");
        celllabel2.setPadding(new Insets(5, 10, 120, 5));
        celllabel2.setWrapText(true);
        board.add(celllabel2, 1 , 4 ); 
      
        Label celllabel3 = new Label("3") ;
        celllabel3.setStyle("-fx-text-fill:RED;");
        celllabel3.setPadding(new Insets(5, 10, 120, 5));
        celllabel3.setWrapText(true);
        board.add(celllabel3, 2 , 4 ); 
        
        Label celllabel4 = new Label("4") ;
        celllabel4.setStyle("-fx-text-fill:RED;");
        celllabel4.setPadding(new Insets(5, 10, 120, 5));
        celllabel4.setWrapText(true);
        board.add(celllabel4, 3 , 4 ); 
        
        Label celllabel5 = new Label("5") ;
        celllabel5.setStyle("-fx-text-fill:RED;");
        celllabel5.setPadding(new Insets(5, 10, 120, 5));
        celllabel5.setWrapText(true);
        board.add(celllabel5, 4 , 4 ); 
        
        Label celllabel6 = new Label("6") ;
        celllabel6.setStyle("-fx-text-fill:RED;");
        celllabel6.setPadding(new Insets(5, 10, 120, 5));
        celllabel6.setWrapText(true);
        board.add(celllabel6, 4 , 3 ); 
        
        Label celllabel7 = new Label("7") ;
        celllabel7.setStyle("-fx-text-fill:RED;");
        celllabel7.setPadding(new Insets(5, 10, 120, 5));
        celllabel7.setWrapText(true);
        board.add(celllabel7, 3 , 3 );
        
        Label celllabel8 = new Label("8") ;
        celllabel8.setStyle("-fx-text-fill:RED;");
        celllabel8.setPadding(new Insets(5, 10, 120, 5));
        celllabel8.setWrapText(true);
        board.add(celllabel8, 2 , 3 );
        
        Label celllabel9 = new Label("9") ;
        celllabel9.setStyle("-fx-text-fill:RED;");
        celllabel9.setPadding(new Insets(5, 10, 120, 5));
        celllabel9.setWrapText(true);
        board.add(celllabel9, 1 , 3 );
        
        Label celllabel10 = new Label("10") ;
        celllabel10.setStyle("-fx-text-fill:RED;");
        celllabel10.setPadding(new Insets(5, 10, 120, 5));
        celllabel10.setWrapText(true);
        board.add(celllabel10, 0 , 3 );
        
        Label celllabel11 = new Label("11") ;
        celllabel11.setStyle("-fx-text-fill:RED;");
        celllabel11.setPadding(new Insets(5, 10, 120, 5));
        celllabel11.setWrapText(true);
        board.add(celllabel11, 0 , 2 );
        
         Label celllabel12 = new Label("12") ;
        celllabel12.setStyle("-fx-text-fill:RED;");
        celllabel12.setPadding(new Insets(5, 10, 120, 5));
        celllabel12.setWrapText(true);
        board.add(celllabel12, 1 , 2 );
        
         Label celllabel13 = new Label("13") ;
        celllabel13.setStyle("-fx-text-fill:RED;");
        celllabel13.setPadding(new Insets(5, 10, 120, 5));
        celllabel13.setWrapText(true);
        board.add(celllabel13, 2 , 2 );
        
         Label celllabel14 = new Label("14") ;
        celllabel14.setStyle("-fx-text-fill:RED;");
        celllabel14.setPadding(new Insets(5, 10, 120, 5));
        celllabel14.setWrapText(true);
        board.add(celllabel14, 3 , 2 );
        
         Label celllabel15 = new Label("15") ;
        celllabel15.setStyle("-fx-text-fill:RED;");
        celllabel15.setPadding(new Insets(5, 10, 120, 5));
        celllabel15.setWrapText(true);
        board.add(celllabel15, 4 , 2 );
        
         Label celllabel16 = new Label("16") ;
        celllabel16.setStyle("-fx-text-fill:RED;");
        celllabel16.setPadding(new Insets(5, 10, 120, 5));
        celllabel16.setWrapText(true);
        board.add(celllabel16, 4 , 1 );
        
         Label celllabel17 = new Label("17") ;
        celllabel17.setStyle("-fx-text-fill:RED;");
        celllabel17.setPadding(new Insets(5, 10, 120, 5));
        celllabel17.setWrapText(true);
        board.add(celllabel17, 3 , 1 );
        
        Label celllabel18 = new Label("18") ;
        celllabel18.setStyle("-fx-text-fill:RED;");
        celllabel18.setPadding(new Insets(5, 10, 120, 5));
        celllabel18.setWrapText(true);
        board.add(celllabel18, 2 , 1 );
        
        Label celllabel19 = new Label("19") ;
        celllabel19.setStyle("-fx-text-fill:RED;");
        celllabel19.setPadding(new Insets(5, 10, 120, 5));
        celllabel19.setWrapText(true);
        board.add(celllabel19, 1 , 1 );
        
        Label celllabel20 = new Label("20") ;
        celllabel20.setStyle("-fx-text-fill:RED;");
        celllabel20.setPadding(new Insets(5, 10, 120, 5));
        celllabel20.setWrapText(true);
        board.add(celllabel20, 0 , 1 );
        
        Label celllabel21 = new Label("21") ;
        celllabel21.setStyle("-fx-text-fill:RED;");
        celllabel21.setPadding(new Insets(5, 10, 120, 5));
        celllabel21.setWrapText(true);
        board.add(celllabel21, 0 , 0 );
        
        Label celllabel22 = new Label("22") ;
        celllabel22.setStyle("-fx-text-fill:RED;");
        celllabel22.setPadding(new Insets(5, 10, 120, 5));
        celllabel22.setWrapText(true);
        board.add(celllabel22, 1 , 0 );
        
        Label celllabel23 = new Label("23") ;
        celllabel23.setStyle("-fx-text-fill:RED;");
        celllabel23.setPadding(new Insets(5, 10, 120, 5));
        celllabel23.setWrapText(true);
        board.add(celllabel23, 2 , 0 );
        
        Label celllabel24 = new Label("24") ;
        celllabel24.setStyle("-fx-text-fill:RED;");
        celllabel24.setPadding(new Insets(5, 10, 120, 5));
        celllabel24.setWrapText(true);
        board.add(celllabel24, 3 , 0 );
        
        Label celllabel25 = new Label("25") ;
        celllabel25.setStyle("-fx-text-fill:RED;");
        celllabel25.setPadding(new Insets(5, 10, 120, 5));
        celllabel25.setWrapText(true);
        board.add(celllabel25, 4 , 0 );
       /*
...................................................................................................
ADDING THE SNAKES AND THE LADDERS:
Disclaimer: Please put the images folder in Windows (C:) area.
snake.gif should be outside the images folder but still in Windows (C:) area.
...................................................................................................
       */
       //THE 3 SNAKES:
        //Code to intialize image, and fetch image file through the file path written in "". Repeated with variation depending on image for all following image uses.
         FileInputStream snake1input = new FileInputStream("C:\\snake.gif");
        Image snake1 = new Image(snake1input);
        ImageView is1 = new ImageView(snake1);
        Label snake1label = new Label ("", is1);
        snake1label.setPadding(new Insets(-75, -75, -75 , 75));
        is1.setFitHeight(275);
        board.add(snake1label, 3, 1);
        
        
        FileInputStream snake2input = new FileInputStream("C:\\images\\snake2.gif");
        Image snake2 = new Image(snake2input);
        ImageView is2 = new ImageView(snake2);
        Label snake2label = new Label ("", is2);
        snake2label.setPadding(new Insets(-75, -75, -200 , 60));
        board.add(snake2label, 2, 3);
        
        FileInputStream snake3input = new FileInputStream("C:\\images\\snake3.gif");
        Image snake3 = new Image(snake3input);
        ImageView is3 = new ImageView(snake3);
        Label snake3label = new Label ("", is3);
        snake3label.setPadding(new Insets(-75, -75, -200 , 60));
        is3.setFitHeight(420);
        board.add(snake3label, 0, 2);
        
       
      // THE 3 LADDERS:
        FileInputStream ladder1input = new FileInputStream("C:\\images\\ladder.gif");
        Image ladder1 = new Image(ladder1input);
        ImageView il1 = new ImageView(ladder1);
        Label ladder1label = new Label ("", il1);
        ladder1label.setPadding(new Insets(-75, -75, -220 , 70));
        il1.setFitHeight(230);
        board.add(ladder1label, 1, 2);
        
         FileInputStream ladder2input = new FileInputStream("C:\\images\\ladder2.gif");
        Image ladder2 = new Image(ladder2input);
        ImageView il2 = new ImageView(ladder2);
        Label ladder2label = new Label ("", il2);
        ladder2label.setPadding(new Insets(-75, -75, -220 , 60));
        il2.setFitHeight(230);
        board.add(ladder2label, 2, 0);
        
        FileInputStream ladder3input = new FileInputStream("C:\\images\\ladder3.gif");
        Image ladder3 = new Image(ladder3input);
        ImageView il3 = new ImageView(ladder3);
        Label ladder3label = new Label ("", il3);
        ladder3label.setPadding(new Insets(-75, -75, -385 , 50));
        il3.setFitHeight(375);
        board.add(ladder3label, 4, 2);
      /*
......................................................................................................
THE MECHANICS OF THE GAME (DICE, PLAYERS MOVING, WINNING AND RESET):
......................................................................................................
        */
      //PLAYER 1, tooru the bull:
        FileInputStream Player1input = new FileInputStream("C:\\images\\bull.gif");
        Image tooruthebull = new Image(Player1input);
        ImageView ib = new ImageView(tooruthebull);
        Label Player1label = new Label ("", ib);
        Player1label.setPadding(new Insets(-75, -75, -90 , -10));
        board.add(Player1label, 0, 4);
        
      //PLAYER 2, smiling cow:  
        FileInputStream Player2input = new FileInputStream("C:\\images\\cow.gif");
        Image smilingcow = new Image(Player2input);
        ImageView ic = new ImageView(smilingcow);
        Label Player2label = new Label ("", ic);
        Player2label.setPadding(new Insets(-75, -75, -10 , 10));
        board.add(Player2label,0, 4);
        
       
//intializing button known as play, so that players could press on the text "ROLL DICE!", and actually roll the dice.
Button play = new Button ("ROLL DICE!");
play.setPadding(new Insets(10, 10, -1700, 300));
Fullgame.getChildren().add(play);
play.setStyle("-fx-text-fill:RED;");
System.out.println ("Press on ROLL DICE! to start new game!");

//intializing globalvariables. x's and y's of both players. outside the button, so that the values could actually change with each button press.
Globalvariables.player1x = 0;
Globalvariables.player1y = 4;
Globalvariables.player2x = 0;
Globalvariables.player2y = 4;

//WIN GIF INTIALIZATION.
FileInputStream WINNER = new FileInputStream("C:\\images\\win.gif");
Image won = new Image(WINNER);
ImageView w = new ImageView(won);
Label winlabel = new Label ("", w);
w.setFitHeight(750);
w.setFitWidth(750);


Globalvariables.thisplayerturn = false; //Intializing global variable, thisplayerturn as false, so player 1 could start first.
Globalvariables.winner = false; //False means that there is no winner at the moment.

//player 1 and player 2 start with 0 games won.
Globalvariables.player1score = 0;
Globalvariables.player2score = 0;

//With each press on text "ROLL DICE", a random number between 0 and 5 is generated (6 numbers for dice) and appropriate dice image is shown and faded, and both players take turns moving based on dice number.
play.setOnMousePressed((MouseEvent e)->{

 Random Dice = new Random(); 
 int upperbound = 6;
 int numberrolled = Dice.nextInt(upperbound); 
 int stepstaken;
 stepstaken = numberrolled + 1;
 System.out.println(Globalvariables.currentplayer+ " rolled "+ stepstaken);
//the following code maps out both players movements according to dice number rolled. With slight variations as befits the unique possiblities of each dice number.

//Essentially the reset button (disguised as another roll of the dice though!).
if (Globalvariables.winner == true){
    
    Globalvariables.currentplayer = "Player 1: tooru the bull ";
    Globalvariables.thisplayerturn = false;
    System.out.println ("New game!");
    FadeTransition wt = new FadeTransition();
       wt.setNode(winlabel);
       wt.setDuration(new Duration(4000));
       wt.setFromValue(1.0);
       wt.setToValue(0.0);
       wt.setCycleCount(1);
       wt.setAutoReverse(true);
       wt.play();
        
        if (player1x == 4 && player1y == 0){
            Globalvariables.winner = false;
            player2x = 0;
            player2y = 4;
            board.add (Player2label,player2x, player2y );
        }
        if (player2x == 4 && player2y == 0){
            Globalvariables.winner = false;
            player1x = 0;
            player1y = 4;
            board.add (Player1label,player1x, player1y );
        }
        
}


//DICE 1 + Players 1 & 2 moving 1 square.
if (numberrolled == 0){
        FileInputStream input;
          try {
              input = new FileInputStream("C:\\images\\dice1.gif");
              Image dice1 = new Image(input);
        ImageView id1 = new ImageView(dice1);
        Label dicelabel1 = new Label("", id1);
       dicelabel1.setPadding(new Insets(10, 10, -1600, 320));
        Fullgame.getChildren().add(dicelabel1);
        //Fade transition repeated six times to allow the dice numbers to disappear after being shown. Cool effect.
       FadeTransition ft1 = new FadeTransition();
       ft1.setNode(id1);
       ft1.setDuration(new Duration(3000));//4 seconds, as the parameter is written in milliseconds.
       ft1.setFromValue(1.0);//visible.
       ft1.setToValue(0.0);//not visible.
       ft1.setCycleCount(1);
       ft1.setAutoReverse(true);
       play.setOnMouseClicked(me -> ft1.play());//The initial mouse click on play button is also the click for fade transition of each dice number.


      
          } catch (FileNotFoundException ex) {
              Logger.getLogger(SALAhmedAmin20022537.class.getName()).log(Level.SEVERE, null, ex);
          }
  //false means player 1's turn, while true means player 2's turn.        
 if (Globalvariables.thisplayerturn == false){   
Globalvariables.thisplayerturn = true;
Globalvariables.currentplayer = "Player 2: smiling cow ";
if (player1y == 0){
              if (player1x == 2){
                  System.out.println ("Encountered snake head. Punishment: move to square 14.");
                  player1x = player1x + 1;
                  player1y = player1y +2;
                  board.add(Player1label, player1x, player1y);
              }
              if (player1x == 0 || player1x == 1  ){
                  player1x = player1x + 1;
                  board.add(Player1label, player1x, player1y);
              }
              if (player1x == 4){
                  player1x = 0;
                  player1y = 4;
                  board.add(Player1label, player1x, player1y);
              }
             
          }
if (player1y == 1){
              if (player1x == 1){
                  System.out.println ("Encountered head of snake. Punishment: move to square: 1.");
                  player1x = player1x - 1;
                  player1y = player1y + 3;
                  board.add(Player1label, player1x, player1y);
              }
              if (player1x == 3){
                  System.out.println("Encountered bottom of ladder. Reward: move to square: 23.");
                  player1x = player1x - 1;
                  player1y = player1y - 1;
                  board.add(Player1label, player1x, player1y);
              }
              
              if (player1x == 4){
                  player1x = player1x - 1;
                  board.add(Player1label, player1x, player1y);
              }
          }
if (player1y == 2){
             if (player1x == 4){
                 player1y = player1y - 1;
                 board.add(Player1label, player1x, player1y);
             }
             if (player1x == 0 || player1x == 1 || player1x == 2 || player1x == 3 ){
                 player1x = player1x + 1;
                 board.add(Player1label, player1x, player1y);
             }  
         }
if (player1y == 3){
              if (player1x == 1){
                 player1y = player1y -1;
                 board.add(Player1label, player1x, player1y);
             }
              
             if (player1x == 3){
            System.out.println ("Encountered snake head. Punishment: move to square 3.");
                 player1x = player1x -1;
                 player1y = player1y +1;
                 board.add(Player1label, player1x, player1y);
             }
             if (player1x == 4 ){
                  player1x = player1x - 1;
                  board.add(Player1label, player1x, player1y);
             }
            if (player1x == 0){
                player1y = player1y -1;
                board.add(Player1label, player1x, player1y);
            }
         }
if (player1y == 4){
        if (player1x == 2 || player1x == 0 || player1x == 1 ){
       player1x = player1x + 1;
       board.add(Player1label, player1x, player1y);
       
         }
        if (player1x == 3){
        System.out.println ("Encountered bottom of ladder. Reward: move to square: 15.");
            player1x = player1x + 1;
            player1y = player1y -2;
            board.add(Player1label, player1x, player1y);
        }
        }

}        
if (Globalvariables.thisplayerturn == true){
    Globalvariables.thisplayerturn = false;
Globalvariables.currentplayer = "Player 1: tooru the bull ";
if (player2y == 0){

              if (player2x == 2){
                  System.out.println ("Encountered snake head. Punishment: move to square 14.");
                  player2x = player2x + 1;
                  player2y = player2y +2;
                  board.add(Player2label, player2x, player2y);
              }
              if (player2x == 0 || player2x == 1  ){
                  player2x = player2x + 1;
                  board.add(Player2label, player2x, player2y);
              }
              if (player2x == 4){
                  player2x = 0;
                  player2y = 4;
                  board.add(Player2label, player2x, player2y);
              }
            
          }
if (player2y == 1){
              if (player2x == 1){
                  System.out.println ("Encountered head of snake. Punishment: move to square: 1.");
                  player2x = player2x - 1;
                  player2y = player2y + 3;
                  board.add(Player2label, player2x, player2y);
              }
              if (player2x == 3){
                  System.out.println("Encountered bottom of ladder. Reward: move to square: 23.");
                  player2x = player2x - 1;
                  player2y = player2y - 1;
                  board.add(Player2label, player2x, player2y);
              }
              
              if (player2x == 4){
                  player2x = player2x - 1;
                  board.add(Player2label, player2x, player2y);
              }
          }
if (player2y == 2){
             if (player2x == 4){
                 player2y = player2y - 1;
                 board.add(Player2label, player2x, player2y);
             }
             if (player2x == 0 || player2x == 1 || player2x == 2 || player2x == 3 ){
                 player2x = player2x + 1;
                 board.add(Player2label, player2x, player2y);
             }  
         }
if (player2y == 3){
              if (player2x == 1){
                 player2y = player2y -1;
                 board.add(Player2label, player2x, player2y);
             }
              
             if (player2x == 3){
            System.out.println ("Encountered snake head. Punishment: move to square 3.");
                 player2x = player2x -1;
                 player2y = player2y +1;
                 board.add(Player2label, player2x, player2y);
             }
             if (player2x == 4 ){
                  player2x = player2x - 1;
                  board.add(Player2label, player2x, player2y);
             }
            if (player2x == 0){
                player2y = player2y -1;
                board.add(Player2label, player2x, player2y);
            }
         }
if (player2y == 4){
        if (player2x == 2 || player2x == 0 || player2x == 1 ){
       player2x = player2x + 1;
       board.add(Player2label, player2x, player2y);
       
         }
        if (player2x == 3){
        System.out.println ("Encountered bottom of ladder. Reward: move to square: 15.");
            player2x = player2x + 1;
            player2y = player2y -2;
            board.add(Player2label, player2x, player2y);
        }
        }

}

}
        

      
 //DICE 2 + Players 1 & 2 moving 2 squares.    
if (numberrolled == 1){
        FileInputStream input2;
          try {
              input2 = new FileInputStream("C:\\images\\dice2.gif");
              Image dice2 = new Image(input2);
        ImageView id2 = new ImageView(dice2);
        Label dicelabel2 = new Label("", id2);
       dicelabel2.setPadding(new Insets(10, 10, -1600, 320));
        Fullgame.getChildren().add(dicelabel2);
        FadeTransition ft2 = new FadeTransition();
       ft2.setNode(id2);
       ft2.setDuration(new Duration(3000));
       ft2.setFromValue(1.0);
       ft2.setToValue(0.0);
       ft2.setCycleCount(1);
       ft2.setAutoReverse(true);
       play.setOnMouseClicked(me -> ft2.play());
       
      
          } catch (FileNotFoundException ex) {
              Logger.getLogger(SALAhmedAmin20022537.class.getName()).log(Level.SEVERE, null, ex);
          }
 if (Globalvariables.thisplayerturn == false){  
     Globalvariables.thisplayerturn = true;
Globalvariables.currentplayer = "Player 2: smiling cow ";
if (player1y == 0){
              if (player1x == 2){
                  Globalvariables.winner = true;
                  player1x = player1x + 2;
                  player1score = player1score + 1;
               System.out.println("Player 1, tooru the bull, reached square 25 and WON!");
               System.out.println("Press on ROLL DICE! twice or thrice to restart game!");
               System.out.println("Player 1's current games won: " + player1score);
               Fullgame.getChildren().add(winlabel);
               board.add(Player1label, player1x, player1y);
               

               
              }
              if (player1x == 0){
                  player1x = player1x + 2;
                  board.add(Player1label, player1x, player1y);
              }
              if (player1x == 1){
                  System.out.println ("Encountered snake head. Punishment: move to square 14.");
                  player1x = player1x + 2;
                  player1y = player1y + 2;
                  board.add(Player1label, player1x, player1y);
              }
              if (player1x == 4){
                  player1x = 0;
                  player1y = 4;
                  board.add(Player1label, player1x, player1y);
              }
             
          }
if (player1y == 1){
              if (player1x == 1){
                  player1x = player1x - 1;
                  player1y = player1y - 1;
                  board.add(Player1label, player1x, player1y);
              }
              if (player1x == 3){
                  player1x = player1x - 2;
                  board.add(Player1label, player1x, player1y);
              }
              
              if (player1x == 4){
                  System.out.println("Encountered bottom of ladder. Reward: move to square: 23.");
                  player1x = player1x - 2;
                  player1y = player1y - 1;
                  board.add(Player1label, player1x, player1y);
              }
          }
if (player1y == 2){
             if (player1x == 4){
                 player1x = player1x - 1;
                 player1y = player1y - 1;
                 board.add(Player1label, player1x, player1y);
             }
             if ( player1x == 2 ){
                 player1x = player1x + 2;
                 board.add(Player1label, player1x, player1y);
             }
             if (player1x == 0){
                 player1x = player1x + 2;
                 board.add(Player1label, player1x, player1y); 
             }
             if (player1x == 1){
                 player1x = player1x + 2;
                 board.add(Player1label, player1x, player1y); 
             }
              if (player1x == 3){
                 player1x = player1x + 1;
                 player1y = player1y - 1;
                 board.add(Player1label, player1x, player1y); 
             }
         }
if (player1y == 3){
              
             if (player1x == 3){
        System.out.println ("Encountered bottom of ladder. Reward: move to square: 12.");
                 player1x = player1x - 2;
                 player1y = player1y - 1;
                 board.add(Player1label, player1x, player1y);
             }
             if (player1x == 4 ){
            System.out.println ("Encountered snake head. Punishment: move to square 3.");
                  player1x = player1x - 2;
                  player1y = player1y + 1;
                  board.add(Player1label, player1x, player1y);
             }
            if (player1x == 0){
                player1x = player1x + 1;
                player1y = player1y -1;
                board.add(Player1label, player1x, player1y);
            }
         }
if (player1y == 4){
        if (player1x == 0){
       player1x = player1x + 2;
       board.add(Player1label, player1x, player1y);
       
         }
        if (player1x == 2){
        System.out.println ("Encountered bottom of ladder. Reward: move to square: 15.");
            player1x = player1x + 2;
            player1y = player1y -2;
            board.add(Player1label, player1x, player1y);
        }
        if (player1x == 1){
            player1x = player1x + 2;
       board.add(Player1label, player1x, player1y);
        }
        if (player1x == 3){
            player1x = player1x + 1;
            player1y = player1y - 1;
            board.add(Player1label, player1x, player1y);
        }
        }

}        
if (Globalvariables.thisplayerturn == true){
    Globalvariables.thisplayerturn = false;
Globalvariables.currentplayer = "Player 1: tooru the bull ";
if (player2y == 0){
              if (player2x == 2){
                  Globalvariables.winner = true;
                  player2x = player2x + 2;
                  player2score = player2score + 1;
                  System.out.println("Player 2, smiling cow, reached square 25 and WON!");
                  System.out.println("Press on ROLL DICE! twice or thrice to restart game!");
                  System.out.println ("Player 2's current games won: " + player2score);
                  Fullgame.getChildren().add(winlabel);
                  board.add(Player2label, player2x, player2y);
                  
                  
              }
              if (player2x == 0){
                  player2x = player2x + 2;
                  board.add(Player2label, player2x, player2y);
              }
              if (player2x == 1){
                  System.out.println ("Encountered snake head. Punishment: move to square 14.");
                  player2x = player2x + 2;
                  player2y = player2y + 2;
                  board.add(Player2label, player2x, player2y);
              }
              if (player2x == 4){
                  player2x = 0;
                  player2y = 4;
                  board.add(Player2label, player2x, player2y);
              }
             
          }
if (player2y == 1){
              if (player2x == 1){
                  player2x = player2x - 1;
                  player2y = player2y - 1;
                  board.add(Player2label, player2x, player2y);
              }
              if (player2x == 3){
                  player2x = player2x - 2;
                  board.add(Player2label, player2x, player2y);
              }
              
              if (player2x == 4){
                  System.out.println("Encountered bottom of ladder. Reward: move to square: 23.");
                  player2x = player2x - 2;
                  player2y = player2y - 1;
                  board.add(Player2label, player2x, player2y);
              }
          }
if (player2y == 2){
             if (player2x == 4){
                 player2x = player2x - 1;
                 player2y = player2y - 1;
                 board.add(Player2label, player2x, player2y);
             }
             if ( player2x == 2 ){
                 player2x = player2x + 2;
                 board.add(Player2label, player2x, player2y);
             }
             if (player2x == 0){
                 player2x = player2x + 2;
                 board.add(Player2label, player2x, player2y); 
             }
             if (player2x == 1){
                 player2x = player2x + 2;
                 board.add(Player2label, player2x, player2y); 
             }
              if (player2x == 3){
                 player2x = player2x + 1;
                 player2y = player2y - 1;
                 board.add(Player2label, player2x, player2y); 
             }
         }
if (player2y == 3){
              
             if (player2x == 3){
        System.out.println ("Encountered bottom of ladder. Reward: move to square: 12.");
                 player2x = player2x - 2;
                 player2y = player2y - 1;
                 board.add(Player2label, player2x, player2y);
             }
             if (player2x == 4 ){
            System.out.println ("Encountered snake head. Punishment: move to square 3.");
                  player2x = player2x - 2;
                  player2y = player2y + 1;
                  board.add(Player2label, player2x, player2y);
             }
            if (player2x == 0){
                player2x = player2x + 1;
                player2y = player2y -1;
                board.add(Player2label, player2x, player2y);
            }
         }
if (player2y == 4){
        if (player2x == 0){
       player2x = player2x + 2;
       board.add(Player2label, player2x, player2y);
       
         }
        if (player2x == 2){
        System.out.println ("Encountered bottom of ladder. Reward: move to square: 15.");
            player2x = player2x + 2;
            player2y = player2y -2;
            board.add(Player2label, player2x, player2y);
        }
        if (player2x == 1){
            player2x = player2x + 2;
       board.add(Player2label, player2x, player2y);
        }
        if (player2x == 3){
            player2x = player2x + 1;
            player2y = player2y - 1;
            board.add(Player2label, player2x, player2y);
        }
        }

} 

}
//DICE 3 + Players 1 & 2 moving 3 squares.
if (numberrolled == 2){
        FileInputStream input3;
          try {
              input3 = new FileInputStream("C:\\images\\dice3.gif");
              Image dice3 = new Image(input3);
        ImageView id3 = new ImageView(dice3);
        Label dicelabel3 = new Label("", id3);
       dicelabel3.setPadding(new Insets(10, 10, -1600, 320));
        Fullgame.getChildren().add(dicelabel3);
        FadeTransition ft3 = new FadeTransition();
       ft3.setNode(id3);
       ft3.setDuration(new Duration(3000));
       ft3.setFromValue(1.0);
       ft3.setToValue(0.0);
       ft3.setCycleCount(1);
       ft3.setAutoReverse(true);
       play.setOnMouseClicked(me -> ft3.play());

      
          } catch (FileNotFoundException ex) {
              Logger.getLogger(SALAhmedAmin20022537.class.getName()).log(Level.SEVERE, null, ex);
          }
 if (Globalvariables.thisplayerturn == false){
     Globalvariables.thisplayerturn = true;
Globalvariables.currentplayer = "Player 2: smiling cow ";
if (player1y == 0){
              if (player1x == 2){
             System.out.println ("Number rolled leads out of bounds. please press ROLL! again.");
               board.add(Player1label, player1x, player1y);

              }
              if (player1x == 0){
                  System.out.println ("Encountered snake head. Punishment: move to square 14.");
                  player1x = player1x + 3;
                  player1y = player1y + 2;
                  board.add(Player1label, player1x, player1y);
              }
              if (player1x == 1){
                  Globalvariables.winner = true;
                  player1score = player1score + 1;
                  System.out.println("Player 1, tooru the bull, reached square 25 and WON!");
                  System.out.println("Press on ROLL DICE! twice or thrice to restart game!");
                  System.out.println ("Player 1's current games won: " + player1score);
                  player1x = player1x + 3;
                  Fullgame.getChildren().add(winlabel);
                  board.add(Player1label, player1x, player1y);
              }
              if (player1x == 4){
                  player1x = 0;
                  player1y = 4;
                  board.add(Player1label, player1x, player1y);
              }
              
          }
if (player1y == 1){
              if (player1x == 1){
                  player1y = player1y - 1;
                  board.add(Player1label, player1x, player1y);
              }
              if (player1x == 3){
                  System.out.println ("Encountered head of snake. Punishment: move to square: 1.");
                  player1x = player1x - 3;
                  player1y = player1y + 3;
                  board.add(Player1label, player1x, player1y);
              }
              
              if (player1x == 4){
                  player1x = player1x - 3;
                  board.add(Player1label, player1x, player1y);
              }
          }
if (player1y == 2){
             if (player1x == 4){
                  System.out.println("Encountered bottom of ladder. Reward: move to square: 23.");
                 player1x = player1x - 2;
                 player1y = player1y - 2;
                 board.add(Player1label, player1x, player1y);
             }
             if ( player1x == 2 ){
                 player1x = player1x + 2;
                 player1y = player1y - 1;
                 board.add(Player1label, player1x, player1y);
             }
             if (player1x == 0){
                 player1x = player1x + 3;
                 board.add(Player1label, player1x, player1y); 
             }
             if (player1x == 1){
                 player1x = player1x + 3;
                 board.add(Player1label, player1x, player1y); 
             }
              if (player1x == 3){
                 player1y = player1y - 1;
                 board.add(Player1label, player1x, player1y); 
             }
         }
if (player1y == 3){
              
             if (player1x == 3){
                 player1x = player1x - 3;
                 board.add(Player1label, player1x, player1y);
             }
             if (player1x == 4 ){
        System.out.println ("Encountered bottom of ladder. Reward: move to square: 12.");
                  player1x = player1x - 3;
                  player1y = player1y - 1;
                  board.add(Player1label, player1x, player1y);
             }
            if (player1x == 0){
                player1x = player1x + 2;
                player1y = player1y -1;
                board.add(Player1label, player1x, player1y);
            }
         }
if (player1y == 4){
        if (player1x == 0){
       player1x = player1x + 3;
       board.add(Player1label, player1x, player1y);
       
         }
        if (player1x == 2){
            player1x = player1x + 2;
            player1y = player1y -1;
            board.add(Player1label, player1x, player1y);
        }
        if (player1x == 1){
        System.out.println ("Encountered bottom of ladder. Reward: move to square: 15.");
            player1x = player1x + 3;
            player1y = player1y - 2;
       board.add(Player1label, player1x, player1y);
        }
        if (player1x == 3){
            player1y = player1y - 1;
            board.add(Player1label, player1x, player1y);
        }
        }

 }       
if (Globalvariables.thisplayerturn == true){
    Globalvariables.thisplayerturn = false;
Globalvariables.currentplayer = "Player 1: tooru the bull ";
if (player2y == 0){
              if (player2x == 2){
                  System.out.println ("Number rolled leads out of bounds. please press ROLL! again.");
                  board.add(Player2label, player2x, player2y);
                  
                  
              }
              if (player2x == 0){
                  System.out.println ("Encountered snake head. Punishment: move to square 14.");
                  player2x = player2x + 3;
                  player2y = player2y + 2;
                  board.add(Player2label, player2x, player2y);
              }
              if (player2x == 1){
                  Globalvariables.winner = true;
                  player2score = player2score + 1;
                  System.out.println("Player 2, smiling cow, reached square 25 and WON!");
                  System.out.println("Press on ROLL DICE! twice or thrice to restart game!");
                  System.out.println ("Player 2's current games won: " + player2score);
                  player2x = player2x + 3;
                  Fullgame.getChildren().add(winlabel);
                  board.add(Player2label, player2x, player2y);
              }
              if (player2x == 4){
                  player2x = 0;
                  player2y = 4;
                  board.add(Player2label, player2x, player2y);
              }
              
          }
if (player2y == 1){
              if (player2x == 1){
                  player2y = player2y - 1;
                  board.add(Player2label, player2x, player2y);
              }
              if (player2x == 3){
                  System.out.println ("Encountered head of snake. Punishment: move to square: 1.");
                  player2x = player2x - 3;
                  player2y = player2y + 3;
                  board.add(Player2label, player2x, player2y);
              }
              
              if (player2x == 4){
                  player2x = player2x - 3;
                  board.add(Player2label, player2x, player2y);
              }
          }
if (player2y == 2){
             if (player2x == 4){
                  System.out.println("Encountered bottom of ladder. Reward: move to square: 23.");
                 player2x = player2x - 2;
                 player2y = player2y - 2;
                 board.add(Player2label, player2x, player2y);
             }
             if ( player2x == 2 ){
                 player2x = player2x + 2;
                 player2y = player2y - 1;
                 board.add(Player2label, player2x, player2y);
             }
             if (player2x == 0){
                 player2x = player2x + 3;
                 board.add(Player2label, player2x, player2y); 
             }
             if (player2x == 1){
                 player2x = player2x + 3;
                 board.add(Player2label, player2x, player2y); 
             }
              if (player2x == 3){
                 player2y = player2y - 1;
                 board.add(Player2label, player2x, player2y); 
             }
         }
if (player2y == 3){
              
             if (player2x == 3){
                 player2x = player2x - 3;
                 board.add(Player2label, player2x, player2y);
             }
             if (player2x == 4 ){
        System.out.println ("Encountered bottom of ladder. Reward: move to square: 12.");
                  player2x = player2x - 3;
                  player2y = player2y - 1;
                  board.add(Player2label, player2x, player2y);
             }
            if (player2x == 0){
                player2x = player2x + 2;
                player2y = player2y -1;
                board.add(Player2label, player2x, player2y);
            }
         }
if (player2y == 4){
        if (player2x == 0){
       player2x = player2x + 3;
       board.add(Player2label, player2x, player2y);
       
         }
        if (player2x == 2){
            player2x = player2x + 2;
            player2y = player2y -1;
            board.add(Player2label, player2x, player2y);
        }
        if (player2x == 1){
        System.out.println ("Encountered bottom of ladder. Reward: move to square: 15.");
            player2x = player2x + 3;
            player2y = player2y - 2;
       board.add(Player2label, player2x, player2y);
        }
        if (player2x == 3){
            player2y = player2y - 1;
            board.add(Player2label, player2x, player2y);
        }
        }

} 

}


//DICE 4 + Players 1 & 2 moving 4 squares. 
if (numberrolled == 3){
        FileInputStream input4;
          try {
              input4 = new FileInputStream("C:\\images\\dice4.gif");
              Image dice4 = new Image(input4);
        ImageView id4 = new ImageView(dice4);
        Label dicelabel4 = new Label("", id4);
       dicelabel4.setPadding(new Insets(10, 10, -1600, 320));
        Fullgame.getChildren().add(dicelabel4);
        FadeTransition ft4 = new FadeTransition();
       ft4.setNode(id4);
       ft4.setDuration(new Duration(3000));
       ft4.setFromValue(1.0);
       ft4.setToValue(0.0);
       ft4.setCycleCount(1);
       ft4.setAutoReverse(true);
       play.setOnMouseClicked(me -> ft4.play());

      
          } catch (FileNotFoundException ex) {
              Logger.getLogger(SALAhmedAmin20022537.class.getName()).log(Level.SEVERE, null, ex);
          }
if (Globalvariables.thisplayerturn == false){  
    Globalvariables.thisplayerturn = true;
Globalvariables.currentplayer = "Player 2: smiling cow ";
if (player1y == 0){
              if (player1x == 2){
             System.out.println ("Number rolled leads out of bounds. please press ROLL! again.");
             player1x = player1x - 1;
               board.add(Player1label, player1x, player1y);

              }
              if (player1x == 0){
                  Globalvariables.winner = true;
                  player1score = player1score + 1;
                   System.out.println("Player 1, tooru the bull, reached square 25 and WON!");
                   System.out.println("Press on ROLL DICE! twice or thrice to restart game!");
                   System.out.println ("Player 1's current games won: " + player1score);
                  player1x = player1x + 4;
                  Fullgame.getChildren().add(winlabel);
                  board.add(Player1label, player1x, player1y);
              }
              if (player1x == 1){
                 System.out.println ("Number rolled leads out of bounds. please press ROLL! again.");
                  board.add(Player1label, player1x, player1y);
              }
              if (player1x == 4){
                  player1x = 0;
                  player1y = 4;
                  board.add(Player1label, player1x, player1y);
              }
               
          }
if (player1y == 1){
              if (player1x == 1){
                  player1x = player1x + 1;
                  player1y = player1y - 1;
                  board.add(Player1label, player1x, player1y);
              }
              if (player1x == 3){
                  player1x = player1x - 3;
                  player1y = player1y - 1;
                  board.add(Player1label, player1x, player1y);
              }
              
              if (player1x == 4){
                  System.out.println ("Encountered head of snake. Punishment: move to square: 1.");
                  player1x = player1x - 4;
                  player1y = player1y + 3;
                  board.add(Player1label, player1x, player1y);
              }
          }
if (player1y == 2){
             if (player1x == 4){
                 player1x = player1x - 3;
                 player1y = player1y - 1;
                 board.add(Player1label, player1x, player1y);
             }
             if ( player1x == 2 ){
                 player1x = player1x + 1;
                 player1y = player1y - 1;
                 board.add(Player1label, player1x, player1y);
             }
             if (player1x == 0){
                 player1x = player1x + 4;
                 board.add(Player1label, player1x, player1y); 
             }
             if (player1x == 1){
                 player1x = player1x + 3;
                 player1y = player1y - 1;
                 board.add(Player1label, player1x, player1y); 
             }
              if (player1x == 3){
                  System.out.println("Encountered bottom of ladder. Reward: move to square: 23.");
                  player1x = player1x - 1;
                 player1y = player1y - 2;
                 board.add(Player1label, player1x, player1y); 
             }
         }
if (player1y == 3){
              
             if (player1x == 3){
                 player1x = player1x - 3;
                 player1y = player1y - 1;
                 board.add(Player1label, player1x, player1y);
             }
             if (player1x == 4 ){
                  player1x = player1x - 4;
                  board.add(Player1label, player1x, player1y);
             }
            if (player1x == 0){
                player1x = player1x + 3;
                player1y = player1y -1;
                board.add(Player1label, player1x, player1y);
            }
         }
if (player1y == 4){
        if (player1x == 0){
        System.out.println ("Encountered bottom of ladder. Reward: move to square: 15.");
       player1x = player1x + 4;
       player1y = player1y - 2;
       board.add(Player1label, player1x, player1y);
       
         }
        if (player1x == 2){
            player1x = player1x + 1;
            player1y = player1y -1;
            board.add(Player1label, player1x, player1y);
        }
        if (player1x == 1){
            player1x = player1x + 3;
            player1y = player1y - 1;
       board.add(Player1label, player1x, player1y);
        }
        if (player1x == 3){
            System.out.println ("Encountered snake head. Punishment: move to square 3.");
           player1x = player1x - 1;
            board.add(Player1label, player1x, player1y);
        }
        }

}        
if (Globalvariables.thisplayerturn == true){
    Globalvariables.thisplayerturn = false;
Globalvariables.currentplayer = "Player 1: tooru the bull ";
if (player2y == 0){
              if (player2x == 2){
                  System.out.println ("Number rolled leads out of bounds. please press ROLL! again.");
                  player2x = player2x - 1;
                  board.add(Player2label, player2x, player2y);

              }
              if (player2x == 0){
                  Globalvariables.winner = true;
                  player2score = player2score + 1;
                  System.out.println("Player 2, smiling cow, reached square 25 and WON!");
                  System.out.println("Press on ROLL DICE! twice or thrice to restart game!");
                  System.out.println ("Player 2's current games won: " + player2score);
                  player2x = player2x + 4;
                  Fullgame.getChildren().add(winlabel);
                  board.add(Player2label, player2x, player2y);
              }
              if (player2x == 1){
                 System.out.println ("Number rolled leads out of bounds. please press ROLL! again.");
                  board.add(Player2label, player2x, player2y);
              }
               if (player2x == 4){
                  player2x = 0;
                  player2y = 4;
                  board.add(Player2label, player2x, player2y);
              }
          }
if (player2y == 1){
              if (player2x == 1){
                  player2x = player2x + 1;
                  player2y = player2y - 1;
                  board.add(Player2label, player2x, player2y);
              }
              if (player2x == 3){
                  player2x = player2x - 3;
                  player2y = player2y - 1;
                  board.add(Player2label, player2x, player2y);
              }
              
              if (player2x == 4){
                  System.out.println ("Encountered head of snake. Punishment: move to square: 1.");
                  player2x = player2x - 4;
                  player2y = player2y + 3;
                  board.add(Player2label, player2x, player2y);
              }
          }
if (player2y == 2){
             if (player2x == 4){
                 player2x = player2x - 3;
                 player2y = player2y - 1;
                 board.add(Player2label, player2x, player2y);
             }
             if ( player2x == 2 ){
                 player2x = player2x + 1;
                 player2y = player2y - 1;
                 board.add(Player2label, player2x, player2y);
             }
             if (player2x == 0){
                 player2x = player2x + 4;
                 board.add(Player2label, player2x, player2y); 
             }
             if (player2x == 1){
                 player2x = player2x + 3;
                 player2y = player2y - 1;
                 board.add(Player2label, player2x, player2y); 
             }
              if (player2x == 3){
                  System.out.println("Encountered bottom of ladder. Reward: move to square: 23.");
                  player2x = player2x - 1;
                 player2y = player2y - 2;
                 board.add(Player2label, player2x, player2y); 
             }
         }
if (player2y == 3){
              
             if (player2x == 3){
                 player2x = player2x - 3;
                 player2y = player2y - 1;
                 board.add(Player2label, player2x, player2y);
             }
             if (player2x == 4 ){
                  player2x = player2x - 4;
                  board.add(Player2label, player2x, player2y);
             }
            if (player2x == 0){
                player2x = player2x + 3;
                player2y = player2y -1;
                board.add(Player2label, player2x, player2y);
            }
         }
if (player2y == 4){
        if (player2x == 0){
        System.out.println ("Encountered bottom of ladder. Reward: move to square: 15.");
       player2x = player2x + 4;
       player2y = player2y - 2;
       board.add(Player2label, player2x, player2y);
       
         }
        if (player2x == 2){
            player2x = player2x + 1;
            player2y = player2y -1;
            board.add(Player2label, player2x, player2y);
        }
        if (player2x == 1){
            player2x = player2x + 3;
            player2y = player2y - 1;
       board.add(Player2label, player2x, player2y);
        }
        if (player2x == 3){
            System.out.println ("Encountered snake head. Punishment: move to square 3.");
           player2x = player2x - 1;
            board.add(Player2label, player2x, player2y);
        }
        }

} 

}


//DICE 5 + Players 1 & 2 moving 5 squares.
if (numberrolled == 4){
        FileInputStream input5;
          try {
              input5 = new FileInputStream("C:\\images\\dice5.gif");
              Image dice5 = new Image(input5);
        ImageView id5 = new ImageView(dice5);
        Label dicelabel5 = new Label("", id5);
       dicelabel5.setPadding(new Insets(10, 10, -1600, 320));
        Fullgame.getChildren().add(dicelabel5);
        FadeTransition ft5 = new FadeTransition();
       ft5.setNode(id5);
       ft5.setDuration(new Duration(3000));
       ft5.setFromValue(1.0);
       ft5.setToValue(0.0);
       ft5.setCycleCount(1);
       ft5.setAutoReverse(true);
       play.setOnMouseClicked(me -> ft5.play());

      
          } catch (FileNotFoundException ex) {
              Logger.getLogger(SALAhmedAmin20022537.class.getName()).log(Level.SEVERE, null, ex);
          }
 if (Globalvariables.thisplayerturn == false){ 
     Globalvariables.thisplayerturn = true;
Globalvariables.currentplayer = "Player 2: smiling cow ";
if (player1y == 0){
              if (player1x == 2){
             System.out.println ("Number rolled leads out of bounds. please press ROLL! again.");
             player1x = player1x - 2;
               board.add(Player1label, player1x, player1y);

              }
              if (player1x == 0){
                  System.out.println ("Number rolled leads out of bounds. please press ROLL! again.");
                  board.add(Player1label, player1x, player1y);
              }
              if (player1x == 1){
                 System.out.println ("Number rolled leads out of bounds. please press ROLL! again.");
                 player1x = player1x - 1;
                  board.add(Player1label, player1x, player1y);
              }
              if (player1x == 4){
                  player1x = 0;
                  player1y = 4;
                  board.add(Player1label, player1x, player1y);
              }
          }
if (player1y == 1){
              if (player1x == 1){
                  System.out.println ("Encountered snake head. Punishment: move to square 14.");
                  player1x = player1x + 2;
                  player1y = player1y + 1;
                  board.add(Player1label, player1x, player1y);
              }
              if (player1x == 3){
                  player1x = player1x - 2;
                  player1y = player1y - 1;
                  board.add(Player1label, player1x, player1y);
              }
              
              if (player1x == 4){
                  player1x = player1x - 4;
                  player1y = player1y - 1;
                  board.add(Player1label, player1x, player1y);
              }
          }
if (player1y == 2){
             if (player1x == 4){
                 System.out.println ("Encountered head of snake. Punishment: move to square: 1.");
                 player1x = player1x - 4;
                 player1y = player1y + 2;
                 board.add(Player1label, player1x, player1y);
             }
             if ( player1x == 2 ){
                  System.out.println("Encountered bottom of ladder. Reward: move to square: 23.");
                 player1y = player1y - 2;
                 board.add(Player1label, player1x, player1y);
             }
             if (player1x == 0){
                 player1x = player1x + 4;
                 player1y = player1y - 1;
                 board.add(Player1label, player1x, player1y); 
             }
             if (player1x == 1){
                 player1x = player1x + 2;
                 player1y = player1y - 1;
                 board.add(Player1label, player1x, player1y); 
             }
              if (player1x == 3){
                  
                  player1x = player1x - 2;
                 player1y = player1y - 1;
                 board.add(Player1label, player1x, player1y); 
             }
         }
if (player1y == 3){
              
             if (player1x == 3){
                 player1x = player1x - 2;
                 player1y = player1y - 1;
                 board.add(Player1label, player1x, player1y);
             }
             if (player1x == 4 ){
                  player1x = player1x - 4;
                  player1y = player1y - 1;
                  board.add(Player1label, player1x, player1y);
             }
            if (player1x == 0){
                player1x = player1x + 4;
                player1y = player1y -1;
                board.add(Player1label, player1x, player1y);
            }
         }
if (player1y == 4){
        if (player1x == 0){
       player1x = player1x + 4;
       player1y = player1y - 1;
       board.add(Player1label, player1x, player1y);
       
         }
        if (player1x == 2){
            System.out.println ("Encountered snake head. Punishment: move to square 3.");

            board.add(Player1label, player1x, player1y);
        }
        if (player1x == 1){
            player1x = player1x + 2;
            player1y = player1y - 1;
       board.add(Player1label, player1x, player1y);
        }
        if (player1x == 3){
        System.out.println ("Encountered bottom of ladder. Reward: move to square: 12.");
           player1x = player1x - 2;
           player1y = player1y - 2;
            board.add(Player1label, player1x, player1y);
        }
        }

}       
if (Globalvariables.thisplayerturn == true){
    Globalvariables.thisplayerturn = false;
Globalvariables.currentplayer = "Player 1: tooru the bull ";
if (player2y == 0){
              if (player2x == 2){
             System.out.println ("Number rolled leads out of bounds. please press ROLL! again.");
             player2x = player2x - 2;
               board.add(Player2label, player2x, player2y);

              }
              if (player2x == 0){
                  System.out.println ("Number rolled leads out of bounds. please press ROLL! again.");
                  board.add(Player2label, player2x, player2y);
              }
              if (player2x == 1){
                 System.out.println ("Number rolled leads out of bounds. please press ROLL! again.");
                 player2x = player2x - 1;
                  board.add(Player2label, player2x, player2y);
              }
              if (player2x == 4){
                  player2x = 0;
                  player2y = 4;
                  board.add(Player2label, player2x, player2y);
              }
          }
if (player2y == 1){
              if (player2x == 1){
                  System.out.println ("Encountered snake head. Punishment: move to square 14.");
                  player2x = player2x + 2;
                  player2y = player2y + 1;
                  board.add(Player1label, player2x, player2y);
              }
              if (player2x == 3){
                  player2x = player2x - 2;
                  player2y = player2y - 1;
                  board.add(Player2label, player2x, player2y);
              }
              
              if (player2x == 4){
                  player2x = player2x - 4;
                  player2y = player2y - 1;
                  board.add(Player2label, player2x, player2y);
              }
          }
if (player2y == 2){
             if (player2x == 4){
                 System.out.println ("Encountered head of snake. Punishment: move to square: 1.");
                 player2x = player2x - 4;
                 player2y = player2y + 2;
                 board.add(Player2label, player2x, player2y);
             }
             if ( player2x == 2 ){
                  System.out.println("Encountered bottom of ladder. Reward: move to square: 23.");
                 player2y = player2y - 2;
                 board.add(Player2label, player2x, player2y);
             }
             if (player2x == 0){
                 player2x = player2x + 4;
                 player2y = player2y - 1;
                 board.add(Player2label, player2x, player2y); 
             }
             if (player2x == 1){
                 player2x = player2x + 2;
                 player2y = player2y - 1;
                 board.add(Player2label, player2x, player2y); 
             }
              if (player2x == 3){
                  
                  player2x = player2x - 2;
                 player2y = player2y - 1;
                 board.add(Player2label, player2x, player2y); 
             }
         }
if (player2y == 3){
              
             if (player2x == 3){
                 player2x = player2x - 2;
                 player2y = player2y - 1;
                 board.add(Player2label, player2x, player2y);
             }
             if (player2x == 4 ){
                  player2x = player2x - 4;
                  player2y = player2y - 1;
                  board.add(Player2label, player2x, player2y);
             }
            if (player2x == 0){
                player2x = player2x + 4;
                player2y = player2y -1;
                board.add(Player2label, player2x, player2y);
            }
         }
if (player2y == 4){
        if (player2x == 0){
       player2x = player2x + 4;
       player2y = player2y - 1;
       board.add(Player2label, player2x, player2y);
       
         }
        if (player2x == 2){
            System.out.println ("Encountered snake head. Punishment: move to square 3.");

            board.add(Player2label, player2x, player2y);
        }
        if (player2x == 1){
            player2x = player2x + 2;
            player2y = player2y - 1;
       board.add(Player2label, player2x, player2y);
        }
        if (player2x == 3){
        System.out.println ("Encountered bottom of ladder. Reward: move to square: 12.");
           player2x = player2x - 2;
           player2y = player2y - 2;
            board.add(Player2label, player2x, player2y);
        }
        }

}

}


//DICE 6 + Players 1 & 2 moving 6 squares.
if (numberrolled == 5){
        FileInputStream input6;
          try {
              input6 = new FileInputStream("C:\\images\\dice6.gif");
              Image dice6 = new Image(input6);
        ImageView id6 = new ImageView(dice6);
        Label dicelabel6 = new Label("", id6);
       dicelabel6.setPadding(new Insets(10, 10, -1600, 320));
        Fullgame.getChildren().add(dicelabel6);
        FadeTransition ft6 = new FadeTransition();
       ft6.setNode(id6);
       ft6.setDuration(new Duration(3000));
       ft6.setFromValue(1.0);
       ft6.setToValue(0.0);
       ft6.setCycleCount(1);
       ft6.setAutoReverse(true);
       play.setOnMouseClicked(me -> ft6.play());

      
          } catch (FileNotFoundException ex) {
              Logger.getLogger(SALAhmedAmin20022537.class.getName()).log(Level.SEVERE, null, ex);
          }
 if (Globalvariables.thisplayerturn == false){ 
     Globalvariables.thisplayerturn = true;
Globalvariables.currentplayer = "Player 2: smiling cow ";
if (player1y == 0){
              if (player1x == 2){
             System.out.println ("Number rolled leads out of bounds. please press ROLL! again.");
             System.out.println ("Encountered head of snake. Punishment: move to square: 1.");
             player1x = player1x - 2;
             player1y = player1y + 4;
               board.add(Player1label, player1x, player1y);

              }
              if (player1x == 0){
                  System.out.println ("Number rolled leads out of bounds. please press ROLL! again.");
                  System.out.println ("Encountered head of snake. Punishment: move to square: 1.");
             player1y = player1y + 4;
                  board.add(Player1label, player1x, player1y);
              }
              if (player1x == 1){
                 System.out.println ("Number rolled leads out of bounds. please press ROLL! again.");
                 System.out.println ("Encountered head of snake. Punishment: move to square: 1.");
             player1x = player1x - 1;
             player1y = player1y + 4;
                  board.add(Player1label, player1x, player1y);
              }
              if (player1x == 4){
                  player1x = 0;
                  player1y = 4;
                  board.add(Player1label, player1x, player1y);
              }
              
          }
if (player1y == 1){
              if (player1x == 1){
                  Globalvariables.winner = true;
                  player1score = player1score + 1;
                  System.out.println("Player 1, tooru the bull, reached square 25 and WON!");
                  System.out.println("Press on ROLL DICE! twice or thrice to restart game!");
                  System.out.println ("Player 1's current games won: " + player1score);
                  player1x = player1x + 3;
                  player1y = player1y - 1;
                  Fullgame.getChildren().add(winlabel);
                  board.add(Player1label, player1x, player1y);
              }
              if (player1x == 3){
                  player1x = player1x - 1;
                  player1y = player1y - 1;
                  board.add(Player1label, player1x, player1y);
              }
              
              if (player1x == 4){
                  player1x = player1x - 3;
                  player1y = player1y - 1;
                  board.add(Player1label, player1x, player1y);
              }
          }
if (player1y == 2){
             if (player1x == 4){
                 
                 player1x = player1x - 4;
                 player1y = player1y - 2;
                 board.add(Player1label, player1x, player1y);
             }
             if ( player1x == 2 ){
                 player1x = player1x - 1;
                 player1y = player1y - 1;
                 board.add(Player1label, player1x, player1y);
             }
             if (player1x == 0){
                 player1x = player1x + 3;
                 player1y = player1y - 1;
                 board.add(Player1label, player1x, player1y); 
             }
             if (player1x == 1){
                 System.out.println("Encountered bottom of ladder. Reward: move to square: 23.");
                 player1x = player1x + 1;
                 player1y = player1y - 2;
                 board.add(Player1label, player1x, player1y); 
             }
              if (player1x == 3){
                  System.out.println ("Encountered head of snake. Punishment: move to square: 1.");
                  player1x = player1x - 3;
                 player1y = player1y + 2;
                 board.add(Player1label, player1x, player1y); 
             }
         }
if (player1y == 3){
              
             if (player1x == 3){
                 player1x = player1x - 1;
                 player1y = player1y - 1;
                 board.add(Player1label, player1x, player1y);
             }
             if (player1x == 4 ){
                  player1x = player1x - 3;
                  player1y = player1y - 1;
                  board.add(Player1label, player1x, player1y);
             }
            if (player1x == 0){
                player1x = player1x + 4;
                player1y = player1y -2;
                board.add(Player1label, player1x, player1y);
            }
         }
if (player1y == 4){
        if (player1x == 0){
       player1x = player1x + 3;
       player1y = player1y - 1;
       board.add(Player1label, player1x, player1y);
       
         }
        if (player1x == 2){
            System.out.println ("Encountered bottom of ladder. Reward: move to square: 12.");
            player1x = player1x -1;
            player1y = player1y - 2;
            board.add(Player1label, player1x, player1y);
        }
        if (player1x == 1){
            System.out.println ("Encountered snake head. Punishment: move to square 3.");
            player1x = player1x + 1;
       board.add(Player1label, player1x, player1y);
        }
        if (player1x == 3){
        
           player1x = player1x - 3;
           player1y = player1y - 1;
            board.add(Player1label, player1x, player1y);
        }
        }

 }        
if (Globalvariables.thisplayerturn == true){
    Globalvariables.thisplayerturn = false;
Globalvariables.currentplayer = "Player 1: tooru the bull ";
if (player2y == 0){
              if (player2x == 2){
             System.out.println ("Number rolled leads out of bounds. please press ROLL! again.");
             System.out.println ("Encountered head of snake. Punishment: move to square: 1.");
             player2x = player2x - 2;
             player2y = player2y + 4;
               board.add(Player2label, player2x, player2y);

              }
              if (player2x == 0){
                  System.out.println ("Number rolled leads out of bounds. please press ROLL! again.");
                  System.out.println ("Encountered head of snake. Punishment: move to square: 1.");
             player2y = player2y + 4;
                  board.add(Player2label, player2x, player2y);
              }
              if (player2x == 1){
                 System.out.println ("Number rolled leads out of bounds. please press ROLL! again.");
                 System.out.println ("Encountered head of snake. Punishment: move to square: 1.");
             player2x = player2x - 1;
             player2y = player2y + 4;
                  board.add(Player2label, player2x, player2y);
              }
             if (player2x == 4){
                  player2x = 0;
                  player2y = 4;
                  board.add(Player2label, player2x, player2y);
              } 
          }
if (player2y == 1){
              if (player2x == 1){
                  Globalvariables.winner = true;
                  player2score = player2score + 1;
                  System.out.println("Player 2, smiling cow, reached square 25 and WON!");
                  System.out.println("Press on ROLL DICE! twice or thrice to restart game!");
                  System.out.println ("Player 2's current games won: " + player2score);
                  player2x = player2x + 3;
                  player2y = player2y - 1;
                  Fullgame.getChildren().add(winlabel);
                  board.add(Player2label, player2x, player2y);
              }
              if (player2x == 3){
                  player2x = player2x - 1;
                  player2y = player2y - 1;
                  board.add(Player2label, player2x, player2y);
              }
              
              if (player2x == 4){
                  player2x = player2x - 3;
                  player2y = player2y - 1;
                  board.add(Player2label, player2x, player2y);
              }
          }
if (player2y == 2){
             if (player2x == 4){
                 
                 player2x = player2x - 4;
                 player2y = player2y - 2;
                 board.add(Player2label, player2x, player2y);
             }
             if ( player2x == 2 ){
                 player2x = player2x - 1;
                 player2y = player2y - 1;
                 board.add(Player2label, player2x, player2y);
             }
             if (player2x == 0){
                 player2x = player2x + 3;
                 player2y = player2y - 1;
                 board.add(Player2label, player2x, player2y); 
             }
             if (player2x == 1){
                 System.out.println("Encountered bottom of ladder. Reward: move to square: 23.");
                 player2x = player2x + 1;
                 player2y = player2y - 2;
                 board.add(Player2label, player2x, player2y); 
             }
              if (player2x == 3){
                  System.out.println ("Encountered head of snake. Punishment: move to square: 1.");
                  player2x = player2x - 3;
                 player2y = player2y + 2;
                 board.add(Player2label, player2x, player2y); 
             }
         }
if (player2y == 3){
              
             if (player2x == 3){
                 player2x = player2x - 1;
                 player2y = player2y - 1;
                 board.add(Player2label, player2x, player2y);
             }
             if (player2x == 4 ){
                  player2x = player2x - 3;
                  player2y = player2y - 1;
                  board.add(Player2label, player2x, player2y);
             }
            if (player2x == 0){
                player2x = player2x + 4;
                player2y = player2y -2;
                board.add(Player2label, player2x, player2y);
            }
         }
if (player2y == 4){
        if (player2x == 0){
       player2x = player2x + 3;
       player2y = player2y - 1;
       board.add(Player2label, player2x, player2y);
       
         }
        if (player2x == 2){
            System.out.println ("Encountered bottom of ladder. Reward: move to square: 12.");
            player2x = player2x -1;
            player2y = player2y - 2;
            board.add(Player2label, player2x, player2y);
        }
        if (player2x == 1){
            System.out.println ("Encountered snake head. Punishment: move to square 3.");
            player2x = player2x + 1;
       board.add(Player2label, player2x, player2y);
        }
        if (player2x == 3){
        
           player2x = player2x - 3;
           player2y = player2y - 1;
            board.add(Player2label, player2x, player2y);
        }
        }

}

}

});
Fullgame.getChildren().addAll(board);



      /*
..............................................................................................................
SCENE:
..............................................................................................................
        */
        Scene scene = new Scene(Fullgame, 1000, 1000);
        primaryStage.setTitle("HIGH SPEED snakes and ladders!");
         primaryStage.setScene(scene);
        primaryStage.show();  
        //THANK YOU FOR READING AND BEING PATIENT WITH THIS 1945 LINES OF CODE BEHEMOTH OF A PROGRAM!
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
