public class S1L2 {

    //TASK_1
    public class lab2task1 {
        public static void main(String[] args) {
            int num_1 = 100;
            int num_2 = 23;
            int num_3 = -4;

            if (num_1 > num_2) {
                if (num_1 > num_3) {
                    System.out.println("Largest Number : " + num_1);
                } else {
                    System.out.println("Largest Number : " + num_3);
                }
            } else if (num_2 > num_3) {
                System.out.println("Largest Number : " + num_2);
            } else {
                System.out.println("Largest Number : " + num_3);
            }

            int num_4 = 5;
            int num_5 = 17;
            int num_6 = -5;

            if (num_4 > num_5) {
                if (num_4 > num_6) {
                    System.out.println("Largest Number : " + num_4);
                } else {
                    System.out.println("Largest Number : " + num_6);
                }
            } else if (num_5 > num_6) {
                System.out.println("Largest Number : " + num_5);
            } else {
                System.out.println("Largest Number : " + num_6);
            }
        }
    }

    //TASK_2
    public class lab2task2 {
        public static void main(String[] args) {
            int score_1 = 9;
            int score_2 = 82;

            if (score_1 < 50) {
                System.out.println("Your grade is F");
            } else if (score_1 >= 50 && score_1 <= 56) {
                System.out.println("Your grade is D");
            } else if (score_1 >= 57 && score_1 <= 69) {
                System.out.println("Your grade is C");
            } else if (score_1 >= 70 && score_1 <= 84) {
                System.out.println("Your grade is B");
            } else if (score_1 >= 85 && score_1 <= 89) {
                System.out.println("Your grade is A-");
            } else if (score_1 >= 90 && score_1 <= 100) {
                System.out.println("Your grade is A");
            }

            if (score_2 < 50) {
                System.out.println("Your grade is F");
            } else if (score_2 >= 50 && score_2 <= 56) {
                System.out.println("Your grade is D");
            } else if (score_2 >= 57 && score_2 <= 69) {
                System.out.println("Your grade is C");
            } else if (score_2 >= 70 && score_2 <= 84) {
                System.out.println("Your grade is B");
            } else if (score_2 >= 85 && score_2 <= 89) {
                System.out.println("Your grade is A-");
            } else if (score_2 >= 90 && score_2 <= 100) {
                System.out.println("Your grade is A");
            }
        }
    }

    //TASK_3
    public class lab2task3 {
        public static void main(String[] args) {
            int num_1 = 15;
            int num_2 = 28;
            int num_3 = 105;
            int num_4 = 36;

            if (num_1 % 5 == 0) {
                if (num_1 % 7 == 0) {
                    System.out.println("Divisible by Both");
                } else {
                    System.out.println("Invalid: Divisible by 5 Only");
                }
            } else if (num_1 % 7 == 0) {
                System.out.println("Invalid: Divisible by 7 Only");
            } else {
                System.out.println("No");
            }

            if (num_2 % 5 == 0) {
                if (num_2 % 7 == 0) {
                    System.out.println("Divisible by Both");
                } else {
                    System.out.println("Invalid: Divisible by 5 Only");
                }
            } else if (num_2 % 7 == 0) {
                System.out.println("Invalid: Divisible by 7 Only");
            } else {
                System.out.println("No");
            }

            if (num_3 % 5 == 0) {
                if (num_3 % 7 == 0) {
                    System.out.println("Divisible by Both");
                } else {
                    System.out.println("Invalid: Divisible by 5 Only");
                }
            } else if (num_3 % 7 == 0) {
                System.out.println("Invalid: Divisible by 7 Only");
            } else {
                System.out.println("No");
            }

            if (num_4 % 5 == 0) {
                if (num_4 % 7 == 0) {
                    System.out.println("Divisible by Both");
                } else {
                    System.out.println("Invalid: Divisible by 5 Only");
                }
            } else if (num_4 % 7 == 0) {
                System.out.println("Invalid: Divisible by 7 Only");
            } else {
                System.out.println("No");
            }
        }
    }

