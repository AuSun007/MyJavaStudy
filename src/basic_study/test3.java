package basic_study;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        //isPaySuc();
        //leftOrRight();
        whichPrice();
    }

    public static void isPaySuc() {
        Scanner sc = new Scanner(System.in);
        int pay = sc.nextInt();
        if (pay > 600) {
            System.out.println("付款成功！");
        } else {
            System.out.println("付款失败！");
        }
    }

    public static void leftOrRight() {
        Scanner sc = new Scanner(System.in);
        int seq = sc.nextInt();

        if (seq % 2 != 0) {
            System.out.println("左边座位");
        } else {
            System.out.println("右边座位");
        }
    }

    public static void whichPrice() {
        System.out.println("请输入会员级别（1, 2, 3）：");
        Scanner sc = new Scanner(System.in);
        int level = sc.nextInt();

        if (level == 1) {
            System.out.println("会员1级打九折");
        } else if (level == 2) {
            System.out.println("会员2级打八折");
        } else if (level == 3) {
            System.out.println("会员3级打七折");
        } else {
            System.out.println("非会员，无折扣！");
        }
    }
}
//if语句练习