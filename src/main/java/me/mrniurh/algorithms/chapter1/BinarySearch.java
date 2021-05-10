package me.mrniurh.algorithms.chapter1;

/**
 * @Author: RuiHan.Niu
 * @Date: 2021/5/8
 * @Description: 二分查找
 */
public class BinarySearch {

    /**
     * 二分查找
     *
     * @param key 查找值
     * @param a   要求数组有序
     * @return int
     */
    public static int rank(int key, int[] a) {
        int low = 0;
        int high = a.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (key < a[mid]) {
                high = mid - 1;
            } else if (key > a[mid]) {
                low = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