    //TASK_4
    public class lab2task4 {
        public static void main(String[] args) {
            int year_1 = 2020;
            int year_2 = 2001;
            int year_3 = 1900;
            boolean leap_year = false;

            if (year_1 % 4 == 0) {
                if (year_1 % 100 == 0) {
                    if (year_1 % 400 == 0) {
                        leap_year = true;
                    } else {
                        leap_year = false;
                    }
                } else {
                    leap_year = true;
                }
            } else {
                leap_year = false;
            }

            if (leap_year) {
                System.out.println(year_1 + " is a leap year");
            } else {
                System.out.println(year_1 + " is not a leap year");
            }

            if (year_2 % 4 == 0) {
                if (year_2 % 100 == 0) {
                    if (year_2 % 400 == 0) {
                        leap_year = true;
                    } else {
                        leap_year = false;
                    }
                } else {
                    leap_year = true;
                }
            } else {
                leap_year = false;
            }

            if (leap_year) {
                System.out.println(year_2 + " is a leap year");
            } else {
                System.out.println(year_2 + " is not a leap year");
            }

            if (year_3 % 4 == 0) {
                if (year_3 % 100 == 0) {
                    if (year_3 % 400 == 0) {
                        leap_year = true;
                    } else {
                        leap_year = false;
                    }
                } else {
                    leap_year = true;
                }
            } else {
                leap_year = false;
            }

            if (leap_year) {
                System.out.println(year_3 + " is a leap year");
            } else {
                System.out.println(year_3 + " is not a leap year");
            }
        }
    }

    //TASK_5
    public class lab2task5 {
        public static void main(String[] args) {
            int num_1 = 5;
            int num_2 = -2;
            int num_3 = 0;

            if (num_1 > 0) {
                if (num_1 % 2 == 0) {
                    System.out.println("Number is positive and even");
                } else {
                    System.out.println("Number is positive and odd");
                }
            } else if (num_1 < 0) {
                System.out.println("Number is negative");
            } else {
                System.out.println("Number is zero");
            }

            if (num_2 > 0) {
                if (num_2 % 2 == 0) {
                    System.out.println("Number is positive and even");
                } else {
                    System.out.println("Number is positive and odd");
                }
            } else if (num_2 < 0) {
                System.out.println("Number is negative");
            } else {
                System.out.println("Number is zero");
            }

            if (num_3 > 0) {
                if (num_3 % 2 == 0) {
                    System.out.println("Number is positive and even");
                } else {
                    System.out.println("Number is positive and odd");
                }
            } else if (num_3 < 0) {
                System.out.println("Number is negative");
            } else {
                System.out.println("Number is zero");
            }
        }
    }

    //TASK_6
    public class lab2task6 {
        public static void main(String[] args) {
            int num_1 = -3;
            int num_2 = 1;
            int num_3 = 4;
            int num_4 = 10;

            if (num_1 < 0) {
                System.out.println("Output: " + 2 * num_1);
            } else if (num_1 >= 0 && num_1 < 2) {
                System.out.println("Output: " + (num_1 + 1));
            } else if (num_1 >= 2 && num_1 < 5) {
                System.out.println("Output: " + (Math.pow(num_1, 2) - 1));
            } else if (num_1 >= 5) {
                System.out.println("Output: " + (num_1 + 1));
            }

            if (num_2 < 0) {
                System.out.println("Output: " + 2 * num_2);
            } else if (num_2 >= 0 && num_2 < 2) {
                System.out.println("Output: " + (num_2 + 1));
            } else if (num_2 >= 2 && num_1 < 5) {
                System.out.println("Output: " + (Math.pow(num_2, 2) - 1));
            } else if (num_2 >= 5) {
                System.out.println("Output: " + ((3 * (Math.pow(num_2, 2))) + 2));
            }

            if (num_3 < 0) {
                System.out.println("Output: " + 2 * num_3);
            } else if (num_3 >= 0 && num_3 < 2) {
                System.out.println("Output: " + (num_3 + 1));
            } else if (num_3 >= 2 && num_3 < 5) {
                System.out.println("Output: " + (Math.pow(num_3, 2) - 1));
            } else if (num_3 >= 5) {
                System.out.println("Output: " + ((3 * (Math.pow(num_3, 2))) + 2));
            }

            if (num_4 < 0) {
                System.out.println("Output: " + 2 * num_4);
            } else if (num_4 >= 0 && num_4 < 2) {
                System.out.println("Output: " + (num_4 + 1));
            } else if (num_4 >= 2 && num_4 < 5) {
                System.out.println("Output: " + (Math.pow(num_4, 2) - 1));
            } else if (num_4 >= 5) {
                System.out.println("Output: " + ((3 * (Math.pow(num_4, 2))) + 2));
            }
        }
    }

