package object_study.test2;

import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        Car[] cars = new Car[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < cars.length; i++) {
            System.out.println("请输入第 " + (i + 1) + " 辆车的品牌、价格和颜色（空格隔开）：");
            String brand = sc.next();
            double price = sc.nextDouble();
            String color = sc.next();
            Car car = new Car();
            car.setBrand(brand);
            car.setPrice(price);
            car.setColor(color);
            cars[i] = car;
        }

        for (int i = 0; i < cars.length; i++) {
            System.out.println("\n第 " + (i + 1) + " 辆车的品牌、价格和颜色分别是：" + cars[i]);
            System.out.println(cars[i].getBrand() + ", " + cars[i].getPrice() + ", " + cars[i].getColor());
        }
    }
}
