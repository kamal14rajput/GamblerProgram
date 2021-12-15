package com.GamblerProgram;
import java.util.Scanner;

public class StopGambling {

	public static void main(String[] args) {
		int stake = 100;
		int bet =1;
		int daysLoss = 0;
		int daysWon = 0;
		int totalAmount = 0;
		int profit, loss;
		int flag = 1;
		boolean option = true;
		while(option) {
				for (int i = 1; i <= 20; i++) {
						stake = 100;
			
						while(stake > 50 && stake < 150) {
						double winOrLoss = Math.floor(Math.random() * 10) % 2;
						if (bet == winOrLoss) {
							System.out.println("you won!!!");
							stake = stake +1;
							System.out.println("your current stake is " + stake);
						}
						else
						{
							System.out.println("you loss!!!Try your luck next time");
							stake = stake -1;
							System.out.println("your remaining stake are: " + stake);
						}
						}
						if(stake == 50) {
							System.out.println("You LOST your 50% of stake, So you have to resign for the day. ");
							daysLoss = daysLoss + 1;
							System.out.println("Day " + i + " is gamblers Unluckiest day as he lost maximum amount RS." + stake);
						}
						else {
							System.out.println("You WON your 50% of stake, So you have to resign for the day. ");
							daysWon = daysWon + 1;
							System.out.println("Day " + i + " is gamblers luckiest day as he won maximum amount RS." + stake);
						}
						totalAmount = totalAmount + stake;
				}
				option=false;
		}
				System.out.println("After 20 days of playing total amount is: " + totalAmount);
		
				if(totalAmount > 2000) {
					profit = totalAmount - 2000;
					System.out.println("you are in profit by: " + profit);
					flag = 0;
				}
				else if(totalAmount < 2000) {
					loss = 2000 - totalAmount;
					System.out.println("you are in loss by: " + loss);
				}
				else {
					System.out.println("you are neither in loss nor in profit: " + totalAmount);
				}
		
				System.out.println("In a month " + daysWon + " days won and " + daysLoss + " Days lost");
	          if(flag == 0) {
					Scanner sc = new Scanner(System.in);
					System.out.println("Do you want to play for next month?press '1'");
					int playOption = sc.nextInt();
					if(playOption == 1) {
						option = true;
					}
					else {
						option =false;
					}
				}
				else {
					System.out.println("You are in lost,So you have to Stop Gambling!");
				}
		
	}
}
