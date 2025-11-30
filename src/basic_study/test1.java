package basic_study;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        System.out.println("请输入两个整数：");
        Scanner sc = new Scanner(System.in);
        int data1 = sc.nextInt();
        int data2 = sc.nextInt();
        boolean result = data1 == 6 || data2 == 6 || (data1 + data2) % 6 == 0;
        System.out.println(result);
    }
}
//短路逻辑运算符练习