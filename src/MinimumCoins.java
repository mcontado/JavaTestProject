
public class MinimumCoins {

	public static int minCoins(int target, int[] coins) {
		//INPUT: Target change amount and list of coin values
		//OUTPUT: Minimum coins needed to make change
		
		//default to target
		int min_coins = target;
		int num_coins = 0;
		
		//BASE CASE
		//Check to see if we have a single coin match
		for (int i=0; i<coins.length; i++) {
			if (target == coins[i]) {
				return 1;
			}
		}
		
		//for every coin value that is <= target
		for (int i=0; i<coins.length; i++) {			
			if (coins[i] <= target) {
				num_coins = 1 + minCoins(target-1, coins);
			}
			
			//reset minimum if we have a new minimum
			if (num_coins < min_coins) {
				min_coins = num_coins;
			}
		}
		
		return min_coins;
		
	}

	
	public static int findMinCoins(int amount, int[] coins) {
		int[] calc = new int[amount+1];
		for (int i=0; i<=amount;i++) {
			calc[i] = Integer.MAX_VALUE;
		}
		calc[0] = 0;
		for (int i=1; i<=amount; i++) {
			for (int coin:coins) {
				if (i >= coin && i - coin >= 0 && calc[i - coin] + 1 < calc[i]) {
			        calc[i] = calc[i - coin] + 1;
			    }
			}
		}
		return calc[amount];
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coins = {1,5,10,25};
		int target = 16;
		System.out.println(findMinCoins(target, coins));
	}

}
