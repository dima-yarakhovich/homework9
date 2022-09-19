import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        int[] arr = generateRandomArray();
        int sum=0;

        for (int i : arr) {
            sum += i;
        }
        System.out.println("Сумма трат за месяц составила "+sum+ " рублей");
        int max=100_000;
        int min=200_000;
        for (int j : arr) {
            if (j > max) {
                int max1 = j;
                max = max1;
            }
        }
            for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min) {
                min=arr[i];
            }
        }
        System.out.println("Максимальная сумма трат за день составила "+max+ " рублей");
        System.out.println("Минимальная сумма трат за день составила "+min+ " рублей");
        double average=sum/30;
        System.out.println("Средняя сумма трат за месяц составила "+average+ " рублей");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int index = reverseFullName.length-1; index >= 0; index--) {
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
}