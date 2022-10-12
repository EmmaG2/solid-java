package task.dto.models;

import task.dto.interfaces.IDbCrudOperations;
import task.vehiculos.models.Camioneta;

import java.util.ArrayList;
import java.util.HashMap;

public class MongoDBConnection extends ConnectionDB implements IDbCrudOperations {
  
  private final HashMap<Integer, Camioneta> carsDb = new HashMap<>();
  private int elements = 0;
  
  @Override
  public void connect() {
    System.out.println("conectado a la base de datos: MongoDB");
  }
  
  @Override
  public void disconnect() {
    System.out.println("desconectado de la base de datos: MongoDB");
  }
  
  @Override
  public Camioneta getCar(int id) {
    return carsDb.get(id);
  }
  
  @Override
  public ArrayList<Camioneta> getAllCars() {
    return new ArrayList<>(carsDb.values());
  }
  
  @Override
  public void addCar(Camioneta car) {
    elements++;
    carsDb.put(elements, car);
  }
  
  @Override
  public void updateCar(int id, Camioneta newCar) {
    carsDb.put(id, newCar);
  }
  
  @Override
  public void deleteCar(int id) {
    carsDb.remove(id);
  }
}
