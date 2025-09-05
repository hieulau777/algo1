package algo;

import java.util.Scanner;

public class InputHelper {
    public static int checkInteger(String message) {
        while (true) {
            System.out.print(message);
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                int value = scanner.nextInt();
                return value;
            } else {
                System.out.println("Giá trị nhập vào không phải là số nguyên. Vui lòng nhập lại.");
                scanner.next();
            }
        }
    }
//    
//    public static double checkDouble(String message) {
//        while (true) {
//            System.out.print(message);
//            Scanner scanner = new Scanner(System.in);
//            if (scanner.hasNextInt()) {
//                double value = scanner.nextInt();
//                return value;
//            } else {
//                System.out.println("Giá trị nhập vào không phải là số thực. Vui lòng nhập lại.");
//                scanner.next();
//            }
//        }
//    }
}
