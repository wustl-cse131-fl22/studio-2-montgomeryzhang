package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		double startAmount;
		System.out.println("Please input a start amount: ");
		startAmount = in.nextDouble();
		double winChance;
		System.out.println("Please input a win percentage: ");
		winChance = in.nextDouble();
		winChance/= 100;
		double winLimit;
		System.out.println("Please input a win limit: ");
		winLimit = in.nextDouble();
		int totalSimulations;
		System.out.println("Please input a number of simulations: ");
		totalSimulations = in.nextInt();

		for (int i = 0; i < totalSimulations; i++)
		{
			int numberOfGames = 0;

			while (startAmount < winLimit && startAmount > 0)
			{
				double winOrLoss;
				winOrLoss = Math.random();
				if (winOrLoss <= winChance)
				{
					startAmount++;
				}
				else
				{
					startAmount--;
				}

				numberOfGames++;
			}

			boolean ruin = startAmount == 0;	
			String gameMsg;
			if (ruin == true) {
				gameMsg = "LOSS";
			}
			else {
				gameMsg = "WIN";
			}
			System.out.println("Simulation " + (i+1) + ": " + numberOfGames + " " + gameMsg);

			


		}

	}

}
