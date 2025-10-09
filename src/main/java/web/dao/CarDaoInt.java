package web.dao;

import web.model.Car;

import java.util.List;

public interface CarDaoInt {
    List<Car> createCarList();
    List<Car> getAllCars();
    List<Car> getCars(int count);
}
