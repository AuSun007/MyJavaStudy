package test;

import java.util.Random;
import java.util.Scanner;

// 抽奖
public class test7 {
    public static void main(String[] args) {
        System.out.println("请输入红包个数");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] prizes = inputPrizes(length);
        whichPrize(prizes);
    }

    // 输入红包金额
    public static int[] inputPrizes(int length) {
        int[] prizes = new int[length];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < length; i++) {
            System.out.println("请输入第 " + (i + 1) + " 个红包的金额：");
            prizes[i] = sc.nextInt();
        }

        return prizes;
    }

    // 随机抽取
    public static void whichPrize(int[] prizes) {
        int length = prizes.length;
        Random random = new Random();
        int[] arr = new int[length];

        for (int i = 0; i < length; ) {
            int index = random.nextInt(length);
            if (!contains(arr, prizes[index])) {
                System.out.println("第 " + (i + 1) + " 次抽中红包 " + prizes[index] + " 元！");
                arr[i] = prizes[index];
                i++;
            }
        }
    }

    // 判定是否重复
    public static boolean contains(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return true;
            }
        }

        return false;
    }
}
