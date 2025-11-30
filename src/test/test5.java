package test;

import java.util.Scanner;

// 评委打分
public class test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入评委数量（至少3个）：");
        int number = sc.nextInt();
        if (number < 2) {
            System.out.println("数量为负数或过少！");
            return;
        }

        double avg = avgScore(enterScores(number));
        System.out.println("最终分数为：" + avg + "分");
    }

    public static int[] enterScores(int number) {
        Scanner sc = new Scanner(System.in);
        int[] scores = new int[number];

        for (int i = 0; i < number; ) {
            System.out.println("请输入第" + (i + 1) + "个评委的打分：");
            scores[i] = sc.nextInt();
            if (scores[i] >= 0 && scores[i] <= 10) {
                i++;
            } else {
                System.out.println("分数不合法！");
            }
        }

        return scores;
    }

    public static double avgScore(int[] scores) {
        int sum = 0, maxIndex = 0, minIndex = 0;

        // 确定最大评分的索引和最小评分的索引
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > scores[maxIndex]) maxIndex = i;
            if (scores[i] < scores[minIndex]) minIndex = i;
        }

        // 去掉最大评分和最小评分求平均值
        for (int i = 0; i < scores.length; i++) {
            if (i != maxIndex && i != minIndex) sum += scores[i];
        }

        return (double) sum / (scores.length - 2);
    }
}
