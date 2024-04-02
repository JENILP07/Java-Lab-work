//import java.util.Scanner;
//
//public class NumberProcessor {
//    public static void main(String[] args) {
//        if (args.length == 0) {
//            System.out.println("Usage: java NumberProcessor <num1> <num2> ... <numN>");
//            return;
//        }
//
//        int sum = 0;
//        for (String arg : args) {
//            try {
//                int num = Integer.parseInt(arg);
//                processNumber(num);
//                sum += num;
//            } catch (NumberFormatException e) {
//                System.out.println("Error: Invalid number format for " + arg);
//            } catch (IllegalArgumentException e) {
//                System.out.println("Error: " + e.getMessage() + " for " + arg);
//            }
//        }
//
//        System.out.println("Sum of valid numbers: " + sum);
//    }
//
//    public static void processNumber(int num) {
//        if (num < 0) {
//            throw new IllegalArgumentException("Negative numbers are not allowed");
//        }
//
//        if (num % 10 == 0) {
//            throw new IllegalArgumentException("Number is evenly divisible by 10");
//        }
//
//        if (num > 1000 && num < 2000) {
//            throw new IllegalArgumentException("Number is between 1000 and 2000");
//        }
//
//        if (num > 7000) {
//            throw new IllegalArgumentException("Number is greater than 7000");
//        }
//    }
//}
