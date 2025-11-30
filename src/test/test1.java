package test;

import java.util.Scanner;
// 飞机票折扣
public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入原价：");
        int price = sc.nextInt();
        System.out.println("请输入月份：");
        int month = sc.nextInt();
        if (month < 1 || month > 12) {
            System.out.println("月份输入错误！");
            return;
        }
        System.out.println("请输入舱室类型（头等舱输入0，经济舱输入1）：");
        int plane = sc.nextInt();
        if (plane != 0 && plane != 1) {
            System.out.println("没有这个舱室！");
            return;
        }
        float p = 0;
        if (month >=5 && month <=10) {
            // 旺季
            p = realPrice(price, month, plane, 0.9f, 0.85f);
        } else {
            // 淡季
            p = realPrice(price, month, plane, 0.7f, 0.65f);
        }

        System.out.println("折扣后的价格为：" + p + "元");
    }

    public static float realPrice(int price, int month, int plane, float v0, float v1) {
        float res = price;
        if (plane == 0) res *= v0;
        else res *= v1;

        return res;
    }
}
