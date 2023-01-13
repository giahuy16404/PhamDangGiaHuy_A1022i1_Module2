package Week1.ss02_introduction_to_java.Exercise;
import java.util.Scanner;
public class Mergearray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ dài của mảng 1:");
        int lengthArrOne = sc.nextInt();
        int numberArrOne[] = new int [lengthArrOne];
        System.out.println("Nhập độ dài của mảng 2:");
        int lengthArrTwo = sc.nextInt();
        int numberArrTwo[] = new int[lengthArrTwo];

        for (int i = 0; i <numberArrOne.length ; i++) {
            System.out.println("Nhập giá trị vào mảng 1 tại vị trí "+i);
            numberArrOne[i] = sc.nextInt();
        }

        for (int i = 0; i <numberArrTwo.length ; i++) {
            System.out.println("Nhập giá trị vào mảng 2 trại vị trí "+i);
            numberArrTwo[i] = sc.nextInt();
        }
        int length = numberArrOne.length;
        int lengthNum2 = numberArrTwo.length;
        int numberArrThree[] = new int[length + lengthNum2];

        for (int i = 0; i <length ; i++) {
            numberArrThree[i] = numberArrOne[i];
        }

        for (int i = 0; i <lengthNum2 ; i++) {
            numberArrThree[i + length] = numberArrTwo[i];
        }

        for (int value:numberArrThree) {
            System.out.println(value);
        }
    }
}
