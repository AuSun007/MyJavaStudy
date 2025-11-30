package test;

import java.util.Random;
import java.util.Scanner;

// 模拟双色球系统
public class test8 {
    public static void main(String[] args) {
        System.out.println("欢迎使用双色球系统。小赌怡情，大赌伤身！\n====================================================");
        int[] numbers = inputNumbers(); // 用户输入号码
        int[] balls = randomBalls(); // 生成双色球号码
        printBalls(balls); // 公布双色球号码
        whichPrize(numbers, balls); // 判断中奖结果
    }

    // 用户输入自己的号码（6红1蓝）
    public static int[] inputNumbers() {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[7];
        int x = 0;
        boolean inputBlue = true;
        for (int i = 0; i < 6; ) {
            System.out.println("请输入第 " + (i + 1) + " 个红色球的号码：");
            x = sc.nextInt();
            if (x < 1 || x > 33) {
                System.out.println("输入数字不在合法号码范围内！");
                continue;
            }
            if (contains(numbers, x)) {
                System.out.println("输入数字重复！");
                continue;
            }
            numbers[i] = x;
            i++;
        }

        while (inputBlue) {
            System.out.println("请输入蓝色球的号码：");
            x = sc.nextInt();
            if (x < 1 || x > 16) {
                System.out.println("输入数字不在合法号码范围内！");
            } else {
                inputBlue = false;
            }
        }
        numbers[6] = x;

        return numbers;
    }

    // 随机生成双色球序号（6红1蓝）
    public static int[] randomBalls() {
        Random random = new Random();
        int[] balls = new int[7];
        int x = 0;

        for (int i = 0; i < 7; ) {
            if (i < 6) {
                x = random.nextInt(33) + 1;
                if (contains(balls, x)) {
                    continue;
                }
            } else {
                x = random.nextInt(16) + 1;
            }
            balls[i] = x;
            i++;

        }

        return balls;
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

    // 公布双色球号码
    public static void printBalls(int[] balls) {
        System.out.println("\n====================================================\n公布双色球号码：");
        for (int i = 0; i < balls.length; i++) {
            System.out.print(balls[i] + " ");
        }
    }

    // 奖金判断
    public static void whichPrize(int[] numbers, int[] balls) {
        int redHit = 0, blueHit = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < balls.length - 1; j++) {
                if (numbers[i] == balls[j]) {
                    redHit++;
                    break;
                }
            }
        }
        if (numbers[numbers.length - 1] == balls[balls.length - 1]) {
            blueHit++;
        }
        System.out.println("\n\n红色球中 " + redHit + " 个" + "\n蓝色球中 " + blueHit + " 个");
        // 判断中奖结果
        if (redHit == 6 && blueHit == 1) { // 一等奖，1000万元
            System.out.println("\n恭喜您获得 一等奖： 1000万元 人民币！");
        } else if (redHit == 6 && blueHit == 0) { // 二等奖，500万元
            System.out.println("\n恭喜您获得 二等奖： 500万元 人民币！");
        } else if (redHit == 5 && blueHit == 1) { // 三等奖，3000元
            System.out.println("\n恭喜您获得 三等奖： 3000元 人民币！");
        } else if ((redHit == 5 && blueHit == 0) || (redHit == 4 && blueHit == 1)) { // 四等奖，200元
            System.out.println("\n恭喜您获得 四等奖： 200元 人民币！");
        } else if ((redHit == 4 && blueHit == 0) || (redHit == 3 && blueHit == 1)) { // 五等奖，10元
            System.out.println("\n恭喜您获得 五等奖： 10元 人民币！");
        } else if ((redHit <= 2 && blueHit == 1)) { // 六等奖，5元
            System.out.println("\n恭喜您获得 六等奖： 5元 人民币！");
        } else {
            System.out.println("\n很遗憾您没中奖。\n====================================================");
        }
    }
}
