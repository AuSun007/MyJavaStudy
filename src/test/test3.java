package test;

import java.util.Random;
import java.util.Scanner;
// 生成随机验证码
public class test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入验证码中的字母数量：");
        int letter = sc.nextInt();
        if (letter < 0) System.out.println("输入不合法！");
        System.out.println("请输入验证码中的数字数量：");
        int number = sc.nextInt();
        if (number < 0) System.out.println("输入不合法！");

        captcha(letter, number);


    }

    public static void captcha(int letter, int number) {
        System.out.println("生成验证码为：");
        String letters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random random = new Random();
        int turn = 0;
        int length = letter + number;

        for (int i = 0; i < length; i++) {
            turn = random.nextInt(2);
            if ((turn == 0 && letter > 0) || (turn == 1 && number < 0)) {
                System.out.print(letters.charAt(random.nextInt(letters.length())));
                letter--;
            } else {
                System.out.print(random.nextInt(10));
                number--;
            }
        }
    }
}
