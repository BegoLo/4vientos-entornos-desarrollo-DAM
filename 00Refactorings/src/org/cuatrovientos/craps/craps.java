package org.cuatrovientos.craps;
import java.util.Random;


/**
 * A press-your-luck game where you roll two dices and 
 * when you get the same in both you win.
 * @author Bego Lopez 
 * 
 *
 */
public class craps {

	private double money; // player money
	private double playerLastBet; // players last bet
	private double totalBets; // total bets
	Random rndom = new Random();
	private int d1;
	private int d2;
	/**
	 * constructor, player begins with initial money
	 * @param money
	 */
	public craps (double money) {
		this.money = money;
	}
	
	/**
	 * player puts bet, and we add random money from other players
	 * @return 
	 */
	public double putBet (double playerLastBet) {
		this.playerLastBet = playerLastBet;
		this.totalBets = this.playerLastBet + rndom.nextInt(100);
		return totalBets;
	}
	
	/**
	 * rolling two 6D dices...
	 */
	public void roll () {
		d1 = rndom.nextInt(6);
		d2 = rndom.nextInt(6);
	}
	
	/**
	 * tells if player wins or not
	 * @return
	 */
	public boolean winOrwhat () {
		boolean result = false;
		if (d1 == d2) {
			result = true;
		}
		return result;
	}
	
	/**
	 * player loses we subtract last bet from total money
	 */
	public void lose () {
		money -= playerLastBet;
	}

	/**
	 * player wins all the money
	 */
	public void win () {
		money += totalBets;
	}

	/**
	 * @return the money
	 */
	public double getMoney() {
		return money;
	}

	/**
	 * @param money the money to set
	 */
	public void setMoney(double money) {
		this.money = money;
	}

	/**
	 * @return the playerLastBet
	 */
	public double getPlayerLastBet() {
		return playerLastBet;
	}

	/**
	 * @param playerLastBet the playerLastBet to set
	 */
	public void setPlayerLastBet(double playerLastBet) {
		this.playerLastBet = playerLastBet;
	}

	/**
	 * @return the totalBets
	 */
	public double getTotalBets() {
		return totalBets;
	}

	/**
	 * @param totalBets the totalBets to set
	 */
	public void setTotalBets(double totalBets) {
		this.totalBets = totalBets;
	}

	/**
	 * @return the d1
	 */
	public int getD1() {
		return d1;
	}


	/**
	 * @return the d2
	 */
	public int getD2() {
		return d2;
	}


	
}