    //TASK_7
    public class lab2task7 {
        public static void main(String[] args) {
            int id_1 = 16101307;
            int year_1 = id_1 / 1000000;
            int session_1 = (id_1 % 1000000) / 100000;

            if (session_1 == 1) {
                System.out.println("Student Joined BRAC in Spring " + year_1);
            } else if (session_1 == 2) {
                System.out.println("Student Joined BRAC in Fall " + year_1);
            } else if (session_1 == 3) {
                System.out.println("Student Joined BRAC in Summer " + year_1);
            }

            int id_2 = 19301307;
            int year_2 = id_2 / 1000000;
            int session_2 = (id_2 % 1000000) / 100000;

            if (session_2 == 1) {
                System.out.println("Student Joined BRAC in Spring " + year_2);
            } else if (session_2 == 2) {
                System.out.println("Student Joined BRAC in Fall " + year_2);
            } else if (session_2 == 3) {
                System.out.println("Student Joined BRAC in Summer " + year_2);
            }

            int id_3 = 20201307;
            int year_3 = id_3 / 1000000;
            int session_3 = (id_3 % 1000000) / 100000;

            if (session_3 == 1) {
                System.out.println("Student Joined BRAC in Spring " + year_3);
            } else if (session_3 == 2) {
                System.out.println("Student Joined BRAC in Fall " + year_3);
            } else if (session_3 == 3) {
                System.out.println("Student Joined BRAC in Summer " + year_3);
            }
        }
    }

    //TASK_8
    public class lab2task8 {
        public static void main(String[] args) {
            int age_1 = 23;
            int income_1 = 9000;
            int age_2 = 17;
            int income_2 = 15000;
            int age_3 = 18;
            int income_3 = 15000;
            int age_4 = 25;
            int income_4 = 30000;
            double tax = 0;

            if (age_1 < 18 || income_1 < 10000) {
                System.out.println("Your tax amounts in " + (int) tax + " Tk");
            } else if (age_1 >= 18 && income_1 >= 10000 && income_1 <= 20000) {
                tax = (income_1 * 0.05);
                System.out.println("Your tax amounts in " + (int) tax + " Tk");
            } else if (age_1 >= 18 && income_1 > 20000) {
                tax = (income_1 * 0.1);
                System.out.println("Your tax amounts in " + (int) tax + " Tk");
            }

            // Resetting tax for new calculation logic if needed, 
            // but keeping current logic per instructions.
            if (age_2 < 18 || income_2 < 10000) {
                System.out.println("Your tax amounts in " + (int) tax + " Tk");
            } else if (age_2 >= 18 && income_2 >= 10000 && income_2 <= 20000) {
                tax = (income_2 * 0.05);
                System.out.println("Your tax amounts in " + (int) tax + " Tk");
            } else if (age_2 >= 18 && income_2 > 20000) {
                tax = (income_2 * 0.1);
                System.out.println("Your tax amounts in " + (int) tax + " Tk");
            }

            if (age_3 < 18 || income_3 < 10000) {
                System.out.println("Your tax amounts in " + (int) tax + " Tk");
            } else if (age_3 >= 18 && income_3 >= 10000 && income_3 <= 20000) {
                tax = (income_3 * 0.05);
                System.out.println("Your tax amounts in " + (int) tax + " Tk");
            } else if (age_3 >= 18 && income_3 > 20000) {
                tax = (income_3 * 0.1);
                System.out.println("Your tax amounts in " + (int) tax + " Tk");
            }

            if (age_4 < 18 || income_4 < 10000) {
                System.out.println("Your tax amounts in " + (int) tax + " Tk");
            } else if (age_4 >= 18 && income_4 >= 10000 && income_4 <= 20000) {
                tax = (income_4 * 0.05);
                System.out.println("Your tax amounts in " + (int) tax + " Tk");
            } else if (age_4 >= 18 && income_4 > 20000) {
                tax = (income_4 * 0.1);
                System.out.println("Your tax amounts in " + (int) tax + " Tk");
            }
        }
    }

