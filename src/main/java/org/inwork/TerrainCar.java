package org.inwork;

import java.awt.*;

public class TerrainCar extends Car implements GasStation {
    /**
     * создали класс наследник для загородных авто,
     * вводим новое поле класса
     * @paramtrunk_volume - объем багажника авто 350л...1400л
     * @author oleg-mng
     * @method переопределили метод refuel() из интерфейса GasStation
     */
    int trunk_volume;

    public TerrainCar(String brand, String model, Color color, int wheels, body_type bodyType, double engine_volume,
                      fuel_type fuelType, transmission transMission, int trunk_volume) {
        super(brand, model, color, wheels, bodyType, engine_volume, fuelType, transMission);
        this.trunk_volume = trunk_volume;

    }

    void fill_trunk() {
        System.out.println("Начинаем заполнение багажника для " + this.model + " " + this.engine_volume + " его max объем "
                + this.trunk_volume);
    }

    @Override
    public void refuel() {
        System.out.println("давайте проедем на заправку, уровень топлива стремительно снижается на вашей модели " +
                this.model + " " + this.bodyType + " " + this.trunk_volume + " " + ", вам нужна колонка для" + " " + this.fuelType);
    }
}
