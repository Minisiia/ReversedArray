import java.util.Random;
import java.util.Scanner;

public class ReversedArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введіть довжину початкового масиву");
        int N = scanner.nextInt();
        System.out.println("Введіть індекс елементу масиву, з якого почнеться копіювання");
        int myIndex = scanner.nextInt();
        System.out.println("Введіть розмірність нового масиву");
        int myCount = scanner.nextInt();
        int[] myArray = new int[N];
        System.out.print("Масив із " + N + " елементів: ");
        for (int i = 0; i < N; i++) {
            myArray[i] = random.nextInt(100); // заповнюємо масив цілими числами від 0 до 100
            System.out.print(myArray[i] + " ");
        }
        System.out.print("\nІнвертований масив: ");
        int[] myReverse = myReverse(myArray);
        for (int i = 0; i < N; i++) System.out.print(myReverse[i] + " ");
        System.out.print("\nНовий масив: ");
        int[] subArray = subArray(myArray, myIndex, myCount);
        for (int i = 0; i < myCount; i++) System.out.print(subArray[i] + " ");
    }

    static int[] myReverse(int[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[array.length - 1 - i];
        }
        return result;
    }

    static int[] subArray(int[] array, int index, int count) {
        int[] result = new int[count];
        int indexResult = 0;
        for (int i = index; i < index + count; i++) {
            if (i == array.length) break;
            result[indexResult] = array[i];
            indexResult++;
        }
        if (count > array.length - index) {
            for (int i = array.length - index; i < count; i++) {
                result[i] = 1;
            }
        }
        return result;
    }

}
