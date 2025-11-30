package string_study.test5;

import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*System.out.println("请输入手机号：");
        String phoneNumber = sc.nextLine();
        while (phoneNumber.length() != 11) {
            System.out.println("手机号格式错误！请重新输入");
            phoneNumber = sc.nextLine();
        }*/
        /*System.out.println("请输入身份证号：");
        String idNumber = sc.nextLine();
        while (idNumber.length() != 18) {
            System.out.println("身份证号格式错误！请重新输入");
            idNumber = sc.nextLine();
        }
        System.out.println(shieldIdNumber(idNumber));
        idNumberInfo(idNumber);*/
        String[] dirtyWords = {"TMD","CNM","SB","MD","MLGB"};
        System.out.println("请发言：");
        String talk = sc.nextLine();
        System.out.println(shieldDirtyWords(talk, dirtyWords));
    }

    public static String shieldPhoneNumber(String phoneNumber) {
        return phoneNumber.substring(0, 3) + "****" + phoneNumber.substring(phoneNumber.length()-4);
    }

    public static String shieldIdNumber(String idNumber) {
        return idNumber.substring(0, 6) + "********" + idNumber.substring(idNumber.length()-4);
    }

    public static void idNumberInfo(String idNumber) {
        System.out.println("省份：" + idNumber.substring(0, 2));
        System.out.println("城市：" + idNumber.substring(2, 4));
        System.out.println("区县：" + idNumber.substring(4, 6));
        System.out.println("出生年月：" + idNumber.substring(6, 10) + "年" + idNumber.substring(10, 12) + "月" + idNumber.substring(12, 14) + "日");
        System.out.println("所在地派出所：" + idNumber.substring(14, 16));
        System.out.print("性别：");
        if (idNumber.charAt(16) - 48 % 2 == 0) {
            System.out.print("女");
        } else {
            System.out.print("男");
        }
    }

    public static String shieldDirtyWords(String talk, String[] dirtyWords) {
        for (int i = 0; i < dirtyWords.length; i++) {
            talk = talk.replace(dirtyWords[i], "***");
        }

        return talk;
    }
}
