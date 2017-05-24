import java.util.Random;
import java.util.Scanner;
public class GameStart {

	public static void main(String[] args) {
		int numberToGuess = 0, guessedNumber = 0, numberOfGuesses = 5;
		boolean replay = true;
		String anotherGame;
		Scanner input = new Scanner(System.in);
		do{
			Random randum = new Random();
			numberToGuess = randum.nextInt(1000);
			System.out.println("A number between 0 and 1000 is generated. Guess the number!");
			while(numberOfGuesses!=0){
				guessedNumber = input.nextInt();
				numberOfGuesses--;
				if(guessedNumber == numberToGuess){
					System.out.println("You Won, Congratulations!!");
					//break;
				}
				else if(guessedNumber > numberToGuess){
					System.out.println("Too Hot Here!!");
				}
				else{
					System.out.println("Too Cold Here!!");
				}
				if(numberOfGuesses!=0){
					System.out.println("You have "+numberOfGuesses+" more guessing trials available, Good Luck with next try!");
					System.out.println("Guess the number: ");
				}
			}
			if(numberOfGuesses == 0){
				System.out.println("Sorry, you lost the game!");
				System.out.println("The number was "+numberToGuess);
			}
			System.out.println("Do you want to play another game? (Yes/No):");
			anotherGame = input.next();
			if(anotherGame.toLowerCase().equals("yes"))
				numberOfGuesses = 5;
			if(anotherGame.toLowerCase().equals("no"))
				replay = false;
		}while(replay);
		if(replay == false)
			System.out.println("Game Over!");
		if(input!=null)
			input.close();
		//System.exit(0);
	}

}