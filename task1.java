
// Реализуйте алгоритм сортировки пузырьком числового массива (введён вами),
// результат после каждой итерации запишите в лог-файл.
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.*;

public class task1 {
    public static void main(String[] args) throws IOException {

        Logger logger = Logger.getLogger(task1.class.getName());

        FileHandler fh = new FileHandler("log.txt");
        logger.addHandler(fh);

        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);

        logger.setLevel(Level.INFO);

        int[] arr = { 4, 9, 2, -10, 5, 20, 0 };

        logger.info("Исходный массив: " + Arrays.toString(arr));
        System.out.println();

        bubbleSort(arr);

        System.out.println();
        logger.info("Отсортированный массив: " + Arrays.toString(arr));
    }

    public static int[] bubbleSort(int[] arr) {
        Logger logger = Logger.getLogger(task1.class.getName());
        for (int k = 0; k < arr.length - 1; k++) {

            for (int i = 0; i < arr.length - k - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            logger.info("Промежуточный массив: " + Arrays.toString(arr));
        }
        return arr;
    }
}
