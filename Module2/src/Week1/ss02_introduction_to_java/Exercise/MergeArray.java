package Week1.ss02_introduction_to_java.Exercise;
import java.util.Scanner;
public class MergeArray {
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
        int lengthNumArrOne = numberArrOne.length;
        int lengthNumArrTwo = numberArrTwo.length;
        int numberArrThree[] = new int[lengthNumArrOne + lengthNumArrTwo];

        for (int i = 0; i <lengthNumArrOne ; i++) {
            numberArrThree[i] = numberArrOne[i];
        }

        for (int i = 0; i <lengthNumArrTwo ; i++) {
            numberArrThree[i + lengthNumArrOne] = numberArrTwo[i];
        }

        for (int value:numberArrThree) {
            System.out.println(value);
        }
    }
}
