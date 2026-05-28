package day4;

import java.util.Scanner;

/*Use Case1- playerPositionstart from 0
 * Use Case 2 - dice take random number using Math.random()
 * Use Case 3 - The Player then checks for a option i.e NoPlay, Ladder,Snake
 * Use Case 4 - Repeat till the Player reaches the winning
				position 100. - Note In case the player position moves
				below 0, then the player restarts from 0
 * Use Case 5 - Ensure the player gets to exact winning position 100. - Note in case the 				player position go above 100, the player stays in the same previous position 				till the player gets the exact
 * Use Case 6 - Ensure the player getsto exact winning position 100. - Note in case the 				player position go above 100, the player stays in the same previous
				position till the player gets the exact
 * Use Case 7 - Play the game with 2 Player. In this case if a Player gets a Ladder then 				plays again. Finally report which UC 7 Player won the game
 */

class SnakeAndLadder{
	static final int NO_PLAY =0;
	static final int LADDER = 1;
	static final int SNAKE =3;
	
	int diceCount=0;
	
	int[] playersPosition= new int[2]; 
	
	public void play(int n) {
		int playerprevious = playersPosition[n];
		int dice=(int)(Math.random()*6)+1;
		diceCount++;
		int option = (int)(Math.random()*3);
		
		if(option==NO_PLAY) {
			System.out.println("No_Play");
			return;
		}
		else if(option == LADDER) {
			System.out.println("Your dice number is = "+dice);
			playersPosition[n]+=dice;
			System.out.println("Ladder");
		}
		else {
			System.out.println("Your dice number is = "+dice);
			playersPosition[n]=playersPosition[n]-dice;
			System.out.println("Snake");
		}
		if(playersPosition[n]<0) {
			playersPosition[n]=0;
		}
		if(playersPosition[n]>100) {
			playersPosition[n]=playerprevious;
		}
		
		System.out.println("Player"+(n+1)+"PresentPosition= "+playersPosition[n]);
		
	}
	public int sequence(int n) {
		return n%2==0?0:1;
	}
	
}
public class SnakeAndLadderGame {

//	static final int NO_PLAY =0;
//	static final int LADDER = 1;
//	static final int SNAKE =3;
//	
//	static int player1position =0;
	public static void main(String[] args) {
		int count=0;
		System.out.println("Welcome to snake and ladder game");
		SnakeAndLadder sl=new SnakeAndLadder();
		Scanner sc= new Scanner(System.in);
		
		while(sl.playersPosition[0]<100 && sl.playersPosition[1]<100) {
			int next=sl.sequence(count);
			System.out.println("Player "+(next+1));
			System.out.println("Enter y =");
			//char c=sc.next().charAt(0);
//			if(c=='y')
			sl.play(next);
			count++;
		}
		if(sl.playersPosition[0]==100) {
			System.out.println("Player 1 won after "+sl.diceCount +" dice");
		}
		else {
			System.out.println("Player 2 won after "+sl.diceCount +" dice");
		}
		
		
//		
//		while(player1position<100) {
//			int previousPosition=player1position;
//		
//			int dice=(int)(Math.random()*6)+1;
//			diceCount++;
//			int option = (int)(Math.random()*3);
//			
//			if(option==NO_PLAY) {
//				System.out.println("No_Play");
//			}
//			else if(option == LADDER) {
//				player1position+=dice;
//				System.out.println("Ladder");
//			}
//			else {
//				player1position=player1position-dice;
//				System.out.println("Snake");
//			}
//			if(player1position<0) {
//				player1position=0;
//			}
//			if(player1position>100) {
//				player1position=previousPosition;
//			}
//			System.out.println("Dice number = "+dice+" at dice Number = "+diceCount);
//			
//			System.out.println("PlayerPresentPosition= "+player1position);
//		}
//		System.out.println("Player won after "+diceCount+" dice");
//		

	}

}
