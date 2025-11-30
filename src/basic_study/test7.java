package basic_study;

import java.util.Random;
import java.util.Scanner;

// 循环综合练习
public class test7 {
    public static void main(String[] args) {
        //meet7Pass();
        //mySqrt();
        //isPrimeNumber();
        guessNumber();
    }

    // 逢7过
    public static void meet7Pass() {
        for (int i = 1; i <= 100; i++) {
            if (i % 10 == 7 || i / 10 == 7 || i % 7 == 0) System.out.println("过！");
            else System.out.println(i);
        }
    }

    //平方根
    public static void mySqrt() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("请输入一个大于等于2的整数(输入小于2的整数则退出)：");
            int x = sc.nextInt();
            if (x < 2) break;
            for (int i = 1; i <= x / 2; i++) {
                if (i * i <= x && (i + 1) * (i + 1) > x) {
                    System.out.println(x + "的平方根（向下取整）是" + i);
                    break;
                }
            }
        }
    }

    //是否是质数
    public static void isPrimeNumber() {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        while (true) {
            flag = true;
            System.out.println("请输入一个大于等于2的正整数（输入小于2则退出）：");
            int x = sc.nextInt();
            if (x < 2) break;
            if (x == 2) {
                System.out.println(x + "是质数");
                continue;
            }
            for (int i = 2; i <= x / 2; i++) {
                if (x % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(x + "是质数");
            } else {
                System.out.println(x + "不是质数");
            }
        }
    }

    //猜数
    public static void guessNumber() {
        Random r = new Random();
        int x = r.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入1-100之间的一个数字：");

        while (true) {
            int n = sc.nextInt();
            if(n < x) {
                System.out.println("太小啦！请重新输入：");
            } else if (n > x) {
                System.out.println("太大啦！请重新输入：");
            } else {
                System.out.println("恭喜你猜对啦！");
                break;
            }
        }
    }
}
