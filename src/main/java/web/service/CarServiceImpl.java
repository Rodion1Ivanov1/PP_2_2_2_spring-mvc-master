package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {
    private static int id_count;
    private List<Car> car;

    {
        car = new ArrayList<>();
        car.add(new Car(++id_count, "Car1", 11));
        car.add(new Car(++id_count, "Car2", 12));
        car.add(new Car(++id_count, "Car3", 13));
        car.add(new Car(++id_count, "Car4", 14));
        car.add(new Car(++id_count, "Car5", 15));
    }

    @Override
    public List<Car> listCars(int id) {
        List<Car> car1 = new ArrayList<>();
        for (int i = 0; i <= id - 1; i++) {
            car1.add(car.get(i));
        }
        return car1;
    }

}
