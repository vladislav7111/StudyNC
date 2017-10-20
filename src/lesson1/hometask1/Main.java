package lesson1.hometask1;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        MassiveGenerator m = new MassiveGenerator();
        m.createMassive();
        Menu menu = new Menu();
        menu.createMenu();
    }
}