package test;

public class MinimumCoins {

	public static int minCoins(int target, int[] coins) {
		//INPUT: Target change amount and list of coin values
		//OUTPUT: Minimum coins needed to make change
		
		//default to target
		int min_coins = target;
		int num_coins = 0;
		
		//BASE CASE
		//Check to see if we have a single coin match		
		for (int coin: coins) {
			if (target == coin) 
				return 1;
		}
		
		//RECURSIVE CASE
		//for every coin value that is <= target
		for (int coin: coins) {
			if (coin <= target) {
				num_coins = 1 + minCoins(target - coin, coins);
			}
			if (num_coins < min_coins) {
				min_coins = num_coins;
			}
		}
		return min_coins;
		
	}

	public static int minCoinsDynam(int target, int[] coins, int[] known_results) {
		//default to target
		int min_coins = target;
		int num_coins = 0;
		
		//Base Case
		for (int coin: coins) {
			if (coin == target) {
				known_results[target] = 1;
				return 1;
			}
		}
		//return a known result if it happens to be > 0
		if (known_results[target] > 0) {
			return known_results[target];
		} else {
			for (int coin: coins) {
				if (coin <= target) {
					num_coins = 1 + minCoinsDynam(target - coin, coins, known_results);
				}
				
				if (num_coins < min_coins) {
					min_coins = num_coins;
				}
				
				//reset known results;
				known_results[target] = min_coins;
			}
			
		}
		
		return min_coins;
	}
	
//	public static int findMinCoins(int amount, int[] coins) {
//		int[] calc = new int[amount+1];
//		for (int i=0; i<=amount;i++) {
//			calc[i] = Integer.MAX_VALUE;
//		}
//		calc[0] = 0;
//		for (int i=1; i<=amount; i++) {
//			for (int coin:coins) {
//				if (i >= coin && i - coin >= 0 && calc[i - coin] + 1 < calc[i]) {
//			        calc[i] = calc[i - coin] + 1;
//			    }
//			}
//		}
//		return calc[amount];
//	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		int[] coins = {1,5,10};
		int target = 7;
		int[] known_results = new int[(target + 1)];
		System.out.println(minCoinsDynam(target, coins, known_results));
		//System.out.println(minCoins(target, coins));
	}

}
