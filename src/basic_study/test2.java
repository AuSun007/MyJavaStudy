package basic_study;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        //isSame();
        tallest();
    }

    public static void isSame() {
        System.out.println("请输入两个数字：");
        Scanner sc = new Scanner(System.in);
        int data1 = sc.nextInt();
        int data2 = sc.nextInt();
        System.out.println(data1 == data2 ? "相同" : "不同");
    }

    public static void tallest() {
        Scanner sc = new Scanner(System.in);
        int h1 = 150, h2 = 210, h3 = 165;
        System.out.println(h1 > (h2 > h3 ? h2 : h3) ? h1 : (h2 > h3 ? h2 : h3));
    }
}
//三元运算符练习