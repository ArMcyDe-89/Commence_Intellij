public class S1L1 {

    // TASK 10
    // > int hungry;
    // > int 2AB;                // variable name cannot start with a number
    // > int 312.2;              // variable name cannot start with a number
    // > int MOBILE;
    // > int "Ans";              // variable name cannot start with punctuation marks
    // > int $30;
    // > int Yes/No;             // variable name cannot have punctuation marks
    // > int student-id;         // variable name cannot have punctuation marks
    // > int A+3;                // variable name cannot have punctuation marks
    // > int 'X';                // variable name cannot start with punctuation marks
    // > int return;             // variable cannot be a reserved word
}

/* ========================= TASK 11 ========================= */

class Task11 {

    public static void main(String[] args) {

        int num_1 = 20;
        System.out.println("The first number is - " + num_1);

        int num_2 = 10;
        System.out.println("The second number is - " + num_2);

        int sum = num_1 + num_2;
        System.out.println("The sum of the first and second number is = " + sum);
        System.out.println("The product is = " + (num_1 * num_2));
        System.out.println("The quotient is = " + (num_1 / num_2));

        double num_3 = 2.2;
        double num_4 = 3.3;

        System.out.println("The third number is - " + num_3);
        System.out.println("The fourth number is - " + num_4);
        System.out.println("The sum of the third and fourth number is = " + (num_3 + num_4));
        System.out.println("The product of the third and fourth number is = " + (num_3 * num_4));
        System.out.println("The division of the third and fourth number is = " + (num_3 / num_4));

        System.out.println("The sum of the first and third number is = " + (num_1 + num_3));
        System.out.println("The product of the first and third number is = " + (num_1 * num_3));
        System.out.println("The division of the first and third number is = " + (num_1 / num_3));

        String w1 = "JAVA";
        String w2 = "Programming";

        System.out.println(w1);
        System.out.println(w1 + w2);
        System.out.println(num_1 + w2);
        System.out.println(w1 + num_2);
    }
}

/* ========================= TASK 12 ========================= */

class Task12 {

    public static void main(String[] args) {

        int r = 4;
        double area = Math.PI * r * r;

        System.out.println("The area of the circle is = " + area + " square units");
    }
}

/* ========================= TASK 13 ========================= */

class Task13 {

    public static void main(String[] args) {

        int num = 83425286;

        int lastDigit = num % 10;
        int secondLastDigit = (num % 100) / 10;

        System.out.println("The last digit of the integer is - " + lastDigit);
        System.out.println("The second to last digit of the integer is - " + secondLastDigit);
    }
}

/* ========================= TASK 14 ========================= */

class Task14 {

    public static void main(String[] args) {

        int inch = 1000;
        double meter = inch * 0.0254;

        System.out.println("A thousand inches in meters is = " + meter + " meters");
    }
}

/* ========================= TASK 15 ========================= */

class Task15 {

    public static void main(String[] args) {

        // (a) Using a third variable
        int num_1 = 5;
        int num_2 = 8;
        int temp = num_1;

        num_1 = num_2;
        num_2 = temp;

        System.out.println("The first number is - " + num_1);
        System.out.println("The second number is - " + num_2);

        // (b) Without using a third variable
        int num_4 = 78;
        int num_5 = 49;

        num_4 = num_4 + num_5;
        num_5 = num_4 - num_5;
        num_4 = num_4 - num_5;

        System.out.println("The fourth number is - " + num_4);
        System.out.println("The fifth number is - " + num_5);
    }
}

/* ========================= TASK 16 ========================= */

class Task16 {

    public static void main(String[] args) {

        int minutes = 3_456_789;

        int years = minutes / (1440 * 365);
        int days = (minutes % (1440 * 365)) / 1440;

        System.out.println(
            "3456789 minutes converted to years and days are "
                + years + " years and " + days + " days"
        );
    }
}

/* ========================= TASK 17 ========================= */

class Task17 {

    public static void main(String[] args) {

        int a = 2;
        int b = 5;
        int c = 8;

        double d = (2 * b * ((c - a) / 3.0)) + 7;

        System.out.println("The value of d is = " + d);
    }
}

/* ========================= TASK 18 ========================= */

class Task18 {

    public static void main(String[] args) {

        int id = 24201277;

        int lastDigit = id % 10;
        int secondLastDigit = (id % 100) / 10;

        System.out.println("The last digit of the ID is - " + lastDigit);
        System.out.println("The second to last digit of the ID is - " + secondLastDigit);
    }
}

/* ========================= TASK 19 ========================= */

class Task19 {

    public static void main(String[] args) {

        int a = 8;
        int b = 3;

        int e = a / 2;
        double c = Math.sqrt((e * e) + (b * b));

        double circumference = 6 * c;
        double area = (2 * (0.5 * a * b)) + (c * a);

        System.out.println("The side length of the hexagon is - " + c + " units");
        System.out.println("The circumference of the hexagon is - " + circumference + " units");
        System.out.println("The area of the hexagon is - " + area + " square units");
    }
}

/* ========================= TASK 20 ========================= */

class Task20 {

    public static void main(String[] args) {

        double a = 4.5;
        double b = 9.5;

        double c = Math.sqrt((a * a) + (b * b));

        double sinA = a / c;
        double sinB = b / c;
        double cosA = b / c;
        double cosB = a / c;

        System.out.println("The value of sin(A) is - " + sinA);
        System.out.println("The value of sin(B) is - " + sinB);
        System.out.println("The value of cos(A) is - " + cosA);
        System.out.println("The value of cos(B) is - " + cosB);
    }
}
