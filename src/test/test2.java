package test;

import java.util.Scanner;
// 某个区间的所有素数
public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入区间的最小值：");
        int from = sc.nextInt();
        System.out.println("请输入区间的最大值：");
        int to = sc.nextInt();
        if (from > to || to < 2) {
            System.out.println("区间不合法！");
            return;
        }
        rangePrimeNumber(from, to);
    }

    public static void rangePrimeNumber(int from, int to) {
        int count = 0;

        System.out.println(from + "到" + to + "之间的素数为：");
        for (int i = from; i <= to; i++) {
            if (isPrimeNumber(i)) {
                System.out.print(i + " ");
                count++;
            }
        }

        System.out.println("\n共有" + count + "个素数。");
    }

    public static boolean isPrimeNumber(int n) {
        boolean isPrime = true;
        if (n < 2) return false;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        return isPrime;
    }
}
