package lesson1.hometask1;

import java.io.*;
import static lesson1.hometask1.MenuOptions.soutOperations2levelSeach;

class Massive {

    static void zamenaElementaMassiva(int[] mas) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите номер элемента для замены:");
        int size = Integer.parseInt(input.readLine());
        BufferedReader input1 = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите на какое значение вы хотите поменять: ");
        int size1 = Integer.parseInt(input1.readLine());
        mas [size-1] = size1;
        for (int v : mas)
            System.out.print(v + " ");
        soutOperations2levelSeach();
    }

    static void elementVMasive(int[] mas) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите элемент для проверки:");
        int element = Integer.parseInt(input.readLine());
        boolean count=false;
        for (int i = 0; i < mas.length; i++) {
            if (element == mas[i]) {count = true; break; }
        }
        if (count){System.out.println("Данный элемент есть в массиве.");}
        else System.out.println("Данного элемента нет в массиве.");
        soutOperations2levelSeach();
    }

}
