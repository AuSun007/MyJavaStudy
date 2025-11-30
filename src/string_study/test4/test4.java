package string_study.test4;

import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入金额：");
        int money = sc.nextInt();
        while (money > 9999999) {
            System.out.println("金额过大！请重新输入：");
            money = sc.nextInt();
        }
        System.out.println(moneyString(money));
    }

    public static String moneyString(int money) {
        String res = "";
        String num = "零壹贰叁肆伍陆柒捌玖";
        String unit = "佰拾万仟佰拾元";
        int N = 1000000;
        for (int i = 0; i < unit.length(); i++) {
            res = res + num.charAt(money / N) + unit.charAt(i);
            money %= N;
            N /= 10;
        }

        return res;
    }
}
