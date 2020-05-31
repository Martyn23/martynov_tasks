package task_1;

public class NewArrays {
    public static void main(String[] args) {

        int array[] = {10, 15, 3, -4, 7, 2, -2, -5, 29, 23};
        int max = 0;
        int min = 0;

        for (int a = 0; a < array.length; a++) {
            if (array[a] > max) {
                max = array[a];
            }
        }
        for (int b = 0; b < array.length; b++) {
            if (array[b] < min) {
                min = array[b];
            }
        }
        double average = 0;
        if (array.length > 0) {
            double sum = 0;
            for (int j = 0; j < array.length; j++) {
                sum += array[j];
            }
            average = sum / array.length;
        }
        System.out.println("максимальное число в массиве: " + max);
        System.out.println("минимальное число в массиве: " + min);
        System.out.println("среднее значение всех чисел в массиве: " + average);
    }
}