package method_study;

public class MethodDemo1 {
    public static void main(String[] args) {
        /*byte a = 1, b = 1;
        short c = 1, d = 2;
        int e = 1, f = 1;
        long g = 1, h = 2;

        if (isEqual(a, b)) System.out.println("a == b");
        else System.out.println("a != b");
        if (isEqual(c, d)) System.out.println("c == d");
        else System.out.println("c != d");
        if (isEqual(e, f)) System.out.println("e == f");
        else System.out.println("e != f");
        if (isEqual(g, h)) System.out.println("g == h");
        else System.out.println("g != h");*/
        int[] a = {11, 22, 33, 44, 55};
        int x = 66;
        scanArray(a);
        System.out.println("数组中的最大值是：" + myMax(a));
        System.out.println(x + "是否在数组中：" + isContains(a, x));
        int[] r = copyOfRange(a, 1,4);
        scanArray(r);

    }

    public static boolean isEqual(byte a, byte b) {
        System.out.println("byte");
        return (a == b);
    }

    public static boolean isEqual(short a, short b) {
        System.out.println("short");
        return (a == b);
    }

    public static boolean isEqual(int a, int b) {
        System.out.println("int");
        return (a == b);
    }

    public static boolean isEqual(long a, long b) {
        System.out.println("long");
        return (a == b);
    }

    public static void scanArray(int[] a) {
        System.out.print("数组：[");

        for (int i = 0; i < a.length; i++) {
            if (i != a.length - 1) {
                System.out.print(a[i] + ",");
            } else {
                System.out.print(a[i]);
            }
        }

        System.out.println("]");
    }

    public static int myMax(int[] a) {
        int max = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) max = a[i];
        }

        return max;
    }

    public static boolean isContains(int[] a, int x) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) return true;
        }

        return false;
    }

    public static int[] copyOfRange(int[] a, int from, int to) {
        int[] result = new int[to - from];

        for (int i = from; i < to; i++) {
            result[i - from] = a[i];
        }

        return result;
    }

}
