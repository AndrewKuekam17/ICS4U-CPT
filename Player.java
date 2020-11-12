/**
 * Class Player
 * 
 */
public class Player {
  //declare the var
    int number = 0;

    public void Player() {
      //This generating random number to 100
        double rand = (Math.random()*100);
        number = (int) rand;
        System.out.println("I am guessing "+number);
    }
}
