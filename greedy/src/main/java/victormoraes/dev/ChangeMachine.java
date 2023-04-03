package victormoraes.dev;

import java.util.ArrayList;

public class ChangeMachine {
    // a public collection of available coins
    public static int[] coins = {25, 10, 5, 1};
    public static boolean[] coinsVisited = new boolean[4];

    public static int globalAmount = 0;

    public static ArrayList<Integer> getMinCoins(int amount)  // function to recieve change in the form of coins
    {
        ArrayList<Integer> minCoins = new ArrayList<>();
        if (amount <= 0) {
            return minCoins;
        }

        globalAmount = amount;
        int baseCoinIndex = 0;

        while (globalAmount > 0) {

            minCoins.addAll(getCoinsForAmountGreaterOrEqualThan(amount, baseCoinIndex, coinsVisited));

            if (globalAmount > 0) {
                getMinCoins(globalAmount);
            }
            baseCoinIndex++;
        }
        return minCoins;
    }

    private static ArrayList<Integer> getCoinsForAmountGreaterOrEqualThan(int amount, int baseCoinIndex, boolean[] coinsVisited) {

        ArrayList<Integer> minCoins = new ArrayList<>();

        if (coinsVisited[baseCoinIndex]) {
            return minCoins;
        }

        // Cenário de maior moeda única
        if (amount > coins[baseCoinIndex] && amount % coins[baseCoinIndex] == 0) {
            int numberOfCoins = amount / coins[baseCoinIndex];
            for (int i = 0; i < numberOfCoins; i++) {
                minCoins.add(coins[baseCoinIndex]);
                globalAmount -= coins[baseCoinIndex];
            }
        } else if (amount > coins[baseCoinIndex] && (amount - coins[baseCoinIndex]) % coins[baseCoinIndex + 1] == 0) {
            minCoins.addAll(getCoins(baseCoinIndex, baseCoinIndex + 1));

        } else if (amount > coins[baseCoinIndex] && (amount - coins[baseCoinIndex]) % coins[baseCoinIndex + 2] == 0) {
            minCoins.addAll(getCoins(baseCoinIndex, baseCoinIndex + 2));

        } else if (amount > coins[baseCoinIndex] && (amount - coins[baseCoinIndex]) % coins[baseCoinIndex + 3] == 0) {
            minCoins.addAll(getCoins(baseCoinIndex, baseCoinIndex + 3));
        }

        return minCoins;
    }

    private static ArrayList<Integer> getCoins(int baseCoinIndex, int nextIndex) {

        ArrayList<Integer> minCoins = new ArrayList<>();
        minCoins.add(coins[baseCoinIndex]);
        coinsVisited[baseCoinIndex] = true;
        globalAmount -= coins[baseCoinIndex];

        int numberOfCoins = globalAmount / coins[nextIndex];

        for (int i = 0; i < numberOfCoins; i++) {
            minCoins.add(coins[nextIndex]);
            coinsVisited[nextIndex] = true;
            globalAmount -= coins[nextIndex];
        }
        return minCoins;
    }


}