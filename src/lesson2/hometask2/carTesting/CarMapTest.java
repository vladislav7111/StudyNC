package lesson2.hometask2.carTesting;


import java.util.*;
import lesson2.hometask2.Car;


public class CarMapTest implements Testable {

    private Car[] array = {new Car(1, "Toyota", 1500, 220),
            new Car(2, "Moskvich", 2000, 499),
            new Car(3, "Moskvich1", 2000, 499),
            new Car(4, "BMW", 1450, 210),
            new Car(5, "Audi", 1500, 190)};

    private Map<String, Car> map = new HashMap();

    @Override
    public void test() {
        putValueToMap(array);

        printMapEntries(map);

        getWeight(map);

        System.out.println(findNumber(map, 'o'));

        getTwoItems(map);

        getThirdItems(map);

        deleteDOMaxId(map, 4);

        deleteMaxId(map);

        deleteMinId(map);


        /*List list = new ArrayList(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            public int compare(Map.Entry<Integer, Integer> a, Map.Entry<Integer, Integer> b) {
                return a.getValue() - b.getValue();
            }
        });*/


        renameItem();

    }

    private void putValueToMap(Car[] array) {
        for(Car item: array) {
            map.put(item.getName(),item);
        }
    }

    private void printMapEntries(Map<String, Car> map) {
        for(Map.Entry<String, Car> entry: map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        System.out.println("Array length: " + array.length);
        System.out.println("Map size: " + map.size());
    }

    private double getWeight(Map<String, Car> map) {
        double summ = 0;
        for(Map.Entry<String, Car> entry: map.entrySet()) {
            summ += entry.getValue().getWeight();
        }
        System.out.println("Суммарное значение поля weight: " + summ);
        return summ;
    }

    private boolean findNumber(Map<String, Car> map, char c) {
        System.out.print("Есть ли символ 'о' во всех полях 'name' данной коллекции? - ");
        for (Map.Entry<String,Car> entry: map.entrySet()) {
            if (entry.getValue().getName().contains((String.valueOf(c)))){
                return false;
            }
        }
        System.out.println();
        return true;
    }

    public void getTwoItems(Map<String, Car> map) {
        int numberOfItems=0;
        System.out.println("2 элемента коллекции, начиная со второго:");
        for (Map.Entry<String,Car> entry: map.entrySet()) {
            switch (numberOfItems) {
                case 1:
                    System.out.println(entry.toString());
                    numberOfItems++;
                    break;
                case 2:
                    System.out.println(entry.toString());
                    numberOfItems++;
                    return;
                default: numberOfItems++;
            }
        }
        System.out.println();
    }

    private void getThirdItems(Map<String, Car> map) {
        int numberOfItems = 0;
        for (Map.Entry<String, Car> entry : map.entrySet()) {
            numberOfItems++;
            if (numberOfItems == 3) {
                System.out.println("Третий элемент коллекции: " + entry.toString());
            }
        }
    }

    private void deleteDOMaxId(Map<String, Car> map, int i) {
        System.out.println("Удаление из коллекции всех лементов со значением поля больше X(поле ID, X примем равным 4)");
        Map<String,Car> map1=new HashMap<>(map);
        for (Map.Entry<String,Car> entry: map1.entrySet()) {
            if (entry.getValue().getId()>i) {
                map.remove(entry.getKey());
            }
        }
        System.out.println(map);
    }

    private void deleteMaxId(Map<String, Car> map) {
        System.out.println("Удаление поля с максимальным значением ID");
        int maxId = Collections.max(map.values(), Comparator.comparingInt(Car::getId)).getId();
        Iterator<Map.Entry<String, Car>> iterator = map.entrySet().iterator();

        while (iterator.hasNext())
            if(iterator.next().getValue().getId() == maxId)
                iterator.remove();

        System.out.println(map);
    }

    private void deleteMinId(Map<String, Car> map) {
        System.out.println("Удаление поля с минимальным значением ID");
        int maxId = Collections.min(map.values(), Comparator.comparingInt(Car::getId)).getId();
        Iterator<Map.Entry<String, Car>> iterator = map.entrySet().iterator();

        while (iterator.hasNext())
            if(iterator.next().getValue().getId() == maxId)
                iterator.remove();

        System.out.println(map);
    }



    private void renameItem() {
        System.out.println("Добавление '_1' к полям name: ");
        for (Map.Entry<String, Car> entry: map.entrySet()) {
            entry.getValue().setName( entry.getValue().getName()+"_1");
        }
        System.out.println(map);
    }


}