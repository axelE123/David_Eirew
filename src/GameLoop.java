import java.io.*;
import java.util.Scanner;

public class GameLoop {
    static void line() {
        System.out.print("+");
        for (int i = 0; i < 42; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String user_response = "";
        String comp_response;
        String want_to_play = "y";
        int comp_wins = 0;
        int user_wins = 0;
        int draws = 0;
        //Defining variables for later
        while(want_to_play.equals("y")){
            while(!"r".equals(user_response) && !"p".equals(user_response) && !"s".equals(user_response) && !"q".equals(user_response)){
                line();
                System.out.println(user_wins + " wins, " + draws + " draws and " + comp_wins + " losses");
                System.out.println("Rock (R), Paper (P), Scissors (S) or Quit (Q)");
                user_response = scanner.nextLine().toLowerCase();
            }
            //This while loop asks the user for a response. It turns the input into lowercase. If the user gave a valid answer, the loop will finish and their choice will be recorded. Otherwise, it will keep asking.

            if ("q".equals(user_response)) {
                want_to_play = "q";
                System.out.println("");
                System.out.println("Thanks for playing");
                System.exit(0);
            } else if("r".equals(user_response)) {
                user_response = "Rock";
            } else if ("p".equals(user_response)) {
                user_response = "Paper";
            } else{
                user_response = "Scissors";
            }
            //This turns the user's letter response into the word they want to be displayed.

            System.out.println("");
            System.out.println("You chose " + user_response);
            // The user's response is printed.

            int random = (int)(Math.random() * 3) + 1;
            //This randomly chooses 1, 3 or 3.
            if (random == 1) {
                comp_response = "Rock";
            } else if (random == 2) {
                comp_response = "Paper";
            } else{
                comp_response = "Scissors";
            }
            System.out.println("The computer chose " + comp_response);
            //This turns the random number into a choice for the computer and prints out the choice.


            if(user_response.equals(comp_response)){
                System.out.println("It's a tie");
                draws++;
            }
            //If the user's response is the same as the computer's, then it will be a tie.

            else if("Rock".equals(user_response) && "Scissors".equals(comp_response)){
                System.out.println("You win");
                user_wins++;
            }
            else if("Paper".equals(user_response) && "Rock".equals(comp_response)){
                System.out.println("You win");
                user_wins++;
            }
            else if("Scissors".equals(user_response) && "Paper".equals(comp_response)){
                System.out.println("You win");
                user_wins++;
            }
            //These are the three possibilities for the user to win.
            else{
                System.out.println("The computer wins");
                comp_wins++;
            }
            //If it is not a draw or a win for the user, it must be a win for the computer.
            System.out.println("");
        }
    }

}