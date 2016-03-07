package test;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class NumberOfCoinsForDollar {
	
	public static void main(String[] args) {
		int amount = 1;
		System.out.println("Number of coins: " + makeChange(10) );
	}
	
	public static int makeChange(int n) {
		int[] denoms = {25,10,5,1};
		int[][] map = new int[n+1][denoms.length];
		
		return makeChange(n, denoms, 0, map);
	}
	
	public static int makeChange(int amount, int[] denoms, int index, int[][]map){
		if (map[amount][index] > 0) { //retrieve value
			return map[amount][index];
		}
		
		if (index >= denoms.length -1) {
			return 1; //one denom remaining
		}
		int denomAmount = denoms[index];
		int ways = 0;
		
		for (int i = 0; i * denomAmount <= amount; i++) {
			//go to next denom, assuming i coins of denomAmount
			int amountRemaining = amount - 1 * denomAmount;
			ways += makeChange(amountRemaining, denoms, index+1, map);
		}
		
		map[amount][index] = ways;
		return ways;
	}
	
}
