package com.GamblerProgram;

public class WinOrLoss {

	public static void main(String[] args) {
		int bet = 100;
		int win = 1;
		double winOrLoss = Math.floor(Math.random() * 10) % 2;
		if (win == winOrLoss) {
			System.out.println("you won!!!");
			bet = bet +1;
			System.out.println("your current bet is " + bet);
		}
		else
		{
			System.out.println("you loss!!!Try your luck next time");
			bet = bet -1;
			System.out.println("your remaining bets are: " + bet);
		}
	}

}
