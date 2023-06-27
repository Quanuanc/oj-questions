package leetcode.editor.cn;

/**
 * [121] 买卖股票的最佳时机
 */
public class BestTimeToBuyAndSellStock {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int maxProfit(int[] prices) {
            int maxProfit = 0, minPrice = prices[0];
            for (int price : prices) {
                minPrice = Math.min(minPrice, price);
                maxProfit = Math.max(maxProfit, price - minPrice);
            }
            return maxProfit;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}