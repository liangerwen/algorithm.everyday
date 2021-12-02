class Solution {

    static int[] getMax(String pat) {

        int len = pat.length();
        int[] max = new int[len];
        max[0] = 0;

        int i = 0;  // 表示当前最大共缀长度的候选值
        int j = 1;  // 从第二位开始遍历

        while (j < len) {

            if (pat.charAt(i) == pat.charAt(j))
                max[j++] = ++i;
            else if (i == 0)
                max[j++] = 0;
            else
                i = max[i - 1]; // 递推核心
        }

        return max;
    }

    public String longestPrefix(String s) {

        int len = s.length();

        if (len < 2) {
            return "";
        } else {
            return s.substring(0, getMax(s)[len - 1]);
        }
    }
}

public class RecurrenceSolution {
    public static void main(String[] args) {
        System.out.println(new Solution().longestPrefix("abacabab"));
    }
}