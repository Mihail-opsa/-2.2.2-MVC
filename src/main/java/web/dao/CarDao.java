package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDao implements CarDaoInt {
    @Override
    public List<Car> createCarList() { // можно через арэй лист для изменения данныйх.или list.of() для статичного списка
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("red", "1-series", "bmw"));
        cars.add(new Car("green", "124", "mersedes"));
        cars.add(new Car("orange", "A7", "audi"));
        cars.add(new Car("blue", "740", "volvo"));
        cars.add(new Car("white", "tiguan", "Volkswagen"));
        return cars;


}

// 2. метода для доступа всех и части машин

    public List<Car> getAllCars(){//доступ всех авто
        return createCarList();
    }

    public List<Car> getCars(int count){
        List<Car> allCars = createCarList();

        if (count >= allCars.size()) {
            return allCars;
        }

        // Возвращаем только первые 'count' машин
        return allCars.subList(0, count);
    }


}
