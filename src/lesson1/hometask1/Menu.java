package lesson1.hometask1;

import java.io.*;
import static lesson1.hometask1.Massive.*;
import static lesson1.hometask1.MassiveGenerator.array;
import static lesson1.hometask1.MenuOptions.*;
import static lesson1.hometask1.Operations.*;
import static lesson1.hometask1.Print.*;


public class Menu {

    void createMenu() throws IOException {
        try {
            BufferedReader k = new BufferedReader (new InputStreamReader(System.in));
            sout1levelMenu();
            boolean quit = false;
            int menuItem;
            do {
                System.out.print(" Выберите необходимую операцию: ");
                menuItem = Integer.parseInt(k.readLine());
                switch (menuItem) {
                    case 1:
                        System.out.println(" Вы выбрали Операции.");
                        createOperations();
                        break;
                    case 2:
                        System.out.println(" Вы выбрали Печать.");
                        createPrint();
                        break;
                    case 3:
                        quit = true;
                        break;
                    default:
                        System.out.println(" Неправильный выбор!");
                }
            } while (!quit);
            System.out.println("Bye");
        }
        catch (NumberFormatException e)  {
            System.out.println(" Вводите числовые значения.\n" +
                    "Возвращение в главное меню...");
            createMenu();
        }

    }



    void createOperations() throws IOException {
        BufferedReader m = new BufferedReader (new InputStreamReader(System.in));
        soutOperations();
        boolean quit = false;
        int menuItem2Level;
        do {
            System.out.print(" Выберите необходимое действие: ");
            menuItem2Level = Integer.parseInt(m.readLine());
            switch (menuItem2Level) {
                case 1:
                    createCalculatingValues();
                    break;
                case 2:
                    createSeach();
                    break;
                case 3:
                    sout1levelMenu();
                    quit = true;
                    break;
                default:
                    System.out.println(" Неправильный выбор!");
            }
        } while (!quit);

    }

    void createPrint() throws IOException {
        BufferedReader p = new BufferedReader (new InputStreamReader(System.in));
        soutOperations2levelPrint();
        boolean quit = false;
        int menuItem2LevelPrint;
        do {
            System.out.print(" Выберите необходимое действие: ");
            menuItem2LevelPrint = Integer.parseInt(p.readLine());
            switch (menuItem2LevelPrint) {
                case 1:
                    normalOutput(array);
                    break;
                case 2:
                    reversOutput(array);
                    break;
                case 3:
                    sortirovkaMassiva(array);
                    break;
                case 4:
                    sout1levelMenu();
                    quit = true;
                    break;
                default:
                    System.out.println(" Неправильный выбор!");
            }
        } while (!quit);

    }



    void createSeach() throws IOException {
        BufferedReader q = new BufferedReader (new InputStreamReader(System.in));
        soutOperations2levelSeach();
        boolean quit = false;
        int menuItem2LevelSeach;
        do {
            System.out.print(" Выберите необходимое действие: ");
            menuItem2LevelSeach = Integer.parseInt(q.readLine());
            switch (menuItem2LevelSeach) {
                case 1:
                    elementVMasive(array);

                    break;
                case 2:
                    zamenaElementaMassiva(array);
                    break;
                case 3:
                    soutOperations();
                    quit = true;
                    break;
                default:
                    System.out.println(" Неправильный выбор!");
            }
        } while (!quit);

    }


    void createCalculatingValues() throws IOException {
        BufferedReader g = new BufferedReader (new InputStreamReader(System.in));
        soutOperations2level();
        boolean quit = false;
        int menuItem3Level;
        do {
            System.out.print(" Выберите необходимое действие: ");
            menuItem3Level = Integer.parseInt(g.readLine());
            switch (menuItem3Level) {
                case 1:
                    maxValueInMassive(array);
                    break;
                case 2:
                    minValueInMassive(array);
                    break;
                case 3:
                    kolElementov(array);
                    break;
                case 4:
                    summaElementov(array);
                    break;
                case 5:
                    averageValue(array);
                    break;
                case 6:
                    soutOperations();
                    quit = true;
                    break;
                default:
                    System.out.println(" Неправильный выбор!");
            }
        } while (!quit);

    }
}
