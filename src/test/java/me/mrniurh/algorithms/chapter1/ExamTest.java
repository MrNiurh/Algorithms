package me.mrniurh.algorithms.chapter1;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @Author MrNiuRH
 * @Date Creat in 2021/5/10
 * @Description 第一章练习
 * @See <a href="https://github.com/MrNiurh?tab=repositories">github</a>
 */
@SpringBootTest
public class ExamTest {

    @Test
    public void test111() {

        /**
         * 1.1.1 给出以下表达式的值
         *
         * a. ( 0 + 15 ) / 2
         * b. 2.0E-6 * 100000000.1
         * c. true && false || true && true
         */
        System.out.println("Result of ( 0 + 15 ) / 2 is : " + ((0 + 15) / 2));
        System.out.println("Result of 2.0E-6 * 100000000.1 is : " + (2.0E-6 * 100000000.1));
        System.out.println("Result of true && false || true && true is : " + (true && false || true && true));

    }

    @Test
    public void test112() {

        /**
         * 1.1.2 给出以下表达式的类型和值
         *
         * a. (1 + 2.236) / 2
         * b. 1 + 2 + 3 + 4.0
         * c. 4.1 >= 4
         * d. 1 + 2 + "3"
         */
        System.out.println("Result of (1 + 2.236) / 2 is : " + ((1 + 2.236) / 2));
        System.out.println("Result of 1 + 2 + 3 + 4.0 is : " + (1 + 2 + 3 + 4.0));
        System.out.println("Result of 4.1 >= 4 is : " + (4.1 >= 4));
        System.out.println("Result of 1 + 2 + \"3\" is : " + (1 + 2 + "3"));
    }

    @Test
    public void test113() {

        Scanner sc = new Scanner(System.in);
        int numbers[] = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.printf("Type the %d number:", i + 1);
            numbers[i] = sc.nextInt();
        }

    }

    public static void main(String[] args) {

        System.out.println("Result is : " + numbersJudge());
    }

    /**
     * 1.1.3 编写一个程序，从命令行得到三个整数参数，如果它们都相等则打印 equal，否则打印 not equal。
     *
     * @return java.lang.String
     */
    public static String numbersJudge() {
        Scanner sc = new Scanner(System.in);
        Set<Integer> numbers = new HashSet<>();

        for (int i = 0; i < 3; i++) {
            System.out.printf("Type the %d number:", i + 1);
            numbers.add(sc.nextInt());
        }

        if (numbers.size() > 1) {
            return "not equal";
        } else {
            return "equal";
        }

    }
}