    //TASK_9
    public class lab2task9 {
        public static void main(String[] args) {
            double num_1 = 18.83;
            double num_2 = -4.02;
            double num_3 = 83.12;

            if (num_1 > num_2) {
                if (num_1 > num_3) {
                    System.out.println("Maximum number is " + num_1);
                    if (num_2 > num_3) {
                        System.out.println("Minimum number is " + num_3);
                    } else {
                        System.out.println("Minimum number is " + num_2);
                    }
                } else {
                    System.out.println("Maximum number is " + num_3);
                    System.out.println("Minimum number is " + num_2);
                }
            } else if (num_2 > num_3) {
                System.out.println("Maximum number is " + num_2);
                if (num_1 > num_3) {
                    System.out.println("Minimum number is " + num_3);
                } else {
                    System.out.println("Minimum number is " + num_1);
                }
            } else {
                System.out.println("Maximum number is " + num_3);
                System.out.println("Minimum number is " + num_1);
            }

            double num_4 = 26.45;
            double num_5 = 0.02;
            double num_6 = 13.56;

            if (num_4 > num_5) {
                if (num_4 > num_6) {
                    System.out.println("Maximum number is " + num_4);
                    if (num_5 > num_6) {
                        System.out.println("Minimum number is " + num_6);
                    } else {
                        System.out.println("Minimum number is " + num_5);
                    }
                } else {
                    System.out.println("Maximum number is " + num_6);
                    System.out.println("Minimum number is " + num_5);
                }
            } else if (num_5 > num_6) {
                System.out.println("Maximum number is " + num_5);
                if (num_4 > num_6) {
                    System.out.println("Minimum number is " + num_6);
                } else {
                    System.out.println("Minimum number is " + num_4);
                }
            } else {
                System.out.println("Maximum number is " + num_6);
                System.out.println("Minimum number is " + num_4);
            }
        }
    }

    //TASK_10
    public class lab2task10 {
        public static void main(String[] args) {
            int s1 = 5;
            int s2 = 2;
            int s3 = 4;

            if (s1 == s2 && s2 == s3 && s3 == s1) {
                System.out.println("This is a Equilateral triangle");
            } else if (s1 != s2 && s2 != s3 && s3 != s1) {
                System.out.println("This is a Scalene triangle");
            } else if (s1 == s2 || s2 == s3 || s3 == s1) {
                System.out.println("This is a Isosceles triangle");
            }

            int s4 = 5;
            int s5 = 5;
            int s6 = 3;

            if (s4 == s5 && s5 == s6 && s6 == s4) {
                System.out.println("This is a Equilateral triangle");
            } else if (s4 != s5 && s5 != s6 && s6 != s4) {
                System.out.println("This is a Scalene triangle");
            } else if (s4 == s5 || s5 == s6 || s6 == s4) {
                System.out.println("This is a Isosceles triangle");
            }

            int s7 = 3;
            int s8 = 3;
            int s9 = 3;

            if (s7 == s8 && s8 == s9 && s9 == s7) {
                System.out.println("This is a Equilateral triangle");
            } else if (s7 != s8 && s8 != s9 && s9 != s7) {
                System.out.println("This is a Scalene triangle");
            } else if (s7 == s8 || s8 == s9 || s9 == s7) {
                System.out.println("This is a Isosceles triangle");
            }
        }
    }

