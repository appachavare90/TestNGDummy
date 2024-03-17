import java.util.Scanner;

public class GuessNumber {
	
	public void guessingNumberGame()
    {
        Scanner sc = new Scanner(System.in);
        int answer = 1 + (int)(100*Math.random());
        int j = 5;
        int i, guessNumber;
        System.out.println("Please choose number between 1 to 100 and Guess the number within 5 attempts.");
 		for (i = 0; i < j; i++)
 		{
 			System.out.println("Please enter the guess the number:");
 			guessNumber = sc.nextInt();
 			if (answer == guessNumber) {
                System.out.println("Congratulations!You guessed the number.");
                break;
            }
            else if (answer > guessNumber && i != j - 1) {
                System.out.println("The number is greater than " + guessNumber);
            }
            else if (answer < guessNumber && i != j - 1) {
                System.out.println("The number is less than " + guessNumber);
            }
        }
 
        if (i == j) {
            System.out.println("You have exhausted "+j+" attempts.");
            System.out.println("The right number was " + answer);
        }
    }
 
	public static void main(String[] args) {
		GuessNumber g=new GuessNumber();
		g.guessingNumberGame();
		
	}

}
