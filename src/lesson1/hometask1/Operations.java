package lesson1.hometask1;

import static lesson1.hometask1.MenuOptions.*;

public class Operations {

    static void maxValueInMassive(int mas[]) {
        int maximum = mas[0];
        System.out.print("Максимальное значение: ");
        for (int i = 0; i < mas.length; i++)
            if (maximum < mas[i]) maximum = mas[i];
        System.out.println(maximum);
        soutOperations2level();

    }

    static void minValueInMassive(int mas[]) {
        int minimum = mas[0];
        System.out.print("Минимальное значение: ");
        for (int i = 0; i < mas.length; i++)
            if (mas[i] < mas[0]) minimum = mas[i];
        System.out.println(minimum);
        soutOperations2level();
    }

    static void kolElementov(int mas[]) {
        int a=mas.length;
        System.out.println("Колическтво элементов массива:" + a);
        soutOperations2level();
    }

    static void summaElementov(int mas[]) {
        int sum=0;
        for(int i=0; i<mas.length; i++) {
            sum=sum+mas[i];
        }
        System.out.println("Сумма элементов массива: " + sum);
        soutOperations2level();
    }

    static void averageValue(int mas[]) {
        double average;
        if (mas.length > 0)
        {
            double sum = 0;
            for (int j = 0; j < mas.length; j++) {
                sum += mas[j];
            }
            average = sum / mas.length;
            System.out.println("Среднее значение всех элементов массива: " + average);
            soutOperations2level();
        }
    }
}
