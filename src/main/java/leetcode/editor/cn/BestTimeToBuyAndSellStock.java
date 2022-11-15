package leetcode.editor.cn;

/**
 * [121] 买卖股票的最佳时机
 */
public class BestTimeToBuyAndSellStock {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int maxProfit(int[] prices) {
            int minPrice = Integer.MAX_VALUE, maxProfit = 0;
            for (int i = 0; i < prices.length; i++) {
                if (prices[i] < minPrice) {
                    minPrice = prices[i];
                } else if (prices[i] - minPrice > maxProfit) {
                    maxProfit = prices[i] - minPrice;
                }
            }
            return maxProfit;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}