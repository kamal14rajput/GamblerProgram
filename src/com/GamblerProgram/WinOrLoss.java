package com.GamblerProgram;

public class WinOrLoss {

	public static void main(String[] args) {
		int stake = 100;
		int bet = 1;
		double winOrLoss = Math.floor(Math.random() * 10) % 2;
		if (bet == winOrLoss) {
			System.out.println("you won!!!");
			stake = stake +1;
			System.out.println("your current bet is " + stake);
		}
		else
		{
			System.out.println("you loss!!!Try your luck next time");
			stake = stake -1;
			System.out.println("your remaining bets are: " + stake);
		}
	}

}
