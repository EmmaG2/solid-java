package task.vehiculos.interfaces;

public interface IVehiculo {
  String arrancarCoche(); // este metodo, arranca el coche, o lo apaga si está encendido
  String prenderLucesAltas();
  String prenderInterminentes(String direccion);
  void isElectric();
  void isHybrid();
  
}
