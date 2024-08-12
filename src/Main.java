import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
   static Scanner sc = new Scanner(System.in);
   static boolean keepPlaying = true;

    public static void main(String[] args) {

        System.out.println("lets play a guessing game");

        while (keepPlaying) {
            playAround();
        }
        System.out.println("\nThank you for playing");
    }
     public static void playAround(){
        boolean validInput;
        int number, guess;
        String answer;

        //pick a random number
         number = (int)(Math.random()* 10 ) + 1;
         System.out.println("\n Im thinking of a number " + "between 1 and 10. ");

         //Get the guess
         System.out.println("What do you think it is ");
         do {
             guess = sc.nextInt();
             validInput = true;
             if ((guess < 1) || (guess > 10)) {
                 System.out.println("I said between 1 " + "and 10. Try again: ");
                 validInput = false;
             }}
             while (!validInput) ;

             //Check the guess
             if (guess == number) {
                 System.out.println("You got it!");
             } else {
                 System.out.println("Try again! " + "the number was " + number);

                 //play again?
                 do {
                     System.out.println("\n Play again? (Y or N)");
                     answer = sc.next();
                     validInput = true;
                     if (answer.equalsIgnoreCase("Y")) {
                     } else if (answer.equalsIgnoreCase("N")) {
                         keepPlaying = false;
                     } else
                         validInput = false;
                 } while(!validInput);
             }}}

