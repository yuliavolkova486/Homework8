public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        int[] integers = new int[3];
        integers[0] = 1;
        integers[1] = 2;
        integers[2] = 3;
        double[] fractional = {1.57, 7.654, 9.986};
        boolean[] bool = {false, true};

        // Задача 2
        System.out.println("Задача 2");
        for (int i = 0; i < integers.length; i++) {
            System.out.print(integers[i]);
            if (i < integers.length - 1) {
                System.out.print(" , ");
            }
        }
        System.out.println();
        for (int i = 0; i < fractional.length; i++) {
            System.out.print(fractional[i]);
            if (i < fractional.length - 1) {
                System.out.print(" , ");
            }
        }
        System.out.println(" ");
        for (int i = 0; i < bool.length; i++) {
            System.out.print(bool[i]);
            if (i < bool.length - 1) {
                System.out.print(" , ");
            }
        }
        System.out.println();


        // Задача 3
        System.out.println("Задача 3");
        for (int i = integers.length - 1; i >= 0; i--) {
            System.out.print(integers[i]);
            if (i > 0) {
                System.out.print(" , ");
            }
        }
        System.out.println();
        for (int i = fractional.length - 1; i >= 0; i--) {
            System.out.print(fractional[i]);
            if (i > 0) {
                System.out.print(" , ");
            }
        }
        System.out.println(" ");
        for (int i = bool.length - 1; i >= 0; i--) {
            System.out.print(bool[i]);
            if (i > 0) {
                System.out.print(" , ");
            }
        }
        System.out.println();


        // Задача 4
        System.out.println("Задача 4");
        for (int i = 0; i < integers.length; i++) {
            if (integers[i] % 2 != 0) {
                if (i > 0)
                    System.out.print(" , ");
                System.out.print(integers[i] + 1);
            } else if (integers[i] % 2 == 0) {
                System.out.print(" , ");
                System.out.print(integers[i]);
            }
        }
    }
}