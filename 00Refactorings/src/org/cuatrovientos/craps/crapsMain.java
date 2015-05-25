package org.cuatrovientos.craps;
import java.util.Scanner;


/**
 * java programa to play a pseudo-craps implementation
 * @author nigga madafaka
 *
 */
public class crapsMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner (System.in);
		double money = 0;
		craps myCraps = new craps(66.6);
		
		do {
			System.out.println("How much you bet?");
			money = reader.nextDouble();
			myCraps.putBet(money);
			myCraps.roll();
			System.out.println("You rolled: " + myCraps.getD1() +","+myCraps.getD2());
			if (myCraps.winOrwhat()) {
				System.out.println("You win, nigga");
				myCraps.win();
			} else {
				System.out.println("You lose, nigga");
				myCraps.lose();
			}
			System.out.println("Your money: " + myCraps.getMoney());
		} while (money != 0);
	}

}
