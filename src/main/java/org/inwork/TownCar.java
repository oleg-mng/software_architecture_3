package org.inwork;

import java.awt.*;
/**
 * создали класс наследник для городских авто,
 * вводим новое поле класса
 * @paramwheel_diameter - диаметр колес R13...R21
 * @author oleg-mng
 * @method переопределили метод refuel() из интерфейса GasStation
 */

public class TownCar extends Car implements GasStation {

    public int wheel_diameter;

    public TownCar(String brand, String model, Color color, int wheels, body_type bodyType, double engine_volume,
                   fuel_type fuelType, transmission transMission, int wheel_diameter) {

        super(brand, model, color, wheels, bodyType, engine_volume, fuelType, transMission);

        this.wheel_diameter = wheel_diameter;
    }

    @Override
    public void refuel() {
        System.out.println("давайте проедем на заправку, уровень топлива стремительно снижается на вашей модели " +
                this.model + " " + this.bodyType + " " + ", вам нужна колонка для" + " " + this.fuelType);
    }
}
