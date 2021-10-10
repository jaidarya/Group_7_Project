package setup;

import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        System.out.println(" Please enter the size of your array");
        Scanner input = new Scanner(System.in);      //int[] arr = {5, 179, 56, 45, 1000};
        int[] arr = new int[input.nextInt()];

        System.out.println("Please enter integer value elements of your array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("The maximum of the numbers is " + findMax(arr));
    }
    public static int findMax(int[] numbers) {
        int max = 0;
        for (int each : numbers) {                     // or for (int i = 0; i < numbers.length; i++) {
            if (each > max) {                          //     if(numbers[i] > max) {
                max = each;                           //     max = numbers[i];
            }
        }
        return max;
    }
}
