//import necessary classes
import java.lang.Math;
import java.util.Random;
import java.util.Scanner;

/**
* This program plays rock paper scissors with the user.
*
* @author  Ben Falsetto
* @version 1.0
* @since   2020-09-30
*/
public class RPS {
  public static void main(String[] args) {
    
    //declare variables
    String userInput = "";
    boolean invalid = true;
    boolean userRock = false;
    boolean userPaper = false;
    boolean userScissors = false;
    boolean compRock = false;
    boolean compPaper = false;
    boolean compScissors = false;
    
    //get the input from the user
    
    while (invalid == true) {
      
      Scanner input = new Scanner(System.in);
      userInput = input.next();
      //userInput.toLowerCase();
      System.out.println(userInput);
      
      if (userInput != "rock" && userInput != "paper" && userInput != "scissors") {
        System.out.println("Selected value out of range, please enter rock, paper, or scissors");
        invalid = true;
      } else {
        invalid = false;
      }
    }
    
    if (userInput == "rock")  {
      userRock = true;
      invalid = false;
      } else if (userInput == "paper")  {
      userPaper = true;
      invalid = false;
      } else if (userInput == "scissors") {
      userScissors = true;
      invalid = false;
    }
  }
}