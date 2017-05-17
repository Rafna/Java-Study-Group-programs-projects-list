/* There are 21 candies available. 
 * You can choose to play first or second. 
 * Each player can pick either one or two candies at a time.
 * The player who picks the last candy will be the winner of the game
 */
import java.util.Scanner;
import java.util.Random;

public class GameStart {
	public static void main(String args[]){
		int totalCandies = 21, candiesPicked = 0;

		Scanner input = new Scanner(System.in);
		Scanner numberOfCandies = new Scanner(System.in);
		
		Random randomNumber = new Random();
		
		System.out.println("Are you playing first?");
		String player = input.nextLine();
		while(totalCandies > 0){
			//if you are the first player
			if(player.equals("Y") || player.equals("y") || player.toLowerCase().equals("yes")){
			System.out.println("There are "+totalCandies+" candies now, you can pick either 1 or 2 candies");
			System.out.println("How many candies are you taking? ");
			candiesPicked = numberOfCandies.nextInt();
			//To avoid entering any number other than 1 or 2
			if(candiesPicked > 2){
				candiesPicked = 2;   
			}
			else if(candiesPicked < 1){
				candiesPicked = 1;
			}
			totalCandies = totalCandies - candiesPicked;
			if(totalCandies <= 0){
				System.out.println("You won the game!!");
				break;
			}
			else{
				System.out.println("There are "+totalCandies+" left, Player 2 is playing now");
				candiesPicked = 1 + randomNumber.nextInt(2);
				System.out.println("Player 2 takes "+candiesPicked+" candies");
				totalCandies = totalCandies - candiesPicked;
				if(totalCandies <= 0){
					System.out.println("you lost the game!!!");
				}
			}
		}
		else{
			candiesPicked = 1 + randomNumber.nextInt(2);
			System.out.println("Okay, Player 2 picked "+candiesPicked+" candies. Now it is your turn");
			totalCandies = totalCandies - candiesPicked;
			if(totalCandies <= 0){
				System.out.println("You lost!!!");
			}
			else{
				System.out.println("Candies left: "+totalCandies);
				System.out.println("How many candies are you taking? ");
				candiesPicked = numberOfCandies.nextInt();
				if(candiesPicked > 2){
					candiesPicked = 2;
				}
				else if(candiesPicked < 1){
					candiesPicked = 1;
				}
				totalCandies = totalCandies - candiesPicked;
				if(totalCandies <= 0){
					System.out.println("You won!!");
					break;
				}
				System.out.println("Now the number of remaining candies are "+totalCandies);
			}
		}
		if(input != null || numberOfCandies != null){
			input.close();
			numberOfCandies.close();
		}
	 }
   }
}
