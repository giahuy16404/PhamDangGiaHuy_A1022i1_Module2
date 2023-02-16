package homework.ss02_introduction_to_java.Exercise;

public class PrimeNumberDisplay {
    public static void main(String[] args) {

        int number = 2;
        int count = 0;
        while (count != 20) {
            boolean check = true;
            int i = 2;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.println(number);
                count++;
            }
            number++;
        }
    }
}

