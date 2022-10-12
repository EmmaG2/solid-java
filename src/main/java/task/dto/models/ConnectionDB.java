package task.dto.models;

import task.dto.interfaces.IConnectionDB;

public class ConnectionDB implements IConnectionDB {
  @Override
  public void connect() {
    System.out.println("Conneccion creada a la base de datos: Por defecto (MySql)");
  }
  
  @Override
  public void disconnect() {
    System.out.println("Desconectado de la base de datos: Por defecto (MySql)");
  }
}
