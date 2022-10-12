package task.vehiculos.models;

import lombok.Builder;
import lombok.Getter;

@Getter
public class CamionetaElectrica extends Camioneta {
  
  
  @Builder(builderMethodName = "electricBuilder")
  CamionetaElectrica(int puertas, int llantas, int ventanas, String marca,
                     boolean areOnHighBeams, boolean areOnIntermitentes, boolean isEncendida) {
    
    super(puertas, llantas, ventanas, marca,
        areOnHighBeams, areOnIntermitentes, isEncendida);
  }
  
  @Override
  public void isElectric() {
    System.out.println("Soy una camioneta electrica");
  }
  
  @Override
  public void isHybrid() {
    System.out.println("No soy hibrido, soy electrico");
  }
}
