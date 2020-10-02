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
    
    //declaring more variables
    String rock = "rock";
    String paper = "paper";
    String scissors = "scissors";
    
    //get the input from the user
    
    while (invalid == true) {
      
      //get the input from the user
      Scanner input = new Scanner(System.in);
      userInput = input.next();
      
      //attempting to convert user input to string for error checking
      userInput = userInput.toString();
      userInput.toLowerCase();
      System.out.println(userInput);
      
      //error checking. already tried (userInput != rock && userInput != paper etc.)
      if (userInput == rock || userInput == paper || userInput == scissors) {
        
        //if true, state true and break the loop
        System.out.println("Selected value IN range");
        invalid = false;
      } else {
        
        //if false, state false and maintain loop
        invalid = true;
        System.out.println("Selected value OUT OF range, please enter rock, paper, or scissors");
      }
    }
    
    //seeing if the loop was the issue. It wasn't
    if (userInput == "rock")  {
      userRock = true;
      invalid = false;
      System.out.println("rock");
    } else if (userInput == "paper")  {
      userPaper = true;
      invalid = false;
      System.out.println("paper");
    } else if (userInput == "scissors") {
      userScissors = true;
      invalid = false;
    }
  }
}