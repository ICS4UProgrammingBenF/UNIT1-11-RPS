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
public class Rps {
  
  /**
   * Main section of code.
   * Functions are called from here
  */
  
  public static void main(String[] args)  {
    
    //delcaring and initializing variables
    int userPoints = 0;
    int compPoints = 0;
    
    //prompting the user for an input
    System.out.println("Enter rock, paper, or scissors");
    System.out.println("First to 10 wins");
    
    while (true)  {
      //get the ID of who won the point
      //0 = user | 1 = computer | 2 = tie
      int retVal = playgame();
      
      if (retVal == 0)  {
        //if userpoint, add to user points
        userPoints++;
        System.out.println("User points: " + userPoints);
        System.out.println("Computer points: " + compPoints);
      } else if (retVal == 1) {
        //if computer point, add to comp points
        compPoints++;
        System.out.println("User points: " + userPoints);
        System.out.println("Computer points: " + compPoints);
      } else  {
        //if tie, display points
        System.out.println("User points: " + userPoints);
        System.out.println("Computer points: " + compPoints);
      }
      
      //if user wins, display user wins
      if (userPoints == 10) {
        System.out.println("User Wins Overall!");
        break;
      } else if (compPoints == 10)  {
        //if computer wins, display computer wins
        System.out.println("Computer Wins Overall!");
      }
    }
  }
  
  /**
   * playgame.
   * This function gets the user input.
   * Then it generates a computer choicn.
   * Then it compares the choices, sees who won,
   * And returns the ID of the party who receives this point
  */
  
  public static int playgame() {
    
    //declare variables
    String userInput = "";
    int userChoice = 0;
    int returnVal = -1;
    boolean invalid = true;
    
    //declaring more variables
    String rock = "rock";
    String paper = "paper";
    String scissors = "scissors";
    
    while (invalid == true) {
      
      //get the input from the user
      Scanner input = new Scanner(System.in);
      userInput = input.next();
      
      //attempting to convert user input to string for error checking
      userInput.toLowerCase();
      
      //error checking. already tried (userInput != rock && userInput != paper etc.)
      if (userInput.equals(rock) || userInput.equals(paper) || userInput.equals(scissors)) {
        
        //if true, break the loop
        invalid = false;
      } else {
        
        //if false, state false and maintain loop
        invalid = true;
        System.out.println("Selected value OUT OF range, please enter rock, paper, or scissors");
      }
    }
    
    //0 = rock
    //1 = paper
    //2 = scissors
    
    //setting userChoice
    if (userInput.equals(rock))  {
      userChoice = 0;
    } else if (userInput.equals(paper))  {
      userChoice = 1;
    } else if (userInput.equals(scissors)) {
      userChoice = 2;
    }
    
    //generating the random choice for the computer
    int compChoice = (int) (0 + (Math.random() * 2 + 1));
    
    //assigning the random choice to a comparable choice
    if (compChoice == 0)  {
      System.out.println("Computer chooses rock");
    } else if (compChoice == 1) {
      System.out.println("Computer chooses paper");
    } else if (compChoice == 2)  {
      System.out.println("Computer chooses scissors");
    }
    
    //checking who won and returning the ID of winning party
    if (userChoice == compChoice)  {
      //tie 
      System.out.println("Tie");
      returnVal = 2;
    } else if (userChoice == 0) {
      if (compChoice == 1)  {
        //computer wins
        System.out.println("Computer Point");
        returnVal = 1;
      } else if (compChoice == 2) {
        //Player Point
        System.out.println("Player Point");
        returnVal = 0;
      }
    } else if (userChoice == 1)  {
      if (compChoice == 0)  {
        //Player Point
        System.out.println("Player Point");
        returnVal = 0;
      } else if (compChoice == 2) {
        //computer wins
        System.out.println("Computer Point");
        returnVal = 1;
      }
    } else if (userChoice == 2) {
      if (compChoice == 0)  {
        //computer wins
        System.out.println("Computer Point");
        returnVal = 1;
      } else if (compChoice == 1) {
        //Player Point
        System.out.println("Player Point");
        returnVal = 0;
      }
    }
    //return the point
    return returnVal;
  }
}