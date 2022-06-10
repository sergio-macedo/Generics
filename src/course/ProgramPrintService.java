package course;

import entities.PrintServiceString;
import entities.PrintServices;

import javax.print.PrintService;
import java.util.Scanner;

public class ProgramPrintService {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PrintServiceString printService = new PrintServiceString();

        System.out.print("How many values");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String value = sc.nextLine();
            printService.addValue(value);
        }

        printService.print();
        System.out.println("First: " + printService.first());
        sc.close();
    }
}
