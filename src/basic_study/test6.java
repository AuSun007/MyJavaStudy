package basic_study;
//while循环练习
public class test6 {
    public static void main(String[] args) {
        //timesToTopest();
        /*isHuiwen(121);
        isHuiwen(234);
        isHuiwen(1234554321);
        isHuiwen(666);
        isHuiwen(1);
        isHuiwen(22);*/
        myDiv(512, 2);
        myDiv(63, 5);
        myDiv(0, 37);
        myDiv(37, 0);

    }

    public static void timesToTopest() {
        int h = 8844430;//8844430毫米，8844.43米
        int count = 0;
        float paper = 0.1f;

        while (paper < h) {
            paper *= 2;
            count++;
        }

        System.out.println("需要折叠" + count + "次");
    }

    public static void isHuiwen(int n) {
        boolean flag = true;
        String numString = Integer.toString(n);
        int left = 0, right = numString.length() - 1;

        while (left <= right) {
            if (numString.charAt(left++) != numString.charAt(right--)) {
                System.out.println(n + "不是回文数字。");
                return;
            }
        }

        System.out.println(n + "是回文数字");
    }

    public static void myDiv(int a, int b) {
        if (b == 0) {
            System.out.println("除数为0！");
            return;
        }
        int i = a, j = b, result = 0;

        while (i >= j) {
            i -= j;
            result++;
        }

        System.out.println(a + "除以" + b + "的商是" + result + "余数是" + i);
    }
}
