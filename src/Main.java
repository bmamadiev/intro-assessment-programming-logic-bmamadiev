package src;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Do not directly modify this array!
        final int[] numbers = new int[]{469, 755, 244, 245, 758, 450, 302, 20, 712, 71, 456, 21, 398, 339, 882, 848, 179, 535, 940, 472};

        System.out.println("****Array Analyzer Program****");
        // write your code here

//        The largest number in the array
        int largestNumber = numbers[0];

        for (int index = 0; index < numbers.length; index++) {
            if (numbers[index] > largestNumber) {
                largestNumber = numbers[index];
            }
        }
        System.out.println("Largest number: " + largestNumber);

//        The smallest number in the array
        int smallestNumber = numbers[0];

        for (int index = 0; index < numbers.length; index++) {
            if (numbers[index] < smallestNumber) {
                smallestNumber = numbers[index];
            }
        }
        System.out.println("Smallest number: " + smallestNumber);

//        The sum of all the numbers in the array
        int sumOfNumbers = 0;

        for (int index = 0; index < numbers.length; index++) {
            sumOfNumbers += numbers[index];
        }
        System.out.println("Sum: " + sumOfNumbers);

//        The average value of all the numbers in the array (the sum of all values divided by the number of values)
        double sum = 0;
        double averageNumber = 0;

        for (int index = 0; index < numbers.length; index++) {
            sum += numbers[index];
            averageNumber = sum / 20;
        }
        System.out.println("Average: " + averageNumber);

//        A list of all even numbers in the array
        int[] evenNumbers = new int[12];
        int evenIndex = 0;

        for (int index = 0; index < numbers.length; index++) {
            if (numbers[index] % 2 == 0) {
                evenNumbers[evenIndex] = numbers[index];
                evenIndex++;
            }
        }
        System.out.println("Even numbers: " + Arrays.toString(evenNumbers));

//        A list of all odd numbers in the array
        int[] oddNumbers = new int[8];
        int oddIndex = 0;

        for (int index = 0; index < numbers.length; index++) {
            if (numbers[index] % 2 == 1) {
                oddNumbers[oddIndex] = numbers[index];
                oddIndex++;
            }
        }
        System.out.println("Odd numbers: " + Arrays.toString(oddNumbers));

//        A list of all numbers divisible by 8 in the array
        int[] divisibleByEight = new int[4];
        int indexOfEight = 0;

        for (int index = 0; index < numbers.length; index++) {
            if (numbers[index] % 8 == 0) {
                divisibleByEight[indexOfEight] = numbers[index];
                indexOfEight++;
            }
        }
        System.out.println("Numbers divisible by 8: " + Arrays.toString(divisibleByEight));

// You can create variables to store each result, for example: int largestNumber = 0;


    }
}
