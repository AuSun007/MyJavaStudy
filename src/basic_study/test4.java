package basic_study;

import java.util.Scanner;
//switch语句练习
public class test4 {
    public static void main(String[] args) {
        //whichSports();
        ticket();
    }

    public static void whichSports() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入周几（如：1）：");
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("跑步");
                break;
            case 2:
                System.out.println("游泳");
                break;
            case 3:
                System.out.println("慢走");
                break;
            case 4:
                System.out.println("动感单车");
                break;
            case 5:
                System.out.println("拳击");
                break;
            case 6:
                System.out.println("爬山");
                break;
            case 7:
                System.out.println("放纵餐");
                break;
            default:
                System.out.println("输入错误！");
                break;
        }

    }

    public static void ticket() {
        System.out.println("请选择相应服务：\n机票查询请按1\n机票预定请按2\n机票改签请按3\n退出服务请按4");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        switch (num) {
            case 1 -> System.out.println("机票查询");
            case 2 -> System.out.println("机票预定");
            case 3 -> System.out.println("机票改签");
            case 4 -> System.out.println("退出服务");
            default -> System.out.println("输入错误");
        }
    }
}
