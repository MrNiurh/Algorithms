package me.mrniurh.algorithms.chapter1;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Author: RuiHan.Niu
 * @Date: 2021/5/8
 * @Description: 二分查找测试
 */
@SpringBootTest
class BinarySearchTest {

    @Test
    public void rankTest() {

        // 寻找值
        int key = 10;
        // 数组
        int array[] = {2, 5, 7, 10, 11, 15, 20};

        // 寻找结果
        int searchResult = BinarySearch.rank(key, array);
        System.out.printf("The index of %d in array is %d.", key, searchResult);

    }

}