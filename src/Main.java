import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        task6();
        task7();
        task8();
        task9();


        int[] arr = generateRandomArray();
        int sum = 0;

        for (int i : arr) {
            sum += i;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int j : arr) {
            if (j > max) {
                int max1 = j;
                max = max1;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + max + " рублей");
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей");
        double average = sum / 30;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int index = reverseFullName.length - 1; index >= 0; index--) {
            System.out.print(reverseFullName[index]);
        }
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    private static void task9() {
        int[] arr = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        Arrays.sort(arr);
        int a = -2;
        for (int i = 0; i < arr.length; i++) {
            for (int b = arr.length - 1; b >= 0; b--) {
                if (arr[i] + arr[b] == a) {
                    System.out.println(arr[i] + " и " + arr[b]);
                }
            }
        }
    }

    private static void task8() {
        int[] arr = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        Arrays.sort(arr);
        int a = -2;
        for (int i = 0; i < arr.length; i++) {
            for (int b = i + 1; b < arr.length; b++) {
                if (arr[i] + arr[b] == a) {
                    System.out.println(arr[i] + " " + arr[b]);
                }
            }
        }
    }


    private static void task7() {
        int[] arr = {9, 1, 3, 6, 7};
        int a = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            a = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = a;
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void task6() {
        int[] arr = {5, 4, 3, 2, 1};
        int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr1[arr.length - 1 - i] = arr[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
    }


}