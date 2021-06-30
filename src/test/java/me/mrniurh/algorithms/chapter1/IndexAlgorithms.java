package me.mrniurh.algorithms.chapter1;

/**
 * @Author MrNiuRH
 * @Date Creat in 2021/6/30
 * @Description 实现一个类似String的indexOf(String str)的方法，用最简单实现即可
 * 查找字符串str在目标字符串source中第一次出现的位置。
 * 不可以调用任何第三方库，也不可以用String.equals， String.substring 方法
 * 注意边界条件
 */
public class IndexAlgorithms {

    /**
     * 字符匹配算法实现
     *
     * @param source 源字符串
     * @param str    目标字符串
     * @return int 所在位置
     */
    public static int indexOf(String source, String str) {
        // 源字符串长度
        int sourceLength = source.length();
        // 目标字符串长度
        int strLength = str.length();
        // 默认返回值
        int index = -1;
        // 循环次数
        int round = sourceLength - strLength;

        for (int i = 0; i < round; i++) {
            // 首个字符匹配
            if (source.charAt(i) == str.charAt(0)) {
                index = i;
                // 后续字符校验
                for (int j = 1; j < strLength; j++) {
                    // 不相等则中止
                    if (source.charAt(i + j) != str.charAt(j)) {
                        index = -1;
                        break;
                    }
                }
            }
        }
        return index;
    }

    public static void main(String[] args) {
        System.out.println(indexOf("abcabdef", "abd"));
        System.out.println(indexOf("abcabdef", "abcd"));
    }
}
