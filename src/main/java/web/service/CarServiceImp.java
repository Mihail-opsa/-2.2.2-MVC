package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service

public class CarServiceImp implements CarService {

    @Override
    public List<Car> getCars(List<Car> cars, int count) {
        if (count <= 0 || count >= cars.size()) {
            return cars;
        }
        return cars.stream().limit(count).collect(Collectors.toList());
    }

    @Override
    public List<Car> getAllCars() { // можно через арэй лист для изменения данныйх.или list.of() для статичного списка
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("red", "1-series", "bmw"));
        cars.add(new Car("green", "124", "mersedes"));
        cars.add(new Car("orange", "A7", "audi"));
        cars.add(new Car("blue", "740", "volvo"));
        cars.add(new Car("white", "tiguan", "Volkswagen"));
        return cars;


    }
}
