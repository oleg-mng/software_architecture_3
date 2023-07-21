package org.inwork;

import java.awt.*;
/**
 * вводим новое поле класса
 * @parambrand - производитель
 * @parammodel - наименование модели
 * @paramcolor - цвет эктерьера авто
 * @parambodyType - тип кузова
 * @paramwheels - количество колес
 * @paramfuelType - тип топлива
 * @paramtransMission - тип коробки передач
 * @paramengine_volume - объем двигателя
 * @methodmove() - метод для передвижения
 * @methodmaintenance() - метод для техобслуживания авто
 * @methodgear_shift() - метод переключения передач
 * @methodheadlights_shift() - метод для включения фар
 * @methodwiper_shift() - метод для включения стеклоочистителей
 * @author oleg-mng
 * @version 0.0.0.1
 * @since 2023.07
 */

abstract public class Car {

    String brand;
    String model;
    Color color;
    body_type bodyType;

    enum body_type {Suv, Sedan, Wagon, Hatchback, Minivan, Coupe, Cabriolet, PickUp}

    ;

    int wheels;

    fuel_type fuelType;

    enum fuel_type {Gasoline, Diesel, Ethanol, Electric}

    ;
    transmission transMission;

    enum transmission {Automatic, Robot, Manual}

    ;
    double engine_volume;

    public Car(String brand, String model, Color color, int wheels, body_type bodyType, double engine_volume,
               fuel_type fuelType,transmission transMission) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.wheels = wheels;
        this.bodyType = bodyType;
        this.engine_volume = engine_volume;
        this.fuelType = fuelType;
        this.transMission = transMission;
    }

    void move() {
        System.out.println(this.model + " начал движение, - пристегните ремни");

    }

    void maintenance() {
        System.out.println("через 1 000км нас ждет ТО для авто " + this.model + " " + this.bodyType +
                " приготовьте VIN, записать Вас на станцию?");

    }

    void gear_shift() {
        System.out.println(this.model + " переходит на 2-ю передачу");

    }

    void headlights_shift() {
        System.out.println("фары на " + this.model + " " + this.engine_volume + " успешно включены, будьте внимальны");

    }

    void wiper_shift() {
        System.out.println("стеклоочистители на " + this.model + " " + this.bodyType + " перешли в режим работы, при" +
                " необходимости мы увеличим частоту работы");

    }

}
