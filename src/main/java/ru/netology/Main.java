package ru.netology;
import ru.netology.javapackage.services.SQRService;

public class Main {

    public static void main(String[] args) {
        SQRService service = new SQRService();
        int start = 100;
        int end = 200;
        int expected = 3;

        long result = service.calculate(start, end);
        System.out.println("1. " + expected + " == ? == " + result);
    }
}
