package Stack;

import java.util.Stack;

public class FinalPricesWithaSpecialDiscountinaShop {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < prices.length; i++) {
            while (!stack.isEmpty() && prices[stack.peek()] >= prices[i]) {
                int ind = stack.pop();
                prices[ind] = prices[ind] - prices[i];
            }
            stack.push(i);
        }
        return prices;
    }
}
