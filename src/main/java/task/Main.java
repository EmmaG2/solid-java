package task;

import task.models.*;

public class Main {
  public static void main(String[] args) {
    
    Camioneta camioneta = Camioneta.normalBuilder()
        .llantas(3)
        .ventanas(34)
        .marca("Chevrolet")
        .puertas(2)
        .build();
    
    Camioneta camioneta1 = CamionetaElectrica.electricBuilder()
        .marca("nissan")
        .ventanas(5)
        .llantas(5)
        .puertas(3)
        .build();
    
    Camioneta camioneta2 = CamionetaHibrida.hybridBuilder()
        .marca("nissan")
        .ventanas(3)
        .llantas(2)
        .puertas(2)
        .build();
    
    camioneta.isHybrid();
    camioneta1.isHybrid();
    camioneta2.isHybrid();
  }
}
