package Week1.ss01_array_java.Exercise;

import java.util.Scanner;

public class ReadNumber {
    static String n = "";
    static int check = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1.Chuong trinh doc so thanh chu");
            System.out.println("2.Exit");
            check = sc.nextInt();
            switch (check) {
                case 1:
                    System.out.println("Nhạp vào số:");
                    int number = sc.nextInt();
                    if (number > 0 && number < 10) {
                        switch (number) {
                            case 1:
                                n = "One";
                                break;
                            case 2:
                                n = "Two";
                                break;
                            case 3:
                                n = "Three";
                                break;
                            case 4:
                                n = "Four";
                                break;
                            case 5:
                                n = "Five";
                                break;
                            case 6:
                                n = "Six";
                                break;
                            case 7:
                                n = "Seven";
                                break;
                            case 8:
                                n = "Eight";
                                break;
                            case 9:
                                n = "Nine";
                                break;
                        }

                    } else if (number >= 10 && number < 20) {
                        switch (number) {
                            case 10:
                                n = "Ten";
                                break;
                            case 11:
                                n = "Eleven";
                                break;
                            case 12:
                                n = "Twelve";
                                break;
                            case 13:
                                n = "thirteen";
                                break;
                            case 14:
                                n = "Fourteen";
                                break;
                            case 15:
                                n = "fifteen";
                                break;
                            case 16:
                                n = "sixteen";
                                break;
                            case 17:
                                n = "seventeen";
                                break;
                            case 18:
                                n = "eighteen";
                                break;
                            case 19:
                                n = "nineteen";
                                break;
                        }
                    } else if (number >= 20 && number < 100) {
                        switch (number / 10) {
                            case 2:
                                n = "Twenty";
                                break;
                            case 3:
                                n = "Thirty";
                                break;
                            case 4:
                                n = "Forty";
                                break;
                            case 5:
                                n = "Fifty";
                                break;
                            case 6:
                                n = "Sixty";
                                break;
                            case 7:
                                n = "seventy";
                                break;
                            case 8:
                                n = "eighty";
                                break;
                            case 9:
                                n = "ninety";
                                break;
                        }
                        switch (number % 10) {
                            case 1:
                                n += "One";
                                break;
                            case 2:
                                n += "Two";
                                break;
                            case 3:
                                n += "Three";
                                break;
                            case 4:
                                n += "Four";
                                break;
                            case 5:
                                n += "Five";
                                break;
                            case 6:
                                n += "Six";
                                break;
                            case 7:
                                n += "Seven";
                                break;
                            case 8:
                                n += "Eight";
                                break;
                            case 9:
                                n += "Nine";
                                break;
                        }
                    } else if (number >= 100 && number < 1000) {
                        switch (number / 100) {
                            case 1:
                                n = "One hundred";
                                break;
                            case 2:
                                n = "Two hundred";
                                break;
                            case 3:
                                n = "Three hundred";
                                break;
                            case 4:
                                n = "Four hundred";
                                break;
                            case 5:
                                n = "Five hundred";
                                break;
                            case 6:
                                n = "Six hundred";
                                break;
                            case 7:
                                n = "Seven hundred";
                                break;
                            case 8:
                                n = "Eight hundred";
                                break;
                            case 9:
                                n = "Nine hundred";
                                break;

                        }
                        number = number % 100;
                        switch (number / 10) {
                            case 2:
                                n += "Twenty";
                                break;
                            case 3:
                                n += "Thirty";
                                break;
                            case 4:
                                n += "Forty";
                                break;
                            case 5:
                                n += "Fifty";
                                break;
                            case 6:
                                n += "Sixty";
                                break;
                            case 7:
                                n += "seventy";
                                break;
                            case 8:
                                n += "eighty";
                                break;
                            case 9:
                                n += "ninety";
                                break;
                        }
                        switch (number % 10) {
                            case 1:
                                n += "One";
                                break;
                            case 2:
                                n += "Two";
                                break;
                            case 3:
                                n += "Three";
                                break;
                            case 4:
                                n += "Four";
                                break;
                            case 5:
                                n += "Five";
                                break;
                            case 6:
                                n += "Six";
                                break;
                            case 7:
                                n += "Seven";
                                break;
                            case 8:
                                n += "Eight";
                                break;
                            case 9:
                                n += "Nine";
                                break;
                        }

                    }
                    System.out.println(n);
                    break;


            }

        } while (check <2);
    }
}