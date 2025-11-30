package string_study.test1;

import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        User user = new User();
        user.setUsername("admin");
        user.setPassword("111");
        Scanner sc = new Scanner(System.in);
        int count = 3;
        while(count-- > 0) {
            System.out.println("请输入用户名：");
            String username = sc.next();
            System.out.println("请输入密码：");
            String password = sc.next();

            if (user.checkLogin(username, password)) {
                System.out.println("登录成功！");
                return;
            }
            System.out.println("用户名或密码错误，登录失败！还剩 " + count + " 次机会。");

        }

        System.out.println("登录失败次数达到上限，已锁定！");
    }
}
