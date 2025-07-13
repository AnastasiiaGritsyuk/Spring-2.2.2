package web.service;

import web.model.Car;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {
    private final List<Car> cars;

    public CarService() {
        cars = new ArrayList<>();
        cars.add(new Car("Toyota Camry", "Red", 2020));
        cars.add(new Car("Honda Accord", "Blue", 2019));
        cars.add(new Car("Ford Mustang", "Yellow", 2021));
        cars.add(new Car("Tesla Model 3", "White", 2022));
        cars.add(new Car("BMW X5", "Black", 2018));
    }

    public List<Car> getCars(int count) {
        return (count >= 5) ? cars : cars.subList(0, count);
    }
}
