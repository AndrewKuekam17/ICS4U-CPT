/**

* Class GussesGame.
 
*/
public class GuessGame {
  Player player1;
  Player player2;
  Player player3;
  int counter;
  /**
  
  * Class GussesGame.
  
  */
  public void startGame() {
    //This container that keeps track of how many times equivalent values
    counter = 0;
    // Prompt for and read in information for player 1
    player1 = new Player();
    // Prompt for and read in information for player 2
    player2 = new Player();
    // Prompt for and read in information for player 3
    player3 = new Player();
        
    //This creates an integers which is initially to 0 (player 1,2 and 3)
    int guessplayer1 = 0;
    int guessplayer2 = 0;
    int guessplayer3 = 0;
        
    //this get player either true or false (Player 1,2 and 3)
    //0 false and all order number == true
    boolean player1IsRight = false;
    boolean player2IsRight = false;
    boolean player3IsRight = false;
        
    //this genrate random number and give a double in the range
    double rand2 = (Math.random()*100);
    int NumToGuess = (int) rand2;
    //System.out.print("I am thinking " + NumToGuess);
        
    //while true means loop forever
    while (true) {
      
    //ihis increase after executeing the stsement
    counter++;
    //this prints the number, that the player a going to guess
    System.out.println("Number to guess is " + NumToGuess + "?");
    player1.guess();
    player2.guess();
    player3.guess();
    
    //return the player next guess
    
    //assigning guessplayer1 to player1,2 and 3;    
    guessplayer1 = player1.number;
    System.out.println("Player1 guessed " + guessplayer1);
    guessplayer2 = player2.number;
    System.out.println("Player2 guessed " + guessplayer2);
    guessplayer3 = player3.number;
    System.out.println("Player3 guessed " + guessplayer3);
    System.out.println("===================");
    System.out.println(" ");
    
    if (guessplayer1 == NumToGuess) {
      player1IsRight = true;
    }
      if (guessplayer2 == NumToGuess){
        player2IsRight = true;
      }
        if (guessplayer3 == NumToGuess){
          player3IsRight = true;
        }
          //using operator
          if (player1IsRight || player2IsRight || player3IsRight) {
            System.out.println("Winner Found");
            //this display player 1,2 or 3 got it right == true or false
            System.out.println("Player 1 got it right ? " + player1IsRight);
            System.out.println("Player 2 got it right ? " + player2IsRight);
            System.out.println("Player 3 got it right ? " + player3IsRight);
            System.out.println("Game over!");
            System.out.println("Total guessed times is :"  + counter);
              break;
            } else {
                System.out.println("No match Found!,Try again.");
            }
        }
    }
}
