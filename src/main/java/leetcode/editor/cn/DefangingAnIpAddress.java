package leetcode.editor.cn;

public class DefangingAnIpAddress {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String defangIPaddr(String address) {
            return address.replace(".", "[.]");
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}