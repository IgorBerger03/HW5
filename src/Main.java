import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        int[] a = new int[]{1, 2, 3};
        double[] b = {1.57, 7.654, 9.986};
        long[] c = {10L, 50L, 100L};
    }

    public static void task2() {
        int[] a = new int[]{1, 2, 3};
        double[] b = {1.57, 7.654, 9.986};
        long[] c = {10L, 50L, 100L};
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));
    }

    public static void task3() {
        int[] a = new int[]{1, 2, 3};
        for (int i = a.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(a[i] + ",");
            } else {
                System.out.print(a[i]);
            }
        }
        System.out.println();

        double[] b = {1.57, 7.654, 9.986};
        for (int i = b.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(b[i] + ",");
            } else {
                System.out.println(b[i]);
            }
        }

        long[] c = {10L, 50L, 100L};
        for (int i = c.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(c[i] + ",");
            } else {
                System.out.print(c[i]);
            }
        }
        System.out.println();
    }

    public static void task4() {
        int[] a = new int[]{1, 2, 3};
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 1) {
                a[i] = a[i] + 1;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}