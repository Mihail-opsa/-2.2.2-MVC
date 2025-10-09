package web.service;

import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;

@Service

public class CarServiceImp implements CarService {
    private final CarDao carDao;


    public CarServiceImp(CarDao carDao) {
        this.carDao = carDao;
    }
     @Override
     public List<Car>processCarRequest(Integer count) {// все машины
        if (count == null) {
            return carDao.getAllCars();
        }
        if (count >= 5 || count <= 0) { // все машины если больше 5 и меньше 1
            return carDao.getAllCars();
        }


         return carDao.getCars(count); // ограниченное количество


    }
}

