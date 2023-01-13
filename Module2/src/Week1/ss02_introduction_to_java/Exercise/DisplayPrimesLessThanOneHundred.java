package Week1.ss02_introduction_to_java.Exercise;

public class DisplayPrimesLessThanOneHundred {
<<<<<<< HEAD
=======
    static  int endLoop;
>>>>>>> origin/main
    public static void main(String[] args) {
        int number = 2;
        while (number <= 100) {
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
            }
            number++;
        }
    }
}
