package test;

import java.util.Scanner;

// 数字加密和解密
public class test6 {
    public static void main(String[] args) {
        System.out.println("请输入密码长度：");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        System.out.println("请依次输入各位数字密码（各位之间用空格隔开）：");
        int[] password = inputPswd(length);
        int[] encoded = encode(password);
        int[] decoded = decode(encoded);

        System.out.println("加密后的密码为：");
        for (int i = 0; i < encoded.length; i++) {
            System.out.print(encoded[i] + " ");
        }

        System.out.println("解密后的密码为：");
        for (int i = 0; i < decoded.length; i++) {
            System.out.print(decoded[i] + " ");
        }

    }

    // 输入密码
    public static int[] inputPswd(int length) {
        Scanner sc = new Scanner(System.in);
        StringBuilder pswd = new StringBuilder("");
        int[] password = new int[length];
        for (int i = 0; i < length; i++) {
            pswd.append(sc.next().charAt(0));
        }

        for (int i = 0; i < pswd.length(); i++) {
            password[i] = pswd.charAt(i) - '0';
        }

        return password;
    }

    // 加密
    public static int[] encode(int[] password) {
        int length = password.length;
        int[] encoded = new int[length];

        for (int i = 0; i < length; i++) {
            int temp = password[length - i - 1];
            encoded[i] = (temp + 5) % 10;
        }

        return encoded;
    }

    // 解密
    public static int[] decode(int[] encoded) {
        int length = encoded.length;
        int[] decoded = new int[length];

        for (int i = 0; i < length; i++) {
            int temp = encoded[length - i - 1];
            if (temp < 5) {
                decoded[i] = temp + 10 - 5;
            } else {
                decoded[i] = temp - 5;
            }
        }

        return decoded;
    }
}
