import java.util.Scanner;

public class S1L4 {

    // TASK_01: Max, Min, and Average of Even Positive Numbers
    public static class lab4task01 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please give the number of inputs : ");
            int input = sc.nextInt();
            int maxVal = Integer.MIN_VALUE;
            int minVal = Integer.MAX_VALUE;
            int counter = 0;
            double sum = 0;

            for (int n = 1; n <= input; n++) {
                System.out.println("Please give a number : ");
                int num = sc.nextInt();
                if (num > 0 && num % 2 == 0) {
                    if (num > maxVal) maxVal = num;
                    if (num < minVal) minVal = num;
                    counter++;
                    sum += num;
                }
            }
            if (counter > 0) {
                System.out.println(maxVal + " is the max");
                System.out.println(minVal + " is the min");
                System.out.println("Average = " + (sum / counter));
            }
        }
    }

    // TASK_02: Infinite Square Loop until Negative Input
    public static class lab4task02 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            while (true) {
                System.out.println("Enter a number: ");
                int input = sc.nextInt();
                if (input > 0) {
                    System.out.println(Math.pow(input, 2));
                } else if (input < 0) {
                    break;
                }
            }
        }
    }

    // TASK_04: Find N Prime Numbers
    public static class lab4task04 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter the amount of prime numbers: ");
            int N = sc.nextInt();
            int primesFound = 0;
            for (int number = 2; primesFound < N; number++) {
                int count = 0;
                for (int divisor = 1; divisor <= number; divisor++) {
                    if (number % divisor == 0) count++;
                }
                if (count == 2) {
                    System.out.println(number);
                    primesFound++;
                }
            }
        }
    }

    // TASK_09: Right-Aligned Number Triangle
    public static class lab4task09 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the height of the triangle: ");    
            int height = sc.nextInt();
            for (int j = 1; j <= height; j++) {
                for (int spaces = 1; spaces <= (height - j); spaces++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= j; k++) {
                    System.out.print(k);
                }
                System.out.println();
            }
        }
    }

    // TASK_11: Armstrong Numbers in Range
    public static class lab4task11 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter starting number: ");
            int start = sc.nextInt();
            System.out.println("Enter ending number: ");
            int end = sc.nextInt();
            System.out.println("The Armstrong numbers are - ");

            for (int i = start; i <= end; i++) {
                int temp = i, digits = 0, sum = 0;
                // Count digits
                int copy = i;
                while (copy != 0) { copy /= 10; digits++; }
                // Calculate Armstrong sum
                copy = i;
                while (copy != 0) {
                    int lastDigit = copy % 10;
                    sum += Math.pow(lastDigit, digits);
                    copy /= 10;
                }
                if (sum == i) System.out.println(i);
            }
        }
    }
}