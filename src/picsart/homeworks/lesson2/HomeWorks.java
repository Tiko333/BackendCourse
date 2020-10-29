package picsart.homeworks.lesson2;

import java.util.Arrays;

public class HomeWorks {
    public static void main(String[] args) {

        System.out.println("\nTask 1: Create an array and fill it with 2 number");
        int[] arrayWithTwoNumbers = {2, 2};
        System.out.println(Arrays.toString(arrayWithTwoNumbers));

        System.out.println("\nTask 2: Create an array and fill it with numbers from 1:1000");
        int[] arrayFromOneToThousand = new int[1000];
        for (int i = 1; i <= arrayFromOneToThousand.length; i++) {
            arrayFromOneToThousand[i - 1] = i;
        }
        System.out.println(Arrays.toString(arrayFromOneToThousand));

        System.out.println("\nTask 3: Create an array and fill it with odd numbers from -20:20");
        int[] arrayOfOddNumbers = new int[20];
        int oddCount = 0;
        for (int i = -19; i <= 19; i += 2) {
            arrayOfOddNumbers[oddCount++] = i;
        }
        System.out.println(Arrays.toString(arrayOfOddNumbers));

        System.out.println("\nTask 4: Create an array and fill it. Print all elements which can be divided by 5.");
        int[] integerArray = {78, 5, 4, 45, 87, 212, 15, -555, 78, 10, 50, 3};
        for (int i = 0; i < integerArray.length; i++) {
            if (integerArray[i] % 5 == 0) {
                System.out.print(integerArray[i] + " ");
            }
        }

        System.out.println("\n\nTask 5: Create an array and fill it. Print all elements which are between 24.12 and 467.23");
        double[] doubleArray = {2.7, 78.65, -8.4, 20.56, 365.784, 100.0, 65.7, 254.6, 1045.8};
        for (int i = 0; i < doubleArray.length; i++) {
            if (doubleArray[i] < 467.23 && doubleArray[i] > 24.12) {
                System.out.print(doubleArray[i] + " ");
            }
        }

        System.out.println("\n\nTask 6: Create an array and fill it. Print count of elements which can be divided by 2");
        int counterOfTwos = 0;
        for (int i = 0; i < integerArray.length; i++) {
            if (integerArray[i] % 2 == 0) {
                counterOfTwos++;
            }
        }
        System.out.println(counterOfTwos);

        System.out.println("\nTask 7: Given an integer, 0< N < 21 , " +
                "print its first 10 multiples.\n" +
                "Each multiple N x i (where 0<i<11) " +
                "should be printed on a new line in the" +
                "form: N x i = result.");
        System.out.println("\ninput: N = 7\nOutput:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("7 x " + i + " = " + 7 * i);
        }

        System.out.println("\nExtra task: Check if a number is an exact power of two");
        int[] randomNumbers = {12, 8, 3, 4, 16, 1, 0};
        for (int i = 0; i < randomNumbers.length; i++) {
            int result = randomNumbers[i];
            while (result > 2) {
                result /= 2;
            }
            if (result == 2 || randomNumbers[i] == 1 || randomNumbers[i] == 0) {
                System.out.print(randomNumbers[i] + " ");
            }
        }

        System.out.println("\nBy Bitwise Operator");
        for (int i = 0; i < randomNumbers.length; i++) {
            if ((randomNumbers[i] - 1 & randomNumbers[i]) == 0) {
                System.out.print(randomNumbers[i] + " ");
            }
        }

    }
}
