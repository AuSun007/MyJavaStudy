package array_study;

import java.util.Random;

public class ArrayDemo1 {
    public static void main(String[] args) {
        //mySum();
        //mySwap();
        //disorganize();
        test();
    }

    public static void mySum() {
        int[] a = new int[10];
        int sum = 0;
        int avg = 0;
        int count = 0;
        Random r = new Random();

        for (int i = 0; i < 10; i++) {
            a[i] = r.nextInt(100) + 1;
            sum += a[i];
        }

        avg = sum / 10;

        for (int i = 0; i < 10; i++) {
            if (a[i] < avg) count++;
        }

        System.out.println("所有数据和为" + sum + "\n平均数为" + avg + "\n比平均数小的数据个数为" + count);
    }

    public static void mySwap() {
        int[] a = {1, 2, 3, 4, 5};

        for (int i = 0; i < 2; i++) {
            a[i] ^= a[4 - i];
            a[4 - i] ^= a[i];
            a[i] ^= a[4 - i];
        }

        for (int i = 0; i < 5; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void disorganize() {
        int[] a = {1, 2, 3, 4, 5};
        //int index = 0;
        Random r = new Random();

        for (int i = 0; i < a.length; i++) {
            int index = r.nextInt(a.length);
            int temp = a[i];
            a[i] = a[index];
            a[index] = temp;
        }

        for (int i = 0; i < 5; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void test() {
        int[] a1 = {11, 22};
        int[] a2 = a1;

        System.out.println(a1[0]);
        System.out.println(a2[0]);

        a2[0] = 33;

        System.out.println(a1[0]);
        System.out.println(a2[0]);
    }
}
