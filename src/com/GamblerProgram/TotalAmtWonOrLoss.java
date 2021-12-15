package com.GamblerProgram;

public class TotalAmtWonOrLoss {

	public static void main(String[] args) {
		int stake = 100;
		int bet =1;
		int totalAmount = 0;
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
			}
			else {
				System.out.println("You WON your 50% of stake, So you have to resign for the day. ");
			}
			totalAmount = totalAmount + stake;
		}
		System.out.println("After 20 days of playing total amount is: " + totalAmount);
		if(totalAmount > 2000) {
			int profit = totalAmount - 2000;
			System.out.println("you are in profit by: " + profit);
		}
		else if(totalAmount < 2000) {
			int loss = 2000 - totalAmount;
			System.out.println("you are in loss by: " + loss);
		}
		else {
			System.out.println("you are neither in loss nor in profit: " + totalAmount);
		}
	}
}
