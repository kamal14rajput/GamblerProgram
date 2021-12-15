package com.GamblerProgram;

public class CalculativeGambler {

	public static void main(String[] args) {
		int stake = 100;
		int bet = 1;
		
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
		}
		else {
			System.out.println("You WON your 50% of stake, So you have to resign for the day. ");
		}
	}
}
