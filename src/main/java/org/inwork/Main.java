package org.inwork;

import java.awt.*;

import static org.inwork.Car.body_type.*;
import static org.inwork.Car.fuel_type.Diesel;
import static org.inwork.Car.fuel_type.Gasoline;
import static org.inwork.Car.transmission.Automatic;
import static org.inwork.Car.transmission.Manual;

/**
 * @author oleg-mng
 * @version 0.0.0.1
 * @since 2023.07
 */

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Camry", new Color(0, 0, 0), 4, Sedan,
                2.4, Gasoline, Automatic) {

        };
        car1.move();
        car1.wiper_shift();
        System.out.println(car1.brand + " " + car1.bodyType + " " + car1.color + " " + car1.bodyType + " "
                + car1.engine_volume);

        TownCar car2 = new TownCar("Honda", "Jazz", new Color(100, 100, 100), 4,
                Hatchback, 1.0, Diesel, Manual, 13);
        System.out.println(car2.brand + " " + car2.model + " " + car2.bodyType + " R" + car2.wheel_diameter);
        car2.headlights_shift();
        car2.maintenance();
        car2.refuel();

        TerrainCar car3 = new TerrainCar("Ford", "Ranger", new Color(50, 50, 50), 4,
                PickUp, 3.0, Gasoline, Automatic, 1400);
        System.out.println(car3.brand + " " + car3.model + " " + car2.bodyType + " " + car3.trunk_volume + "л");
        car3.fill_trunk();
        car3.refuel();

    }
}