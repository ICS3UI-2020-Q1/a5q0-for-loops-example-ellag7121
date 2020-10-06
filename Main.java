import java.util.Scanner;
/**
 * The for loop example
 * @author Graham Ellacott
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //create a count variable
    int count = 1;
    //create a while loop to count to 10
    while(count <= 10){
      //print the number
      System.out.println(count);
      //increase the counter
      count = count + 1;
    }

    //do the same with a for loop
    for(int count2 = 0; count2 < 10; count2++){
      //print the number
      System.out.println(count2 + 1);
    }
    
  }
}
