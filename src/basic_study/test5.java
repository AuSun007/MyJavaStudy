package basic_study;

import java.util.Scanner;
//for循环练习
public class test5 {
    public static void main(String[] args) {
//        getOu();
        whichNum();
    }

    public static void getOu() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) System.out.println(i);
        }
    }

    public static void whichNum() {
        int count = 0;
        System.out.println("请输入两个数字表示一个范围（先小后大）：");
        Scanner sc = new Scanner(System.in);
        int left = sc.nextInt();
        int right = sc.nextInt();
        if (left >= right) {
            System.out.println("输入不合法！");
            return;
        }

        for (int i = left; i <= right; i++) {
            if (i % 3 ==0 && i % 5 == 0) {
                count++;
                System.out.println(i);
            }
        }

        System.out.println("该范围内既能被3整除又能被5整除的有上述" + count + "个");
    }
}
