package lesson2.hometask2.carTesting;

import lesson2.hometask2.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CarListTest implements Testable {

    private Car[] array = {
            new Car(1, "Toyota", 1500, 220),
            new Car(2, "Moskvich", 2000, 499),
            new Car(3, "Moskvich", 2000, 499),
            new Car(4, "BMW", 1450, 210),
            new Car(5, "Audi", 1500, 190)
    };

    private List<Car> list = new ArrayList();

    @Override
    public void test() {
        addValuesToList(array);

        printListEntries(list);

        getWeight(list);

        System.out.println(findNumber(list,'o'));

        getTwoItems(list);

        getThirdItems(list);

        deleteMaxId(list);

        deleteMinId(list);

        System.out.println("Сортировка коллекции по полю(одному) ID");
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);

        deleteDOMaxId(list, 2);

        renameItem();
    }

    private void addValuesToList(Car[] array) {
        for(int index = 0; index < array.length; index++) {
            list.add(array[index]);
        }
    }

    private void printListEntries(List list) {
        System.out.println("Исходная коллекция List");
        for(int index = 0; index < list.size(); index++) {
            System.out.println("Element "+index+": " + list.get(index));
        }
        System.out.println("Array length: " + array.length);
        System.out.println("List size: " + list.size());
    }

    private double getWeight(List<Car> list) {
        System.out.println("Суммарное значение поля weight");
        double summ = 0;
        for (int i = 0; i < list.size() ; i++) {
            summ += list.get(i).getWeight();
        }
        System.out.println(summ);
        return summ;
    }

    private boolean findNumber(List<Car> list, char c) {
        System.out.println("Есть ли символ 'о' во всех полях 'name' данной коллекции");
        System.out.print("Ответ: ");
        for (int i = 0; i < list.size(); i++) {
            if (!list.get(i).getName().contains(String.valueOf(c))){
                return false;
            }
        }
        return true;

    }

    public void getTwoItems(List<Car> list) {
        System.out.println("2 элемента коллекции, начиная со второго");
        Car car1 =  list.get(1);
        Car car2 =  list.get(2);
        System.out.println(car1);
        System.out.println(car2);
    }

    public void getThirdItems(List<Car> list) {
        System.out.print("Третий элемент коллекции: ");
        System.out.println(this.list.get(2));
    }

    private void deleteMaxId(List<Car> list) {
        System.out.println("Удаление поля с максимальным значением ID");
        int max =0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId()>max){
                max = list.get(i).getId();
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() ==max){
                list.remove(list.get(i));
                i--;
            }
        }
        System.out.println("Коллекция после удаления maxvalue:");
        System.out.println(list);
    }

    private void deleteMinId(List<Car> list) {
        System.out.println("Удаление поля с минимальным значением ID");
        int min =Integer.MAX_VALUE;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId()< min){
                min = list.get(i).getId();
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == min){
                list.remove(list.get(i));
                i--;
            }
        }
        System.out.println("Коллекция после удаления minvalue:");
        System.out.println(list);

    }

    private void deleteDOMaxId(List<Car> list, int x) {
        System.out.println("Удаление из коллекции всех элементов со значением поля меньше либо равно X(поле ID, X примем равным 3)");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId()> x) {
                list.remove(list.get(i));
            }
        }
        System.out.println(list);
    }

    public void renameItem() {
        System.out.println("Добавление '_1' к полям name ");
        for (Car item : list) {
            item.setName(item.getName() + "_1");
        }
        System.out.println(list);
    }


}
