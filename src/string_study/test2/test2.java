package string_study.test2;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.nextLine();
        int smallCount = 0, bigCount = 0, numCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {
                numCount++;
            } else if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
                bigCount++;
            } else if (str.charAt(i) >= 97 && str.charAt(i) <= 122) {
                smallCount++;
            }
        }

        System.out.println("数字字符有 " + numCount + " 个。");
        System.out.println("小写字母有 " + smallCount + " 个。");
        System.out.println("大写字母有 " + bigCount + " 个。");
    }
}