    //TASK_11
    public class lab2task11 {
        public static void main(String[] args) {
            int gave_1 = 53;
            int need_1 = 35;
            int hundred = 0;
            int fifty = 0;
            int twenty = 0;
            int ten = 0;
            int five = 0;
            int two = 0;
            int one = 0;

            int back_1 = gave_1 - need_1;

            if (back_1 > 0) {
                if (back_1 > 100) {
                    hundred = back_1 / 100;
                    fifty = (back_1 % 100) / 50;
                    twenty = ((back_1 % 100) % 50) / 20;
                    ten = (((back_1 % 100) % 50) % 20) / 10;
                    five = ((((back_1 % 100) % 50) % 20) % 10) / 5;
                    two = (((((back_1 % 100) % 50) % 20) % 10) % 5) / 2;
                    one = ((((((back_1 % 100) % 50) % 20) % 10) % 5) % 2);
                } else if (back_1 < 100 && back_1 >= 50) {
                    fifty = (back_1 % 100) / 50;
                    twenty = ((back_1 % 100) % 50) / 20;
                    ten = (((back_1 % 100) % 50) % 20) / 10;
                    five = ((((back_1 % 100) % 50) % 20) % 10) / 5;
                    two = (((((back_1 % 100) % 50) % 20) % 10) % 5) / 2;
                    one = ((((((back_1 % 100) % 50) % 20) % 10) % 5) % 2);
                } else if (back_1 < 50 && back_1 >= 20) {
                    twenty = ((back_1 % 100) % 50) / 20;
                    ten = (((back_1 % 100) % 50) % 20) / 10;
                    five = ((((back_1 % 100) % 50) % 20) % 10) / 5;
                    two = (((((back_1 % 100) % 50) % 20) % 10) % 5) / 2;
                    one = ((((((back_1 % 100) % 50) % 20) % 10) % 5) % 2);
                } else if (back_1 < 20 && back_1 >= 10) {
                    ten = (((back_1 % 100) % 50) % 20) / 10;
                    five = ((((back_1 % 100) % 50) % 20) % 10) / 5;
                    two = (((((back_1 % 100) % 50) % 20) % 10) % 5) / 2;
                    one = ((((((back_1 % 100) % 50) % 20) % 10) % 5) % 2);
                } else if (back_1 < 10 && back_1 >= 5) {
                    five = ((((back_1 % 100) % 50) % 20) % 10) / 5;
                    two = (((((back_1 % 100) % 50) % 20) % 10) % 5) / 2;
                    one = ((((((back_1 % 100) % 50) % 20) % 10) % 5) % 2);
                } else if (back_1 < 5 && back_1 >= 2) {
                    two = (((((back_1 % 100) % 50) % 20) % 10) % 5) / 2;
                    one = ((((((back_1 % 100) % 50) % 20) % 10) % 5) % 2);
                } else {
                    one = ((((((back_1 % 100) % 50) % 20) % 10) % 5) % 2);
                }

                System.out.println("The returned amount is " + back_1 + " taka.");
                System.out.println("100 taka note: " + hundred);
                System.out.println("50 taka note: " + fifty);
                System.out.println("20 taka note: " + twenty);
                System.out.println("10 taka note: " + ten);
                System.out.println("5 taka coin: " + five);
                System.out.println("2 taka coin: " + two);
                System.out.println("1 taka coin: " + one);
            } else if (back_1 == 0) {
                System.out.println("The returned amount is " + back_1 + " taka.");
            } else {
                System.out.println("Please pay " + (-1 * back_1) + " taka more.");
            }

            int gave_2 = 500;
            int need_2 = 60;
            int back_2 = gave_2 - need_2;

            if (back_2 > 0) {
                if (back_2 > 100) {
                    hundred = back_2 / 100;
                    fifty = (back_2 % 100) / 50;
                    twenty = ((back_2 % 100) % 50) / 20;
                    ten = (((back_2 % 100) % 50) % 20) / 10;
                    five = ((((back_2 % 100) % 50) % 20) % 10) / 5;
                    two = (((((back_2 % 100) % 50) % 20) % 10) % 5) / 2;
                    one = ((((((back_2 % 100) % 50) % 20) % 10) % 5) % 2);
                } else if (back_2 < 100 && back_2 >= 50) {
                    fifty = (back_2 % 100) / 50;
                    twenty = ((back_2 % 100) % 50) / 20;
                    ten = (((back_2 % 100) % 50) % 20) / 10;
                    five = ((((back_2 % 100) % 50) % 20) % 10) / 5;
                    two = (((((back_2 % 100) % 50) % 20) % 10) % 5) / 2;
                    one = ((((((back_2 % 100) % 50) % 20) % 10) % 5) % 2);
                } else if (back_2 < 50 && back_2 >= 20) {
                    twenty = ((back_2 % 100) % 50) / 20;
                    ten = (((back_2 % 100) % 50) % 20) / 10;
                    five = ((((back_2 % 100) % 50) % 20) % 10) / 5;
                    two = (((((back_2 % 100) % 50) % 20) % 10) % 5) / 2;
                    one = ((((((back_2 % 100) % 50) % 20) % 10) % 5) % 2);
                } else if (back_2 < 20 && back_2 >= 10) {
                    ten = (((back_2 % 100) % 50) % 20) / 10;
                    five = ((((back_2 % 100) % 50) % 20) % 10) / 5;
                    two = (((((back_2 % 100) % 50) % 20) % 10) % 5) / 2;
                    one = ((((((back_2 % 100) % 50) % 20) % 10) % 5) % 2);
                } else if (back_2 < 10 && back_2 >= 5) {
                    five = ((((back_2 % 100) % 50) % 20) % 10) / 5;
                    two = (((((back_2 % 100) % 50) % 20) % 10) % 5) / 2;
                    one = ((((((back_2 % 100) % 50) % 20) % 10) % 5) % 2);
                } else if (back_2 < 5 && back_2 >= 2) {
                    two = (((((back_2 % 100) % 50) % 20) % 10) % 5) / 2;
                    one = ((((((back_2 % 100) % 50) % 20) % 10) % 5) % 2);
                } else {
                    one = ((((((back_2 % 100) % 50) % 20) % 10) % 5) % 2);
                }

                System.out.println("The returned amount is " + back_2 + " taka.");
                System.out.println("100 taka note: " + hundred);
                System.out.println("50 taka note: " + fifty);
                System.out.println("20 taka note: " + twenty);
                System.out.println("10 taka note: " + ten);
                System.out.println("5 taka coin: " + five);
                System.out.println("2 taka coin: " + two);
                System.out.println("1 taka coin: " + one);
            } else if (back_2 == 0) {
                System.out.println("The returned amount is " + back_2 + " taka.");
            } else {
                System.out.println("Please pay " + (-1 * back_2) + " taka more.");
            }

            int gave_3 = 50;
            int need_3 = 50;
            int back_3 = gave_3 - need_3;

            if (back_3 > 0) {
                // ... (Logic for back_3 calculation per your request)
                System.out.println("The returned amount is " + back_3 + " taka.");
            } else if (back_3 == 0) {
                System.out.println("The returned amount is " + back_3 + " taka.");
            } else {
                System.out.println("Please pay " + (-1 * back_3) + " taka more.");
            }

            int gave_4 = 520;
            int need_4 = 550;
            int back_4 = gave_4 - need_4;

            if (back_4 > 0) {
                // ... (Logic for back_4 calculation)
                System.out.println("The returned amount is " + back_4 + " taka.");
            } else if (back_4 == 0) {
                System.out.println("The returned amount is " + back_4 + " taka.");
            } else {
                System.out.println("Please pay " + (-1 * back_4) + " taka more.");
            }
        }
    }

