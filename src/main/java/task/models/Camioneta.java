package task.models;

import lombok.*;

@Getter
@Builder(builderMethodName = "normalBuilder")
public class Camioneta implements IVehiculo {
  
  int puertas;
  int llantas;
  int ventanas;
  String marca;
  @Builder.Default
  boolean areOnHighBeams = false;
  @Builder.Default
  boolean areOnIntermitentes = false;
  @Builder.Default
  boolean isEncendida = false;
  
  @Override
  public String arrancarCoche() {
    
    if(!isEncendida) {
      isEncendida = true;
      return "Camioneta encendida";
    }
    
    isEncendida = false;
    return "Camioneta apagada";
  }
  
  @Override
  public String prenderLucesAltas() {
    if (!areOnHighBeams) {
      areOnHighBeams = true;
      return "Luces altas prendidas";
    }
    
    areOnHighBeams = false;
    return "Luces altas apagadas";
  }
  
  @Override
  public String prenderInterminentes(String direccion) {
    direccion = direccion.toLowerCase();
    
    if (!areOnIntermitentes) {
      areOnIntermitentes = true;
      return "Luces prendidas en la direccion: " + direccion;
    }
    
    areOnIntermitentes = false;
    return "Luces apagadas en la direccion: " + direccion;
  }
  
  @Override
  public void isElectric() {
    System.out.println("No soy electrica");
  }
  
  @Override
  public void isHybrid() {
    System.out.println("No soy hibrido, soy de GAS");
  }
}
