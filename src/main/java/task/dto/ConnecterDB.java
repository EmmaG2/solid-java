package task.dto;

import task.dto.interfaces.IDbCrudOperations;
import task.dto.models.MongoDBConnection;


public class ConnecterDB {
  private static IDbCrudOperations dbInstance = null;
  
  public static IDbCrudOperations createConnection(String dbName) {
    dbName = dbName.toLowerCase();
    if ("mongodb".equals(dbName)) {
      dbInstance = new MongoDBConnection();
    } else {
      System.out.println("Por favor escoje una base de datos válida");
    }
    
    return dbInstance;
    
  }
}
