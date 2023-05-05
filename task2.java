
// К калькулятору из предыдущего дз добавить логирование.
import java.io.IOException;
import java.util.logging.*;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(task2.class.getName());
        FileHandler fh = new FileHandler("log1.txt");
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        logger.setLevel(Level.INFO);
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = iScanner.nextInt();
        System.out.println();
        System.out.print("Введите операцию: ");
        char b = iScanner.next().charAt(0);
        System.out.println();
        System.out.print("Введите второе число: ");
        int c = iScanner.nextInt();
        int d = 0;
        if (b == '+') {
            d = a + c;
        } else if (b == '-') {
            d = a - c;
        } else if (b == '*') {
            d = a * c;
        } else if (b == '/') {
            d = a / c;
        }
        System.out.println();
        System.out.printf("Ответ: %d ", d);
        System.out.println();
        System.out.println();
        logger.info(Integer.toString(a) + " " + Character.toString(b) + " "
                + Integer.toString(c) + " " + "=" + " " + Integer.toString(d));
        iScanner.close();
    }
}