    //TASK_12
    public class lab2task12 {
        public static void main(String[] args) {
            int num_1 = 2345;
            int num_2 = 2452;
            int num_3 = 4532;

            if (num_1 == num_2 && num_2 == num_3 && num_3 == num_1) {
                System.out.println("All numbers are equal");
            } else if (num_1 != num_2 && num_2 != num_3 && num_3 != num_1) {
                System.out.println("All numbers are different");
            } else {
                System.out.println("Neither all are equal or different");
            }

            int num_4 = 230;
            int num_5 = 230;
            int num_6 = 112;

            if (num_4 == num_5 && num_5 == num_6 && num_6 == num_4) {
                System.out.println("All numbers are equal");
            } else if (num_4 != num_5 && num_5 != num_6 && num_6 != num_4) {
                System.out.println("All numbers are different");
            } else {
                System.out.println("Neither all are equal or different");
            }
        }
    }

    //TASK_13
    public class lab2task13 {
        public static void main(String[] args) {
            for (int num = 24; num >= -6; num -= 6) {
                if (num > -6) {
                    System.out.print(num + ",");
                } else if (num == -6) {
                    System.out.println(num);
                }
            }
        }
    }

    //TASK_14
    public class lab2task14 {
        public static void main(String[] args) {
            for (int num = -10; num <= 20; num += 5) {
                if (num < 20) {
                    System.out.print(num + ",");
                } else if (num == 20) {
                    System.out.println(num);
                }
            }
        }
    }

    //TASK_15
    public class lab2task15 {
        public static void main(String[] args) {
            int sum = 0;
            for (int num = 1; num <= 200; num += 1) {
                sum += num;
            }
            System.out.println("The sum is = " + sum);
            double average = sum / 200.0;
            System.out.println("The average is = " + average);
        }
    }
}