public class S1L3 {

    // TASK_1: Multiples of 9
    public static class lab3task1 {
        public static void main(String[] args) {
            for (int i = 2; i <= 7; i++) {
                if (i < 7) {
                    System.out.print(9 * i + ", ");
                } else if (i == 7) {
                    System.out.println(9 * i);
                }
            }
        }
    }

    // TASK_2: Alternating Multiples of 9
    public static class lab3task2 {
        public static void main(String[] args) {
            for (int i = 2; i <= 7; i++) {
                if (i < 7 && i % 2 != 0) {
                    System.out.print(-9 * i + ", ");
                } else if (i < 7 && i % 2 == 0) {
                    System.out.print(9 * i + ", ");
                } else if (i == 7) {
                    System.out.println(-9 * i);
                }
            }
        }
    }

    // TASK_3: Sum divisible by 7 AND 9
    public static class lab3task3 {
        public static void main(String[] args) {
            int sum = 0;
            for (int i = 1; i <= 600; i++) {
                if (i % 7 == 0 && i % 9 == 0) {
                    sum += i;
                }
            }
            System.out.println(sum);
        }
    }

    // TASK_4: Sum divisible by 7 OR 9
    public static class lab3task4 {
        public static void main(String[] args) {
            int sum = 0;
            for (int i = 1; i <= 600; i++) {
                if (i % 7 == 0 || i % 9 == 0) {
                    sum += i;
                }
            }
            System.out.println(sum);
        }
    }

    // TASK_5: Sum divisible by 7 OR 9, but not both
    public static class lab3task5 {
        public static void main(String[] args) {
            int sum = 0;
            for (int i = 1; i <= 600; i++) {
                if ((i % 7 == 0 || i % 9 == 0) && !(i % 7 == 0 && i % 9 == 0)) {
                    sum += i;
                }
            }
            System.out.println(sum);
        }
    }

    // TASK_6: Alternating squares sum
    public static class lab3task6 {
        public static void main(String[] args) {
            int[] limits = {5, 10, 20};
            for (int limit : limits) {
                int y = 0;
                for (int n = 1; n <= limit; n++) {
                    if (n % 2 == 0) y -= Math.pow(n, 2);
                    else y += Math.pow(n, 2);
                }
                System.out.println(y);
            }
        }
    }

    // TASK_7: Divisors count
    public static class lab3task7 {
        public static void main(String[] args) {
            int num = 6;
            int count = 0;
            System.out.println("Divisors of 6: ");
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    System.out.println(i);
                    count++;
                }
            }
            System.out.println("Total divisors: " + count);
        }
    }

    // TASK_8: Sum of N odd natural numbers
    public static class lab3task8 {
        public static void main(String[] args) {
            int sum = 0, n = 0;
            System.out.println("The odd numbers are: ");
            for (int i = 1; n < 5; i++) {
                if (i % 2 != 0) {
                    sum += i;
                    System.out.println(i);
                    n++;
                }
            }
            System.out.println("The Sum of odd Natural Numbers up to " + n + " terms is: " + sum);
        }
    }

    // TASK_9: Running sum
    public static class lab3task9 {
        public static void main(String[] args) {
            int sum = 0;
            for (int i = 1; i <= 10; i++) {
                sum += i;
                System.out.println("Current Number: " + i + ", Sum: " + sum);
            }
        }
    }

    // TASK_10: Multiples of 5 but not 3
    public static class lab3task10 {
        public static void main(String[] args) {
            int n = 40;
            for (int i = 0; i <= n; i++) {
                if ((i % 5 == 0) && !(i % 3 == 0)) {
                    System.out.println(i);
                }
            }
        }
    }

    // TASK_11: Digits count
    public static class lab3task11 {
        public static void main(String[] args) {
            int num = 7546;
            int digits = 0;
            while (num > 0) {
                num = num / 10;
                digits++;
            }
            System.out.println("Total digits = " + digits);
        }
    }

    // TASK_12: Print digits from last to first
    public static class lab3task12 {
        public static void main(String[] args) {
            int val = 32768, digits = 0;
            int copy = val;
            while (val != 0) {
                val /= 10;
                digits++;
            }
            for (int k = 1; k <= digits; k++) {
                int rem = copy % 10;
                copy /= 10;
                if (k == digits) System.out.println(rem);
                else System.out.print(rem + ", ");
            }
        }
    }

    // TASK_13: Print digits from first to last
    public static class lab3task13 {
        public static void main(String[] args) {
            int num = 32768, copy = num, digits = 0, divider = 1;
            while (num != 0) {
                num /= 10;
                digits++;
            }
            for (int i = 1; i < digits; i++) divider *= 10;
            for (int k = 1; k <= digits; k++) {
                int quot = copy / divider;
                copy %= divider;
                divider /= 10;
                if (k == digits) System.out.println(quot);
                else System.out.print(quot + ", ");
            }
        }
    }

    // TASK_14: Prime number check
    public static class lab3task14 {
        public static void main(String[] args) {
            int num = 7, count = 0;
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) count++;
            }
            if (count == 2) System.out.println(num + " is a prime number.");
            else System.out.println(num + " is not a prime number.");
        }
    }

    // TASK_15: Perfect number check
    public static class lab3task15 {
        public static void main(String[] args) {
            int num = 6, sum = 0;
            for (int i = 1; i < num; i++) {
                if (num % i == 0) sum += i;
            }
            if (sum == num) System.out.println(num + " is a perfect number.");
            else System.out.println(num + " is not a perfect number.");
        }
    }
}