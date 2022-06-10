package course;

import entities.PrintServices;

import java.util.Scanner;

public class ProgramPrintService {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PrintServices<String> printService = new PrintServices<>();

        System.out.print("How many values");
        int n = sc.nextInt();

        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String value = sc.nextLine();
            printService.addValue(value);
        }

        printService.print();
        String x = printService.first();
        System.out.println("First: " + printService.first());
        sc.close();
    }
}
