package object_study.test3;

import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        Phone[] phones = new Phone[3];
        int sum = 0, avg = 0;
        for (int i = 0; i < phones.length; i++) {
            Phone phone = new Phone();
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入第 " + (i + 1) + " 个手机的品牌、价格和颜色（空格隔开）：");
            String brand = sc.next();
            phone.setBrand(brand);
            int price = sc.nextInt();
            phone.setPrice(price);
            String color = sc.next();
            phone.setColor(color);
            phones[i] = phone;
            sum += price;
        }
        avg = sum / phones.length;
        System.out.println("价格平均值是" + avg);
        System.out.println("\n价格低于平均值的手机为：");
        for (int i = 0; i < phones.length; i++) {
            if (phones[i].getPrice() < avg) {
                System.out.println(phones[i].toString());
            }
        }
    }
}
