package homework.ss02_introduction_to_java.Exercise;

import java.util.Scanner;

public class EntValueArray {
    //    static int[] numberUpdate;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào độ dài của mảng");// độ dài mảng bandđàu
        int longArr = sc.nextInt();
        int[] numbers = new int[longArr];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Nhập phần tử vào manảng tại vị trí " + i);// Thêm vào mảng;
            numbers[i] = sc.nextInt();
        }
        System.out.println("Nhập vào số cần chèn cần thêm trong mảng");
        int inputIndex = sc.nextInt();
        System.out.println("Nhập vào index cần chèn");
        int index = sc.nextInt();

        int newArr[] = new int[longArr + 1];// tạo mảng mới độ dài +1

        for (int i = 0; i < numbers.length + 1; i++) { //Duyệt mảng với do dài +1
            if (i < index) {
                newArr[i] = numbers[i]; // bé hơn v trí cần chnè thì gán vào
            } else if (i == index) { // bằng thì gán số cần chen;
                newArr[i] = inputIndex;
            } else {
                newArr[i] = numbers[i - 1]; //gán number trừ 1 vì đã gán index vào vị trí i trước đó;
            }
        }
        for (int value : newArr) {  // Duyệt mảng in ra .
            System.out.println(value);
        }
    }
}
