package task.vehiculos.models;

import lombok.Builder;
import lombok.Getter;

@Getter
public class CamionetaHibrida extends Camioneta {
  
  @Builder(builderMethodName = "hybridBuilder")
  CamionetaHibrida(int puertas, int llantas, int ventanas, String marca,
                   boolean areOnHighBeams, boolean areOnIntermitentes, boolean isEncendida) {
    super(puertas, llantas, ventanas, marca,
        areOnHighBeams, areOnIntermitentes, isEncendida);
  }
  
  @Override
  public void isHybrid() {
    System.out.println("soy hibrido");
  }
}
