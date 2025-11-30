package string_study.test3;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        /*int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        String str = intArrayToString(arr);
        System.out.println(str);*/
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.nextLine();
        System.out.println(reverseString(str));
    }

    public static String intArrayToString(int[] arr) {
        String res = "[";
        for (int i = 0; i < arr.length; i++) {
            res += arr[i];
            if (i != arr.length - 1) {
                res += ", ";
            }
        }
        res += "]";

        return res;
    }

    public static String reverseString(String str) {
        String res = "";
        for (int i = str.length() - 1; i > -1; i--) {
            res += str.charAt(i);
        }
        return res;
    }
}
