package Week1.ss01_array_java.Exercise;
import java.util.Scanner;
public class ReadNumber {
    static String sumNumber = "";
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
                                sumNumber = "One";
                                break;
                            case 2:
                                sumNumber = "Two";
                                break;
                            case 3:
                                sumNumber = "Three";
                                break;
                            case 4:
                                sumNumber = "Four";
                                break;
                            case 5:
                                sumNumber = "Five";
                                break;
                            case 6:
                                sumNumber = "Six";
                                break;
                            case 7:
                                sumNumber = "Seven";
                                break;
                            case 8:
                                sumNumber = "Eight";
                                break;
                            case 9:
                                sumNumber = "Nine";
                                break;
                        }

                    } else if (number >= 10 && number < 20) {
                        switch (number) {
                            case 10:
                                sumNumber = "Ten";
                                break;
                            case 11:
                                sumNumber = "Eleven";
                                break;
                            case 12:
                                sumNumber = "Twelve";
                                break;
                            case 13:
                                sumNumber = "thirteen";
                                break;
                            case 14:
                                sumNumber = "Fourteen";
                                break;
                            case 15:
                                sumNumber = "fifteen";
                                break;
                            case 16:
                                sumNumber = "sixteen";
                                break;
                            case 17:
                                sumNumber = "seventeen";
                                break;
                            case 18:
                                sumNumber = "eighteen";
                                break;
                            case 19:
                                sumNumber = "nineteen";
                                break;
                        }
                    } else if (number >= 20 && number < 100) {
                        switch (number / 10) {
                            case 2:
                                sumNumber = "Twenty";
                                break;
                            case 3:
                                sumNumber = "Thirty";
                                break;
                            case 4:
                                sumNumber = "Forty";
                                break;
                            case 5:
                                sumNumber = "Fifty";
                                break;
                            case 6:
                                sumNumber = "Sixty";
                                break;
                            case 7:
                                sumNumber = "seventy";
                                break;
                            case 8:
                                sumNumber = "eighty";
                                break;
                            case 9:
                                sumNumber = "ninety";
                                break;
                        }
                        switch (number % 10) {
                            case 1:
                                sumNumber += "One";
                                break;
                            case 2:
                                sumNumber += "Two";
                                break;
                            case 3:
                                sumNumber += "Three";
                                break;
                            case 4:
                                sumNumber += "Four";
                                break;
                            case 5:
                                sumNumber += "Five";
                                break;
                            case 6:
                                sumNumber += "Six";
                                break;
                            case 7:
                                sumNumber += "Seven";
                                break;
                            case 8:
                                sumNumber += "Eight";
                                break;
                            case 9:
                                sumNumber += "Nine";
                                break;
                        }
                    } else if (number >= 100 && number < 1000) {
                        switch (number / 100) {
                            case 1:
                                sumNumber = "One hundred";
                                break;
                            case 2:
                                sumNumber = "Two hundred";
                                break;
                            case 3:
                                sumNumber = "Three hundred";
                                break;
                            case 4:
                                sumNumber = "Four hundred";
                                break;
                            case 5:
                                sumNumber = "Five hundred";
                                break;
                            case 6:
                                sumNumber = "Six hundred";
                                break;
                            case 7:
                                sumNumber = "Seven hundred";
                                break;
                            case 8:
                                sumNumber = "Eight hundred";
                                break;
                            case 9:
                                sumNumber = "Nine hundred";
                                break;

                        }
                        number = number % 100;
                        switch (number / 10) {
                            case 2:
                                sumNumber += "Twenty";
                                break;
                            case 3:
                                sumNumber += "Thirty";
                                break;
                            case 4:
                                sumNumber += "Forty";
                                break;
                            case 5:
                                sumNumber += "Fifty";
                                break;
                            case 6:
                                sumNumber += "Sixty";
                                break;
                            case 7:
                                sumNumber += "seventy";
                                break;
                            case 8:
                                sumNumber += "eighty";
                                break;
                            case 9:
                                sumNumber += "ninety";
                                break;
                        }
                        switch (number % 10) {
                            case 1:
                                sumNumber += "One";
                                break;
                            case 2:
                                sumNumber += "Two";
                                break;
                            case 3:
                                sumNumber += "Three";
                                break;
                            case 4:
                                sumNumber += "Four";
                                break;
                            case 5:
                                sumNumber += "Five";
                                break;
                            case 6:
                                sumNumber += "Six";
                                break;
                            case 7:
                                sumNumber += "Seven";
                                break;
                            case 8:
                                sumNumber += "Eight";
                                break;
                            case 9:
                                sumNumber += "Nine";
                                break;
                        }

                    }
                    System.out.println(sumNumber);
                    break;
            }

        } while (check < 2);
    }
}