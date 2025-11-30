package test;

public class test9 {
    public static void main(String[] args) {
        int[][] arr = {{22, 66, 44}, {77, 33, 88}, {25, 45, 65}, {11, 66, 99}};
        int a = 0, sum = 0;
        System.out.println("每个季度的总营业额如下：");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                a += arr[i][j];
            }
            sum += a;
            System.out.println("第 " + (i + 1) + " 个季度：" + a + " 万元");
            a = 0;
        }

        System.out.println("\n全年总营业额为：" + sum + " 万元");
    }
}
