package businesslogic;

import businesslogic.Bestilling;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Timestamp;
 
public class DBFacade implements DataFacade {
 
    @Override
    public void gemIDatabase(Bestilling b) {
        try {
            String user = "root";
            String password = "1234";
            String IP = "localhost";
            String PORT =  "3306";
            String DATABASE = "marios_pizzabar";
            String url = "jdbc:mysql://" + IP + ":" + PORT + "/" + DATABASE + "?useUnicode=true&useJDBCcompliantTimeZoneShift=true&"
                    + "useLegacyDatetimeCode=false&serverTimezone=UTC";
           
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery("SELECT MAX(ORDERNO) FROM ORDERS");
            int maxOrderNr = 0;
            while (result.next()){
                maxOrderNr = result.getInt(1);
            }
        String query = "INSERT INTO ORDERS VALUES(" + (maxOrderNr+1) + ", '" + b.getPizza().getPizzaNavn() + "', '2019-01-01T00:00'" + ", '2020-01-01T00:00', TRUE)";
            System.out.println("dfklsjflkjldjs" + query);
            int numberOfRowsImpacted = statement.executeUpdate(query);//?
            System.out.println("Antal rows: " + numberOfRowsImpacted);
        } catch (SQLException ex) {
            Logger.getLogger(DBFacade.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
}
