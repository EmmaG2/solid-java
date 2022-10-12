package task;

import task.dto.ConnecterDB;
import task.dto.interfaces.IDbCrudOperations;
import task.vehiculos.models.*;

public class Main {
  public static void main(String[] args) {
    IDbCrudOperations db = ConnecterDB.createConnection("mongodb");
    
    db.addCar(Camioneta.normalBuilder()
        .llantas(3)
        .ventanas(34)
        .marca("Chevrolet")
        .puertas(2)
        .build());
    
    db.addCar(CamionetaElectrica.electricBuilder()
        .marca("nissan")
        .ventanas(5)
        .llantas(5)
        .puertas(3)
        .build());
    
    db.addCar(CamionetaHibrida.hybridBuilder()
        .marca("Tesla")
        .ventanas(3)
        .llantas(2)
        .puertas(2)
        .build());
    
    db.getAllCars().forEach(System.out::println);
  }
}
