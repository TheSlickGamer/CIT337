/*
 * Created by Austin Staschke
 */

public class BeerSong {

  public static void main(String[] args) {
      Ninety_Nine_Bottles_of_Beer();
  }

/*
 * Created public class BeerSong
 */
  
  public static void Ninety_Nine_Bottles_of_Beer() {
  
      for(int i = 99; i > 2; i--) {
          System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer");
          System.out.println("take one down, pass it around, " + Integer.toString(i-1) + " bottles of beer on the wall.");
      }
    
 /*
  * Created "Ninety_Nine_Bottles_of_Beer" function. This will start at 99 and count down until zero is reached.
  */
      
  System.out.println("2 bottles of beer on the wall, 2 bottles of beer");
  System.out.println("take one down, pass it around, 1 bottle of beer on the wall.");
  System.out.println("1 bottle of beer on the wall, 1 bottle of beer");
  System.out.println("take one down, pass it around, no more bottles of beer on the wall.");
  
  }
  
}

/*
 * Since the last two lines of the song are a little different from the rest of the numbers, they need their own lines to print."
 */
