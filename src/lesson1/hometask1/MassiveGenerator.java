package lesson1.hometask1;

import java.io.*;

public class MassiveGenerator {
    static int[] array;
    void createMassive() throws IOException {
        try {
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            System.out.print(" Введите длинну массива(меньше 10): ");
            int size = Integer.parseInt(input.readLine());

            while (size>=10){
                System.out.println(" Введите корректную длинну массива. ");
                size = Integer.parseInt(input.readLine());
            }
            array = new int[size];
            System.out.println(" Введите элементы массива: ");
            for (int i = 0; i < size; i++) {

                array[i] = Integer.parseInt(input.readLine());
            }
            System.out.print (" Введённый массив: ");
            for (int i = 0; i < size; i++) {
                System.out.print (" " + array[i]);
            }System.out.println();
        }
        catch (NumberFormatException e) {
            System.out.println(" Введите числовые значения.");
            createMassive();
        }

    }
}