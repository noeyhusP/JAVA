package printerEx;

import java.util.Scanner;

public class PrintApp {
    public static void main(String[] args) {
        // Printer prt = new LGPrinter();

        Scanner scan = new Scanner(System.in);

        System.out.println("1. EPSON | 2. HP | 3. SAMSUNG | 4. LG");
        System.out.printf("사용할 프린터를 입력하세요 > ");

        int type = scan.nextInt();

        Printer prt = null;

        switch(type)
        {
            case 1 :
                prt = new ESPrinter();
                break;

            case 2 :
                prt = new HPPrinter();
                
                break;
            case 3 :
                prt = new SSPrinter();
                
                break;
            case 4 :
                prt = new LGPrinter();
                
                break;
        }
        prt.init();
        prt.stop();
    }
}
