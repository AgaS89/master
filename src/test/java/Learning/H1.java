package Learning;

import java.util.Scanner;

public class H1 {

        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();


    }

public void task1(int n){
        if (n%2!=0){
            System.out.println("Weird");
        }else {
            if (n >= 2 && n<= 5){
                System.out.println("Not Weird");
            }else if (n > 20){
                System.out.println("Not Werid");
            }

        }
    }
}
