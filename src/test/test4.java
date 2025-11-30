package test;
// 复制数组
public class test4 {
    public static void main(String[] args) {
        int[] oldArray = {1, 2, 3, 4, 5};
        int[] newArray = new int[oldArray.length];

        if (!copyIntArray(oldArray, newArray)) {
            System.out.println("数组长度不匹配，复制失败！");
        }
        System.out.println("复制成功！新数组为：");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }

    }

    public static boolean copyIntArray(int[] oldArray, int[] newArray) {
        if (oldArray.length != newArray.length) {
            return false;
        }

        for (int i = 0; i < oldArray.length; i++) {
            newArray[i] = oldArray[i];
        }

        return true;
    }
}
