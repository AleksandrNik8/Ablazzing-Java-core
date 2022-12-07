//Задача №1
//2. Создать следующую структуру из классов и интерфейсов
// магазин (обладает работниками)
// работник (обладает часами - (часы одни))
// часы (умеют тикать, если сломаны выкидывают ошибку WatchBrokenError)
// Бренд (обладает массивом магазинов)
// Создать бренд, положить в него два магазина, в каждом магазине будет по работнику,
// у каждого работника по часам. У одного работника часы сломаны, у второго нет.
// После создания бренда, вытащить из него все часы и вызвать у всех часов метод тикать,
// обработать ошибку сломанных часов.
// Ожидание вывода на экран:
// Часы тикают
// Ошибка: Часы сломались.

//Task #1
//2. Create the following structure from classes and interfaces
// store (has employees)
// employee (has a clock - (one clock))
// clock (can tick, if broken, throw the error WatchBrokenError)
// Brand (has an array of stores)
// Create a brand, put two stores in it, each store will have an employee,
// each employee has an hour. One employee's watch is broken, the second is not.
// After creating a brand, pull out all the watches from it and call the tick method for all watches,
// handle the broken clock error.
// Waiting for output to the screen:
// The clock is ticking
// Error: The watch is broken.

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws WatchBrokenError {
        //System.out.println("Hello world!");
        Watch watch = new Watch(false);//создал часы
        Watch watch2 = new Watch(true);//создал часы
        Employee employee = new Employee(watch);// создал работника
        Employee employee2 = new Employee(watch2);// создал работника2
        Store store = new Store(new ArrayList<>());//создал магазин
        Store store2 = new Store(new ArrayList<>());//создал магазин2
        store.getArrOfEmployee().add(employee);//нанял первого работника
        store2.getArrOfEmployee().add(employee2);//нанял второго работника
        Brand gucci = new Brand(new ArrayList<>());// создал бренд
        gucci.getListOfStore().add(store);//добавил магазин в бренд
        gucci.getListOfStore().add(store2);//добавил магазин2 в бернд

        for (int i = 0; i < gucci.getListOfStore().size(); i++) {
            for (int j = 0; j < gucci.getListOfStore().get(i).getArrOfEmployee().size(); j++) {
                try {
                    gucci.getListOfStore().get(i).getArrOfEmployee().get(j).getWatch().canTick();
                } catch (WatchBrokenError e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}