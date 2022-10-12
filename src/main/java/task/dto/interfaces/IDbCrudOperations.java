package task.dto.interfaces;

import task.vehiculos.models.Camioneta;

import java.util.ArrayList;

public interface IDbCrudOperations {
  Camioneta getCar(int id);
  ArrayList<Camioneta> getAllCars();
  void addCar(Camioneta car);
  void updateCar(int id, Camioneta newCar);
  void deleteCar(int id);
}
